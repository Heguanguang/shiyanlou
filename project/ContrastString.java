/*对比字符串
要求：
1、从控制台输入字符串 a 和字符串 b
2、比较字符串 a 和字符 b 是否完全一致，长度，内容等完全一致。
3、如果完全一致，输出相同，如果不一致，输出不同。
4、禁止使用equals方法
对比方法：equals(完全相同)、==(内存地址)、
         compareTo（完全相同）、equalsIngoreCase(忽略大小写)
*/
import java.util.Scanner;
public class ContrastString {
    public static void main(String[] args) {
        //System.out.println("输入：");
        Scanner in = new Scanner(System.in);//从控制台获取输入
        String a = in.nextLine();
        String b = in.nextLine();
        if (a.compareTo(b) == 0){
            //System.out.println("输出：");
            System.out.println("相同");
        }else{
            //System.out.println("输出：");
            System.out.println("不同");
        }
    }
}