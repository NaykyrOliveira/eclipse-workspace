package byteBankHerdado;

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do designer");
		return 200;
	}
}
