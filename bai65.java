package bai65;

import java.util.Scanner;

public class sdf {
	
		public boolean kiemtra(String nhap) {
			if (nhap.length()<2) {
				return true;
			}else {
				if(nhap.charAt(0)!= nhap.charAt(nhap.length()-1)){
					return false;
				}
			}
			return kiemtra(nhap.substring(1,nhap.length()-1));
		}
		public static void main(String[] args) {
			System.out.println("moi ban nhap:");
			String nhap;
			sdf check = new sdf();
			Scanner sc = new Scanner(System.in);
			nhap = sc.nextLine();
			if (check.kiemtra(nhap)==true) {
				System.out.println("day la chuoi Palindrome");
			}else {
				System.out.println("day khong la chuoi Palindrome");
			}
		}
	}


