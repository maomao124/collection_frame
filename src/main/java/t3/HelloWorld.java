package t3;

import java.util.*;

/**
 * Project name(项目名称)：集合框架
 * Package(包名): t3
 * Class(类名): HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/6
 * Time(创建时间)： 20:37
 * Version(版本): 1.0
 * Description(描述)： 分别定义HashSet、ArrayList、LinkedList、HashMap集合。并向每一个集合中添加www.educoder.net，
 * Map集合的key设置为address，最后将每一个集合返回。
 * 测试说明
 * 补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
 * <p>
 * 测试输入：无
 * 预期输出：
 * www.educoder.net
 * www.educoder.net
 * www.educoder.net
 * www.educoder.net
 */

@SuppressWarnings("all")
public class HelloWorld
{
    public HashSet getHashSet()
    {
        /********** Begin **********/
        HashSet h = new HashSet<>();
        h.add("www.educoder.net");
        return h;

        /********** End **********/
    }

    public ArrayList getArrayList()
    {
        /********** Begin **********/
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("www.educoder.net");
        return arrayList;

        /********** End **********/
    }

    public LinkedList getLinkedList()
    {
        /********** Begin **********/
        LinkedList list = new LinkedList<>();
        list.add("www.educoder.net");
        return list;

        /********** End **********/
    }

    public Map getHashMap()
    {
        /********** Begin **********/
        Map m = new HashMap<>();
        m.put("address", "www.educoder.net");
        return m;

        /********** End **********/
    }

}
