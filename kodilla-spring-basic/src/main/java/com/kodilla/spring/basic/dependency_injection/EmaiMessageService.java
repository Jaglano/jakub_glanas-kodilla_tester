package com.kodilla.spring.basic.dependency_injection;

public class EmaiMessageService implements MessageService{

    @Override
    public void send(String message, String receinver) {
        System.out.println("Sending [" + message + " ] to: " + receinver + "via Email");
    }
}
