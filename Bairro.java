package bookSmart;

public enum Bairro {

    TIJUCA(1, "Tijuca"), URCA(2, "Urca"), MADUREIRA(3, "Madureira"), BANGU(4, "Bangu"), DENDE(5, "Dendê"), 
    SAOCRISTOVAO(6, "São Cristóvão"), PENHA(7, "Penha"), SANTACRUZ(8, "Santa Cruz"), GAVEA(9, "Gávea"), 
    RIACHUELO(10, "Riachuelo");
	
    private final static String nome = null;
    
    Bairro(int num, String nomeBairro){
    	nome = nomeBairro;
    }
    
    public static String getBairro(){
        return nome;
    }
}
