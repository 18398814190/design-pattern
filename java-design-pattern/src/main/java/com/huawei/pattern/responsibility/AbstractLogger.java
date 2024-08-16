package com.huawei.pattern.responsibility;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 18:21
 * @description
 */
public class AbstractLogger {
    public static final int debug = 1;
    public static final int info = 2;
    public static final int warning = 3;
    public static final int error = 4;

    private AbstractLogger nextLogger;
    private int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = abstractLogger;
    }

    public void log(int level, String message) {
        if (level >= this.level) {
            System.out.println("[" + this.level + "] " + message);
            if (nextLogger != null) {
                nextLogger.log(level, message);
            }
        }

    }
}
