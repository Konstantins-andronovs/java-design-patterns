package com.andronov;

import com.andronov.thirdpartylogger.LogMessage;

@ComplexMessage
public class SystemMessage implements LogMessage {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.print(message);
    }
}
