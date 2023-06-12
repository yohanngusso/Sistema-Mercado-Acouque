public class Frango extends Carne {
    //Novos atributos
    private String tempero;

    //Método construtor
    public Frango(String nome_fabricante,double preco_unitario,String peso,int quant_estoque, String tipo_corte,String tempero){
        super(nome_fabricante,preco_unitario,peso,quant_estoque,tipo_corte);
        this.tempero = tempero;

    }

    @Override
    public String toString() {
        return super.toString() + "|"+ " Temperado: "+ tempero + "|"+ " [Frango] " ;
    }

    public void tipo_frango(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Esses são os tipos de cortes para carne de Frango:");
        System.out.println("[Asa]");
        System.out.println("[Coração]");
        System.out.println("[Coxa com sobrecoxa]");
        System.out.println("[Coxinha da asa]");
        System.out.println("[Filé de frango]");
        System.out.println("[Filezinho]");
        System.out.println("[Frango inteiro]");
        System.out.println("[Frango a passarinho]");
        System.out.println("[Peito]");
        System.out.println("---------------------------------------------------------\n");
    }

    public void tipos_d_cortes() {
        {tipo_frango();}
    }
}