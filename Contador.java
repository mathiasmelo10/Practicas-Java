import java.util.Scanner;
public class Contador {
	//EJERCICIO 2
	Scanner entrada = new Scanner(System.in);
	private int Cont;
	
	public Contador(){
		
	}
	
	public void Cont(int Cont){
		System.out.println("Ingrese un valor: "+Cont);
		this.Cont=entrada.nextInt();
		
		if(this.Cont < 0){
			this.Cont=0;
			System.out.println("El valor ingresado no puede ser negativo: "+this.Cont);
		}
	}
	
	
	public void decrementar(){
		
		this.Cont=this.Cont-2;
		System.out.println("El valor DECREMENTADO en 1 es: "+this.Cont);
		if(this.Cont < 0){
			this.Cont=0;
			System.out.println("El valor no puede ser Negativo aunque decremente: "+this.Cont);
		}
	}
	public void incrementar(){
		
		this.Cont=this.Cont+1;
		System.out.println("El valor INCREMENTADO en 1 es: "+this.Cont);
	}
	
	public void setCont(int Cont){
		this.Cont=Cont;
	}
	public int getCont(){
		return this.Cont;
	}

}
