package program;

import objetos2d.*;
import objetos3d.*;

//Visao geral do programa

public class teste {

	public static void main(String[] args) {
		
		System.out.println("-------------------Objetos 2d -------------------------");
		System.out.println("");
		
	System.out.printf("Calcular area e perimetros dos Triangulos %n%n");
		
	
	
				Double[] valuesTri = {3.0,4.0,5.0};
				
				Triangulo tri = new Triangulo();
				tri.setLado(valuesTri);
				tri.calcularArea();
				tri.calcularPerimetro();
				
			  System.out.println("Triangulo lados 3.0,4.0,5.0 : <A> "+tri.getArea()+" <P> "+tri.getPerimetro());
				
			
				Double[] valuesTriEquilatero = {3.0,3.0,3.0};
				
				Triangulo triEq = new Triangulo();
				triEq.setLado(valuesTriEquilatero);
				triEq.calcularArea();
				triEq.calcularPerimetro();
				
			  System.out.printf("Triangulo lados 3.0,3.0,3.0 : <A> %.4f <P> %.4f%n%n%n%n%n",triEq.getArea(),triEq.getPerimetro());
			
			
		System.out.printf("Calcular area e perimetro do Quadrado %n%n");
		
				Double ladoQua = 5.0;
				
				Quadrado qua = new Quadrado();
				qua.setLado(ladoQua);
				qua.calcularArea();
				qua.calcularPerimetro();
				
			  System.out.printf("Quadrado com lado 5.0 : <A> %.4f <P> %.4f%n%n%n%n%n",qua.getArea(),qua.getPerimetro());
				
		System.out.printf("Calcular area e perimetro do Circulo %n%n");
				
				Double raioCir = 3.0;
				
				Circulo cir = new Circulo();
				cir.setRaio(raioCir);
				cir.calcularArea();
				cir.calcularPerimetro();
				
			  System.out.printf("Circulo com raio 3.0 : <A> %.4f <P ou C> %.4f%n%n%n",cir.getArea(),cir.getPerimetro());
				
		  System.out.println("-------------------Objetos 3d -------------------------");
			System.out.println("");
			
			System.out.printf("Calcular volume do Cilindro %n%n");
			
			Double altCil = 5.0;
			Double raioCil = 3.0;
					
			
			Cilindro cil = new Cilindro();
			cil.setRaio(raioCil);
			cil.setAltura(altCil);
			cil.calcularVolume();
			
			
			
		  System.out.printf("Cilindro com raio 3.0 e altura de 5.0 : <V> %.4f %n%n%n%n%n",cil.getVolume());
			
		  System.out.printf("Calcular volume do Cubo %n%n");
			
			Double aresta = 5.0;
			
					
			
			Cubo cub = new Cubo();
			cub.setAresta(aresta);
			cub.calcularVolume();
			
			
			
		  System.out.printf("Cubo com com aresta de 5.0 : <V> %.4f %n%n%n%n%n",cub.getVolume());
			
		  System.out.printf("Calcular volume da Piramede %n%n");
			
			Double[] medDaBaseQua = {5.0,5.0};
			Double altura = 6.0;
			//Double[] medDaBaseTri = {3.0,4.0,5.0};
					
			
			Piramede pir = new Piramede();
			pir.setAltura(altura);
			pir.setLadosOuAreaDaBase(medDaBaseQua);
			pir.calcularVolume();
			
			
			
		  System.out.println("Piramede com base quadrada de 5.0 e altura de 6.0: <V> "+pir.getVolume());
		  System.out.println("");
		  	Double[] medDaBaseTri = {3.0,4.0,5.0};
					
			
			Piramede pirBaseTri = new Piramede();
			pirBaseTri.setAltura(altura);
			pirBaseTri.setLadosOuAreaDaBase(medDaBaseTri);
			pirBaseTri.calcularVolume();
			
			
		  
		  System.out.printf("Piramde com base triangular de 5.0 e altura de 6.0: <V> %.4f %n%n%n%n%n",pirBaseTri.getVolume());
			
			
	}

}
