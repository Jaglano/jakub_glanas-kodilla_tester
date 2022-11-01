package com.kodilla.spring.basic.dependency_injection;

public class TextMessageService implements MessageService{
    @Override
    public void send(String message, String receinver) {
        System.out.println("Sending text [" + message + " ] to: " + receinver);
    }
}
