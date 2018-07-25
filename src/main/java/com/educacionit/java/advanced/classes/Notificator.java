package com.educacionit.java.advanced.classes;

public class Notificator {
    private INotification notification;

    public void setNotification(INotification notification){
        this.notification = notification;
    }

    public void send(String from, String to, String msg){
        this.notification.send (from, to, msg);
    }
}
