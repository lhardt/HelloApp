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

@RestController
@RequestMapping("/school")
public class SchoolJSONController {

	@Autowired
    private SchoolRepository repository;

	@RequestMapping("/api")
	public List<School> listAll(){
		return repository.findAll();
	}


	@RequestMapping("/api/{id}")
	public School listAll(@PathVariable long id){
		List<School> schools = repository.findById(id);

		if(schools.size() > 0){
			return schools.get(0);
		}
		// TODO redirect.
		return null;
	}
}
