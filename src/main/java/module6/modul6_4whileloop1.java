/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module6;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class modul6_4whileloop1 {
    public static void main(String[] args) {
            Scanner b = new Scanner(System.in);
            System.out.println("masukkan angka : ");
            int input = b.nextInt();

            System.out.println("masukkan pangkat : ");
            int pangkat = b.nextInt();

            int i = 1;
            int h = 1;

            while (i<pangkat){
            h = h*input;
            i++;
            }
            System.out.println(input + " ^ " +pangkat +" = " +h);

            }
    
}
