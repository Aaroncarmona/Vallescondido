package com.vallescondido.a2rp.vallescondido.ui;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.vallescondido.a2rp.vallescondido.R;
import com.vallescondido.a2rp.vallescondido.util.Util;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = LoginActivity.class.getSimpleName();

    private ProgressBar mProgressBar;
    private TextView mtvForgottenPassword;
    private LinearLayout mllConteiner;
    private TextInputEditText mtietUser, mtietPassword;
    private ImageView mivLogoValle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        anims();

    }

    private void init() {
        setContentView(R.layout.activity_login);

        mProgressBar         = (ProgressBar) findViewById(R.id.progressBar);
        mllConteiner         = (LinearLayout) findViewById(R.id.llConteiner);
        mivLogoValle         = (ImageView) findViewById(R.id.ivLogoValle);
        mtietUser            = (TextInputEditText) findViewById(R.id.tietUser);
        mtietPassword        = (TextInputEditText) findViewById(R.id.tietPassword);
        mtvForgottenPassword = (TextView) findViewById(R.id.tvForgottenPassword);

        mtvForgottenPassword.setOnClickListener(this);

    }
    private void anims() {
        Animation fadeIn = Util.anim(getBaseContext() , Util.AnimationName.FADE_IN);
        fadeIn.setDuration(2500);

        mllConteiner.setAnimation(fadeIn);
        mivLogoValle.setAnimation(fadeIn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvForgottenPassword:
                Util.snake(getCurrentFocus() , getString(R.string.dummy_text));
                break;
        }
    }
}
