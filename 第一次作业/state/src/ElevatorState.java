// 定义状态接口
interface ElevatorState {
    void enterState(Elevator elevator);
    void pressStartButton(Elevator elevator);
    void pressStopButton(Elevator elevator);
    void pressOpenButton(Elevator elevator);
    void pressCloseButton(Elevator elevator);
}