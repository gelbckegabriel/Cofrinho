package company;

public class Dolar extends Moedas {
	
	double saldoDolar;
	
	// ADICIONAR DOLAR.
	public double adicionarDolar(double valor) {
		System.out.printf("U$ %.2f adicionado com sucesso! \n", valor);
		System.out.println("");
		return saldoDolar = saldoDolar + valor;
	}
	
	// REMOVER DOLAR.
	public void removerDolar(double valor) {
		
		// CONDICIONAL PARA VERIFICAR SE HÁ SALDO SUFICIENTE PARA RETIRADA.
		if (valor > saldoDolar) {
			System.out.println("Saldo insuficiente para retirada!");
			System.out.printf("Saldo disponível: U$ %.2f \n", saldoDolar);
			System.out.println("");
		} else {
			System.out.printf("U$ %.2f removido com sucesso! \n", valor);
			System.out.println("");
			saldoDolar = saldoDolar - valor;
		}
	}

	// INFORMAR SALDO.
	@Override
	void info() {
		System.out.printf(" Saldo: U$ %.2f \n", saldoDolar);
		
	}

	// CONVERTER MOEDA PARA REAL.
	@Override
	double converter() {
		return saldoDolar * 5.15;
	}
}
