import java.util.Scanner;
public class PrincipalCuenta {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		System.out.println("¿Cuantos clientes va a ingresar?: ");
		int p=entrada.nextInt();
		int Clientes [] = new int [p];
		for(int i = 1;i <= Clientes.length;i++){
			int opcion;
			System.out.println("Ingrese nombre del cliente: ");
			cuenta.setNombreCliente(entrada.next());
			System.out.println("Ingrese numero de cuenta del cliente: ");
			cuenta.setNumeroCuenta(entrada.next());
			System.out.println("Ingrese tipo de Interes: ");
			cuenta.setTipoInteres(entrada.nextDouble());
			System.out.println("Ingrese saldo: ");
			cuenta.setSaldo(entrada.nextDouble());
	
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-**-*-*-*-*-*");
			System.out.println("1-Ingreso");
			System.out.println("2-Reintegro");
			System.out.println("3-Salir");
			System.out.println("Opcion: ");
			opcion=entrada.nextInt();
			switch(opcion){
				case 1:
					double  monto;
					System.out.print("Ingrese el aumento del saldo: ");
					monto=entrada.nextDouble();
					cuenta.ingreso(monto);
					System.out.println("Transferencia Realizada: "+cuenta.ingreso(monto));
					break;
				case 2:
					double descuento;
					System.out.print("Ingrese el descuento del saldo: ");
					descuento=entrada.nextDouble();
					if(cuenta.getSaldo()>=descuento){
					cuenta.reintegro(descuento);
					System.out.println("Transferencia de Reintegro realizada: "+cuenta.reintegro(descuento));
					}else{
					System.out.println("El saldo es insuficiente");
					}
					break;
				case 3:
					break;
				default:
					System.out.println("OPCIÓN INCORRECTA");
			}
			System.out.println("*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.println("Usted ha ingresado "+(i+1)+" clientes");
			System.out.println("*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		}
	
	}

}
