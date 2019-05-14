/*
一串数据（313, 89, 123, 323, 313, 15, 90, 56, 39）
求出最大值和最小值并输出。
*/
import java.util.Scanner;
public class MaxAndMin{
    public static void main(String []args){
        int [] maxmin = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        int a, b;
        a = maxmin[0]; //max value
        b = maxmin[0];  //min value
        for (int i = 0; i < maxmin.length; i++){
            if (a>=maxmin[i]){
                a = a;
            }else{
                a = maxmin[i];
            }
            if (b <= maxmin[i]){
                b = b;
            }else{
                b = maxmin[i];
            }
        }
        System.out.println("最大值："+a);
        System.out.println("最小值："+b);
    }
}