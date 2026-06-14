package com.github.willatkinson.invoice_api.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Client()
    {}

    public Long getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {   
        this.name = name;
    }
}
