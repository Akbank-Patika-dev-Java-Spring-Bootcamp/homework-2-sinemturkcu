package com.sinemturkcu.onlineshoppingsite.service;

import com.sinemturkcu.onlineshoppingsite.General.BaseEntityService;
import com.sinemturkcu.onlineshoppingsite.dao.ClientRepository;
import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import com.sinemturkcu.onlineshoppingsite.mapper.ClientMapper;
import org.springframework.stereotype.Service;


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
        return clientMapper.convertToClientDTO(client);
    }
}
