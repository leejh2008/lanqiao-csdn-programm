package jh.game;

/**
 * @author jinhong
 * @date 2026/7/6 16:35
 * @description
 */
public class Yase {
    public String name;
    public int attack;
    public int blood;
    public void attack(Houyi hy){
        hy.blood-=attack;
    System.out.println(name+"正在攻击"+hy.name+","+hy.name+"掉血"+attack+",剩余血量"+hy.blood);
    }
    }

