package bai64;

import java.util.Scanner;

public class STRING {
	public static void main(String[] args) {
		System.out.print("moi nhap: ");
		Scanner sc = new Scanner(System.in);
		String nhap = sc.nextLine();
		String arr[] = nhap.split(" ");
		for (int i = 0; i < arr.length; i++) {
            String arr1[] = arr[i].split("");
            for (int j = arr1.length - 1; j >= 0; j--) {
                System.out.print(arr1[j]);
            }
            System.out.print(" ");

        }
        System.out.println("");
    }
}


