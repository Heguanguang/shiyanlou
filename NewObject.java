public class NewObject {
    public static void main(String[] args){
        People LiLei = new People();    //创建了一个People对象LiLei

        //利用setter方法为属性赋值
        LiLei.setHeight(170.0);

        //利用getter方法取属性值
        System.out.println("LiLei的身高是"+LiLei.getHeight());


        /*实验测试1
        //创建一个People 对象
        People LiLei = new People();

        LiLei.height = 170;
        LiLei.age = 20;
        LiLei.sex = 1;
        LiLei.cry();

        LiLei.printBaseMes();
        */
    }
}