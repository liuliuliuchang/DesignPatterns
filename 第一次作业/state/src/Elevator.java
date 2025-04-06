class Elevator {
    private ElevatorState state;

    public Elevator() {
        this.state = new StoppedState();
        state.enterState(this);
    }

    public void setState(ElevatorState state) {
        this.state = state;
        state.enterState(this);
    }

    public void pressStartButton() {
        state.pressStartButton(this);
    }

    public void pressStopButton() {
        state.pressStopButton(this);
    }

    public void pressOpenButton() {
        state.pressOpenButton(this);
    }

    public void pressCloseButton() {
        state.pressCloseButton(this);
    }
}