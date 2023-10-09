package _5_criando_excecoes_personalizadas._1_exemplo._3_terceira_solucao_boa.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import _5_criando_excecoes_personalizadas._1_exemplo._3_terceira_solucao_boa.model.entities.Reservation;
import _5_criando_excecoes_personalizadas._1_exemplo._3_terceira_solucao_boa.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int roomNumber = scanner.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = simpleDateFormat.parse(scanner.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(scanner.next());
			
			reservation.updateDates(checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Erro in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		scanner.close();
	}
	
}
