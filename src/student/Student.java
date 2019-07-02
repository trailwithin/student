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
public class Student {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        student_admin s[]= new student_admin[5];
        for(int i=1;i<s.length;)
        {
            s[0]=new student_admin(i,"name"+i,90.00f);
            s[1]=new student_admin(i,"name"+i,50.00f);
            s[2]=new student_admin(i,"name"+i,78.00f);
            s[3]=new student_admin(i,"name"+i,48.00f);
            s[4]=new student_admin(i,"name"+i,80.00f);
            s[i].getData();
            s[i].calcgrade();
        }
        
    }
    
}
