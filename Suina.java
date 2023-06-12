public class Suina extends Carne{
    //Novos atributos
    private String tempero;
    private String classificacao;
    //Método construtor
    public Suina(String nome_fabricante,double preco_unitario, String peso,int quant_estoque, String tipo_corte, String tempero, String classificacao){
        super(nome_fabricante,preco_unitario,peso,quant_estoque,tipo_corte);
        this.tempero = tempero;
        this.classificacao = classificacao;

    }

    @Override
    public String toString() {
        return super.toString() + "|"+ " Temperado: "+ tempero + "|"+ " Classificação: " + classificacao + "|"+ " [Suína] " ;
    }

    public void tipo_suina(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Esses são os tipos de cortes para carne Suína:");
        System.out.println("[Bisteca]");
        System.out.println("[Carré]");
        System.out.println("[Costela]");
        System.out.println("[Linguiça calabresa]");
        System.out.println("[Lombo]");
        System.out.println("[Paio]");
        System.out.println("[Pé]");
        System.out.println("[Pernil]");
        System.out.println("[Rabó]");
        System.out.println("---------------------------------------------------------\n");
    }


    public void tipos_d_cortes() {
        {tipo_suina();}
    }
}