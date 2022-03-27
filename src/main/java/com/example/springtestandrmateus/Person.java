package com.example.springtestandrmateus;

public class Person {
    private final long id;
    private final String name;
    private final Integer age;
    private String message;
    
    public Person (long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void defineMessage(String message) {
        this.message = message;
    }
    
    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }
}
