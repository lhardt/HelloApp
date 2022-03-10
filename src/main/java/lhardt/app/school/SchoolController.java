package lhardt.app.school;

import java.util.List;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import lhardt.app.address.Address;

@Controller
@RequestMapping("/school")
public class SchoolController {

	@Autowired
    private SchoolRepository repository;

	@GetMapping("/all")
	public String listSchools(Model model){
		School newSchool = new School();
		newSchool.setAddress(new Address());

		model.addAttribute("title", "LH");
		model.addAttribute("list", repository.findAll());
		model.addAttribute("newSchool", newSchool);
		return "school/all";
	}

	@RequestMapping(value="/new",method = RequestMethod.POST)
	public String save(@ModelAttribute("school") School school){
		repository.save(school);
		return "redirect:/school/all";
	}

	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("school") School school){
		repository.save(school);
		return "redirect:/school/all";
	}

	@RequestMapping("/{id}")
	public String showSchool(Model model, @PathVariable long id){
		List<School> schools = repository.findById(id);

		if(schools.size() > 0){
			model.addAttribute("school", schools.get(0));
		}

		return "school/item";
	}
}
