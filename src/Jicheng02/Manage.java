package Jicheng02;

/**
 * @author jinhong
 * @date 2026/8/5 09:58
 * @description
 */
public class Manage {
    public static void main(String[] args) {


        Dog d = new Dog();
        d.setName("小黄");
        d.setAge(6);
        d.eat();
        d.bark();
        Cat c=new Cat();
        c.setName("小白");
        c.setAge(4);
        c.eat();
        c.sound();
        Bird b=new Bird();
        b.setName("可爱的小奥");
        b.setAge(2);
        b.eat();
        b.fly();

    }
}