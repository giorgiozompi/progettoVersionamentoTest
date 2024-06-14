public class NotificaApp extends Notifica {

    public NotificaApp(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("Invio notifica app a: " + destinatario);
        System.out.println("Messaggio: " + messaggio);
    }
}