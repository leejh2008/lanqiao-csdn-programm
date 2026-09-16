package jh.game;

/**
 * @author jinhong
 * @date 2026/7/6 16:36
 * @description
 */
public class Manage {
    public static void main(String[] args) {
        Yase ys =new Yase();
        ys.name="亚瑟";
        ys.attack=20;
        ys.blood=100;

        Houyi hy=new Houyi();
        hy.name="后裔";
        hy.attack=30;
        hy.blood=110;
        while(ys.blood>0 && hy.blood>0){
            ys.attack(hy);
        if (hy.blood<0){
            break;}
        while(hy.blood>0 && ys.blood>0)
            hy.attack(ys);
        if(ys.blood<0){
            break;}
        }
    }
}
