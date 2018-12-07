package fr.wildcodeschool.pattern.builder;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;

public class ConstraintLayoutBuilder implements Builder {
  private ConstraintLayout mLayout;

  public ConstraintLayoutBuilder(Context ctx) {
    mLayout = new ConstraintLayout(ctx);
  }

  public void setMargin() {
    // Specific ConstraintLayout setMargin code
  }

  public void setAnchor() {
    // Specific ConstraintLayout setAnchor code
  }

  public View getBuildView() {
    return mLayout;
  }
}
