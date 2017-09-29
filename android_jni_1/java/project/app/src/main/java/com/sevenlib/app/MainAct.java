package com.sevenlib.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class MainAct extends Activity {
    static {
        System.loadLibrary("hello");
    }

    private native String getMessage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.util.Log.i("duy", "Begin app");
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.jniLabel);
        tv.setText(getMessage());
    }
}
