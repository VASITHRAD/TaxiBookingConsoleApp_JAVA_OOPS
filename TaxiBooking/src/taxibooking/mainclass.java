/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxibooking; 
import java.util.ArrayList;
import static taxibooking.Details.*;

/**
 *
 * @author vasit
 */
public class mainclass {
    static ArrayList<Details> array=new ArrayList<>();
    public static void booktaxi(String fromcity,String tocity){
        Details det=new Details(fromcity,tocity);
        array.add(det);
        System.out.println("Your Booking Id is:"+det.BookingId+"\n"+"You are assigned to the driver: "+det.driverId);
        System.out.print("Your total cost is $");
        estimate(fromcity,tocity);
        System.out.println("\nBooking Successful!!!");

    }
    public static void canceltaxi(int BookingId){
        for(Details det:array){
            if(det.BookingId==BookingId){
//                System.out.print(driver);
                driver.add(det.driverId);
//                System.out.print(driver);
                array.remove(det);
                System.out.println("Booking Cancelled for your Booking ID : "+ BookingId);
                return;
            }
        }
        System.out.println("Booking Id not found");
    }
    public static void estimate(String from,String dest){
        from=from.toLowerCase();
        dest=dest.toLowerCase();
        int begin=0,end=0;
//                int city1=1,city2=2,city3=3,city4=4,city5=5,city6=6;
        switch (from) {
            case "city 1":
                begin =1;
                break;
            case "city 2":
                begin =2;
                break;
            case "city 3":
                begin =3;
                break;
            case "city 4":
                begin =4;
                break;
            case "city 5":
                begin =5;
                break;
            case "city 6":
                begin =6;
                break;
            default:
                System.out.println("Not a valid city");
                return;
        }
       switch (dest) {
            case "city 1":
                end = 1;
                break;
            case "city 2":
                end =2;
                break;
            case "city 3":
                end =3;
                break;
            case "city 4":
                end =4;
                break;
            case "city 5":
                end =5;
                break;
            case "city 6":
                end =6;
                break;
            default:
                System.out.println("Not a valid city");
                return;
        }
        int distance=end-begin;
        int cost=100;
        if(distance<0){
            distance*=(-1);
        }
        if(distance>2){
            cost=cost+(distance-2)*30;
        }
        System.out.print(cost);
    }
    public static void display(){
         for(Details det:array){
                 System.out.println("Booking Details:");
                 System.out.println("Booking ID: " + det.BookingId);
                 System.out.println("From: " + det.from);
                 System.out.println("To: " + det.to);
                 System.out.println("Driver ID: " + det.driverId);
                 System.out.println("*****************************************************"); 
            }
    }
}
