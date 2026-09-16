package jh.game;

/**
 * @author jinhong
 * @date 2026/7/6 16:36
 * @description
 */
public class Houyi{
    public String name;
    public int attack;
    public int blood;
    public void attack(Yase ys){
        ys.blood-=attack;
        System.out.println(name+"正在攻击"+ys.name+","+ys.name+"掉血"+attack+",剩余血量"+ys.blood);
    }
        }


