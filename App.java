public class App {

    public static void main (String [] args){

// Instanciando 
        Bovina Alcatra = new Bovina("MONTANA", 47.99, "1KG", 100, "Alcatra","Sem tempero","Primeira");
        Bovina Picanha = new Bovina("Beef Club", 69.90, "1KG", 400, "Picanha","Sem tempo", "Primeira");
        Suina  Costela = new Suina("Friboi", 22.99,"1KG", 200, "Costela","Temperado","Segunda");
        Frango Coxa = new Frango("Lar", 5.95, "500g", 1000, "Coxa com sobrecoxa","Temperado");
        Peixes Bacalhau = new Peixes("MAR ALTO", 99.90, "1KG", 300, "Não possui", "Bacalhau", "Matinhos");
        loja Sao = new loja("Açougue São Paio");

        Sao.adicionar(Alcatra); // adionando objetos ao catálogo e consequentemente seus atributos que vão para a lista
        Sao.adicionar(Picanha);
        Sao.adicionar(Costela);
        Sao.adicionar(Coxa);
        Sao.adicionar(Bacalhau);

        Sao.menu();
    }
    
}
