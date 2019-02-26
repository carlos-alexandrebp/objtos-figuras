package objetos3d;
import figura.Figura3D;
import objetos2d.DimensaoSuperficial;

public class Cubo extends Figura3D implements DimensaoVolumetrica,DimensaoSuperficial{
	private Double aresta;


	
	public Cubo(Double aresta) {
		super();
		this.aresta = aresta;
	}
	public Cubo() {}
	
	
	
@Override
	public void calcularArea() {
		setAreaSuperficial(6*Math.pow(aresta, 2));
		
	}
@Override
	public void calcularPerimetro() {
		setPerimetro(12*aresta);
		
	}
@Override	
	public void calcularVolume() {
		super.setVolume(aresta*aresta*aresta);
	}
	
	
	
	
	
	
	public Double getAresta() {
		return aresta;
	}
	public void setAresta(Double aresta) {
		this.aresta = aresta;
	}
	
}
