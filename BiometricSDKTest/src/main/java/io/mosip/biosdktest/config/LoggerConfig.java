package io.mosip.biosdktest.config;

import io.mosip.kernel.core.logger.spi.Logger;
import io.mosip.kernel.logger.logback.appender.RollingFileAppender;
import io.mosip.kernel.logger.logback.factory.Logfactory;

public final class LoggerConfig {

    /**
     * Instantiates a new pre-reg  logger.
     */
    private LoggerConfig() {

    }


    /** The mosip rolling file appender. */
    private static RollingFileAppender sdkRollingFileAppender;

    static {
        sdkRollingFileAppender = new RollingFileAppender();
        sdkRollingFileAppender.setAppend(true);
        sdkRollingFileAppender.setAppenderName("fileappender");
        sdkRollingFileAppender.setFileName("./logs/biosdk-testing-kit.log");
        sdkRollingFileAppender.setFileNamePattern("./logs/biosdk-testing-kit-%d{yyyy-MM-dd}-%i.log");
        sdkRollingFileAppender.setImmediateFlush(true);
        sdkRollingFileAppender.setMaxFileSize("50mb");
//		sdkRollingFileAppender.setMaxHistory(3);
        sdkRollingFileAppender.setPrudent(false);
//		sdkRollingFileAppender.setTotalCap("50mb");
    }

    public static Logger logConfig(Class<?> clazz) {
        return Logfactory.getDefaultRollingFileLogger(sdkRollingFileAppender, clazz);
    }

}
