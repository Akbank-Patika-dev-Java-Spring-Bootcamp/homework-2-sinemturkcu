package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.ClientRepository;
import com.sinemturkcu.onlineshoppingsite.dto.ClientDto;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import com.sinemturkcu.onlineshoppingsite.mapper.ClientMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.ref.Cleaner;


@Service
public class ClientService extends BaseEntityService<Client,ClientRepository> {

    ClientRepository clientRepository;
    ClientMapper clientMapper;

    public ClientService(ClientRepository repository) {
        super(repository);
        this.clientMapper = clientMapper;
    }

    public ClientDto getByFullName(String name){
        Client client = clientRepository.findByFullName(name);
        return clientMapper.convertToClientDto(client);
    }
}
