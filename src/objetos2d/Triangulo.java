package objetos2d;
import figura.Figura2D;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	private Double[] lado;
	
	public Triangulo(Double[] lado) {
		super();
		this.lado = lado;
	}
	public Triangulo() {}
	
@Override	
	public void calcularArea() {
		if(lado[0] == lado[1] && lado[0] == lado[2]) {
			super.setArea(((lado[0]*lado[0])*Math.sqrt(3))/4);
		}else {
			double p = (lado[0]+lado[1]+lado[2])/2;
			super.setArea(Math.sqrt(p*(p-lado[0])*(p-lado[1])*(p-lado[2])));
		}
	}
@Override
	public void calcularPerimetro() {
		super.setPerimetro(lado[0]+lado[1]+lado[2]);
	}
	
	
	
	
	
	
	
	
	public Double[] getLado() {
		return lado;
	}
	public void setLado(Double[] lado) {
		this.lado = lado;
	}
}
