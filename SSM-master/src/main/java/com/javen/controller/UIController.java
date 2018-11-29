package com.javen.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javen.model.TbItem;
import com.javen.model.TbUser;
import com.javen.service.ItemService;
import com.javen.service.UserService;
@Controller
@RequestMapping("/veigar")
public class UIController {
	@Autowired
	private ItemService itemService;
	 
	@RequestMapping("/testJson")
	@ResponseBody
	public Map<String,Object> testJson(@RequestParam int page, int rows) throws IOException {
	        /*
	         * page:�ڼ�ҳ
	         * rows:ÿҳ����������
	         * ����count��ѯ��������������Ϊtrue
	         */
	        PageHelper.startPage(page, rows, true);
	        //ִ�в�ѯ���ж���
	        List<TbItem> list  = this.itemService.findAllItem();
	        //��list����PageInfo
	        PageInfo<TbItem> info = new PageInfo(list);
	        //����list���Ѿ����÷�ҳ��list
	        list =info.getList();
	        //��ȡ����
	        long count = info.getTotal();
	        //ǰ̨���յ���json��map���Զ�תΪjson��������F12����̨�鿴
	        Map<String,Object> map = new HashMap<String,Object>();
	        map.put("total",count);
	        map.put("rows",list);
	        return map;
	    }

}
