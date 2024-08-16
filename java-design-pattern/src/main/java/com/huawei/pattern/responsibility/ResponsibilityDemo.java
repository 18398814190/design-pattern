package com.huawei.pattern.responsibility;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 18:28
 * @description 责任链模式
 */
public class ResponsibilityDemo {
    public static void main(String[] args) {
        AbstractLogger logger = getLogger();
        logger.log(1, "打印");
    }

    private static AbstractLogger getLogger(){
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.debug);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.info);
        WarningLogger warningLogger = new WarningLogger(AbstractLogger.warning);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.error);

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);
        return debugLogger;
    }
}
