package com.example.naguannide.kdniao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);


        KdniaoTrackQueryAPI api = new KdniaoTrackQueryAPI();

        api.getOrderTracesByJson("SF", "")
    }
}