package springboot_splunk_hec_poc.service;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import springboot_splunk_hec_poc.model.Person;
import org.apache.logging.log4j.*;

@Service
public class PersonService {
	Logger logger = LogManager.getLogger(PersonService.class);

	
	private final List<Person> persons = new ArrayList<>();
	
	public Person addPerson(Person person) {
		logger.info("addPerson: adding Person");
		logger.info("addPerson: Request: {}",person);
		persons.add(person);
		logger.info("addPerson: added Person");
		logger.info("addePerson: Response: {}",person);
		return person;	
	}
	
	
	public List<Person> getPersons(){
		logger.info("getPersons: getting Persons");
		List<Person> personsList = persons;
		logger.info("getPersons: got Persons");
		logger.info("getPersons: Response: {}", personsList);
		return personsList;
	}
	
	public Person getPerson(int phoneNumber) {
		logger.info("getPerson: getting Person");
		logger.info("getPerson: Request: {}",phoneNumber);
		Person person = persons.stream().filter(per->per.getPhoneNumber()==phoneNumber)
				.findAny().orElseThrow(()->new RuntimeException("Person not found"));
		logger.info("getPerson: got Person");
		logger.info("getPerson: Response: {}",person);
		return person;
	}
	
}
