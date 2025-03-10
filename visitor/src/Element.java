// 定义元素接口
interface Element {
    void accept(Visitor visitor);
}

// 具体元素类 - 文本
class TextElement implements Element {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// 具体元素类 - 图片
class ImageElement implements Element {
    private String url;

    public ImageElement(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
