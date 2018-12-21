package fr.wildcodeschool.pattern.builder.layout;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import fr.wildcodeschool.pattern.builder.Builder;

public class LinearLayoutBuilder implements Builder {
  private LinearLayout mLayout;

  public LinearLayoutBuilder(Context ctx) {
    mLayout = new LinearLayout(ctx);
  }

  public void setMargin() {
    // Specific LinearLayout setMargin code
  }

  public void setAnchor() {
    // Specific LinearLayout setAnchor code
  }

  public View getBuildView() {
    return mLayout;
  }
}
