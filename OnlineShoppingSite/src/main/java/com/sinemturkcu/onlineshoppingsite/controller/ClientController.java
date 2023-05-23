package com.sinemturkcu.onlineshoppingsite.controller;

import com.sinemturkcu.onlineshoppingsite.General.RestResponse;
import com.sinemturkcu.onlineshoppingsite.controller.contract.ClientControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientControllerContract clientControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<ClientDto>> save(@RequestBody ClientSaveRequest clientSaveRequest){
        var response = clientControllerContract.save(clientSaveRequest);
        return ResponseEntity.ok(RestResponse.of(response));
    }

    @GetMapping
    public List<ClientDto> getAll(){
        return clientControllerContract.findAll();
    }

    @GetMapping("/{id}")
    public ClientDto getById(@PathVariable Long id){
        return clientControllerContract.getById(id);
    }

    @GetMapping("/{clientName}")
    public ClientDto getByClientName(@PathVariable String clientName){
        return clientControllerContract.getByFullName(clientName);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        clientControllerContract.delete(id);
    }

}
