package sound;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffect
{
    public void playSound(String id)
    {
        System.out.println("Playing sound: " + id);
        File f = new File("sound/" + id + ".wav");
        if(f.isFile()) 
        {
            try
            {
                AudioInputStream sndFile = AudioSystem.getAudioInputStream(f);
                Clip clip = AudioSystem.getClip();
                clip.open(sndFile);
                clip.start();
            }
            catch(Exception e)
            {
                System.out.println("Sound " + id + " could not be played. [" + e.getMessage() + "]");
            }
        }
        else
        {
            System.out.println("Sound " + id + " does not exist in sound/");
        }
    }
}