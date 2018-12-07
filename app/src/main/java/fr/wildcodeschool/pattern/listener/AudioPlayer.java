package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;

import java.util.ArrayList;

public class AudioPlayer {
  ArrayList<AudioEventHandler> eventHandlerList = new ArrayList<>();

  public void addListener(AudioEventHandler handler) {
    if (!eventHandlerList.contains(handler)) {
      eventHandlerList.add(handler);
    }
  }

  public void removeListener(AudioEventHandler handler) {
    if (eventHandlerList.contains(handler)) {
      eventHandlerList.remove(handler);
    }
  }


  /**
   *
   * @param mp
   */
  private void onPrepared(MediaPlayer mp) {
    for (AudioEventHandler handler : eventHandlerList) {
      handler.onPrepared(mp);
    }
  }

  /**
   *
   * @param mp
   */
  private void onCompletion(MediaPlayer mp) {
    for (AudioEventHandler handler : eventHandlerList) {
      handler.onCompletion(mp);
    }
  }

}
