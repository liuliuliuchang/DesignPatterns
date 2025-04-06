public class Main {
    public static void main(String[] args) {
        // 创建处理器链
        Logger errorLogger = new ErrorLogger(LogLevel.ERROR);
        Logger debugLogger = new DebugLogger(LogLevel.DEBUG);
        Logger infoLogger = new InfoLogger(LogLevel.INFO);

        // 设置职责链
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        // 测试日志记录
        errorLogger.logMessage(LogLevel.INFO, "This is an info message.");
        errorLogger.logMessage(LogLevel.DEBUG, "This is a debug message.");
        errorLogger.logMessage(LogLevel.ERROR, "This is an error message.");
    }
}