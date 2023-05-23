package com.sinemturkcu.onlineshoppingsite.mapper;

import com.sinemturkcu.onlineshoppingsite.dto.response.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client convertToClient(ClientSaveRequest clientSaveRequest);
    ClientDto convertToClientDTO(Client client);
    List<ClientDto> convertToClientDTOList(List<Client> clientList);

}
