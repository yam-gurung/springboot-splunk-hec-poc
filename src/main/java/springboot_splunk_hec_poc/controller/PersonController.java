package springboot_splunk_hec_poc.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import springboot_splunk_hec_poc.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import springboot_splunk_hec_poc.service.PersonService;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}
	
	@GetMapping
	public List<Person> getPersons(){
		return personService.getPersons();
	}
	
	@GetMapping("{phoneNumber}")
	public Person getPerson(@PathVariable("phoneNumber") int phoneNumber) {
		return personService.getPerson(phoneNumber);
	}
	
}
