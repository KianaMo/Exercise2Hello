package fi.haagahelia.execise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ExerciseController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name= "name") String name, 
			@RequestParam(name = "age") Integer age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return  "hello";
	}
}
