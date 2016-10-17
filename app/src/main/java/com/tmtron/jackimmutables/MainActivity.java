package com.tmtron.jackimmutables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class MainActivity extends AppCompatActivity {

    @ViewById
    protected TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Click
    public void buttonClicked() {
        /* when Immutables is used the jack-compilation takes about 1 minute
         * even when I only make a small change (e.g. change the data-text), I must rebuild the
         * whole project
         * Run will fail with an error.
         */
        SimpleData immutableData = ImmutableSimpleData.builder().data("button Clicked").build();
        textView.setText(immutableData.data());
    }


}
