package Jicheng02;

/**
 * @author jinhong
 * @date 2026/8/5 09:58
 * @description
 */
public class Animal {
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println(name+"正在吃东西");
    }
}
