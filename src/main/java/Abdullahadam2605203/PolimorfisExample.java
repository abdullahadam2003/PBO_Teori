/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abdullahadam2605203;

/**
 *
 * @author windows
 */
public class PolimorfisExample {
   public static void main(String[] args) {
        Person ref;
        Student studenObjek = new Student();
        Employee employeeObjek = new Employee();
        
        studenObjek.setName("fajrin");
        employeeObjek.setName("faisal");
        
        ref = studenObjek;
        System.out.println("Nama " +ref.getName());
        
        ref = employeeObjek;
        System.out.println("Nama "+ref.getName());
        printInformatika(studenObjek);
        printInformatika(employeeObjek);
        
    }
    
    public static void printInformatika(Person ref) {
        if(ref instanceof Student){
            System.out.println("Nama Student"+ref.getName());
            System.out.println("Alamar Student"+ref.getAddress());
        }else if(ref instanceof Employee){
            System.out.println("Nama Employee"+ref.getName());
            System.out.println("Alamar Employee"+ref.getAddress());
        }
        
    }
}