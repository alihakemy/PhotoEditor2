package com.droidninja.imageeditengine;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.droidninja.imageeditengine.utils.FragmentUtil;

import static com.droidninja.imageeditengine.ImageEditor.EXTRA_IMAGE_PATH;

public class ImageEditActivity extends BaseImageEditActivity
{
  private Rect cropRect;

  //private View touchView;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_image_edit);

    String imagePath = getIntent().getStringExtra(EXTRA_IMAGE_PATH);
    if (imagePath != null) {
      FragmentUtil.addFragment(this, R.id.fragment_container,
          PhotoEditorFragment.newInstance(imagePath));
    }
  }






  @Override public void onBackPressed() {
    super.onBackPressed();
  }
}
