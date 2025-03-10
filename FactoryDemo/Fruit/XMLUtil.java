package FactoryDemo.Fruit;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        try {
            // 创建文档BuilderFactory对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            // 创建DocumentBuilder对象
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            // 解析XML文件
            Document doc;
            doc = builder.parse(new File("config.xml"));
            // 获取所有名为"className"的元素
            NodeList n1 = doc.getElementsByTagName("className");
            // 获取第一个"className"元素的第一个子节点
            Node classNode = n1.item(0).getFirstChild();
            // 获取节点值
            String cName = classNode.getNodeValue();

            // 加载类并创建实例
            Class c = Class.forName(cName); // 使用trim()去除可能的空白字符
            Object obj = c.newInstance(); // 使用新的实例化方式
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
