package com.sinemturkcu.onlineshoppingsite.controller.contract;

import com.sinemturkcu.onlineshoppingsite.dto.request.ClientUpdateRequest;
import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;

import java.util.List;

public interface ClientControllerContract {
    ClientDto save(ClientSaveRequest clientSaveRequest);
    List<ClientDto> findAll();
    void delete(Long id);
    ClientDto getById(Long id);
    ClientDto getByFullName(String fullName);
    ClientDto updateClient(Long id,ClientUpdateRequest clientUpdateRequest);
}
