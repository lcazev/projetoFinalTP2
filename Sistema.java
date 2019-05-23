import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    static Scanner entrada = new Scanner(System.in);
    
    static ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();//aqui temos que ter um arquivo de texto com todas as bibs

    public static void pedirLivro() {
        System.out.println("Bem-vindo(a)! Digite o titulo do livro que deseja pedir:");
        String titulo = entrada.nextLine();
        //chamar a funcao obterLivroPorTitulo
        FilaEncaminhados.encaminharLivro(null);
    }
    
    public boolean obterLivroPorTitulo(String livro){
        //varrer as bibliotecas pesquisando o titulo do livro
        // se o livro for encontrado, informar a biblioteca
        //se o livro nao for encontrado, encaminhar para a fila
        return true;
    }
    
    public static void cadastrarUsuario(){
        
    }
    
    public static void cadastrarBiblioteca(){
        
    }
    
    public static void avaliarEntrega(){
        
    }

    //montando uma interface simples para testar o funcionamento
    public static void main(String[] args) 
    { 
        
        System.out.println("Você é:");
        System.out.println("1) Usuario 2)Biblioteca");
        int opcao = entrada.nextInt();
        switch(opcao){
        case 1:
            System.out.println("1) Cadastrar usuario ou 2) Pedir livro");
            opcao = entrada.nextInt(); //tratar caso de numero errado ou letra
            switch (opcao){
            case 1: cadastrarUsuario();
            case 2: pedirLivro(); 
            break;
            }
        case 2: 
            System.out.println("1) Cadastrar biblioteca ou 2) Avaliar entrega");
            opcao = entrada.nextInt();
            switch(opcao){
            case 1: cadastrarBiblioteca();
            case 2: avaliarEntrega();
            }
        
        }
        
    }
}
