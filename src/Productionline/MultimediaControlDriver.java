
package Productionline;

public class MultimediaControlDriver {

    public static void main(String[] args) {
       MultimediaControl[] devices = new MultimediaControl[] {
            new AudioPlayer("My Audio Player", "High Fidelity"),
            new MoviePlayer("My Movie Player", new Screen("1920x1080", 60, 5), MonitorType.LED)
        };

        for (MultimediaControl device : devices) {
            device.play();
            device.stop();
            device.next();
            device.previous();
            System.out.println(device);
        }
    }
 
}
    

