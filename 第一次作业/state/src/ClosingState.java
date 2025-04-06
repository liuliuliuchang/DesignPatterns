class ClosingState implements ElevatorState {
    @Override
    public void enterState(Elevator elevator) {
        System.out.println("Elevator door is closing.");
    }

    @Override
    public void pressStartButton(Elevator elevator) {
        System.out.println("Cannot start while door is closing.");
    }

    @Override
    public void pressStopButton(Elevator elevator) {
        System.out.println("Cannot stop while door is closing.");
    }

    @Override
    public void pressOpenButton(Elevator elevator) {
        System.out.println("Opening the door...");
        elevator.setState(new OpeningState());
    }

    @Override
    public void pressCloseButton(Elevator elevator) {
        System.out.println("Door is already closing.");
    }
}