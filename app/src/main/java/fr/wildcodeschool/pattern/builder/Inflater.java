package fr.wildcodeschool.pattern.builder;

import android.content.Context;

import java.util.HashMap;
import java.util.List;

import fr.wildcodeschool.pattern.builder.layout.ConstraintLayoutBuilder;
import fr.wildcodeschool.pattern.builder.layout.GridLayoutBuilder;
import fr.wildcodeschool.pattern.builder.layout.LinearLayoutBuilder;

public class Inflater {

  public static class LayoutDetail {
    private String layoutName = "";
    private HashMap<String, String> layoutDetail = new HashMap<>();

    public void setLayoutDetail(HashMap<String, String> layoutDetail) {
      this.layoutDetail = layoutDetail;
    }

    public void setLayoutName(String layoutName) {
      this.layoutName = layoutName;
    }

    public HashMap<String, String> getLayoutDetail() {
      return layoutDetail;
    }

    public String getLayoutName() {
      return layoutName;
    }
  }

  /**
   *
   * @param ctx
   * @param list
   */
  public void inflate(Context ctx, List<LayoutDetail> list) {
    for (LayoutDetail layoutDetail: list) {

      Builder builderView;
      switch (layoutDetail.getLayoutName()) {
        case "GridLayout":
          builderView = new GridLayoutBuilder(ctx);
          break;
        case "LinearLayout":
          builderView = new LinearLayoutBuilder(ctx);
          break;
        default:
          builderView = new ConstraintLayoutBuilder(ctx);
          break;
      }

      LayoutDirector director = new LayoutDirector(builderView);
      director.build(layoutDetail.getLayoutDetail());
      builderView.getBuildView();
    }
  }

  class LayoutDirector {
    private Builder mBuilder;

    public LayoutDirector(Builder b) {
      mBuilder = b;
    }

    public void build(HashMap<String, String> details) {
      if (details.containsKey("margin")) {
        mBuilder.setMargin();
      }
      if (details.containsKey("anchor")) {
        mBuilder.setAnchor();
      }
    }
  }
}
