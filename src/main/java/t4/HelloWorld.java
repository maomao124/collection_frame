package t4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): t4
 * Class(类名): HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 20:48
 * Version(版本): 1.0
 * Description(描述)：
 * 创建一个只能存储String类型数据的List集合；
 * <p>
 * 将程序输入的数据存入List集合中；
 * <p>
 * 输出集合中所有的数据。
 * 测试输入：
 * 张三
 * 李四
 * 王五
 * <p>
 * 预期输出：
 * 集合的第1个数据为：张三
 * 集合的第2个数据为：李四
 * 集合的第3个数据为：王五
 */

public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //程序会输入三次数据
        /********** Begin **********/
        ArrayList<String> list = new ArrayList<>();
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("集合的第" + (i+1) + "个数据为：" + list.get(i));
        }

        /********** End **********/
    }
}
