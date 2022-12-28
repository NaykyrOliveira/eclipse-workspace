package byteBankHerdado;

public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
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

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
