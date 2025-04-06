// 实际的文件类
public class RealFile implements File {
    private String name;

    public RealFile(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println("Reading file: " + name);
    }

    @Override
    public void write() {
        System.out.println("Writing to file: " + name);
    }
}
