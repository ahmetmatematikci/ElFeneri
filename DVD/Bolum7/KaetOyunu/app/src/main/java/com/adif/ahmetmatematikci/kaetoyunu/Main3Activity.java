package com.adif.ahmetmatematikci.kaetoyunu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv5, tv6;
    String ix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv5 = (TextView)findViewById(R.id.textView5);
        tv6 =(TextView)findViewById(R.id.textView6);

        Intent i = getIntent();
        ix =i.getStringExtra("hata");
        tv5.setText(ix);
    }
}
