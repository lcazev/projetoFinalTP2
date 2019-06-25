package bookSmart;

public enum Bairro {

    TIJUCA("Tijuca"), URCA("Urca"), MADUREIRA("Madureira"), BANGU("Bangu"), DENDE("Dendê");
    private final String nome;
    Bairro(String nomeBairro){
        nome = nomeBairro;
    }
    
    public String getBairro(){
        return nome;
    }
}
