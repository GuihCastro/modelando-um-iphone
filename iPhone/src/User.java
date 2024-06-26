import device.IPhone;

public class User {
    public static void main(String[] args) {
        IPhone myIphone = new IPhone();

        myIphone.makeCall();
        myIphone.answerCall();
        myIphone.checkVoiceMail();

        myIphone.openNewTab();
        myIphone.showPage();
        myIphone.refreshPage();

        myIphone.playMusic();
        myIphone.pauseMusic();
        myIphone.selectTrack("Vida Loka, pt. 2");
    }
}