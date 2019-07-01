package bookSmart;

public enum Bairro {

    TIJUCA(1, "Tijuca"), URCA(2, "Urca"), MADUREIRA(3, "Madureira"), BANGU(4, "Bangu"), DENDE(5, "Dende"), 
    SAOCRISTOVAO(6, "São Cristóvão"), PENHA(7, "Penha"), SANTACRUZ(8, "Santa Cruz"), GAVEA(9, "Gavea"), 
    RIACHUELO(10, "Riachuelo");
	
    private int numBairro;
	private String nome;
    
    Bairro(int num, String nomeBairro){
    	numBairro = num;
    	nome = nomeBairro;
    }
    
    public String getBairro(){
        return nome;
    }
    
    public int getNumBairro() {
    	return this.numBairro;
    }
}
