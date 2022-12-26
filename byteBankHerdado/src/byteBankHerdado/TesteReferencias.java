package byteBankHerdado;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);
		
		EditorVideo editor = new EditorVideo();
		funcionario.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(editor);
		
		System.out.println(controle.getSoma());
	}
}
