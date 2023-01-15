//classe para chamar o banco de dados

package io.github.MatheusMelo181.repository;

import io.github.MatheusMelo181.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepository {
    public void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
    }
}
