package figura;
public class FigurasGeometricas {
	private String nome;
	private String cor;
	
	
	public FigurasGeometricas(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	public FigurasGeometricas() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
