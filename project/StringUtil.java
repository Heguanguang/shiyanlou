/*字符串处理
1、从控制台输入一行字符串；
2、去除字符串中的z所有空格；
3、打印去除空格后的字符串。
*/
import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//从控制台获取输入
        String a = in.nextLine();
        String[] b = a.split("\\s+");//根据空格切片放进数组
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]);//print打印不换行
        }
    }
}