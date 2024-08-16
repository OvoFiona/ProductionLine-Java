
package Productionline;

public class MoviePlayerDriver {

    public static void main(String[] args) {
        Screen screen = new Screen("3840x2160", 60, 5);
        MoviePlayer moviePlayer = new MoviePlayer("Home Theater", screen, MonitorType.LED);
        moviePlayer.play();
        moviePlayer.stop();
        moviePlayer.previous();
        moviePlayer.next();
        System.out.println(moviePlayer);
    }

}
    

