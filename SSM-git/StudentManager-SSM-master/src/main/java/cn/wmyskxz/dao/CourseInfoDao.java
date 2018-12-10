package cn.wmyskxz.dao;
import java.util.List;

import cn.wmyskxz.entity.CourseInfo;


public interface CourseInfoDao {
	 int getTotal();
	    void addCourse(CourseInfo course);
	    void deleteCourse(int id);
	    void updateCourse(CourseInfo course);
	    CourseInfo getCourse(int id);
	    List<CourseInfo> list(int start, int count);
	    List<CourseInfo> getCourseByNo(String cno);
	    List<CourseInfo> getCourseByName(String cname);
	    List<CourseInfo> getCourseByDept(String dept);
	    List<CourseInfo> listCourse();
	    List<CourseInfo> findAll();
	   
}
