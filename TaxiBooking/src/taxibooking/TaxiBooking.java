/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxibooking;
import java.util.*;
import static taxibooking.Details.driver;
import static taxibooking.mainclass.*;
//import static taxibooking.mainclass.booktaxi;

/**
 *
 * @author vasit
 */
public class TaxiBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        while(1<2){
        System.out.println("\nWelcome to Taxi World!!!\n 1.Book taxi\n 2.Cancel ride\n 3.Show Estimation\n 4.All Details\n 5.Exit\nPlease select your option");
        int choice=sc.nextInt();
        sc.nextLine();
            switch(choice){
                case 1:
                    if(driver.size()>0){
                    System.out.println("We can only drive to the below cities\n1.City 1\n2.City 2\n3.City 3\n4.City 4\n5.City 5\n6.City 6");
                    System.out.println("Type from which city you have to start?");
                    String from=sc.nextLine();
                    System.out.println("Please type your destination city?");
                    String dest=sc.nextLine();
                    booktaxi(from,dest);
                    System.out.println("Happy Journey....");
                    }
                    else{
                        System.out.println("All our taxis are booked.\nBOOKING REJECTED!!!");
                    }
                    break;
                case 2:
                    System.out.println("Enter your Booking ID:");
                    int BookId=sc.nextInt();
                    canceltaxi(BookId);
                    break;
                case 3:
                    System.out.println("We can only drive to the below cities\n1.City 1\n2.City 2\n3.City 3\n4.City 4\n5.City 5\n6.City 6");
                    System.out.println("Type from which city you have to start?");
                    String from=sc.nextLine().trim();
                    System.out.println("Please type your destination city!!!");
                    String dest=sc.nextLine().trim();
                    System.out.print("Total cost is $" );
                    estimate(from,dest);
                    
                case 4:
                   display();
                   break;
                case 5:
                    return;
            }
        }
    }
    
}
