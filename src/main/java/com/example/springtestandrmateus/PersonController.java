package com.example.springtestandrmateus;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
    
    private final AtomicLong idPerson = new AtomicLong();
    
    @GetMapping("/personCreate")
	public Object personCreate(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "age", defaultValue = "0")Integer age) {
		Person qualquer = new Person(idPerson.incrementAndGet(), name, age);
        qualquer.defineMessage(String.format("My name is %s and i've %d years old", qualquer.getName(), qualquer.getAge()));
        return qualquer;
	}
}
