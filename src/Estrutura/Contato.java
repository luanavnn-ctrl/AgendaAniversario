package Estrutura;

public class Contato {                                              //classe contato
    int id;                                                  //id do contato
    String nome;                                                    //nome do contato
                                             //aniversario do contato
    public MesAniversario mes;

    public Contato (int id, String nome, MesAniversario mes) {      //construtor com parametros
        this.id = id;                                               //inicializa o atributo id   
        this.nome = nome;                                           //inicializa o atributo nome   
        this.mes = mes;                             //inicializa o atributo aniversario
    }    

    public String toString(){                                       //sobrescreve o metodo toString
        return "(" + nome + ", " + mes + ")";   //retorna codigo, nome e aniversario
    }
}