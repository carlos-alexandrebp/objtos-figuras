package codigo;

import objetos2d.Circulo;
import objetos3d.Cilindro;

//Area para fazer teste importe analize os metodos,classe,interfaces e pacotes.

public class testar {
	public static void main(String[] args) {
	//EX.. Circulo
		Circulo cir = new Circulo(4.0);
		cir.calcularPerimetro();
		cir.calcularArea();
		System.out.println("circuferencia : "+cir.getPerimetro());
	//EX.. Cilindro
		Cilindro cil = new Cilindro(3.0,4.0);
		cil.calcularArea();
		cil.calcularPerimetro();
		System.out.println("perimetro : "+cil.getPerimetro());
		
		
	}
}
