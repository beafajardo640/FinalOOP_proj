package finalproj_oop;

import javax.sound.sampled.*;
import javax.swing.JButton;
import java.io.File;

public class AudioManager {
    private static Clip backgroundClip;
    private static boolean isMuted = false;

    // ✅ Play looping background music (non-overlapping)
    public static void playBackground(String filepath) {
        if (isMuted) return;

        // Prevent duplicate play
        if (backgroundClip != null && backgroundClip.isRunning()) return;

        // Fade out previous clip in a separate thread
        fadeOutAndStop();

        new Thread(() -> {
            try {
                if (isMuted) return;

                File file = new File(filepath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                backgroundClip = AudioSystem.getClip();
                backgroundClip.open(audioStream);
                backgroundClip.loop(Clip.LOOP_CONTINUOUSLY);
                backgroundClip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    // ✅ Smooth fade out of background music
    private static void fadeOutAndStop() {
        if (backgroundClip == null || !backgroundClip.isRunning()) return;

        new Thread(() -> {
            try {
                if (backgroundClip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                    FloatControl gainControl = (FloatControl) backgroundClip.getControl(FloatControl.Type.MASTER_GAIN);
                    float currentVolume = gainControl.getValue();
                    float minVolume = gainControl.getMinimum();

                    for (float v = currentVolume; v > minVolume; v -= 1.0f) {
                        gainControl.setValue(v);
                        Thread.sleep(10);
                    }
                }

                backgroundClip.stop();
                backgroundClip.close();
                backgroundClip = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    // ✅ Stop background music immediately
    public static void stopBackground() {
        if (backgroundClip != null) {
            backgroundClip.stop();
            backgroundClip.close();
            backgroundClip = null;
        }
    }

    // ✅ Play short effect sound (button clicks, correct/wrong)
    public static void playEffect(String filepath) {
        if (isMuted) return;

        new Thread(() -> {
            try {
                File file = new File(filepath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip effectClip = AudioSystem.getClip();
                effectClip.open(audioStream);
                effectClip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    // ✅ Mute / Unmute background and effects
    public static void setMuted(boolean muted) {
        if (isMuted == muted) return;
        isMuted = muted;

        if (muted) {
            stopBackground();
        } else {
            playBackground("src/AUDIO/WHILEPLAYING.wav");
        }
    }

    public static boolean isMuted() {
        return isMuted;
    }

    // ✅ Check if background music is stopped
    public static boolean isBackgroundStopped() {
        return backgroundClip == null || !backgroundClip.isRunning();
    }

    // ✅ Add button click sound to any JButton
    public static void addSelectSound(JButton button) {
        button.addActionListener(e -> {
            if (!isMuted) {
                playEffect("src/AUDIO/select.wav");
            }
        });
    }
}
