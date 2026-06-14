package com.github.willatkinson.invoice_api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.willatkinson.invoice_api.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> 
{}