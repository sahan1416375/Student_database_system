/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create n number of new students
        System.out.println("Enter how many studeents do you eant enter :");
        Scanner in=new Scanner(System.in);
        int numberOfStudent=in.nextInt();
        Student[] students=new Student[numberOfStudent];
        for(int n=0; n<numberOfStudent;n++){
           students[n]=new Student();
           students[n].courseEnroll();
           students[n].payTuition();
        
    }
    
}
}
