package Main;

import Estrutura.Contato;
import Estrutura.Hash;
import Estrutura.MesAniversario;

public class Main {
    public static void main(String[] args) {

        Hash hash = new Hash(12);

        hash.inserir(new Contato(2, "Luana",MesAniversario.Janeiro));
        hash.inserir(new Contato(3, "Henrique", MesAniversario.Agosto));
        hash.inserir(new Contato(4, "Thiago", MesAniversario.Outubro));
        hash.inserir(new Contato(10, "Maria", MesAniversario.Fevereiro));
        hash.inserir(new Contato(8, "Gustavo", MesAniversario.Março));
        hash.inserir(new Contato(15, "Luana",MesAniversario.Janeiro));

       
        System.out.println(hash);
    }
}
