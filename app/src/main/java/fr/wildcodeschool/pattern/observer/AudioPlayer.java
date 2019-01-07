package fr.wildcodeschool.pattern.observer;

import android.media.MediaPlayer;

import java.util.ArrayList;

public class AudioPlayer {
  // Media player new instance
  private MediaPlayer player = new MediaPlayer();

  // Array with all the listener of event
  private ArrayList<AudioEventListener> eventHandlerList = new ArrayList<>();

  /**
   * Add a new listener in the list
   * @param handler AudioEventListener: new event client
   */
  public void addListener(AudioEventListener handler) {
    if (!eventHandlerList.contains(handler)) {
      eventHandlerList.add(handler);
    }
  }

  /**
   * Remove a listener in the list
   * @param handler AudioEventListener: remove an event client
   */
  public void removeListener(AudioEventListener handler) {
    if (eventHandlerList.contains(handler)) {
      eventHandlerList.remove(handler);
    }
  }

  /**
   * Remove all the listeners of the list
   */
  @SuppressWarnings("unused")
  public void removeAllListeners() {
    eventHandlerList.clear();
  }

  /**
   * Simulate onPrepared MediaPlayer event
   */
  public void forceOnPrepared() {
    onPrepared(player);
  }

  /**
   * Simulate onCompletion MediaPlayer event
   */
  public void forceOnCompletion() {
    onCompletion(player);
  }

  /**
   * Called when the media file is ready for playback.
   * @param mp MediaPlayer: the MediaPlayer that is ready for playback
   */
  private void onPrepared(MediaPlayer mp) {
    for (AudioEventListener handler : eventHandlerList) {
      handler.onPrepared(mp);
    }
  }

  /**
   * Called when the end of a media source is reached during playback.
   * @param mp MediaPlayer: the MediaPlayer that reached the end of the file
   */
  private void onCompletion(MediaPlayer mp) {
    for (AudioEventListener handler : eventHandlerList) {
      handler.onCompletion(mp);
    }
  }

}
