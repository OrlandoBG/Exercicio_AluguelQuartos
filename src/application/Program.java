package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Student[]  rooms = new Student[10];
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("How many rooms will be rented?");
		int Quantityroom = sc.nextInt();
		
		for(int i=0; i<Quantityroom;i++) {
			System.out.printf("Rent #%d:\n",(i+1));
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			
			rooms[room] = new Student(name,email,room);
		}
		
		for(int i=0; i<10;i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i].toString());
			}
		}
		
		sc.close();

	}

}
