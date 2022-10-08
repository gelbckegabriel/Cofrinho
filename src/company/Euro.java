package company;

public class Euro extends Moedas {

	double saldoEuro;

	// ADICIONAR EURO.
	public double adicionarEuro(double valor) {
		System.out.printf("€ %.2f adicionado com sucesso! \n", valor);
		System.out.println("");
		return saldoEuro = saldoEuro + valor;
	}
	
	// REMOVER EURO.
	public void removerEuro(double valor) {
		
		// CONDICIONAL PARA VERIFICAR SE HÁ SALDO SUFICIENTE PARA RETIRADA.
		if (valor > saldoEuro) {
			System.out.println("Saldo insuficiente para retirada!");
			System.out.printf("Saldo disponível: € %.2f \n", saldoEuro);
			System.out.println("");
		} else {
			System.out.printf("€ %.2f removido com sucesso! \n", valor);
			System.out.println("");
			saldoEuro = saldoEuro - valor;
		}
	}
	
	// INFORMAR SALDO.
	@Override
	void info() {
		System.out.printf(" Saldo:  € %.2f \n", saldoEuro);
	}

	// CONVERTER MOEDA PARA REAL.
	@Override
	double converter() {
		return saldoEuro * 7.16;
	}
	
}
