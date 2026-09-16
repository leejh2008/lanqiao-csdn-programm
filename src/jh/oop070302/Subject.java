package jh.oop070302;

/**
 * @author jinhong
 * @date 2026/7/3 18:34
 * @description
 */
public class Subject {
    public String name;
    public int price;
    public void discount(int pri){int op=price;
        price=price-pri;
        System.out.println("这是我的电脑，名称是"+name+"售价"+op+","+"由于促销，减去"+pri+"现价"+price);
    }
}
