package com.sinemturkcu.onlineshoppingsite.controller.contract;

import com.sinemturkcu.onlineshoppingsite.dto.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;

import java.util.List;

public interface ClientControllerContract {
    ClientDto save(ClientSaveRequest clientSaveRequest);
    List<Client> findAll();
    void delete(Long id);
    ClientDto getById(Long id);
    ClientDto getByFullName(String fullName);
}
