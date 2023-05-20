package com.sinemturkcu.onlineshoppingsite.controller.contract.impl;

import com.sinemturkcu.onlineshoppingsite.controller.contract.ClientControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import com.sinemturkcu.onlineshoppingsite.mapper.ClientMapper;
import com.sinemturkcu.onlineshoppingsite.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientControllerContractImpl implements ClientControllerContract {

    private final ClientService clientService;

    @Override
    public ClientDto save(ClientSaveRequest clientSaveRequest) {
        Client client = ClientMapper.INSTANCE.convertToClient(clientSaveRequest);
        client = clientService.save(client);
        return ClientMapper.INSTANCE.convertToClientDto(client);
    }

    @Override
    public List<Client> findAll() {
       return clientService.getAll();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ClientDto getById(Long id) {
        Client client = clientService.getById(id);
        return ClientMapper.INSTANCE.convertToClientDto(client);
    }

    @Override
    public ClientDto getByFullName(String fullName) {
       return clientService.getByFullName(fullName);
    }

}
