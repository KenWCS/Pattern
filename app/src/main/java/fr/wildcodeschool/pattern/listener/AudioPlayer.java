package fr.wildcodeschool.pattern.listener;

import android.media.MediaPlayer;

import java.util.ArrayList;

public class AudioPlayer {
  // Media player new instance
  MediaPlayer player = new MediaPlayer();

  // Array with all the listener of event
  ArrayList<AudioEventHandler> eventHandlerList = new ArrayList<>();

  /**
   * Add a new listener in the list
   * @param handler AudioEventHandler: new event client
   */
  public void addListener(AudioEventHandler handler) {
    if (!eventHandlerList.contains(handler)) {
      eventHandlerList.add(handler);
    }
  }

  /**
   * Remove a listener in the list
   * @param handler AudioEventHandler: remove an event client
   */
  public void removeListener(AudioEventHandler handler) {
    if (eventHandlerList.contains(handler)) {
      eventHandlerList.remove(handler);
    }
  }

  /**
   * Remove all the listeners of the list
   */
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
    for (AudioEventHandler handler : eventHandlerList) {
      handler.onPrepared(mp);
    }
  }

  /**
   * Called when the end of a media source is reached during playback.
   * @param mp MediaPlayer: the MediaPlayer that reached the end of the file
   */
  private void onCompletion(MediaPlayer mp) {
    for (AudioEventHandler handler : eventHandlerList) {
      handler.onCompletion(mp);
    }
  }

}
