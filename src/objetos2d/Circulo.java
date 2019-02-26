package objetos2d;
import figura.Figura2D;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	private Double raio;
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}
	public Circulo() {}

	
@Override	
	public void calcularArea() {
		super.setArea(Math.PI*raio*raio);
	}
@Override	
	public void calcularPerimetro() {
		super.setPerimetro(2*Math.PI*raio);
	}
	
	
	
	
	
	
	
	
	
	
	
	public Double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		this.raio = raio;
	}
}
