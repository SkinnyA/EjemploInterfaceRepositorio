package org.alvaro.poointerfaces.modelo;

import java.util.Arrays;
import java.util.List;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
