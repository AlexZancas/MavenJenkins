import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name = "";
		String lastname = "";
		String city = "";
		int age = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nombre: ");
		name = scanner.nextLine();
		
		System.out.println("Apellido: ");
		lastname = scanner.nextLine();
		
		System.out.println("Ciudad: ");
		city = scanner.nextLine();
		
		System.out.println("Edad: ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		
		
		
	}
}
