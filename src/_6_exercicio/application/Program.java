package _6_exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import _6_exercicio.model.entities.Account;
import _6_exercicio.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		
		System.out.print("Numero: ");
		int number = scanner.nextInt();
		
		System.out.print("Titular: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		
		System.out.print("Saldo inicial: ");
		double initialBalance = scanner.nextDouble();
		
		System.out.print("Limite de saque: ");
		double withdrawLimit = scanner.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		
		System.out.print("Informe uma quantia para sacar: ");
		double amountWithdraw = scanner.nextDouble();
		
		try {
			account.withDraw(amountWithdraw);
			
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
