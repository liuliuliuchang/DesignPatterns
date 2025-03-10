public class Main {
    public static void main(String[] args) {
        // 创建接收者
        Light livingRoomLight = new Light();

        // 创建具体命令
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // 创建调用者并设置命令
        RemoteControl remote = new RemoteControl();

        // 按下开灯按钮
        remote.setCommand(lightOn);
        remote.pressButton(); // 输出: Light is ON

        // 按下关灯按钮
        remote.setCommand(lightOff);
        remote.pressButton(); // 输出: Light is OFF
    }}