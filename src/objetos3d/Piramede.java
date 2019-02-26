package objetos3d;
import figura.Figura3D;
import objetos2d.*;

public class Piramede extends Figura3D implements DimensaoVolumetrica,DimensaoSuperficial{
	private Double altura;
	private Double[] ladosOuAreaDaBase;

	
	public Piramede(Double altura, Double[] ladosOuAreaDaBase) {
		super();
		this.altura = altura;
		this.ladosOuAreaDaBase = ladosOuAreaDaBase;
	}
	public Piramede() {}
	
	
	
	
@Override
	public void calcularArea() {
		if(ladosOuAreaDaBase.length == 2) {
			double apotema;
			double area;
			apotema = Math.pow(altura, 2)+Math.pow((ladosOuAreaDaBase[0]/2), 2);
			apotema = Math.sqrt(apotema);
			
			area = (apotema*ladosOuAreaDaBase[0])/2*4;
			area += Math.pow(ladosOuAreaDaBase[0], 2);
			
			super.setAreaSuperficial(area);
		}
		if(ladosOuAreaDaBase.length == 3 
				&& ladosOuAreaDaBase[0] == ladosOuAreaDaBase[1]
				&& ladosOuAreaDaBase[2] == ladosOuAreaDaBase[0]) {
					System.err.println("Nao implementado nesta piramede de base triangular Equilatero");
		}
		else if(ladosOuAreaDaBase.length == 3) {
			System.err.println("Nao implementado nesta piramede de base triangular Issosels");
		}
		
	}
@Override
	public void calcularPerimetro() {
		System.err.println("Nao implementado o calculo de perimetro");
	}
@Override
	public void calcularVolume() {
		if(ladosOuAreaDaBase.length == 3) {
			Triangulo triangulo = new Triangulo();
			triangulo.setLado(ladosOuAreaDaBase);
			triangulo.calcularArea();
			super.setVolume(triangulo.getArea()*altura/3);
		}
		else if(ladosOuAreaDaBase.length == 2) {
			
			Quadrado quadrado = new Quadrado();
			quadrado.setLado(ladosOuAreaDaBase[0]);
			quadrado.calcularArea();
			super.setVolume(quadrado.getArea()*altura/3);
			
		}
		else {
			System.err.println("Para base Quadrada |2| e valores iguais  e triangular |3| valores");
		}
	}
	



	
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double[] getLadosOuAreaDaBase() {
		return this.ladosOuAreaDaBase;
	}
	public void setLadosOuAreaDaBase(Double[] ladosOuAreaDaBase) {
		this.ladosOuAreaDaBase = ladosOuAreaDaBase;
	}
	
}
