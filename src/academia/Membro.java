package academia;

public class Membro {
	
	private char tipoMembro;
	private int cpfMembro;
	private String nome;
	private double mensalidade;
	
	Membro(char tipoMembro, int cpfMembro, String nome, double mensalidade) {
		this.tipoMembro = tipoMembro;
		this.cpfMembro = cpfMembro;
		this.nome = nome;
		this.mensalidade = mensalidade;
	}

	public char getTipoMembro() {
		return tipoMembro;
	}

	public void setTipoMembro(char tipoMembro) {
		this.tipoMembro = tipoMembro;
	}

	public int getCpfMembro() {
		return cpfMembro;
	}

	public void setCpfMembro(int cpfMembro) {
		this.cpfMembro = cpfMembro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	@Override
	public String confirmacao() {
		return tipoMembro +", "+ cpfMembro + ", "+ nome + ", " + mensalidade;
	}

}
