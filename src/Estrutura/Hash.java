package Estrutura;

public class Hash {             
    int operador;   
    Lista[] vetor;                  

    public Hash(int operador){
        this.operador = operador;
        vetor = new Lista[operador];
        for (int i = 0; i < operador; i++) {
            vetor[i] = new Lista();
        }
    }

    public void inserir(Contato contato) {
        int chave = contato.id % operador;
        vetor[chave].inserir(contato);        
    }

    public Contato buscar(int id) {
        return vetor[id % operador].buscar(id);
    }

    
    public String toString() {
        String out = "";
        for(int i = 0; i < operador; i++) {
            out += "" + i + ": ";
            out += vetor[i % operador] + "\n";
        }
        return out;
    }
}
