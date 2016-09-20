package Principal;

import java.io.IOException;
import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String args[]) throws IOException{
		
		Scanner ler = new Scanner(System.in);
		Login loginLogin = new Login();
		
		//Chama o metodo Validação Login
		loginLogin.validacaoLogin(null, null);

	}
}
