public class Client {
    public static void main(String[] args) {
        Chatroom happyChat = new ChatGroup();
        Member member1, member2;
        member1 = new CommonMember("张三");
        member2 = new DiamondMember("李四");

        happyChat.register(member1);
        happyChat.register(member2);

        member1.sendText(member2.getName(), member2.getName() + "，你好！");
        member2.sendText(member1.getName(), member1.getName() + "，你好！");
        member1.sendImage(member2.getName(), "太阳");
        member2.sendImage(member1.getName(), "月亮");

    }
}