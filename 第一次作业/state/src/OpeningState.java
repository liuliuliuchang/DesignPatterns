class OpeningState implements ElevatorState {
    @Override
    public void enterState(Elevator elevator) {
        System.out.println("Elevator door is opening.");
    }

    @Override
    public void pressStartButton(Elevator elevator) {
        System.out.println("Cannot start while door is opening.");
    }

    @Override
    public void pressStopButton(Elevator elevator) {
        System.out.println("Cannot stop while door is opening.");
    }

    @Override
    public void pressOpenButton(Elevator elevator) {
        System.out.println("Door is already opening.");
    }

    @Override
    public void pressCloseButton(Elevator elevator) {
        System.out.println("Closing the door...");
        elevator.setState(new ClosingState());
    }
}
