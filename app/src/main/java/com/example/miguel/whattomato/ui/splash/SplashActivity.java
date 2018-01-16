
package com.example.miguel.whattomato.ui.splash;


import android.content.Intent;
import android.os.Bundle;

import com.example.miguel.whattomato.R;
import com.example.miguel.whattomato.ui.base.BaseActivity;
import com.example.miguel.whattomato.ui.main.MainActivity;


public class SplashActivity extends BaseActivity {


    protected boolean _active = true;
    protected int _splashTime = 3000; // time to display the splash screen in ms


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                } catch (Exception e) {

                } finally {

                    startActivity(new Intent(SplashActivity.this,
                            MainActivity.class));
                    finish();
                }
            }
        };
        splashTread.start();
    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
    }


}
