public class Main {
    public static void main(String[] args) {
        // Client code with the target interface
        MediaPlayer mediaPlayer = new Adapter(new AdvancedMediaPlayer());

        // Client plays AAC file without knowing about AdvancedMediaPlayer
        mediaPlayer.play("AAC", "song.aac");

        MediaPalyer mediaPlayerHighResolution=new Adapter(new AdvancedHighResolutionMediaPlayer());
        mediaPlayer.play("HighResolution","VIP.*");
    }
}
