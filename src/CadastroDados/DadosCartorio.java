package CadastroDados;
import java.io.IOException;
import java.util.Scanner;

public class DadosCartorio extends CadastroClassePai {
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	private String cnpj;
	private String cnsServentia;
	private String titularCartorio;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnsServentia() {
		return cnsServentia;
	}
	public void setCnsServentia(String cnsServentia) {
		this.cnsServentia = cnsServentia;
	}
	public String getTitularCartorio() {
		return titularCartorio;
	}
	public void setTitularCartorio(String titularCartorio) {
		this.titularCartorio = titularCartorio;
	}
	
	public void DadosCartorio() throws IOException{
		
		DadosCartorio dadosCart = new DadosCartorio();
		/*CadastroClassePai chamaCadastro = new CadastroClassePai();
		chamaCadastro.DadosParaCadastro();*/
		
		System.out.println("\n***************DADOS DO CARTÓRIO***************\n");
		
		System.out.print("Nome do Cartório: ");
		dadosCart.setNome(ler.nextLine());
		
		System.out.print("Endereço: ");
		dadosCart.setEndereco(ler.nextLine());
			
		System.out.print("Número: ");
		dadosCart.setNumero(lerInteiro.nextInt());
			
		System.out.print("Complemento: ");
		dadosCart.setComplemento(ler.nextLine());
			
		System.out.print("Bairro: ");
		dadosCart.setBairro(ler.nextLine());
			
		System.out.print("Cidade: ");
		dadosCart.setCidade(ler.nextLine());
		
		System.out.print("Estado: ");
		dadosCart.setEstado(ler.nextLine());
			
		System.out.print("Telefone fixo: ");
		dadosCart.setTelefoneFixo(ler.nextLine());
			
		System.out.print("E-mail: ");
		dadosCart.setEmail(ler.nextLine());
			
		System.out.print("CEP: ");
		dadosCart.setCep(ler.nextLine());
			
		System.out.print("Comarca: ");
		dadosCart.setComarca(ler.nextLine());
			
		System.out.print("Distrito: ");
		dadosCart.setDistrito(ler.nextLine());

		System.out.print("CNPJ: ");
		dadosCart.setCnpj(ler.nextLine());
		
		System.out.print("CNS Serventia: ");
		dadosCart.setCnsServentia(ler.nextLine());
		
		System.out.print("Titular do Cartório: ");
		dadosCart.setTitularCartorio(ler.nextLine());
	
		
	}
	
	
	
	

}
