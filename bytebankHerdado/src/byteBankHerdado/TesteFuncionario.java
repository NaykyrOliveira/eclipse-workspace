package byteBankHerdado;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-09");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
}
