package jh.oop070501;

/**
 * @author jinhong
 * @date 2026/7/5 12:25
 * @description
 */
public class Metro {
    public int number;
    public int count;
    public int normal;
    public int peakadd;
    public int total;
    public void Peak(int peakadd){
        int total=normal+peakadd;
        System.out.println(number+"号线地铁有"+count+"辆列车，平峰期在线运营"+normal+"辆,高峰期加开"+peakadd+"辆，在线运营"+total+"辆");
    }
}
