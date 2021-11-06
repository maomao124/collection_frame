package t1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): PACKAGE_NAME
 * Class(类名): t1.Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 19:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        HelloWorld hello = new HelloWorld();
        ArrayList arr = hello.getList();
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));

        Scanner input = new Scanner(System.in);
        int q2 = 34;

        //控制台输入变量:q2
        int errCount = 0;
        while (true)
        {
            try
            {
                //min:10
                //max:20
                System.out.print("请输入学号：");
                q2 = input.nextInt();
                if (q2 >= 10 && q2 <= 20)
                {
                    break;
                }
                else
                {
                    errCount++;
                    Toolkit.getDefaultToolkit().beep();
                    if (errCount > 10)
                    {
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        System.out.println("输入的数据不在范围内! 范围：[10,20]");
                    }
                }
            }
            catch (Exception e)
            {
                errCount++;
                if (errCount > 5)
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.err.println("错误次数过多！！！退出");
                    System.exit(1);
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("输入错误！！！请重新输入！");
                    input.nextLine();
                }
            }
        }
    }
}
