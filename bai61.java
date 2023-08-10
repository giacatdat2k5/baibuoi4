package bai61;

import java.util.Scanner;

public class bai61 {
	public static void main(String[] args) {
		System.out.println("moi ban nhap ho ten: ");
		Scanner sc = new Scanner(System.in);
		String nhap = sc.nextLine();
		String ho= nhap.substring(0,nhap.indexOf(" "));
		String ten=nhap.substring(nhap.lastIndexOf(" "));
		int b = nhap.indexOf(" ");
		int e = nhap.lastIndexOf(" ");
		String tendem = nhap.substring(b,e).trim();
		System.out.println("\nHo: "+ho+"\nTendem: "+tendem+"\nTen: "+ten);
	}
}



