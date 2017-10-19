package com.vallescondido.a2rp.vallescondido.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.vallescondido.a2rp.vallescondido.R;
import com.vallescondido.a2rp.vallescondido.util.Util;

public class SplashActivity extends AppCompatActivity{

    private static final String TAG = SplashActivity.class.getSimpleName();

    private LinearLayout mllConteiner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        animations();

        Util.delay(2500, new Util.DelayCallback() {
            @Override
            public void post() {
                startActivity( new Intent( getBaseContext() , LoginActivity.class));
            }
        });
    }

    private void init() {
        setContentView(R.layout.activity_splash);
        mllConteiner = (LinearLayout) findViewById(R.id.llConteiner);

    }

    private void animations() {
        Animation fadeIn = Util.anim(getBaseContext() , Util.AnimationName.FADE_IN);
        fadeIn.setDuration(2500);

        mllConteiner.startAnimation(fadeIn);

    }
}
