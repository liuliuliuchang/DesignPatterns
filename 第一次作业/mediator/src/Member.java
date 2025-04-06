public abstract class Member {
    protected Chatroom chatroom;
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public abstract void sendText(String to, String message);

    public abstract void sendImage(String to, String image);

    public void receiveText(String from, String message) {
        System.out.println(from + " 发送文本给 " + name + ": " + message);
    }

    public void receiveImage(String from, String image) {
        System.out.println(from + " 发送图片给 " + name + ": " + image);
    }
}
