package org.alvaro.poointerfaces.repositorio;

import org.alvaro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface IOrdenableRepo {
    List<Cliente> listar(String campo, Direccion dir);

}
