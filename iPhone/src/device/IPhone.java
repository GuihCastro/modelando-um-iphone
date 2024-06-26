package device;

import device.interfaces.InternetBrowser;
import device.interfaces.MusicPlayer;
import device.interfaces.Telephone;

public class IPhone implements Telephone, MusicPlayer, InternetBrowser {

    public void makeCall() {
        System.out.println("Fazendo ligação...");
    }
    public void answerCall() {
        System.out.println("Recebendo ligação...");
    }
    public void checkVoiceMail() {
        boolean isThereVoiceMails = false;
        System.out.println(isThereVoiceMails ? "Você tem novas mensagens." : "Você não tem novas mensagens.");
    }

    public void showPage() {
        System.out.println("Mostrando página web...");
    }
    public void openNewTab() {
        System.out.println("Nova aba aberta!");
    }
    public void refreshPage() {
        System.out.println("Página atualizada!");
    }

    public void playMusic() {
        System.out.println("Tocando música...");
    }
    public void pauseMusic() {
        System.out.println("Música pausada!");
    }
    public void selectTrack(String track) {
        System.out.println("Tocando a música " + track);
    }
}
