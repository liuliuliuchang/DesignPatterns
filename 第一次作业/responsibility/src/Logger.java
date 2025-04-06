abstract class Logger {
    protected LogLevel level;
    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.level = level;
    }

    // 设置下一个处理器
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // 处理请求的核心方法
    public void logMessage(LogLevel level, String message) {
        if (this.level == level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    // 子类需要实现具体的写日志逻辑
    protected abstract void write(String message);
}
