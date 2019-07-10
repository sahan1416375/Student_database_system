
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private String tuitionBalance;
    private int costofCourse=600;
    private int balance=0;
    private int feez;
    private int id=1000;
    private String course;
    //Constructor prompt user to student's name and year
    public Student(){
        Scanner in= new Scanner(System.in);
        
        System.out.println("What is your first name : ");
        this.firstName=in.nextLine();
        
        System.out.println("What is your last name :");
        this.lastName=in.nextLine();
        
        System.out.println("1-Freshmen\n 2-Sophmore\n 3-junior\n 4-Senior\n Enter your student class level :");
        this.gradeYear=in.nextInt();
        
        setstudentID();
        
        System.out.println(this.firstName+" "+this.lastName+" "+this.gradeYear);
    }
    
    public void setstudentID(){
        id++;
        this.studentID=gradeYear+""+id;
        
        System.out.println("password : "+studentID);
        
    }
    public void courseEnroll(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter course to enroll(Q to quit) : ");
        courses=in.nextLine();
        int i=0;
        
        if(!courses.equals("Q")){
            feez=feez+costofCourse;
            course=course+"\n "+courses;
            i++;
        }
        else{
            System.out.println("Break;");
            break;
        }
        System.out.println("Number of subjects : "+i);
        System.out.println("Your balance is "+feez );
    }
        }
    
    //Genarate an ID
    
    //Viw balance
    
    //Pay tuition
    
    //show status
}
