package com.sinemturkcu.onlineshoppingsite.controller.contract.impl;

import com.sinemturkcu.onlineshoppingsite.controller.contract.ClientControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientUpdateRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import com.sinemturkcu.onlineshoppingsite.mapper.ClientMapper;
import com.sinemturkcu.onlineshoppingsite.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientControllerContractImpl implements ClientControllerContract {

    private final ClientService clientService;

    @Override
    public ClientDto save(ClientSaveRequest clientSaveRequest) {
        Client client = ClientMapper.INSTANCE.convertToClient(clientSaveRequest);
        client = clientService.save(client);
        return ClientMapper.INSTANCE.convertToClientDTO(client);
    }

    @Override
    public List<ClientDto> findAll() {
        return ClientMapper.INSTANCE.convertToClientDTOList(clientService.getAll());
    }

    @Override
    public void delete(Long id) {
        Client client= clientService.getById(id);
        clientService.delete(client);
    }

    @Override
    public ClientDto getById(Long id) {
        Client client = clientService.getById(id);
        return ClientMapper.INSTANCE.convertToClientDTO(client);
    }

    @Override
    public ClientDto getByFullName(String fullName) {
        Client client=clientService.getByFullName(fullName);
        return ClientMapper.INSTANCE.convertToClientDTO(client);
    }

    @Override
    public ClientDto updateClient(Long id,ClientUpdateRequest clientUpdateRequest) {
        Client client = clientService.getById(id);
        client.setFullName(clientUpdateRequest.fullName());
        clientService.save(client);
        return ClientMapper.INSTANCE.convertToClientDTO(client);
    }

    @Override
    public void deleteByClientNameAndPhoneNumber(String fullName, String phoneNumber) {
        Optional<Client> client = clientService.findByClientNameAndPhoneNumber(fullName,phoneNumber);
        if(client.isPresent()){
            throw new RuntimeException();
        }
        clientService.deleteById(client.get().getId());
    }

}
