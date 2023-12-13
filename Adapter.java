// Adapter
public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    private AdvancedHighResolutionMediaPlayer advancedHighResolutionMediaPlayer;

    public Adapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public Adapter(AdvancedHighResolutionMediaPlayer advancedHighResolutionMediaPlayer) {
        this.advancedHighResolutionMediaPlayer = advancedHighResolutionMediaPlayer;
    }

    public Adapter(AdvancedMediaPlayer advancedMediaPlayer,AdvancedHighResolutionMediaPlayer advancedHighResolutionMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
        this.advancedHighResolutionMediaPlayer=advancedHighResolutionMediaPlayer;
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("AAC")) {
            advancedMediaPlayer.playAAC(fileName);
        } else if(mediaType.equalsIgnoreCase("HighResolution")){
            advancedHighResolutionMediaPlayer.playHighResolutionAAC("JWT");
        }else {
            System.out.println("Invalid media type. Cannot play: " + mediaType);
        }
    }
}
