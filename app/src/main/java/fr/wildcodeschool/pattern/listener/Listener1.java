package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;

public class Listener1 implements AudioEventHandler {

  AudioPlayer mPlayer;

  public Listener1(AudioPlayer audioPlayer) {
    mPlayer = audioPlayer;
    mPlayer.addListener(this);
  }

  public void onPrepared(MediaPlayer mp) {

  }

  public void onCompletion(MediaPlayer mp) {
    mPlayer.removeListener(this);
  }
}
