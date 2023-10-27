package academia;

public class MembroSingular extends Membro{
	
	private int clube;
	
	MembroSingular(char tipoMembro, int cpfMembro, String nome, double mensalidade, int clube){
		super(tipoMembro, cpfMembro, nome, mensalidade);
		this.clube = clube;
	}

	public int getClube() {
		return clube;
	}

	public void setClube(int clube) {
		this.clube = clube;
	}
	
	@Override
	public String confirmacao() {
		return super.confirmacao() + ", " + clube;
	}

}
