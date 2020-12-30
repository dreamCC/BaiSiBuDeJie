package com.zcj.baisibudejie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        splashAnimator();
    }

    private void splashAnimator() {

        // 实现的方案
        // 1、属性动画ObjectAnimator
        // 2、补间动画
        // 3、定时器
        // 4、Handle+Thread
        ImageView splashIV = findViewById(R.id.iv_splash);
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(splashIV, "alpha", 0.f, 1.f);
        // 动画执行时间 2~3秒
        objectAnimator.setDuration(2000);
        objectAnimator.start();

        // android适配模式器模式。
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                startActivity(new Intent(LaunchActivity.this, MainActivity.class));
                finish();
            }
        });
    }

}