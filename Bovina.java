public class Bovina extends Carne {
    //Novos atributos
    private String tempero;
    private String classificacao;
    //Método construtor
    public Bovina(String nome_fabricante,double preco_unitario,String peso, int quant_estoque, String tipo_corte, String tempero, String classificacao){
        super(nome_fabricante,preco_unitario,peso,quant_estoque,tipo_corte);
        this.tempero = tempero;
        this.classificacao = classificacao;
    }
    
    @Override
    public String toString() {
        return super.toString() + "|"+ " Temperado: "+ tempero + "|"+ " Classificação: " + classificacao + "|"+ " [Bovina] " ;
    }

    public void tipo_bovina(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Esses são os tipos de cortes para carne Bovina:");
        System.out.println("[Acém]");
        System.out.println("[Alcatra]");
        System.out.println("[Carne Moída]");
        System.out.println("[Carne Seca]");
        System.out.println("[Contra filé]");
        System.out.println("[Coxão duro]");
        System.out.println("[Coxão mole]");
        System.out.println("[Fígado]");
        System.out.println("[Filé mignon]");
        System.out.println("[Fraldinha]");
        System.out.println("[Maminha]");
        System.out.println("[Paleta]");
        System.out.println("[Patinho]");
        System.out.println("[Picanha]");
        System.out.println("---------------------------------------------------------\n");
    }
    public void tipos_d_cortes() {
        {tipo_bovina();}

    }


}