package Main;

import Estrutura.Contato;
import Estrutura.Hash;

public class Main {
    public static void main(String[] args) {

        Hash hash = new Hash(12);

        hash.inserir(new Contato(2, "Luana", "Setembro"));
        hash.inserir(new Contato(3, "Henrique", "Julho"));
        hash.inserir(new Contato(4, "Thiago", "Maio"));
        hash.inserir(new Contato(10, "Maria", "Novembro"));
        hash.inserir(new Contato(8, "Gustavo", "Janeiro"));
        hash.inserir(new Contato(1, "Luana", "Fevereiro"));

        System.out.println(hash);
    }
}
