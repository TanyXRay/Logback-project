package ru.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.lessons.test.LogbackTest;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LogbackTest logbackTest = new LogbackTest();
        logbackTest.doLogDebug();
        logbackTest.doLogError();

        log.error("Message-debug for MAIN");
        log.info("Message-info for MAIN");
    }
}