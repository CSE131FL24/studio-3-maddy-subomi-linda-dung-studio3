package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);  


		System.out.println("What is your value of n?");
		int n = in.nextInt();

		boolean[] array = new boolean[n+1];

		//creating the array and setting them all to true
		for (int i = 2; i <= n; i++) {
			array[i] = true;
		}

		//look at all the values and set to false if not prime 
		for (int i = 2; i*i <= n; i++) {
			if (array[i]==true) {
				for (int j = ((i * i)); j <= n; j=j+i) {
					array[j]=false;
				}
			}

		}
		//print if its still true 
		for (int i = 2; i <= n; i++) {
			if (array[i] == true) {
				System.out.println(i);
			}

		}

	}
}