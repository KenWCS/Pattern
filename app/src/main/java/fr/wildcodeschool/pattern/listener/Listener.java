package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;
import android.util.Log;

public class Listener implements AudioEventHandler {
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
