/*用户输入
获取用户的输入信息（字符串）
当用户输入 end 时，结束输入并打印用户之前输入
的所有信息（输入的信息数量不超过 100 个）
*/
import java.util.Scanner;
import java.util.ArrayList;
public class InputTest{
    public static void main(String []args){
        ArrayList instring = new ArrayList();
        Scanner in = new Scanner(System.in);//从控制台获取输入
        for (int i = 0; i<= 100; i++){
            String a = in.nextLine();
            if (a.equals("end")){
                break;
            }
            instring.add(a);
        }
        for (int j = 0; j < instring.size(); j++){
            System.out.println(instring.get(j));
        }
        //关闭输入
        in.close();
    }
}