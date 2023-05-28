package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.ClientRepository;
import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import com.sinemturkcu.onlineshoppingsite.mapper.ClientMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClientService extends BaseEntityService<Client,ClientRepository> {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository repository) {
        super(repository);
        clientRepository=repository;
    }

    public Client getByFullName(String name){
        Client client = clientRepository.findByFullName(name);
        return client;
    }
    public Optional<Client> findByClientNameAndPhoneNumber(String clientName, String phoneNumber){
        return clientRepository.findByFullNameAndPhoneNumber(clientName,phoneNumber);
    }
}
