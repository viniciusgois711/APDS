package dominio;

public class Pessoa {
	
	private String nome;
	private String nEmpresa;
	private String dataE;
	private String dataS;
	private int qtdEmpresas;
	
	public Pessoa(String nome, int qtdEmpresas, String nEmpresa, String dataE, String dataS) {
		this.nome = nome;
		this.qtdEmpresas = qtdEmpresas;
		this.nEmpresa = nEmpresa;
		this.dataE = dataE;
		this.dataS = dataS;
	}
	
	public int getQtdEmpresas() {
		return qtdEmpresas;
	}
	public void setQtdEmpresas(int qtdEmpresas) {
		this.qtdEmpresas = qtdEmpresas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getnEmpresa() {
		return nEmpresa;
	}
	public void setnEmpresa(String nEmpresa) {
		this.nEmpresa = nEmpresa;
	}
	public String getDataE() {
		return dataE;
	}
	public void setDataE(String dataE) {
		this.dataE = dataE;
	}
	public String getDataS() {
		return dataS;
	}
	public void setDataS(String dataS) {
		this.dataS = dataS;
	}
	
}