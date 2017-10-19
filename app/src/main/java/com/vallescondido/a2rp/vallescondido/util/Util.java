package com.vallescondido.a2rp.vallescondido.util;

import android.content.Context;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.vallescondido.a2rp.vallescondido.R;

/**
 * Created by Aaron on 18/10/2017.
 */

public class Util {

    public static void delay(int milliseconds , final DelayCallback delayCallback){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                delayCallback.post();
            }
        } , milliseconds);
    }

    public interface DelayCallback{
        void post();
    }

    public static void toast(Context context , String text ){
        Toast.makeText( context , text , Toast.LENGTH_SHORT).show();
    }

    public enum AnimationName{
        SLIDE_DOWN (0), SLIDE_TOP(1), BOUNCE(2)
        ,FADE_IN(3);
        private final int index;
        AnimationName(int index){
            this.index = index;
        }
    }

    public static Animation anim(Context context , AnimationName name){
        int [] resources = {
                R.anim.slide_down,
                R.anim.slide_top,
                R.anim.bounce,
                android.R.anim.fade_in
        };

        return AnimationUtils.loadAnimation(context , resources[name.index]);
    }

    public static void snake(View view , String text ){
        Snackbar.make(view , text , Snackbar.LENGTH_SHORT).show();
    }
}
