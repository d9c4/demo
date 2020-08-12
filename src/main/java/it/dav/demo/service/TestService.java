package it.dav.demo.service;

import it.dav.demo.model.Person;
import it.dav.demo.repository.PersonRepository;
import it.dav.demo.rest.dto.PersonDTO;
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
            Person p = Person.builder().name("John").surname("Doe").build();
            personRepository.save(p);
        }
    }

    public List<PersonDTO> findAllPeople(){
        return personRepository.findAll().stream().map(PersonDTO::from).collect(Collectors.toList());
    }


    public PersonDTO addPerson(PersonDTO dto) {
        Person toAdd = Person.builder().name(dto.getName()).surname(dto.getSurname()).build();
        return PersonDTO.from(personRepository.save(toAdd));
    }
}
