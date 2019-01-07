package fr.wildcodeschool.pattern.observer;

import android.media.MediaPlayer;

public interface AudioEventListener {
  void onPrepared(MediaPlayer mp);
  void onCompletion(MediaPlayer mp);
}
