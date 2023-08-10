package bai62;

import java.util.Scanner;

public class bai62 {
	public static void main(String[] args) {
		System.out.println("moi ban nhap : ");
		Scanner sc = new Scanner(System.in);
		String nhap = sc.nextLine();
		nhap.trim();
		String[] tach = nhap.split(" ");
		String sum ="";
		for (String t : tach) {
			String n =t.substring(0,1).toUpperCase()+t.substring(1,t.length());
			for(int i=0;i<1;i++) {
			sum+=n+" ";
			}
		}
		String name = sum.trim()+".";
		System.out.println(name);
	}
}


