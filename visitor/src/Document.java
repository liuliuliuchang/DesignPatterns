import java.util.ArrayList;
import java.util.List;

public class Document {
    private static List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public static void main(String[] args) {
        Document document = new Document();
        elements.add(new TextElement("Hello, World!"));
        elements.add(new ImageElement("http://example.com/image1.jpg"));
        elements.add(new TextElement("Another text element"));

        // 使用打印访问者
        PrintVisitor printVisitor = new PrintVisitor();
        document.accept(printVisitor);

        // 使用统计访问者
        CountVisitor countVisitor = new CountVisitor();
        document.accept(countVisitor);
        System.out.println("Text elements: " + countVisitor.getTextCount());
        System.out.println("Image elements: " + countVisitor.getImageCount());
    }
}
