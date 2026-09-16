package Jicheng02;

/**
 * @author jinhong
 * @date 2026/8/5 09:58
 * @description
 */
public class Bird extends Animal{
    public void fly(){
        System.out.println("它正在天空中飞翔");
    }
    public void eat(){
        System.out.println(getName()+"正在吃谷子");
    }
}
