
import java.util.*;
import java.io.*;

public class keobuabao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		while (ans == 1) {
			printSurface();
			System.out.println();
			int userChoice = sc.nextInt();
			printResult(userChoice);
			System.out.println("1.Choi tiep");
			System.out.println("2.Nghi");
			System.out.println();
			ans = sc.nextInt();
		}
		System.out.println("GoodBye");
	}

	public static void printSurface() {
		System.out.println("-----Kéo Búa Bao-----");
		System.out.println("1.Kéo");
		System.out.println("2.Búa");
		System.out.println("3.Bao");
		System.out.println("Moi ban nhap so:");
	}

	public static void printResult(int userChoice) {
		Random generator = new Random();
		int botChoice = generator.nextInt(3) + 1;
		if (botChoice == 1) {
			System.out.println("Bot ra keo");
		}
		if (botChoice == 2) {
			System.out.println("Bot ra bua");
		}
		if (botChoice == 3) {
			System.out.println("Bot ra bao");
		}
		int ans = userChoice - botChoice;
		if (ans == 0) {
			System.out.println("Draw");
		}
		if (ans < 0) {
			ans = ans * -1;
			if (ans == 1) {
				System.out.println("You Lose");
			} else {
				System.out.println("You Win");
			}
		}
		if (ans > 0) {
			if (ans == 1) {
				System.out.println("You Win");
			} else {
				System.out.println("You Lose");
			}
		}
	}
}
