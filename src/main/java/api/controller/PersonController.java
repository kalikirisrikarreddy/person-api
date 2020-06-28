package api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import api.model.Person;

@RestController
public class PersonController {

  @GetMapping("/api/v1/students/{id}")
  public ResponseEntity<Person> getStudent(@PathVariable(name = "id") String id) {
    Person person = new Person();
    person.setId(id);
    person.setFirstName("Srikar");
    person.setMiddleName("Reddy");
    person.setLastName("Kalikiri");
    return new ResponseEntity<>(person, HttpStatus.OK);
  }

}
