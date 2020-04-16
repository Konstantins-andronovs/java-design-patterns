package com.andronov;


import com.andronov.thirdpartylogger.LogMessage;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import java.time.LocalDate;

@Decorator
@Priority(10)
public abstract class LogMessageFormatter implements LogMessage {

    @Any
    @Inject
    @Delegate
    private LogMessage logMessage;

    @Override
    public void printMessage() {
        String message = logMessage.getMessage();
        message = LocalDate.now().toString().concat(message);
        logMessage.setMessage(message);
    }

}
