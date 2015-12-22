package com.justd.setstyleprogramatically;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;

public class StyleLoader {

    public StyleLoader() {

    }

    public static class StyleAttrs {
        public int textColor;
        public int dividerColor;
    }

    public StyleAttrs load(Context context, @StyleRes int styleResId) {
        final TypedArray styledAttributes = context.obtainStyledAttributes(styleResId, R.styleable.CustomWidget);
        return load(styledAttributes);
    }

    public StyleAttrs load(Context context, AttributeSet attrs) {
        final TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CustomWidget);
        return load(styledAttributes);
    }

    @NonNull
    private StyleAttrs load(TypedArray styledAttributes) {
        StyleAttrs styleAttrs = new StyleAttrs();
        try {
            styleAttrs.textColor = styledAttributes.getColor(R.styleable.CustomWidget_customTextColor, 0);
            styleAttrs.dividerColor = styledAttributes.getColor(R.styleable.CustomWidget_customDividerColor, 0);
        } finally {
            styledAttributes.recycle();
        }
        return styleAttrs;
    }


}