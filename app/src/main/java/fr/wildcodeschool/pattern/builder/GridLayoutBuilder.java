package fr.wildcodeschool.pattern.builder;

import android.content.Context;
import android.view.View;
import android.widget.GridLayout;

public class GridLayoutBuilder implements Builder{
  private GridLayout mLayout;

  public GridLayoutBuilder(Context ctx) {
    mLayout = new GridLayout(ctx);
  }

  public void setMargin() {
    // Specific GridLayout setMargin code
  }

  public void setAnchor() {
    // Specific GridLayout setAnchor code
  }

  public View getBuildView() {
    return mLayout;
  }

}
