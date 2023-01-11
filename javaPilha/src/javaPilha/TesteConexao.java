package javaPilha;

public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conex = new Conexao()) {
			conex.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conexão");
		}
		
		//-----------------------------------
		
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//			
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro na conexão");
//			
//		} finally {
//			System.out.println("finally");
//			if(conexao != null) {
//				conexao.close();
//			}
//		}

	}

}
