package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What number? ");
		int max = in.nextInt();
		boolean [] numbers = new boolean [max];
		for (int i = 0; i < max; i++) {
			numbers[i] = true;
		}
		for (int j = 2; j < Math.sqrt(max); j++) {
			if (numbers[j] == true) {
				for (int k = (j * j); k < max; k = k + j) {
					numbers[k] = false;
				}
			}
		}
		for (int l = 0; l < max; l++) {
			if (numbers[l] == true) {
				System.out.println(l);
			}
		}
		
	}

}
