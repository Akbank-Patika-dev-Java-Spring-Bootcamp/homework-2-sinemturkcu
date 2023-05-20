package com.sinemturkcu.onlineshoppingsite.controller;

import com.sinemturkcu.onlineshoppingsite.General.RestResponse;
import com.sinemturkcu.onlineshoppingsite.controller.contract.ClientControllerContract;
import com.sinemturkcu.onlineshoppingsite.dto.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
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
    public List<Client> getAll(){
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

    /*
      ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }



    @GetMapping("/{clientName}")
    public Client getByClientName(@PathVariable String clientName){
        return clientService.getByFullName(clientName);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
         clientService.deleteById(id);
    }
     */


}
