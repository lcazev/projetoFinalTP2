import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    
    static ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();//aqui temos que ter um arquivo de texto com todas as bibs

    public void pedirLivro(Livro livro) {
        FilaEncaminhados.encaminharLivro(livro);
    }
    
    public boolean obterLivroPorTitulo(String livro){
        //varrer as bibliotecas pesquisando o titulo do livro
        // se o livro for encontrado, informar a biblioteca
        //se o livro nao for encontrado, encaminhar para a fila
        return true;
    }
    
    //montando uma interface simples para testar o funcionamento
    public static void main(String[] args) 
    { 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bem-vindo(a)! Digite o titulo do livro que deseja pedir:");
        String titulo = entrada.nextLine();
        
    }
}
