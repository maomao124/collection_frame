package t3;

import t3.HelloWorld;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): t3
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 20:36
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {

        HelloWorld hello = new HelloWorld();

        ArrayList list = hello.getArrayList();
        System.out.println(list.get(0));
        Map map = hello.getHashMap();
        System.out.println(map.get("address"));
        LinkedList link = hello.getLinkedList();
        System.out.println(link.get(0));
        HashSet set = hello.getHashSet();
        for (Object object : set)
        {
            System.out.println(object);
        }
    }
}
