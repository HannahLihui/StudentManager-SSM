/**
 * 
 */
/**
 * @author apple
 *
 */
package cn.wmyskxz.service;
import java.io.FileInputStream
;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wmyskxz.dao.CourseInfoDao;
import cn.wmyskxz.entity.CourseInfo;


@Service(value="courseInfo")
public class CourseInfoServiceImpl implements CourseInfoService {
	 @Autowired
	 CourseInfoDao courseDao;

	public int getTotal() {
		// TODO Auto-generated method stub
		return courseDao.getTotal();
	}

	public void addCourse(CourseInfo course) {
		// TODO Auto-generated method stub
		courseDao.addCourse(course);
	}

	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseDao.deleteCourse(id);
	}

	public void updateCourse(CourseInfo course) {
		// TODO Auto-generated method stub
		courseDao.updateCourse(course);
	}

	public CourseInfo getCourse(int id) {
		// TODO Auto-generated method stub
		return courseDao.getCourse(id);
	}

	public List<CourseInfo> list(int start, int count) {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	public List<CourseInfo> getCourseByNo(String cno) {
		// TODO Auto-generated method stub
		return courseDao.getCourseByNo(cno);
	}

	public List<CourseInfo> getCourseByName(String cname) {
		// TODO Auto-generated method stub
		return courseDao.getCourseByName(cname);
	}

	public List<CourseInfo> getCourseByDept(String dept) {
		// TODO Auto-generated method stub
		return courseDao.getCourseByDept(dept);
	}

	public List<CourseInfo> listCourse() {
		// TODO Auto-generated method stub
		return courseDao.listCourse();
				
	}


}