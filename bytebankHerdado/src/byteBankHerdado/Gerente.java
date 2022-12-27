package byteBankHerdado;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("chamando o método de bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
