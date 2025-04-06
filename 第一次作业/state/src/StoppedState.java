// 具体状态：停止状态
class StoppedState implements ElevatorState {
    @Override
    public void enterState(Elevator elevator) {
        System.out.println("Elevator is stopped.");
    }

    @Override
    public void pressStartButton(Elevator elevator) {
        System.out.println("Starting the elevator...");
        elevator.setState(new RunningState());
    }

    @Override
    public void pressStopButton(Elevator elevator) {
        System.out.println("Elevator is already stopped.");
    }

    @Override
    public void pressOpenButton(Elevator elevator) {
        System.out.println("Opening the door...");
        elevator.setState(new OpeningState());
    }

    @Override
    public void pressCloseButton(Elevator elevator) {
        System.out.println("Cannot close door when stopped. Press open first.");
    }
}
