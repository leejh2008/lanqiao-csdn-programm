package jh.oop0703;

/**
 * @author jinhong
 * @date 2026/7/3 14:05
 * @description
 */
public class Student {
    public String name;
    public int score;
    public int age;
    public double height;
    public void study(int sco) {
        score += sco;
        System.out.println("我是" + name + "现在" + age + "," + height + "m" + "正在学习，学分增加了" + sco + "分，现在的学分" + score);
    }
    public void higher(double hei){
        height+=hei;
        System.out.println("坚持运动及营养摄入，长高了"+hei+"米，现在身高"+height+"m");
    }
}
