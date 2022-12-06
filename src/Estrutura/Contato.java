package Estrutura;

public class Contato {                                              //classe contato
    public int id;                                                  //id do contato
    String nome;                                                    //nome do contato
    String aniversario;                                             //aniversario do contato


    public Contato (int id, String nome, String aniversario) {      //construtor com parametros
        this.id = id;                                               //inicializa o atributo id   
        this.nome = nome;                                           //inicializa o atributo nome   
        this.aniversario = aniversario;                             //inicializa o atributo aniversario
    }

    

    public String toString(){                                       //sobrescreve o metodo toString
        return "(" + id + ", " + nome + ", " + aniversario + ")";   //retorna codigo, nome e aniversario
    }
}