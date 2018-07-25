package com.educacionit.java.advanced.classes;

public class AppNotification {
    public static void main(String[] args){
        Notificator app = new Notificator();
        app.setNotification(new EmailNotification());
        app.send("Gonzo", "Alguien", "Hola" );

        app.setNotification(
            new INotification() {
                @Override
                public void send(String from, String to, String msg) {
                    System.out.printf("\nUsando clase ANONIMA: %s envia msg %s a %s", from, msg, to);
                }
            }
        );
        app.send("Gonzo", "Alguien", "Hola" );

        app.setNotification(
            (String from, String to, String msg) -> {System.out.printf("\nUsando clase LAMBDA: %s envia msg %s a %s", from, msg, to);}
        );
        app.send("Gonzo", "Alguien", "Hola" );
    }
}
