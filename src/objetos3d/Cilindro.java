package objetos3d;
import figura.Figura3D;
import objetos2d.Circulo;
import objetos2d.DimensaoSuperficial;

public class Cilindro extends Figura3D implements DimensaoVolumetrica,DimensaoSuperficial{
	private Double altura;
	private Double raio;
	
	
	public Cilindro(Double altura, Double raio) {
		super();
		this.altura = altura;
		this.raio = raio;
	}
	public Cilindro() {}




@Override
	public void calcularArea() {
		double area;
		area = (2*Math.PI*raio*altura)+(2*Math.PI*Math.pow(raio,2));
		super.setAreaSuperficial(area);
	}
@Override
	public void calcularPerimetro() {
		double per;
		per = 4*Math.PI*raio;
		super.setPerimetro(per);
	}
@Override	
	public void calcularVolume() {
		Circulo circulo = new Circulo();
		circulo.setRaio(raio);
		circulo.calcularArea();
		super.setVolume(circulo.getArea()*altura);
	}
	
	
	
	
	
	
	
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
}
