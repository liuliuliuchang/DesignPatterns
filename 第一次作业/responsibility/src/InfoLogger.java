class InfoLogger extends Logger {
    public InfoLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}