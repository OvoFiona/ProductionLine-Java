
package Productionline;

public class AudioPlayer extends Product implements MultimediaControl {
   
    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.Audio;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Audio Spec: " + audioSpecification + "\n" +
               "Type: " + mediaType;
    }

    public static void main(String[] args) {
        AudioPlayer A1 = new AudioPlayer("Ipod", "High Quality Audio");
        System.out.println(A1.toString());
        A1.play();
        A1.stop();
        A1.previous();
        A1.next();
    }
}
