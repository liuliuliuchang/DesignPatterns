import java.util.Hashtable;

public class ChatGroup extends Chatroom {
    private Hashtable members = new Hashtable();

    public void register(Member member) {
        members.put(member.getName(), member);
        member.setChatroom(this);
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) members.get(to);
        String newMessage = message;
        newMessage = newMessage.replaceAll("打", "*");
        member.receiveText(from, newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        if (image.length() > 5) {
            System.out.println("图片太大，发送失败");
        } else {
            member.receiveImage(from, image);
        }
    }
}
