//数组的运用：算平均成绩
public class AverageScore{
    public static void main(String []args){
        int []stuScore = {61,57,95,85,75,65,44,66,90,32};
        int i = 1;
        int sum = 0;
        for (int a:stuScore){
            System.out.println("第"+i+"位:"+a);
            i++;
            sum = sum + a;
        }
        System.out.println("平均成绩："+sum/i);
    }
}