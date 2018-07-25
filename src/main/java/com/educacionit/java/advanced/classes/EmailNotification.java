package com.educacionit.java.advanced.classes;

public class EmailNotification implements INotification {
    @Override
    public void send (String from, String to, String msg){
        System.out.printf("Usando EMAIL: %s send msg %s to %s", from, msg, to);
    }
}
