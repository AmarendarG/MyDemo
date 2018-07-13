package com.posidex.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.posidex.beans.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/getForm", method = RequestMethod.GET)
	public ModelAndView getAdmission() {

		ModelAndView andView = new ModelAndView("createAdmission");

		return andView;
	}

	/*
	 * @RequestMapping(value = "/submitForm", method = RequestMethod.POST) public
	 * ModelAndView submitForm(@RequestParam("studentName") String
	 * name, @RequestParam("studentAge") Integer age) {
	 * 
	 * ModelAndView andView = new ModelAndView("submitApplication");
	 * andView.addObject("name", name); andView.addObject("age", age);
	 * 
	 * return andView;
	 * 
	 * }
	 */
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("student") Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView andView = new ModelAndView("createAdmission");

			return andView;
		}

		ModelAndView andView = new ModelAndView("submitApplication");
		// andView.addObject("headerMsg","Samskruti College Of Engineering Technology");
		andView.addObject("student", student);
		return andView;

	}

	@ModelAttribute
	public void addCommon(Model model) {

		model.addAttribute("HeaderMsg", "College");
	}

	@RequestMapping(value = "/getEmployess", method = RequestMethod.GET)
	public ModelAndView getEmployee() {
		List<Student> student = new ArrayList<Student>();
		String[] courses = new String[] { "JAVA", "PYTHON" };

		Student stu1 = new Student();
		stu1.setSkills(courses);

		student.add(stu1);
		ModelAndView andView = new ModelAndView("emps");
		andView.addObject("student", student);
		return andView;

	}

	@InitBinder
	public void initBinder1(WebDataBinder binder) {

		binder.setDisallowedFields(new String[] { "studentName", "studentId" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, "studentDob", new CustomDateEditor(dateFormat, false));

	}

}
