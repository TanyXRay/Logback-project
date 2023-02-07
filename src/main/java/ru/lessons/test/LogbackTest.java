package ru.lessons.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    public void doLogDebug() {
        logger.debug("Message-debug for LogbackTest");
    }

    public void doLogError() {
        logger.debug("Message-error for LogbackTest");
    }
}
