package objetos2d;
import figura.Figura2D;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	private Double lado;
	
	
	public Quadrado(Double lado) {
		super();
		this.lado = lado;
	}
	public Quadrado() {}
	
@Override
	public void calcularArea() {
		super.setArea(lado*lado);
	}
@Override
	public void calcularPerimetro() {
		super.setPerimetro(lado*4);
	}
	
	
	
	
	
	
 	public Double getLado() {
		return lado;
	}
	public void setLado(Double lado) {
		this.lado = lado;
	}
}
