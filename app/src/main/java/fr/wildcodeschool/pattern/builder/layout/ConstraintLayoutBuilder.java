package fr.wildcodeschool.pattern.builder.layout;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

import fr.wildcodeschool.pattern.builder.Builder;

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
