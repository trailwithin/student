/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Dell India
 */
public class student_admin {
int rollno;
String name;
float marks;

student_admin()
{
    rollno=0;
    name=null;
    marks=0.0f;
}
student_admin(int rn, String nam,float mark)
{
    this.rollno=rn;
    this.name=nam;
    this.marks=mark;
}
public void getData()
{
    System.out.println("rollno is"+""+rollno);
    System.out.println("name is"+""+name);
    System.out.println("marks is"+""+marks);
}
public void calcgrade()
{
    if(marks<=100 && marks>=80)
    {
        System.out.println("Your Grade is A");
    }
    if(marks<=80 && marks>=70)
    {
        System.out.println("Your Grade is B");
    }
    if(marks<=70 && marks>=60)
    {
        System.out.println("Your Grade is C");
    }
    if(marks<=60 && marks>=50)
    {
        System.out.println("Your Grade is D");
    }
    if(marks<=40)
    {
        System.out.println("You Failed");
    }
}



    
}
