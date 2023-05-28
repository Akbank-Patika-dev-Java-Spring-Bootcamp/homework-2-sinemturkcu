package com.sinemturkcu.onlineshoppingsite.dao;

import com.sinemturkcu.onlineshoppingsite.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByFullName(String clientName);
    Optional<Client> findByFullNameAndPhoneNumber(String fullName, String phoneNumber);

}
