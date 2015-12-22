package com.justd.setstyleprogramatically;

import android.content.Context;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by defuera on 22/12/2015.
 */
public class StyleableWidget extends LinearLayout {

    private final StyleLoader styleLoader = new StyleLoader();

    private TextView textView;
    private View divider;

    public StyleableWidget(Context context) {
        super(context);
        init();
    }

    public StyleableWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        apply(styleLoader.load(context, attrs));
    }

    private void init() {
        inflate(getContext(), R.layout.widget_styleable, this);
        textView = (TextView) findViewById(R.id.text_view);
        divider = findViewById(R.id.divider);
        setOrientation(VERTICAL);
    }

    protected void apply(StyleLoader.StyleAttrs styleAttrs) {
        textView.setTextColor(styleAttrs.textColor);
        divider.setBackgroundColor(styleAttrs.dividerColor);
    }


    public void setStyle(@StyleRes int style) {
        apply(styleLoader.load(getContext(), style));
    }
}
