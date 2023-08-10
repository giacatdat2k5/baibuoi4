package bai66;

import java.util.Scanner;

public class bai66 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("moi ban nhap chuoi");
		String nhap = sc.nextLine();
		System.out.println("ky tu dau la: "+nhap.charAt(0));
		System.out.println("ky tu cuoi la: "+nhap.charAt(nhap.length()-1));
	}
}
