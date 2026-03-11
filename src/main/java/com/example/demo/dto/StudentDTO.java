package com.example.demo.dto;

import jakarta.validation.constraints.*;

public class StudentDTO {
    @NotBlank(message = "Name cannot be empty")
    private String name;
    @Min(value = 1, message = "Age must be greater than 0")
    @Max(value = 120, message = "Age must be less than 120")
    private int age;

    public StudentDTO() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
