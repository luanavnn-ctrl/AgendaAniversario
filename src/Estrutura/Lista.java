package Estrutura;

public class Lista {                    //classe lista
   No inicio;                           //ponteiro para o inicio da lista
   int tamanho;                         //tamanho da lista
   
   public void inserir(Contato info) {  //metodo para inserir no inicio 
        No no = new No();               //cria um no 
        no.info = info;                 //atribui a informacao ao no 
        no.proximo = inicio;            //o ponteiro proximo do no inserido aponta para o inicio
        inicio = no;                    //o inicio passa a ser novo no 
        tamanho ++;                     //incrementa o tamanho 
   }

   public Contato buscar(int id) {      //metodo metodo buscar pelo codigo
        No no = inicio;                 //vai para o inicio da lista
        while (no != null) {            //enquanto o no nao for nulo
            if (no.info.id == id){      //se o id do no for igual ao parametro passado
                return no.info;         //retorna a informacao do tipo id
            }
            no = no.proximo;            //vai para o proximo no     
        }
        return null;    
   }

   public String toString() {           //sobrescreve o metodo toString
        String out = "";                //cria uma string vazia para retorno
        No no = inicio;                 //vai para o inicio da lista
        while (no != null) {            //enquanto o no for diferente de nulo
            out += no.info + " ";       //adiciona a string a informacao
            no = no.proximo;            //vai para o proximo no
        }
        return out;                     //retorna a string
   }
}
