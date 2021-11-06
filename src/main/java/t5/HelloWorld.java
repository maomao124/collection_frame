package t5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): t5
 * Class(类名): HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 20:53
 * Version(版本): 1.0
 * Description(描述)：
 * 向menuDict集合中添加一道菜名lamb，它的价格是50；
 * <p>
 * 获取menuDict集合中的fish的价格并打印出来；
 * <p>
 * 将menuDict集合中的fish的价格改为100；
 * <p>
 * 删除menuDict集合中noodles这道菜；
 * <p>
 * 输出新的menuDict菜单。
 * pizza
 * 40
 * noodles
 * 30
 * carrot
 * 20
 * turkey
 * 34
 * fish
 * 37
 * <p>
 * 预期输出：
 * <p>
 * 37
 * {pizza=40,turkey=34,fish=100,lamb=50,carrot=20}
 */

public class HelloWorld
{
    public static void main(String[] args)
    {
        Map<String, Integer> menuDict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            menuDict.put(sc.next(), sc.nextInt());
        }
        /********** Begin **********/
        menuDict.put("lamb", 50);
        System.out.println(menuDict.get("fish"));
        menuDict.put("fish", 100);
        menuDict.remove("noodles");
        System.out.println(menuDict);

        /********** End **********/
    }

}
