package bookSmart;

import java.util.ArrayList;
import java.util.Scanner;

public class Entregador extends Usuario {

	static Scanner entrada = new Scanner(System.in);
	private ArrayList<Bairro> bairrosAtendidos;

	public Entregador(String nome, Endereco endereco, String email, String senha) {
		super(nome, endereco, email, senha);
		ArrayList<Bairro> bairrosAtendidos = new ArrayList<Bairro>();
	}

	public void escolherBairros() {
		exibirBairros();
		System.out.println("Digite os numeros dos bairros que deseja atender. Para parar, digite -1");
		ArrayList<Integer> bairrosAtend = new ArrayList<Integer>();
		int num = 0;
		do {
			num = entrada.nextInt();
			if (num > 0) {
				bairrosAtend.add(num);
			}
		} while (num > 0);
		adicionarBairrosLista(bairrosAtend);
	}

	public void adicionarBairrosLista(ArrayList<Integer> lista) {
		for (int indice : lista) {
			for (Bairro bairro : Bairro.values()) {
				if (indice == bairro.getNumBairro()) {
					this.bairrosAtendidos.add(bairro);
				}
			}
		}
	}

	public void exibirBairros() {
		// mostra o enum com os bairros disponiveis
		System.out.println("Abaixo estão os bairros disponíveis.");
		System.out.println("Selecione os que desejar atender.");
		for (@SuppressWarnings("unused")
		Bairro nome : Bairro.values()) {
			System.out.println(nome.getNumBairro() + " " + nome.getBairro());
		}
	}
