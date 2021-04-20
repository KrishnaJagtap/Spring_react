package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service

public class CourseServiceimpl implements CourseService {
//	List <Courses> list;
	@Autowired
	private CourseDao coursedao;
	
	
	public  CourseServiceimpl() {
		
		
		// TODO Auto-generated constructor stub
		
//		list = new ArrayList<>();
//		list.add(new Courses(1, "java", "contains basic java"));
//		list.add(new Courses(2, "spring", "contains basic spring"));
		
		
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
	
		return coursedao.findAll();
	}

	@Override
	public Courses getId(long courseid) {
// TODO Auto-generated method stub
//		Courses c=null;
//		for(Courses s:list)
//		{
//			
//			if(s.getId()==courseid)
//			{
//			c=s;
//			break;
//		    }
//		}
		return coursedao.findById(courseid).get();
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
//		list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDetails(course.getDetails());
//			}
//		});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Courses entity =coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

}
