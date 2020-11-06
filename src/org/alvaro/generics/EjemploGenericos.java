package org.alvaro.generics;

import org.alvaro.poointerfaces.modelo.Cliente;
import org.alvaro.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Jose", "Fernandez"));

        Cliente jose = clientes.iterator().next();

        Cliente[] clientesArray = {new Cliente("Alberto", "Garcia"), new Cliente("Pepe", "Peste")};
        Integer[] enterosArray = {1, 2, 3};

        List<Cliente> clientes2 = fromArrayToList(clientesArray);
        List<Integer> enteros2 = fromArrayToList(enterosArray);

        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "bea", "John"}, enterosArray);
        nombres.forEach(System.out::println);

        List<Cliente> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientes2);
        imprimirClientes(clientesPremiumList);
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
