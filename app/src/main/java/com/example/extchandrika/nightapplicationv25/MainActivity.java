package com.example.extchandrika.nightapplicationv25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static boolean bFlag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtononClick(View v)
    {
        System.out.println("Pressed Day/Night Button");
        Button buttonInstance = (Button) v;
        int setAlphaMode ;
        if(bFlag) {
            buttonInstance.setText("DayMode");
            setAlphaMode = 180;
        }
        else{
            buttonInstance.setText("NightMode");
            setAlphaMode  = 90;
        }
        float preferredAlpha = setAlphaMode / (float)255;
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha  = preferredAlpha;
        getWindow().setAttributes(lp);
        bFlag=!bFlag;
    }
    public void onBackPressed(View v) {
        System.out.println("Back Button Press..");
        finish();
        }

    public void onDestroy(View v)
    {
        System.out.println("onDestroy called ");
        finish();
    }

}
