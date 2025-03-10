// 定义访问者接口
interface Visitor {
    void visit(TextElement textElement);
    void visit(ImageElement imageElement);
}

// 具体访问者类 - 打印内容
class PrintVisitor implements Visitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Text: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Image URL: " + imageElement.getUrl());
    }
}

// 具体访问者类 - 统计元素数量
class CountVisitor implements Visitor {
    private int textCount = 0;
    private int imageCount = 0;

    @Override
    public void visit(TextElement textElement) {
        textCount++;
    }

    @Override
    public void visit(ImageElement imageElement) {
        imageCount++;
    }

    public int getTextCount() {
        return textCount;
    }

    public int getImageCount() {
        return imageCount;
    }
}
