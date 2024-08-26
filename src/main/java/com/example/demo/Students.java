package com.example.demo;

import java.lang.annotation.Inherited;
import jakarta.persistence.*;

public class Students 
{
    @Id
    @GeneratedValue
    private Long id;
    public Students(){}

    public Students(String name)
    {
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNane(String name)
    {
    }

    public Long getId(Long id)
    {
        return id;
    }

    public String getNane(String name)
    {
        return name;
    }
}
