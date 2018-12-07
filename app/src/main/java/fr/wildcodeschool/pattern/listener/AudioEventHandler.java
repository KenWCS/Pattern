package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;

public interface AudioEventHandler {
  void onPrepared(MediaPlayer mp);
  void onCompletion(MediaPlayer mp);
}
