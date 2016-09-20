package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	private String usuario;
	private String senha;
	
	//M�todos Getters e Setters 
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	//Metodo Login e Verifica��o 
	public void validacaoLogin(String usuario,String senha) throws IOException{
			
		Login loginLogin = new Login();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("**********CAMPO DE LOGIN**********\n");
		
		System.out.print("Usu�rio: ");
		loginLogin.setUsuario(ler.nextLine());
			
		System.out.print("Senha: ");
		loginLogin.setSenha(ler.nextLine());
		
		//Salvando os usu�rios em arquivos TXT - As classes foram importadas em passo a passo...
		File arq = new File("src/CadastroDados/tabeliao/tabelioesCadastrados.txt"); //url - par�metro de cria��o para File que representa o caminho do arquivo
		FileWriter escritor = new FileWriter(arq,true); // o valor true � para n�o apagar valor anterior existente.
		
		//Recuperando os valores cadastrados em arquivo
		FileReader leitor = new FileReader(arq);
		BufferedReader bufferLeitura = new BufferedReader(leitor);
		String linha; //Linha do arquivo

		while((linha = bufferLeitura.readLine()) != null){//Ir� repetir at� que a linha do arquivo seja vazia
			String[] loginPassword = linha.split("\\|"); //Separa os valores da linha pelo separador |
						
			if((loginLogin.usuario.equals(loginPassword[0])) && (loginLogin.senha.equals(loginPassword[1]))){
				
				Menu listaMenu = new Menu();
				listaMenu.listaMenu();
				
				break;
				
			}else{
				System.out.print("\nUsu�rio e/ou Senha incorretos.");
			}
			
		}//fim valida��o login
			
		
}//
}//fim da classe login