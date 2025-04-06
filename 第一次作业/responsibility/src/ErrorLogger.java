class ErrorLogger extends Logger {
    public ErrorLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}