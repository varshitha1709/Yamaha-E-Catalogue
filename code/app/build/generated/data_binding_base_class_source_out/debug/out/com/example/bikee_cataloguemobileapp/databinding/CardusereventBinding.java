// Generated by view binder compiler. Do not edit!
package com.example.bikee_cataloguemobileapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bikee_cataloguemobileapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardusereventBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvecg;

  @NonNull
  public final TextView tvecity;

  @NonNull
  public final TextView tvedec;

  @NonNull
  public final TextView tveend;

  @NonNull
  public final TextView tveplace;

  @NonNull
  public final TextView tvestart;

  @NonNull
  public final TextView tvevent;

  @NonNull
  public final ImageView viewimg;

  private CardusereventBinding(@NonNull CardView rootView, @NonNull TextView tvecg,
      @NonNull TextView tvecity, @NonNull TextView tvedec, @NonNull TextView tveend,
      @NonNull TextView tveplace, @NonNull TextView tvestart, @NonNull TextView tvevent,
      @NonNull ImageView viewimg) {
    this.rootView = rootView;
    this.tvecg = tvecg;
    this.tvecity = tvecity;
    this.tvedec = tvedec;
    this.tveend = tveend;
    this.tveplace = tveplace;
    this.tvestart = tvestart;
    this.tvevent = tvevent;
    this.viewimg = viewimg;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardusereventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardusereventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.carduserevent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardusereventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvecg;
      TextView tvecg = ViewBindings.findChildViewById(rootView, id);
      if (tvecg == null) {
        break missingId;
      }

      id = R.id.tvecity;
      TextView tvecity = ViewBindings.findChildViewById(rootView, id);
      if (tvecity == null) {
        break missingId;
      }

      id = R.id.tvedec;
      TextView tvedec = ViewBindings.findChildViewById(rootView, id);
      if (tvedec == null) {
        break missingId;
      }

      id = R.id.tveend;
      TextView tveend = ViewBindings.findChildViewById(rootView, id);
      if (tveend == null) {
        break missingId;
      }

      id = R.id.tveplace;
      TextView tveplace = ViewBindings.findChildViewById(rootView, id);
      if (tveplace == null) {
        break missingId;
      }

      id = R.id.tvestart;
      TextView tvestart = ViewBindings.findChildViewById(rootView, id);
      if (tvestart == null) {
        break missingId;
      }

      id = R.id.tvevent;
      TextView tvevent = ViewBindings.findChildViewById(rootView, id);
      if (tvevent == null) {
        break missingId;
      }

      id = R.id.viewimg;
      ImageView viewimg = ViewBindings.findChildViewById(rootView, id);
      if (viewimg == null) {
        break missingId;
      }

      return new CardusereventBinding((CardView) rootView, tvecg, tvecity, tvedec, tveend, tveplace,
          tvestart, tvevent, viewimg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
