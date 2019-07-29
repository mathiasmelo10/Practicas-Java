package paquete;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
		int opcion;
		
		
		int pComun=5;
		
		
		int pRelleno=15;
		
		
		int pPastelitos=20;
		
		int aguaCaliente=0;
		int PaguaCaliente=10;
		
		int OpcionC;
		int CantComun=0;
		
		int OpcionR;
		int CantRelleno=0;
		
		int OpcionP;
		int CantPastelitos=0;
		
		int totalComun=0;
		int totalRelleno=0;
		int totalPastelitos=0;
		int totalAguaCaliente=0;
		
		int total=0;
			
			do{
				System.out.println("CHURRERIA");
				System.out.println("1.COMÚN: "+pComun+"$");
				System.out.println("2.RELLENO: "+pRelleno+"$");
				System.out.println("3.PASTELITOS: "+pPastelitos+"$");
				System.out.println("4.AGUA CALIENTE: "+PaguaCaliente+"$");
				System.out.println("5.SALIR");
				System.out.println("Opcion: ");
				opcion=entrada.nextInt();
					switch(opcion){
						case 1 :
							System.out.println("¿Cuantos Churros COMUNES quiere?: ");
							OpcionC=entrada.nextInt();
							CantComun=CantComun+OpcionC;
							System.out.println("Sale/en "+CantComun+" Comun/es");
							break;
						case 2 :
							System.out.println("¿Cuantos Churros RELLENOS quiere?: ");
							OpcionR=entrada.nextInt();
							CantRelleno=CantRelleno+OpcionR;
							System.out.println("Sale/en "+CantRelleno+" con RELLENO");
							break;
						case 3 :
							System.out.println("¿Cuantos PASTELITOS quiere?: ");
							OpcionP=entrada.nextInt();
							CantPastelitos=CantPastelitos+OpcionP;
							System.out.println("Sale/en "+CantPastelitos+" PASTELITOS");
							break;
						case 4:
							System.out.println("Sale"+aguaCaliente+"AGUA CALIENTE");
							aguaCaliente++;
							break;
						case 5 :
							break;
						default :
							System.out.println("OPCION INCORRECTA");
					}
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				
				
			}while(opcion != 5);
			totalComun=CantComun*pComun;
			totalRelleno=CantRelleno*pRelleno;
			totalPastelitos=CantPastelitos*pPastelitos;
			totalAguaCaliente=aguaCaliente*PaguaCaliente;
			
			total=totalComun+totalRelleno+totalPastelitos+totalAguaCaliente;
			
			System.out.println("CUENTA:");
			System.out.println(CantComun+" COMUNES: "+totalComun+"$");
			System.out.println(CantRelleno+" RELLENOS: "+totalRelleno+"$");
			System.out.println(CantPastelitos+" PASTELITOS: "+totalPastelitos+"$");
			System.out.println(aguaCaliente+" AGUA CALIENTE: "+totalAguaCaliente+"$");
			System.out.println("IMPORTE TOTAL: "+total+"$");
			
				
			}
	}
	


