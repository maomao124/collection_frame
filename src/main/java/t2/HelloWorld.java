package t2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): t2
 * Class(类名): t1.HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 20:29
 * Version(版本): 1.0
 * Description(描述)：
 * 请仔细阅读右侧代码，根据方法内的提示，在Begin - End区域内进行代码补充，具体任务如下：
 * <p>
 * 删除集合的第一个和最后一个元素；
 * <p>
 * 添加两个字符串：hello，educoder至集合中；
 * <p>
 * 修改集合的第三个元素，改为：list；
 * <p>
 * 输出集合中所有的元素。
 * 测试输入：
 * <p>
 * 4
 * 张三
 * 李四
 * 王五
 * 赵六
 * <p>
 * 预期输出：
 * <p>
 * 李四
 * 王五
 * list
 * educoder
 */

public class HelloWorld
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //获取输入的数据并添加至集合
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int length = sc.nextInt();
        for (int i = 0; i < length; i++)
        {
            list.add(sc.next());
        }
        /********** Begin *********/
        list.remove(0);
        list.remove(list.size()-1);
        list.add("hello");
        list.add("educoder");
        list.set(2,"list");
        list.forEach(System.out::println);

        /********** End **********/
    }
}
