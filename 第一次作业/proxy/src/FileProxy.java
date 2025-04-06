// 文件代理类
public class FileProxy implements File {
    private RealFile realFile;
    private String user;

    public FileProxy(String fileName, String user) {
        this.realFile = new RealFile(fileName);
        this.user = user;
    }

    @Override
    public void read() {
        if (checkPermission(user, "read")) {
            realFile.read();
        } else {
            System.out.println("Permission denied for reading file.");
        }
    }

    @Override
    public void write() {
        if (checkPermission(user, "write")) {
            realFile.write();
        } else {
            System.out.println("Permission denied for writing to file.");
        }
    }

    // 检查用户权限
    private boolean checkPermission(String user, String action) {
        // 简单的权限检查逻辑
        if ("admin".equals(user)) {
            return true;
        } else {
            return "read".equals(action); // 普通用户只能读取
        }
    }
}
