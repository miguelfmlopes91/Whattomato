
package com.example.miguel.whattomato.ui.splash;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.miguel.whattomato.R;
import com.example.miguel.whattomato.ui.login.LoginActivity;


public class SplashActivity extends AppCompatActivity {


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
                            LoginActivity.class));
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
