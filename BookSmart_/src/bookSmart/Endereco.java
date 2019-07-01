package bookSmart;

public class Endereco {
    private String logadouro;
    private int numero;
    private String complemento;
    private Bairro bairro;
    private String cidade;

    public Endereco(String logadouro, int numero, String complemento, Bairro bairro, String cidade) {
        this.setLogadouro(logadouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setBairro(bairro);
        this.setCidade(cidade);
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEndCompleto() {
    	return this.getLogadouro()+", numero: "+this.getNumero()+" complemento "+this.getComplemento()+
    			", "+this.getBairro()+", "+this.getCidade();
    }
   
}
