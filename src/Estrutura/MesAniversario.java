package Estrutura;

public enum MesAniversario{
    Janeiro(0), Fevereiro(1), Março(2), Abril(3), Maio(4), Junho(5),
    Julho(6), Agosto(7), Setembro(8), Outubro(9), Novembro(10), Dezembro(11);

    private int mes;

    private MesAniversario(int mes){   
        this.mes = mes;
        return;
    }

    public int getMes(){
        return this.mes;
    }
}
