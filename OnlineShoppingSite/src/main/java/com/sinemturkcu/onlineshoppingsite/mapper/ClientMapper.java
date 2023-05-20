package com.sinemturkcu.onlineshoppingsite.mapper;

import com.sinemturkcu.onlineshoppingsite.dto.ClientDto;
import com.sinemturkcu.onlineshoppingsite.dto.request.ClientSaveRequest;
import com.sinemturkcu.onlineshoppingsite.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client convertToClient(ClientSaveRequest clientSaveRequest);
    ClientDto convertToClientDto(Client client);

}
