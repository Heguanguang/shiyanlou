public class People {
//属性（成员变量）有什么，前面添加了访问修饰符private
//变成了私有属性，必须通过方法调用
    private double height;     //身高

//属性已经封装好了，如果用户需要调用属性
//必须用getter和setter方法进行调用
//getter和setter方法需要程序员自己定义
    public double getHeight(){
    //getter 方法命名是get关键字加属性名（属性名首字母大写）
    //getter 方法一般是为了得到属性值
        return height;
    }

//同理设置我们的setter方法
//setter 方法命名是set关键字加属性名（首字母大写）
//setter 方法一般是给属性值赋值，所以有一个参数
    public void setHeight(double newHeight){
        height = newHeight;
    }


/*实验测试1对于类内容
//属性（成员变量） 有什么
    double height;  //身高
    int age;     //年龄
    int sex;    //性别，0为男性，非0为女性

//方法 干什么
    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        //当成员变量与局部变量同名时，局部变量拥有更高的优先级
        int height = 180;//在方法内的局部变量
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");

    }
    */
}