package com.example.demo.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity implements View.OnClickListener {

    private TextView tv;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();

    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:

                break;
        }
    }
}
