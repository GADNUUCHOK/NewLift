package com.bignerdranch.android.lift;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class LiftActivity extends AppCompatActivity implements OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    private Button mButton12;
    private Button mButton13;
    private Button mButton14;
    private Button mButton15;
    private Button mButton16;
    private Button mButton17;
    private Button mButton18;
    private Button mButton19;
    private Button mButton20;

    private int liftLocation;
    private int floorLift = 1;
    ArrayList<Integer> InsideButtons;
    ArrayList<Integer> OutsideButtons;

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lift);

        mImageView = (ImageView) findViewById(R.id.Lift);

        mButton1 = (Button) findViewById(R.id.button1);
        mButton11 = (Button) findViewById(R.id.button11);
        mButton12 = (Button) findViewById(R.id.button12);
        mButton13 = (Button) findViewById(R.id.button13);
        mButton14 = (Button) findViewById(R.id.button14);
        mButton15 = (Button) findViewById(R.id.button15);
        mButton16 = (Button) findViewById(R.id.button16);
        mButton17 = (Button) findViewById(R.id.button17);
        mButton18 = (Button) findViewById(R.id.button18);
        mButton19 = (Button) findViewById(R.id.button19);
        mButton20 = (Button) findViewById(R.id.button20);

        mButton11.setOnClickListener(this);
        mButton12.setOnClickListener(this);
        mButton13.setOnClickListener(this);
        mButton14.setOnClickListener(this);
        mButton15.setOnClickListener(this);
        mButton16.setOnClickListener(this);
        mButton17.setOnClickListener(this);
        mButton18.setOnClickListener(this);
        mButton19.setOnClickListener(this);
        mButton12.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button11:
                    OutsideButtons.add(1);
                    if (OutsideButtons.get(1) > floorLift) {
                        levelUp();
                        floorLift++;
                    }
                    if (OutsideButtons.get(1) < floorLift) {
                        levelDown();
                        floorLift--;
                    }
                    break;
                case R.id.button12:
                    OutsideButtons.add(2);
                    break;
                case R.id.button13:
                    OutsideButtons.add(3);
                    break;
                case R.id.button14:
                    OutsideButtons.add(4);
                    break;
                case R.id.button15:
                    OutsideButtons.add(5);
                    break;
                case R.id.button16:
                    OutsideButtons.add(6);
                    break;
                case R.id.button17:
                    OutsideButtons.add(7);
                    break;
                case R.id.button18:
                    OutsideButtons.add(8);
                    break;
                case R.id.button19:
                    OutsideButtons.add(9);
                    break;
                case R.id.button20:
                    OutsideButtons.add(10);
                    break;
            }
        }
        /**mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton11);
            }
        });

        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton12);
            }
        });
        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton13);
            }
        });
        mButton4 = (Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton14);
            }
        });
        mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton15);
            }
        });
        mButton6 = (Button) findViewById(R.id.button6);
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton16);
            }
        });
        mButton7 = (Button) findViewById(R.id.button7);
        mButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton17);
            }
        });
        mButton8 = (Button) findViewById(R.id.button8);
        mButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton18);
            }
        });
        mButton9 = (Button) findViewById(R.id.button9);
        mButton9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton19);
            }
        });
        mButton10 = (Button) findViewById(R.id.button10);
        mButton10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startAnimation(mButton20);
            }
        });
    }
    private void startAnimation(Button button, int level) {

        int i = 1;
        float Ystart = mImageView.getTop();
        float Yend = Ystart + 40;
        ObjectAnimator heightAnimator = ObjectAnimator
                .ofFloat(mImageView, "y", Ystart, Yend)
                .setDuration(3000);
        i++;

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet
                .play(heightAnimator);
        if (i == level) {
            heightAnimator.setDuration(5000);
        } else {
            heightAnimator.
        }
        heightAnimator.start();*/


        private void levelUp() {

            liftLocation =+ 40;
            floorLift ++;
        }

        private void levelDown() {

            liftLocation =-40;
            floorLift --;
        }
}