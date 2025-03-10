public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.pressStartButton();  // 启动电梯
        elevator.pressOpenButton();   // 尝试开门（失败）
        elevator.pressStopButton();   // 停止电梯

        elevator.pressOpenButton();   // 开门
        elevator.pressCloseButton();  // 关门

        elevator.pressStartButton();  // 启动电梯
        elevator.pressStopButton();   // 停止电梯
    }}