/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author DARSHIKA
 */
import java.util.Scanner;
public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = sc.next();
       System.out.println("Enter your middle name");
       String name1 =sc.next();
        System.out.println("Enter your last name");
       String name2 =sc.next();
        System.out.println(" your full name is  " + name +" "+ name1 + " "+ name2 );
        String st1= name.charAt(0) + " ";
        
       
        
        
    }
    
}
