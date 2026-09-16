package Array;

/**
 * @author jinhong
 * @date 2026/9/8 17:04
 * @description 动态数组
 */
public class DongTai {
    //初始数组，长度定为0，用来保存数据
    public int[]arr=new int[0];
    //调用add方法
    public void add(int data){
        //对原数组扩容,长度+1
        int[]nArr=new int[arr.length+1];

        //复制原数组到新数组中
        for(int i=0;i<arr.length; i++){
            nArr[i]=arr[i];
        }
        //在末尾添加数据
        nArr[nArr.length-1]=data;
        //更新对象头
        arr=nArr;
    }
    //添加到指定位置（插入数据）
    public void insert(int index,int data){
        //对原数组扩容，长度+1
        int[]nArr=new int[arr.length+1];
        //下标index前的数据直接复制原数据到新数组中
        for(int i=0;i<index; i++){
            nArr[i]=arr[i];
        }
        //将要插入的数据放置到相应下标位置
        nArr[index]=data;
        //下标index后面的数据下标都要+1再存入数组
        for (int i=index;i<arr.length;i++){
            nArr[i+1]=arr[i];
        }
        //更新对象头
        arr=nArr;
    }
    //删除数据
    public int remove(int index){
        return 0;//返回被删除的数据
    }
    //获取指定下标位置的数据
    public int get(int index){
        return arr[index];//注意不能写死为0，不然打印出结果全部都是0；
    }
    //动态数组的长度
    public int size(){
        return  arr.length;
    }
    //测试
    public static void main(String[] args) {
        DongTai list=new DongTai();
        //添加数据
        list.add(10);
        list.add(20);
        list.add(30);
        //取数据
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
