package com.andronov;

import com.andronov.thirdpartylogger.LogMessage;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;

@Decorator
@Priority(20)
public abstract class LogMessageJSONFormatter implements LogMessage {

    @Any
    @Inject
    @Delegate
    @ComplexMessage
    private LogMessage logMessage;

    @Override
    public void printMessage() {
        String message = logMessage.getMessage();
        String jsonMessage = JsonbBuilder.create().toJson(message);
        logMessage.setMessage(jsonMessage);
    }

}
