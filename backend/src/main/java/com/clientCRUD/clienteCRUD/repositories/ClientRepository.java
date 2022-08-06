package com.clientCRUD.clienteCRUD.repositories;

import com.clientCRUD.clienteCRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
