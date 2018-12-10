/**
 * 
 */
/**
 * @author apple
 *
 */
package cn.wmyskxz.controller;
import java.io.File;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.wmyskxz.service.CourseInfoService;
import cn.wmyskxz.util.FileUtils;
import cn.wmyskxz.util.Page;
import cn.wmyskxz.entity.*;

@Controller
@RequestMapping("")
public class CourseInfoController {
	@Autowired
	CourseInfoService courseInfo;
	
	
	 @RequestMapping(value="/getAllCourse",method=RequestMethod.POST,produces="application/json")
	public String getAllCourse() {
		 return "listCourse";
	 }
  

    @RequestMapping("/groupStatCourse")
    public ModelAndView MyData(HttpServletRequest request) {
       
    	ModelAndView mav = new ModelAndView("statistic");
	       
	     
	        return mav;
    }


	

	
	@RequestMapping("/selectByChooseCourse")
	public ModelAndView selectChoose(HttpServletRequest request,HttpServletResponse response) {
		String select=request.getParameter("select");
		String text=request.getParameter("content");
		List<CourseInfo> info=new ArrayList<CourseInfo>();
		if(select.equals("按课程号查询")) {
			info=courseInfo.getCourseByNo(text);
		}
		else if(select.equals("按课程名查询")) {
			info=courseInfo.getCourseByName(text);
		}
		else if(select.equals("按开设学院查询")) {
			info=courseInfo.getCourseByDept(text);
		}
		
		 ModelAndView mav = new ModelAndView("resultViewCourse");
	       
	       mav.addObject("courseResult", info);
	        return mav;
	}
	
	 @RequestMapping("/listCourseInfo")
	    public String listCourse(HttpServletRequest request, HttpServletResponse response) {

		// 获取分页参数
	        int start = 0;
	        int count = 10;

	        try {
	            start = Integer.parseInt(request.getParameter("page.start"));
	            count = Integer.parseInt(request.getParameter("page.count"));
	        } catch (Exception e) {
	        }

	        Page page = new Page(start, count);

	        List<CourseInfo> courses = courseInfo.list(page.getStart(), page.getCount());
	        int total = courseInfo.getTotal();
	        page.setTotal(total);

	        request.setAttribute("courses", courses);
	        request.setAttribute("page", page);

	        return "listCourseInfo";
	    }
	@RequestMapping("/addCourseInfo")
	public String addStudentInfo(HttpServletRequest request,HttpServletResponse response) {
		CourseInfo info=new CourseInfo();
		info.setCedit(Integer.parseInt(request.getParameter("cedit")));
		info.setCno(request.getParameter("cno"));
		info.setCname(request.getParameter("cname"));
		
		info.setDept(request.getParameter("dept"));
	
	       courseInfo.addCourse(info);
	        return "redirect:listCourseInfo";
	}
	  @RequestMapping("/deleteCourseInfo")
	    public String deleteStudent(int cno) {
	        courseInfo.deleteCourse(cno);
	        return "redirect:listCourseInfo";
	    }

	    @RequestMapping("/editCourseInfo")
	    public ModelAndView editStudent(int id) {
	        ModelAndView mav = new ModelAndView("editCourseInfo");
	        CourseInfo course = courseInfo.getCourse(id);
	        mav.addObject("courseinfo", course);
	        return mav;
	    }

	    @RequestMapping("/updateCourseInfo")
	    public String updateCourse(HttpServletRequest request, HttpServletResponse response) {

	    	CourseInfo info=new CourseInfo();
	    	info.setId(Integer.parseInt(request.getParameter("id")));
			info.setCedit(Integer.parseInt(request.getParameter("cedit")));
			info.setCno(request.getParameter("cno"));
			info.setCname(request.getParameter("cname"));
			
			info.setDept(request.getParameter("dept"));
			
		
             System.out.println(info);
	        courseInfo.updateCourse(info);
	        return "redirect:listCourseInfo";
	    }

}
