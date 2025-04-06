// 具体状态：运行状态
class RunningState implements ElevatorState {
    @Override
    public void enterState(Elevator elevator) {
        System.out.println("Elevator is running.");
    }

    @Override
    public void pressStartButton(Elevator elevator) {
        System.out.println("Elevator is already running.");
    }

    @Override
    public void pressStopButton(Elevator elevator) {
        System.out.println("Stopping the elevator...");
        elevator.setState(new StoppedState());
    }

    @Override
    public void pressOpenButton(Elevator elevator) {
        System.out.println("Cannot open door while running. Stop first.");
    }

    @Override
    public void pressCloseButton(Elevator elevator) {
        System.out.println("Cannot close door while running. Stop first.");
    }
}
