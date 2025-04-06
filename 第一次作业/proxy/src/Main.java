public class Main {
    public static void main(String[] args) {
        // 创建文件代理
        File fileAdmin = new FileProxy("example.txt", "admin");
        File fileUser = new FileProxy("example.txt", "user");

        // 测试管理员操作
        System.out.println("Admin operations:");
        fileAdmin.read();
        fileAdmin.write();

        // 测试普通用户操作
        System.out.println("\nUser operations:");
        fileUser.read();
        fileUser.write();
    }}