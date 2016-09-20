package CadastroDados;
import java.util.Scanner;

public class JuizCasamento extends CadastroClassePai{
	
	Scanner ler = new Scanner(System.in);
	
	private String celular;
	private String cpf;
	private String identidade;
	private String tituloEleitoral;
	private String cargo = "Juiz de Casamento";
	
	
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	public String getTituloEleitoral() {
		return tituloEleitoral;
	}
	public void setTituloEleitoral(String tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	//Método Tabelião
	public void DadosJuizCasamento(){
		
		JuizCasamento dados = new JuizCasamento();
		
		System.out.println("\n***************DADOS DO TABELIÃO***************\n");
			
		System.out.print("Nome: ");
		dados.setNome(ler.nextLine());
			
		System.out.print("Endereço: ");
		dados.setEndereco(ler.nextLine());
			
		System.out.print("Número: ");
		dados.setNumero(ler.nextInt());
			
		System.out.print("Complemento: ");
		dados.setComplemento(ler.nextLine());
			
		System.out.print("Bairro: ");
		dados.setBairro(ler.nextLine());
		
		System.out.print("Cidade: ");
		dados.setCidade(ler.nextLine());
			
		System.out.print("Estado: ");
		dados.setEstado(ler.nextLine());
			
		System.out.print("Telefone fixo: ");
		dados.setTelefoneFixo(ler.nextLine());
			
		System.out.print("E-mail: ");
		dados.setEmail(ler.nextLine());
		
		System.out.print("CEP: ");
		dados.setCep(ler.nextLine());
			
		System.out.print("Comarca: ");
		dados.setComarca(ler.nextLine());
			
		System.out.print("Distrito: ");
		dados.setDistrito(ler.nextLine());
			
		System.out.print("Celular: ");
		dados.setCelular(ler.nextLine());
			
		System.out.print("CPF: ");
		dados.setCpf(ler.nextLine());
			
		System.out.print("Identidade: ");
		dados.setIdentidade(ler.nextLine());
			
		System.out.print("Título Eleitoral: ");
		dados.setTituloEleitoral(ler.nextLine());
			
		System.out.print("Cargo: ");
		dados.setCargo(ler.nextLine());
				
		}
	
	
}
