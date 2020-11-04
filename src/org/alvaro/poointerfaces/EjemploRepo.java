package org.alvaro.poointerfaces;

import org.alvaro.poointerfaces.modelo.Cliente;
import org.alvaro.poointerfaces.repositorio.*;
import java.util.List;

public class EjemploRepo {
    public static void main(String[] args) {

        IOrdenablePaginaleCrudRepo repo = new ClienteListRepo();
        repo.crear(new Cliente("Alvaro", "Arguelles"));
        repo.crear(new Cliente("Pepe", "Garcia"));
        repo.crear(new Cliente("Pepe", "Gonzalez"));
        repo.crear(new Cliente("Fran", "Garcia"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== paginable =====");

        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar asc nombre =====");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);


        System.out.println("===== ordenar desc nombre =====");
        repo.listar("nombre", Direccion.DESC).forEach(System.out::println);


        System.out.println("===== editar =====");
        Cliente actualizar = new Cliente("Pepe", "Testing");
        actualizar.setId(2);
        repo.editar(actualizar);
        Cliente pepe = repo.porId(2);
        System.out.println(pepe);
        repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("===== eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("===== total =====");
        System.out.println("Total registros: " + repo.total());
    }
}
