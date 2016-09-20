package Principal;

import java.io.IOException;
import java.util.Scanner;

import CadastroDados.DadosCartorio;
import CadastroDados.JuizCasamento;
import CadastroDados.Tabeliao;

public class Menu {
	
	private int menu;
	
	Scanner ler = new Scanner(System.in);

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}
	
	
	//===============================MENU PRINCIPAL============================================
	public void listaMenu() throws IOException{
		
		System.out.println("\n***************MENU***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Cartório.");
		System.out.println("[3] -> Cadastrar Tabeliões.");
		System.out.println("[4] -> Cadastrar Juiz de Casamentos.");
		System.out.println("[5] -> Abertura de Firma.");
		System.out.println("[6] -> Emitir Registro de Nascimento.");
		System.out.println("[7] -> Emitir Registro de Casamento.");
		System.out.println("[8] -> Emitir Registro de Divórcio.");
		System.out.println("[9] -> Emitir Registro de Óbito.");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			System.out.println("Por enquanto ainda não faz nada.");
		} break;
		
		case 2:{
			menuDadosCartorio();
		}break;
		
		case 3:{
			menuDadosTabeliao();
			
		} break;
		
		case 4:{
			menuDadosJuizCasamento();
		} break;
		
		case 5:{
			//menuDadosAberturaFirma();
			//AberturaFirma aberturaFirma = new AberturaFirma();
		} break;
		
		case 6:{
			//menuDadosRegistroNascimento();
			//RegistroNascimento registroNascimento = new RegistroNascimento();
		} break;
		
		case 7:{
			//menuDadosRegistroCasamento();
			//RegistroCasamento registroCasamento = new RegistroCasamento();
		} break;
		
		case 8:{
			//menuDadosRegistroDivorcio();
			//RegistroDivorcio registroDivorcio = new RegistroDivorcio();
		} break;
		
		case 9:{
			//menuDadosRegistroObito();
			//RegistroObito registroObito = new RegistroObito();
		} break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso sistema.");
		} break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
	}//fim método listaMenu (menu principal)
	
	
	//===============================MENU CARTÓRIO============================================
	public void menuDadosCartorio() throws IOException{
		
		System.out.println("\n***************MENU DADOS DO CARTÓRIO***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Cartório");
		System.out.println("[3] -> Editar Dados do Cartório");
		System.out.println("[4] -> Excluir Dados do Cartório");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			System.out.println("Por enquanto ainda não faz nada.");
		
		} break;
		
		case 2:{
			DadosCartorio dados = new DadosCartorio();
			dados.DadosCartorio();
		}break;
		
		case 3:{
			//Editar Dados do Cartório
		}break;
		
		case 4:{
			//Excluir Dados do Cartório
		}break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Cartório
	
	//===============================MENU TABELIÃO============================================
	public void menuDadosTabeliao() throws IOException{
		
		System.out.println("\n***************MENU DADOS DO TABELIÃO***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Tabelião");
		System.out.println("[3] -> Editar Dados do Tabelião");
		System.out.println("[4] -> Excluir Dados do Tabelião");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			System.out.println("Por enquanto ainda não faz nada.");
		
		} break;
		
		case 2:{
			Tabeliao dados = new Tabeliao();
			dados.DadosTabeliao();
		}break;
		
		case 3:{
			//Editar Dados do Tabeliao
		}break;
		
		case 4:{
			//Excluir Dados do Tabeliao
		}break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Tabeliao
	
	
	
	//===============================MENU JUIZ CASAMENTO============================================
	public void menuDadosJuizCasamento(){
		
		System.out.println("\n***************MENU DADOS DO TABELIÃO***************\n");
		
		System.out.println("[1] -> Pesquisar.");
		System.out.println("[2] -> Cadastrar Dados do Juiz de Casamento");
		System.out.println("[3] -> Editar Dados do Juiz de Casamento");
		System.out.println("[4] -> Excluir Dados do Juiz de Casamento");
		System.out.println("[0] -> Sair do Programa.");

		System.out.print("\nO que deseja fazer? -> "); 
		menu = ler.nextInt();
		
		switch(menu){
			
		case 1:{
			
			System.out.println("Por enquanto ainda não faz nada.");
		
		} break;
		
		case 2:{
			JuizCasamento dados = new JuizCasamento();
			dados.DadosJuizCasamento();
		}break;
		
		case 3:{
			//Editar Dados do Juiz Casamento
		}break;
		
		case 4:{
			//Excluir Dados do Juiz Casamento
		}break;
		
		case 0:{
			System.out.println("Obrigado por usar nosso Sistema.");
		}break;
		
		default:{
			System.out.println("Erro!");
		}
		
		}//fim switch
		
		
	}//fim do menu Dados do Tabeliao

}
