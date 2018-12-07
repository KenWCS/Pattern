package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;

public class Listener2 implements AudioEventHandler {

  AudioPlayer mPlayer;

  public Listener2(AudioPlayer audioPlayer) {
    mPlayer = audioPlayer;
    mPlayer.addListener(this);
  }

  public void onPrepared(MediaPlayer mp) {

  }

  public void onCompletion(MediaPlayer mp) {
    mPlayer.removeListener(this);
  }
}
