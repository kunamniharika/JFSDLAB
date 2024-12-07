package klu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.CourseManager;
import klu.model.Courses;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@PostMapping("/save")
	public String save(@RequestBody Courses C)
	{
		try
		{
			CourseManager CM = new CourseManager();
			return CM.saveCourse(C);
		}catch (Exception e) 
		{
			return e.getMessage();
		}
	}
}
