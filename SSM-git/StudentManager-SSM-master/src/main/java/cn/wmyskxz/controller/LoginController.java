package cn.wmyskxz.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.wmyskxz.entity.Result;
import cn.wmyskxz.util.RandomValidateCode;
@RestController
public class LoginController {
	
	@RequestMapping("/login")
	public Result Login( @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            @RequestParam(value = "remember", required = false) String remember,
            @RequestParam(value = "code", required = false) String code,
            HttpServletRequest request
            ) {
		 String error = null;
		 HttpSession session = request.getSession();
		  System.out.println(code.toUpperCase());
		 System.out.println(session.getAttribute( RandomValidateCode.RANDOMCODEKEY).equals(code.toUpperCase()));
		if(username==null||!session.getAttribute( RandomValidateCode.RANDOMCODEKEY).equals(code.toUpperCase())) {
			System.out.println("code 有问题");
			return new Result(false, error);
		}
		
		//System.out.println(password);
		//System.out.println("调试");
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		if (remember != null) {
            if (remember.equals("true")) {
                //说明选择了记住我
                token.setRememberMe(true);
            } else {
                token.setRememberMe(false);
            }
        } else {
            token.setRememberMe(false);
        }
		System.out.println(token.isRememberMe());
		try {
			
			subject.login(token);
			
			
			 return new Result(true,error);
			 
		} catch (UnknownAccountException e) {
       	 System.out.println( "登陆出错");
         error = "用户账户不存在，错误信息：" + e.getMessage();
     }catch (IncorrectCredentialsException ex) {
     	 System.out.println( "用户名和密码不匹配");
     	 error = "用户名或密码错误，错误信息：" + ex.getMessage();
     }catch (AuthenticationException e) {
     	 System.out.println( "其他的登陆错误");
     	 error = "错误信息：" + e.getMessage();
     	
     }finally {
    	
     }
		return new Result(true, error); 
		
	}
	@RequestMapping(value="/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		//设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        HttpSession session = request.getSession();
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        
        RandomValidateCode randomValidateCode = new RandomValidateCode();
       
        
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
           //
            System.out.println(session.getAttribute( RandomValidateCode.RANDOMCODEKEY));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}


}
