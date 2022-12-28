package byteBankHerdado;

public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.autenticador.autentica(senha);
	}
}
