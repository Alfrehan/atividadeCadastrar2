package com.senac.models;

public class Usuarios {

    public boolean verficarIdade(int idade) {

        if (idade >= 18) {
            System.out.println("É maior de idade");
            return true;
        } else {
            System.out.println("Não é maior de idade");
            return false;
        }
    }

    public boolean verificarNacionalidade(boolean nacionalidade) {
        if (nacionalidade) {
            System.out.println("É Brasileira");
            return true;
        } else {
            System.out.println("NÃO é Brasileira");
            return false;
        }
    }

    public boolean verificarDisponibilidade(boolean disponibilidade) {
        if (disponibilidade) {
            System.out.println("tem disponibilidada");
            return true;
        } else {
            System.out.println("Não tem disponibilidada");
            return false;
        }
    }

    public boolean cadastrar(int idade, boolean nacionalidade, boolean disponibilidade) {
        if (verficarIdade(idade)) {
            if (verificarNacionalidade(nacionalidade)) {
                if (verificarDisponibilidade(disponibilidade)) {
                    System.out.println("PARABÉNS! Cadastro realizado");
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
