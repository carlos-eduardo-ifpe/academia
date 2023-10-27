package academia;

public class MultiMembros extends Membro{
	
	private int pontosDeFidelidade;
	
	MultiMembros(char tipoMembro, int cpfMembro, String nome, double mensalidade, int pontosDeFidelidade){
		super(tipoMembro, cpfMembro, nome, mensalidade);
		this.pontosDeFidelidade = pontosDeFidelidade;
	}

	public int getPontosDeFidelidade() {
		return pontosDeFidelidade;
	}

	public void setPontosDeFidelidade(int pontosDeFidelidade) {
		this.pontosDeFidelidade = pontosDeFidelidade;
	}
	
	@Override
	public String confirmacao() {
		return super.toString() + ", " + pontosDeFidelidade;
	}
}