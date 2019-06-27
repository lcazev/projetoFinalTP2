package bookSmart;

import java.util.ArrayList;
import java.util.Scanner;

public class Entregador extends Usuario {
Scanner entrada = new Scanner(System.in);
	public Entregador(String nome, Endereco endereco, String email, String senha) {
		super(nome, endereco, email, senha);
		ArrayList<Bairro> bairrosAtendidos = new ArrayList<Bairro>();
	}
	
	public void escolherBairros() {
		System.out.println("Voce deseja:");
		System.out.println("1) Exibir por regiao (Ex.: Zona Norte");
		System.out.println("2) Exibir lista completa de bairros disponiveis");
		int opcao = entrada.nextInt();
		switch(opcao) {
		case 1: exibirBairrosZona();
		System.out.println("Deseja selecionar toda a Zona? 1)Sim 2)Nao");
		int op = entrada.nextInt();
		switch(op) {
		case 1: //adicionar toda a zona a this.BairrosAtendidos
		case2: System.out.println("Selecione os bairros. Para parar, digite -1");
		//criar um while para que o usuario entre com os numeros dos bairros que quer
		//quando parar, adicionar esses numeros a this.bairrosAtendidos
		}
		case 2: exibirBairros();
		System.out.println("Selecione os bairros. Para parar, digite -1");
		//criar um while para que o usuario entre com os numeros dos bairros que quer
		//quando parar, adicionar esses numeros a this.bairrosAtendidos
		
		default: System.out.println("Opcao Invalida! Redirecionando para Menu");
		escolherBairros();
		
		
		}
	}
	
	public void exibirBairros() {
		//mostra o enum com os bairros disponiveis
	}
	
	public void exibirBairrosZona() {
		//mostra o enum de acordo com a zona
		//nao sei se isso e possivel la nos metodos do enum
		//se nao for possivel, podemos adicionar os bairros na ordem de zona
		//e criar um for pra exibir somente os que estao numerados no intervalo que queremos
	}
}
