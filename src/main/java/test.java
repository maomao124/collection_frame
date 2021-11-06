import t1.Test;
import t2.HelloWorld;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 21:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("t1:");
        Test.main(null);
        System.out.println();
        System.out.println("t2:");
        HelloWorld.main(null);
        System.out.println();
        System.out.println("t3");
        t3.Test.main(null);
        System.out.println();
        System.out.println("t4");
        t4.HelloWorld.main(null);
        System.out.println();
        System.out.println("t5");
        t5.HelloWorld.main(null);
    }
}
