package com.robspassky.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BarJob implements Runnable {
    private Environment environment;
    private IncrementComponent incrementComponent;
    private CalculatorComponent calculatorComponent;

    private static final Logger log = LoggerFactory.getLogger(BarJob.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public BarJob(Environment environment, CalculatorComponent calculatorComponent, IncrementComponent incrementComponent) {
        this.environment = environment;
        this.incrementComponent = incrementComponent;
        this.calculatorComponent = calculatorComponent;
        int num = Integer.parseInt(environment.getRequiredProperty("samplejob.metadata.number"));
        this.calculatorComponent.setZ(num);
    }

    public int calcCurrentLine() {
        incrementComponent.incr();
        return calculatorComponent.add(incrementComponent.getCount());
    }

    public String dateToString(Date d) {
        return dateFormat.format(d);
    }

    public String getHomeDir() {
        return environment.getRequiredProperty("user.home");
    }

    @Override
    public void run() {
        int line = calcCurrentLine();
        String now = dateToString(new Date());
        String name = getHomeDir();
        log.info("{}. The (5s) time is now {} -- by the way, {}", line, now, name);
    }


}
