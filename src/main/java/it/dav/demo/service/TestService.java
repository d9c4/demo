package it.dav.demo.service;

import it.dav.demo.model.Person;
import it.dav.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestService {
    protected final PersonRepository personRepository;

    @PostConstruct
    private void init(){
        List<Person> people = personRepository.findAll();
        if(people.size() < 1){
            Person p = Person.builder().name("John Doe").build();
            personRepository.save(p);
        }
    }

    public String findAllPeople(){
        return personRepository.findAll().stream().map(Person::getName).collect(Collectors.joining());
    }


}
