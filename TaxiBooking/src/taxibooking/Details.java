/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxibooking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vasit
 */
public class Details {
    static int id=1;
    static ArrayList<Integer> driver=new ArrayList<>(List.of(1,2,3,4));
    int BookingId;
    String from;
    String to;
    int driverId;
    Details(String from,String to){
        this.from=from;
        this.to=to;
        this.BookingId=id++;
        this.driverId=Details.driver.get(0);
        driver.remove(0);
        }
}
