package bytebankHerdadoConta;

public class TesteTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		calculadora.registra(contaCorrente);
		calculadora.registra(seguro);
	
		System.out.println(calculadora.getTotalImposto());
	}
}
