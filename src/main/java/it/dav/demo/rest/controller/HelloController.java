package it.dav.demo.rest.controller;

import it.dav.demo.model.Person;
import it.dav.demo.rest.dto.PersonDTO;
import it.dav.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/api")
@RequiredArgsConstructor
public class HelloController {

    protected final TestService testService;

    @GetMapping(path = "/all")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok().body(testService.findAllPeople());
    }

    @PostMapping(path = "/person")
    public ResponseEntity<PersonDTO> add(@RequestBody PersonDTO dto){
        return ResponseEntity.ok().body(testService.addPerson(dto));
    }

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("HELLO WORLD!");
    }
}
