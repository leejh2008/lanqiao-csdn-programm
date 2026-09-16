package jh.oop070302;

/**
 * @author jinhong
 * @date 2026/7/3 18:34
 * @description
 */
public class Manage {
    public static void main(String[]args){
        Subject com=new Subject();
        com.name="华硕天选6pro";
        com.price=8999;
        System.out.println("售价"+com.price);
        com.discount(1000);


    }
}
