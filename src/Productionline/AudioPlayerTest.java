
package Productionline;

public class AudioPlayerTest {
    public static void main(String[] args) {
       // Create an instance of AudioPlayer
 AudioPlayer myAudioPlayer = new AudioPlayer("MP3 Player", "High-Quality Audio");
 AudioPlayer myAudioPlayer1 = new AudioPlayer("CD Player", "Stereo Audio");
        myAudioPlayer.play();
        myAudioPlayer.stop();
        myAudioPlayer.next();
        myAudioPlayer.previous();
        System.out.println(myAudioPlayer);
        
        myAudioPlayer1.play();
        myAudioPlayer1.stop();
        myAudioPlayer1.next();
        myAudioPlayer1.previous();
        System.out.println(myAudioPlayer1);
    }

}
