package fr.wildcodeschool.pattern.builder;

import android.view.View;

public interface Builder {
  void setMargin();
  void setAnchor();

  View getBuildView();
}
