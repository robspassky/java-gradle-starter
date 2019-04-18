package com.robspassky.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FooJob implements Runnable {
    private Environment environment;
    private IncrementComponent incrementComponent;

    private static final Logger log = LoggerFactory.getLogger(FooJob.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public FooJob(Environment environment, IncrementComponent incrementComponent) {
        this.environment = environment;
        this.incrementComponent = incrementComponent;
    }

    public int calcCurrentLine() {
        incrementComponent.incr();
        return incrementComponent.getCount();
    }

    public String dateToString(Date d) {
        return dateFormat.format(d);
    }

    public String getJobName() {
        return environment.getRequiredProperty("samplejob.metadata.name");
    }

    @Override
    public void run() {
        int line = calcCurrentLine();
        String now = dateToString(new Date());
        String name = getJobName();
        log.info("{}. The (5s) time is now {} -- by the way, {}", line, now, name);
    }

}
