package it.dav.demo.rest.dto;

import it.dav.demo.model.Person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonDTO {
    Integer id;
    String name;
    String surname;

    public static PersonDTO from(Person p) {
        return PersonDTO.builder().id(p.getId()).name(p.getName()).surname(p.getSurname()).build();
    }
}
