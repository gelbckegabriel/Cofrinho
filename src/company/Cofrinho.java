package company;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

	public static void main(String[] args) {
		
		// TODO calculate the amount of money that you have converted and summed to BRL.
		
		// CRIAR SCANNER PARA INPUTS.
		Scanner input = new Scanner(System.in);
		int opcao;
		double valor;
		double saldo = 0;
		
		ArrayList<Moedas> lista = new ArrayList<Moedas>();
		
		// CRIAÇÃO DE VARIÁVEIS DAS MOEDAS.
		Real real = new Real();
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		
		// ADICIONANDO AS MOEDAS A LISTA.
		lista.add(real);
		lista.add(dolar);
		lista.add(euro);
		
		// MENU PRINCIPAL.
		System.out.println("- - - Gelbcke´s Bank - - -");
		System.out.println("1 - Adicionar dinheiro");
		System.out.println("2 - Remover dinheiro");
		System.out.println("3 - Listar saldo de moedas");
		System.out.println("4 - Listar total em BRL");
		System.out.println("0 - Encerrar Programa.");
		System.out.print("Opção: ");
		opcao = input.nextInt();
		System.out.println("- - - - - - - - - - - - - \n");
		
		while (opcao != 0) {
			
			switch(opcao) {
			
			case 1:
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				System.out.print("Opção: ");
				opcao = input.nextInt();
				System.out.println("");
				System.out.println("- - - - - - - - - - - - - \n");
				
				if (opcao == 1) {
					System.out.print("Digite o valor: U$ ");
					valor = input.nextDouble();
					dolar.adicionarDolar(valor);
				} else if (opcao == 2) {
					System.out.print("Digite o valor: € ");
					valor = input.nextDouble();
					euro.adicionarEuro(valor);
				} else if (opcao == 3) {
					System.out.print("Digite o valor: R$ ");
					valor = input.nextDouble();
					real.adicionarReal(valor);
				} else {
					System.out.println("Opção inválida!");
					System.out.println("");
					break;
				}
				break;
				
			case 2:
				System.out.println("1 - Dolar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				System.out.print("Opção: ");
				opcao = input.nextInt();
				System.out.println("");
				System.out.println("- - - - - - - - - - - - - \n");
				
				if (opcao == 1) {
					System.out.print("Digite o valor: U$ ");
					valor = input.nextDouble();
					dolar.removerDolar(valor);
				} else if (opcao == 2) {
					System.out.print("Digite o valor: € ");
					valor = input.nextDouble();
					euro.removerEuro(valor);
				} else if (opcao == 3) {
					System.out.print("Digite o valor: R$ ");
					valor = input.nextDouble();
					real.removerReal(valor);
				} else {
					System.out.println("Opção inválida!");
					System.out.println("");
					break;
				}
				break;
				
			case 3:
				for (Moedas o : lista) {
					o.info();
				}
				System.out.println("");
				break;
				
			case 4:
				saldo = saldo + real.converter();
				saldo = saldo + dolar.converter();
				saldo = saldo + euro.converter();
				
				System.out.printf("Saldo total convertido para BRL: R$ %.2f \n", saldo);
				System.out.println();
				break;
				
			default: 
				System.out.println("Opção inválida! \n");
				break;
			}
			
			System.out.println("- - - Gelbcke´s Bank - - -");
			System.out.println("1 - Adicionar dinheiro");
			System.out.println("2 - Remover dinheiro");
			System.out.println("3 - Listar saldo de moedas");
			System.out.println("4 - Listar total em BRL");
			System.out.println("0 - Encerrar Programa.");
			System.out.print("Opção: ");
			opcao = input.nextInt();
			System.out.println("- - - - - - - - - - - - - \n");
			
		}
		
		
	}

}
