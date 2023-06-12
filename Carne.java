abstract class Carne {
    
    //Atributos
    private String nome_fabricante;
    private double preco_unitario;
    private int    quant_estoque;
    private String peso;
    private String tipo_corte;

    //Método Construtor
    public Carne(String nome_fabricante,double preco_unitario, String peso, int quant_estoque, String tipo_corte){
        this.nome_fabricante = nome_fabricante;
        this.preco_unitario = preco_unitario;
        this.quant_estoque = quant_estoque;
        this.peso = peso;
        this.tipo_corte = tipo_corte;
    }

    @Override
    public String toString() {
        return  '\n' +"|"+ "Fabricante: " + nome_fabricante + "|" + " Preco:  " + preco_unitario + "|"+ " Peso: " + peso + "|"+ " Estoque: " + quant_estoque + "|"+ " Tipo de Corte: " + tipo_corte;
    }

    boolean fabricada_por(String fabricante){
        boolean resultado;
               
        if(tipo_corte.equals(fabricante)){
            resultado = true;
        
        }
        else{

            resultado = false;
        }
        return resultado;
    }

    void vender_b(int qnt){
        this.quant_estoque = quant_estoque - qnt;
    }
    
    void comprar_b(int qnt){
        this.quant_estoque = quant_estoque + qnt;
    }

    void atualizar_preco(double valor){
        this.preco_unitario = valor;
    }
    abstract void tipos_d_cortes(); 
}