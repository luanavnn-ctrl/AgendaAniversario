package Estrutura;

public class Hash {                             //classe hash              
    int operador;                               //atributo operador 
    Lista[] vetor;                              //vetor de listas 

    public Hash(int operador){                  //contrutor iniciando com um operador 
        this.operador = operador;               //inicializa o operador 
        vetor = new Lista[operador];            //inicializa o vetor de Listas 
        for (int i = 0; i < operador; i++) {    //para cada posicao no vetor 
            vetor[i] = new Lista();             //inicializa a Lista daquela posicao do vetor 
        }
    }

    public void inserir(Contato contato) {      //metodo inserir um contato           
        int chave = contato.id % operador;      //posicao = resto do id / operador
        vetor[chave].inserir(contato);          //insere o contato naquela lista
    }

    public Contato buscar(int id) {             //metodo buscar pelo id
        return vetor[id % operador].buscar(id); //busca apenas na lista especifica
    }
    
    public String toString() {                  //sobrescreve o metodo toString              
        String out = "";                        //cria uma string de saida  
        for(int i = 0; i < operador; i++) {     //para cada posicao no vetor de Listas
            out += "" + i + ": ";               //adiciona uma string representando a Lista
            out += vetor[i % operador] + "\n";  
        }
        return out;                             //retorna a string
    }
}
