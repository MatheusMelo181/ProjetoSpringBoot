//Classe para manipular os dados que vem do banco de dados

package io.github.MatheusMelo181.service;

import io.github.MatheusMelo181.model.Cliente;
import io.github.MatheusMelo181.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
