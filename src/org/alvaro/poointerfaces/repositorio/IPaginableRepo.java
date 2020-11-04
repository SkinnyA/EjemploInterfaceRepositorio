package org.alvaro.poointerfaces.repositorio;

import org.alvaro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface IPaginableRepo {
    List<Cliente> listar(int desde, int hasta);
}
