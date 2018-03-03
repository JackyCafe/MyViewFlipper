package com.linyanheng.myviewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vf = (ViewFlipper) findViewById(R.id.vf1);
        vf.setAutoStart(true);
        vf.setFlipInterval(3000);
        boolean isFlip = vf.isFlipping();
        Log.v("Jacky",""+isFlip);
        vf.setInAnimation(this,R.anim.in_from_right);
        vf.setOutAnimation(this,R.anim.out_to_left);

    }
}
