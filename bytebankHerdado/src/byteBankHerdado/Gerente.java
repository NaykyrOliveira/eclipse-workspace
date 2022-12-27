package byteBankHerdado;

public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do gerente");
		return super.getSalario();
	}
}
