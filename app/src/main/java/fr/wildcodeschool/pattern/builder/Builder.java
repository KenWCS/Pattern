package fr.wildcodeschool.pattern.builder;

import android.view.View;

interface Builder {
  void setMargin();
  void setAnchor();

  View getBuildView();
}
