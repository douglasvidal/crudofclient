package br.com.douglasvidal.crudofclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.douglasvidal.crudofclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
