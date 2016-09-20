package CadastroDados;
import java.util.Scanner;

public class CadastroClassePai {
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	private String nome;
	private String endereco;
	private int	   numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefoneFixo;
	private String email;
	private String cep;
	private String comarca;
	private String distrito;
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComarca() {
		return comarca;
	}
	public void setComarca(String comarca) {
		this.comarca = comarca;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public void CadastroDadosPessoais(Tabeliao dados){
		
		//CadastroClassePai dados = new CadastroClassePai();
		
		System.out.print("Nome: ");
		dados.setNome(ler.nextLine());
		
		System.out.print("Endereço: ");
		dados.setEndereco(ler.nextLine());
			
		System.out.print("Número: ");
		dados.setNumero(lerInteiro.nextInt());
			
		System.out.print("Complemento: ");
		dados.setComplemento(ler.nextLine());
			
		System.out.print("Bairro: ");
		dados.setBairro(ler.nextLine());
			
		System.out.print("Cidade: ");
		dados.setCidade(ler.nextLine());
		
		System.out.print("Estado: ");
		dados.setEstado(ler.nextLine());
			
		/*System.out.print("Telefone fixo: ");
		dados.setTelefoneFixo(ler.nextLine());
			
		System.out.print("E-mail: ");
		dados.setEmail(ler.nextLine());
			
		System.out.print("CEP: ");
		dados.setCep(ler.nextLine());
			
		System.out.print("Comarca: ");
		dados.setComarca(ler.nextLine());
			
		System.out.print("Distrito: ");
		dados.setDistrito(ler.nextLine());
		
		/*System.out.print("Celular: ");
		dados.setCelular(ler.nextLine());
			
		System.out.print("CPF: ");
		dados.setCpf(ler.nextLine());
			
		System.out.print("Identidade: ");
		dados.setIdentidade(ler.nextLine());
			
		System.out.print("Título Eleitoral: ");
		dados.setTituloEleitoral(ler.nextLine());
			
		System.out.print("Cargo: ");
		dados.setCargo(ler.nextLine());*/

	}
	

}

