package org.kodluyoruz.homework1.question4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    4- 	Kullanıcıdan alınan ondalıklı bir sayının
    	ondalık kısmına göre
    	aşağı ve yukarı doğru yuvarlama işlemi
    	yapacak bir program yazınız.
     - 	aşağı veya yukarı yuvalarlanacağını
    	kullanıcıdan bir bilgi olarak alınız.
*/
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter decimal number please: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid Number!! \nEnter decimal number please: ");
            scanner.next();
        }
        double decimalNum = scanner.nextDouble();
        System.out.println("Decimal Number is: " + decimalNum);


        System.out.print("If you want to convert it, \nEnter '1' for Upper or '0' for Lower integer, please: ");

        while (scanner.hasNextLine()) {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid Number!! \nEnter '1' for Upper or '0' for Lower integer, please: ");
                scanner.next();
            }
            int UpDownNum = Integer.parseInt(scanner.next());
            switch (UpDownNum) {
                case 1:
                    System.out.println("Upper integer is: " + Math.ceil(decimalNum));
                    break;
                case 0:
                    System.out.println("Lower integer is: " + Math.floor(decimalNum));
                    break;
                default:
                    System.out.print("Invalid Number!! \nEnter '1' for Upper or '0' for Lower integer please: ");
            }
        }
    }
}
