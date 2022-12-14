// Generated by view binder compiler. Do not edit!
package org.hyperskill.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.hyperskill.calculator.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText EditTextInput;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button10;

  @NonNull
  public final Button button11;

  @NonNull
  public final Button button12;

  @NonNull
  public final Button button13;

  @NonNull
  public final Button button14;

  @NonNull
  public final Button button15;

  @NonNull
  public final Button button16;

  @NonNull
  public final Button button17;

  @NonNull
  public final Button button18;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button9;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final TextView textView;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull EditText EditTextInput,
      @NonNull Button button, @NonNull Button button10, @NonNull Button button11,
      @NonNull Button button12, @NonNull Button button13, @NonNull Button button14,
      @NonNull Button button15, @NonNull Button button16, @NonNull Button button17,
      @NonNull Button button18, @NonNull Button button2, @NonNull Button button5,
      @NonNull Button button6, @NonNull Button button9, @NonNull Guideline guideline3,
      @NonNull Guideline guideline4, @NonNull TextView textView) {
    this.rootView = rootView;
    this.EditTextInput = EditTextInput;
    this.button = button;
    this.button10 = button10;
    this.button11 = button11;
    this.button12 = button12;
    this.button13 = button13;
    this.button14 = button14;
    this.button15 = button15;
    this.button16 = button16;
    this.button17 = button17;
    this.button18 = button18;
    this.button2 = button2;
    this.button5 = button5;
    this.button6 = button6;
    this.button9 = button9;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EditText_input;
      EditText EditTextInput = ViewBindings.findChildViewById(rootView, id);
      if (EditTextInput == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button10;
      Button button10 = ViewBindings.findChildViewById(rootView, id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.button11;
      Button button11 = ViewBindings.findChildViewById(rootView, id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.button12;
      Button button12 = ViewBindings.findChildViewById(rootView, id);
      if (button12 == null) {
        break missingId;
      }

      id = R.id.button13;
      Button button13 = ViewBindings.findChildViewById(rootView, id);
      if (button13 == null) {
        break missingId;
      }

      id = R.id.button14;
      Button button14 = ViewBindings.findChildViewById(rootView, id);
      if (button14 == null) {
        break missingId;
      }

      id = R.id.button15;
      Button button15 = ViewBindings.findChildViewById(rootView, id);
      if (button15 == null) {
        break missingId;
      }

      id = R.id.button16;
      Button button16 = ViewBindings.findChildViewById(rootView, id);
      if (button16 == null) {
        break missingId;
      }

      id = R.id.button17;
      Button button17 = ViewBindings.findChildViewById(rootView, id);
      if (button17 == null) {
        break missingId;
      }

      id = R.id.button18;
      Button button18 = ViewBindings.findChildViewById(rootView, id);
      if (button18 == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = ViewBindings.findChildViewById(rootView, id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, EditTextInput, button, button10,
          button11, button12, button13, button14, button15, button16, button17, button18, button2,
          button5, button6, button9, guideline3, guideline4, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
