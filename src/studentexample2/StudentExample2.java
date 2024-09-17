/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentexample2;

import java.util.Scanner;

/**
 *
 * @author Syed Raza Bashir
 */
public class StudentExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Student[] students = new Student[5];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter a name");
            String name = input.nextLine();
            students[i] = new Student(name);            
        }
        
        students[2].setAge(18);
        
        for (Student student: students) {
            System.out.printf("Student %s is %d years old\n", 
                    student.getName(), student.getAge());
        }
        
        
        
        
        
    }
    
}
