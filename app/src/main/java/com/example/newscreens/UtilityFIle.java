package com.example.newscreens;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;

public class UtilityFIle {
    public static void setSecondaryColorForButton(Button button){
        button.setBackgroundResource(R.drawable.rounded_rectangle_gray);
        GradientDrawable drawable = (GradientDrawable) button.getBackground();
    }
//    public static void setPrimararyColorForButton(Button button){
//        button.setBackgroundResource(R.drawable.roundshapebtn);
//        GradientDrawable drawable = (GradientDrawable) button.getBackground();
//        //   textView.setTextColor(Color.parseColor(User.sharedInstance().primary));
//    }
}
