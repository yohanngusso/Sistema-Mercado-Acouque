public class Peixes extends Carne {
    //Novos atributos
    private String tipos_peixes;
    private String local;
    //Método construtor
    public Peixes(String nome_fabricante,double preco_unitario, String peso, int quant_estoque,String tipo_corte,String tipos_peixes,String local){
        super(nome_fabricante, preco_unitario, peso, quant_estoque,tipo_corte);
        this.tipos_peixes = tipos_peixes;
        this.local = local;
    }

    @Override
    public String toString() {
        return super.toString() + "|"+ " Local: " + local + "|"+ " Tipo do Peixe: " + tipos_peixes + "|"+ " [Peixes] " ;
    }

    public void tipo_peixe(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Esses são os tipos de Peixes:");
        System.out.println("[Bacalhau]");
        System.out.println("[Piramutaba]");
        System.out.println("[Peroá]");
        System.out.println("[Salmão]");
        System.out.println("[Sardinha]");
        System.out.println("[Surubim]");
        System.out.println("[Tilápia]");
        System.out.println("---------------------------------------------------------\n");
    }

    public void tipos_d_cortes() {
        {tipo_peixe();}
    } 
}