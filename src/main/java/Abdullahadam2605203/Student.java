/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abdullahadam2605203;

/**
 *
 * @author windows
 */
public class Student extends Person {
    
    public Student(){
        //super("Anna","Padang");
        super();
        super.name = "Anna";
        super.address ="Padang";
               
        System.out.println("Inside Student:Construktor");
        //Beberapa kode disini
    }
    @Override
    public String getName(){
    System.out.println("parent: getName");
    return name;
    }
    public static void main(String[] args){
        Student anna  = new Student ();
        System.out.println("Nama "+ anna.name);
        System.out.println("Alamat "+anna.address);
    }
    
    
}
