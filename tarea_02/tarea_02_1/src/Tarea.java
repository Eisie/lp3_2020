import java.util.Scanner;

public class Tarea {
	
	public static void main(String[] args) {
		
		boolean compra;
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor(50);
		Scanner lector = new Scanner(System.in);
		System.out.println("Desea llevar algo? (Si s�, ingresa Y): ");
		compra = lector.next().toLowerCase().equals("y");
		
		while(compra) {
			
			try {
				
				System.out.println("Cu�nto deseas llevar?");
				cliente.comprar(lector.nextInt(), vendedor);
				System.out.println("Algo m�s? (Una vez m�s, Y");
				compra = lector.next().toLowerCase().equals("y");
				
			}catch(Exception a){
				
				System.out.println("No te entiendo, perd�n");
				compra = false;
			
			}
		
		}
		
		lector.close();
		System.out.println("Hasta luego!");
	}
}
