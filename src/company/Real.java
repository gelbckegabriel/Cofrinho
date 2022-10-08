package company;

public class Real extends Moedas {
	
	double saldoReal;
	
	// ADICIONAR REAL.
	public double adicionarReal(double valor) {
		System.out.printf("R$ %.2f adicionado com sucesso! \n", valor);
		System.out.println("");
		return saldoReal = saldoReal + valor;
	}

	// REMOVER REAL.
	public void removerReal(double valor) {
		
		// CONDICIONAL PARA VERIFICAR SE HÁ SALDO SUFICIENTE PARA RETIRADA.
		if (valor > saldoReal) {
			System.out.println("Saldo insuficiente para retirada!");
			System.out.printf("Saldo disponível: R$ %.2f \n", saldoReal);
			System.out.println("");
		} else {
			System.out.printf("R$ %.2f removido com sucesso! \n", valor);
			System.out.println("");
			saldoReal = saldoReal - valor;
		}
	}
	
	// INFORMAR SALDO.
	@Override
	void info() {
		System.out.printf(" Saldo: R$ %.2f \n", saldoReal);
	}

	@Override
	double converter() {
		return saldoReal;
	}
	
}
