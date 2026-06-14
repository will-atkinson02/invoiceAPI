package com.github.willatkinson.invoice_api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import com.github.willatkinson.invoice_api.Entities.Client;

import com.github.willatkinson.invoice_api.Repositories.ClientRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class ClientController {
    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/client")
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
        
}
