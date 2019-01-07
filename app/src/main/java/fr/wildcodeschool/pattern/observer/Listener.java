package fr.wildcodeschool.pattern.observer;

import android.media.MediaPlayer;
import android.util.Log;

public class Listener implements AudioEventListener {
  // TAG
  private static final String TAG = "Listener";
  // Listener name
  private String mName;

  public Listener(String pName) {
    mName = pName;
  }

  public void onPrepared(MediaPlayer mp) {
    Log.i(TAG, mName+" receive onPrepared event");
  }

  public void onCompletion(MediaPlayer mp) {
    Log.i(TAG, mName+" receive onCompletion event");
  }
}
