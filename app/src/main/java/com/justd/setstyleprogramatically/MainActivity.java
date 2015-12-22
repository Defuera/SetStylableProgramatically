package com.justd.setstyleprogramatically;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StyleableWidget widget = (StyleableWidget) findViewById(R.id.styleble_dynamically_widget);
        widget.setStyle(R.style.MyStyle);

    }

}
