package de.check24.databinding.bindings;

import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Custom binding adapter for {@link View}.
 */
public class ViewBindings {

    @BindingAdapter({"visibility"})
    public static void setVisibility(View view, boolean visible) {
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }
}
