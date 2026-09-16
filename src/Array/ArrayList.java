package Array;

import java.sql.Array;

/**
 * @author jinhong
 * @date 2026/9/11 19:28
 * @description
 */
public class ArrayList {
    //初始数组，用来保存数据
    public int[]arr;
    //size用来记录有效数据的个数
    public int size=0;
    //定义构造方法，初始化数组长度
    public ArrayList(int len) {
        arr = new int[len];
    }
        public ArrayList() {
        this(10);
        }


   //末尾添加数据
    //调用add方法
    public void add(int data) {
        if (size == arr.length) {
            //对原数组扩容,长度*2
            int[] nArr = new int[arr.length * 2];
            //复制原数组到新数组中
            for (int i = 0; i < arr.length; i++) {
                nArr[i] = arr[i];
            }
            //更新对象头
            arr = nArr;
        }
        //在末尾添加数据
        arr[size] = data;
        size++;
    }
    //添加到指定位置（插入数据）
    public void insert(int index,int data) {
        //判断越界与扩容
        if (index < 0 || index > size-1) {
            return;
        }
        //判断是否需要扩容（与add一样）
        if (size == arr.length) {
            //对原数组扩容,长度*2
            int[] nArr = new int[arr.length * 2];
            //复制原数组到新数组中
            for (int i = 0; i < arr.length; i++) {
                nArr[i] = arr[i];
            }
            //更新对象头
            arr = nArr;
        }
        //将index及之后的元素整体向后移动一位（由最后一位开始向前移动）
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = data;
        size++;
    }
    //删除数据
    public int remove(int index){
        //判断越界与扩容
        if (index < 0 || index > size-1) {
            return-1;
        }
        int removed=arr[index];
        for (int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return removed;
        //返回被删除的数据
    }

    //删除第一个匹配的数据（removes)
    public boolean removes(int data){
        for(int i=0;i<size;i++){
            if(arr[i]==data){
                remove(i);
                return true;
            }
        }
        return false;
    }
    //补充removeAll,删除所有匹配的数据
    public boolean removeAll(int data){
        boolean flag=false;
        for (int i=0;i<size;i++){
            if(arr[i]==data){
                remove(i);
                i--;
                flag=true;
            }
        }
        return flag;
    }
    //获取指定下标位置的数据
    public int get(int index){
        if (index < 0 || index > size-1) {
            return-1;
        }
        return arr[index];//注意不能写死为0，不然打印出结果全部都是0；
    }
    //动态数组的长度
    public int size(){
        return  size;
    }
    //测试
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(4);
        //list.removes(4);


        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(list.get(i));
        }




    }
}


