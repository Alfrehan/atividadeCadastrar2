package com.senac;

import com.senac.models.Usuarios;

public class Main {

    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.cadastrar(19, true, true);

    }
}
