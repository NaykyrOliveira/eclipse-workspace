package byteBankHerdado;

public class Cliente implements Autenticavel {

	private Autenticador autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.autenticador.autentica(senha);
	}
}
