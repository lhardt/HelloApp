package lhardt.app.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {

	@RequestMapping("/all")
	public String listSchools(){
		return "Hello world!<br>\n";
	}

	@RequestMapping("/{id}")
	public String showSchool(@PathVariable long id){
		return "Olá, id = " + id + "...\n";
	}
}
