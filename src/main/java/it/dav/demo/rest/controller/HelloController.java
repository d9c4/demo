package it.dav.demo.rest.controller;

import it.dav.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/api")
@RequiredArgsConstructor
public class HelloController {

    protected final TestService testService;

    @GetMapping(path = "/hello")
    public ResponseEntity<?> get(){

        return ResponseEntity.ok().body(testService.findAllPeople());
    }
}
