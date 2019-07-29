
/*
Crear una clase Rect�ngulo, con atributos base y altura.
Crear tambi�n el constructor de la clase y los  m�todos  necesarios  para  calcular  el  �rea  y  el  per�metro. 
 Crear  otra  clase  PruebaRectangulo que pruebe varios rect�ngulos y muestre por consola sus �reas y per�metros.
*/
import java.util.Scanner;
public class Rectangulo {
	Scanner entrada = new Scanner(System.in);
	private float base;
	private float altura;
	private float area;
	private float perimetro;
	
	public Rectangulo(){
		
	}
	public void Rect(float base , float altura) {
		System.out.println("Ingrese el valor de la base del Rectangulo: ");
		this.base=entrada.nextFloat();
		
		System.out.println("Ingrese el valor de la altura del Rectangulo: ");
		this.altura=entrada.nextFloat();
	}
	public void area(){
		System.out.print("�rea del Rectangulo:");
		System.out.print("-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- ");
		 area = this.base * this.altura /2;
		 System.out.println("El �REA del Rectangulo es: "+area);
	}
	public void perimetro(){
		System.out.print("Per�metro del Rectangulo: ");
		System.out.print("-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- ");
		perimetro = this.base*2+this.altura*2;
		System.out.println("El PER�METRO del Rectangulo es: "+perimetro);
		
	}
	public void PruebaRectangulo(){
		System.out.println("Ingrese cuantos Rectangulos quiere calcular: ");
		int j = entrada.nextInt();
		int cantidad [] = new int [j];
		for(int i=0;i <= cantidad.length;i++){
			System.out.println("Usted a ingresado "+(i+1)+" Rectangulos.");
			Rect(1,2);
			area();
			perimetro();
		}
	}
}
