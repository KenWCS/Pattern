package fr.wildcodeschool.pattern.singleton;

public class AudioManager {
  private static final AudioManager mInstance = new AudioManager();

  public static AudioManager getInstance() {
    return mInstance;
  }

  private AudioManager() {
  }
}
