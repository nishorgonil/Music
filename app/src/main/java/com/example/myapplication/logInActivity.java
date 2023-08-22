package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class logInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int flags = View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(flags);
        setContentView(R.layout.activity_log_in);

        Button myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(logInActivity.this, "LogIn clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        TextView myTextView = findViewById(R.id.textView8);

        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(logInActivity.this, "SignUp clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        TextView myTextView2 = findViewById(R.id.textView7);

        myTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(logInActivity.this, "Reset password clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView myImageView = findViewById(R.id.imageView5);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setDuration(50000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        rotateAnimation.setInterpolator(new LinearInterpolator());


        myImageView.startAnimation(rotateAnimation);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView myImageView2 = findViewById(R.id.imageView6);

        RotateAnimation rotateAnimation2 = new RotateAnimation(0, -360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation2.setDuration(50000);
        rotateAnimation2.setRepeatCount(Animation.INFINITE);
        rotateAnimation2.setInterpolator(new LinearInterpolator());

        myImageView2.startAnimation(rotateAnimation2);

    }


}
