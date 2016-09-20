package CadastroDados;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabeliao extends CadastroClassePai{

	Scanner ler = new Scanner(System.in);
	Scanner lerInteiro = new Scanner(System.in);
	
	private String celular;
	private String cpf;
	private String identidade;
	private String tituloEleitoral;
	private String cargo;
	private String usuario;
	private String senha;
	
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
	
	public String toString(){
		return usuario + "|" + senha + "|" + getNome() + "|" + getEndereco() + "|" + getNumero() + "|" + getComplemento() + "|" + getBairro() + "|" + getCidade() + "|" + getEstado() + "\r";
	}
	
	
	//Método Tabelião
	public void DadosTabeliao() throws IOException{
		
	Tabeliao dadosTab = new Tabeliao();
	CadastroClassePai chamaCadastro = new CadastroClassePai();
		
	System.out.println("\n***************DADOS DO TABELIÃO***************\n");
	
	System.out.print("Usuário: ");
	dadosTab.setUsuario(ler.nextLine());
		
	System.out.print("Senha: ");
	dadosTab.setSenha(ler.nextLine());
	
	chamaCadastro.CadastroDadosPessoais(dadosTab);
		
	/*System.out.print("Nome: ");
	dadosTab.setNome(ler.nextLine());
	
	System.out.print("Endereço: ");
	dadosTab.setEndereco(ler.nextLine());
		
	System.out.print("Número: ");
	dadosTab.setNumero(lerInteiro.nextInt());
		
	System.out.print("Complemento: ");
	dadosTab.setComplemento(ler.nextLine());
		
	System.out.print("Bairro: ");
	dadosTab.setBairro(ler.nextLine());
		
	System.out.print("Cidade: ");
	dadosTab.setCidade(ler.nextLine());
	
	System.out.print("Estado: ");
	dadosTab.setEstado(ler.nextLine());
		
	/*System.out.print("Telefone fixo: ");
	dadosTab.setTelefoneFixo(ler.nextLine());
		
	System.out.print("E-mail: ");
	dadosTab.setEmail(ler.nextLine());
		
	System.out.print("CEP: ");
	dadosTab.setCep(ler.nextLine());
		
	System.out.print("Comarca: ");
	dadosTab.setComarca(ler.nextLine());
		
	System.out.print("Distrito: ");
	dadosTab.setDistrito(ler.nextLine());
	
	System.out.print("Celular: ");
	dadosTab.setCelular(ler.nextLine());
		
	System.out.print("CPF: ");
	dadosTab.setCpf(ler.nextLine());
		
	System.out.print("Identidade: ");
	dadosTab.setIdentidade(ler.nextLine());
		
	System.out.print("Título Eleitoral: ");
	dadosTab.setTituloEleitoral(ler.nextLine());
		
	System.out.print("Cargo: ");
	dadosTab.setCargo(ler.nextLine());*/
		
		
		//Salvando os usuários em arquivos TXT - As classes foram importadas em passo a passo...
		File arq = new File("src/CadastroDados/tabeliao/tabelioesCadastrados.txt"); //url - parâmetro de criação para File que representa o caminho do arquivo
		FileWriter escritor = new FileWriter(arq,true); // o valor true é para não apagar valor anterior existente.
		escritor.write(dadosTab.toString()+"\n"); //utiliza o modelo do toString criado
		escritor.flush(); //libera o buffer de memória
		escritor.close(); //fecha a escrita no arquivo*/
		
	}

}
