class DebugLogger extends Logger {
    public DebugLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}