

package com.example.miguel.whattomato.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.miguel.whattomato.R;
import com.example.miguel.whattomato.ui.base.BaseActivity;


public class LoginActivity extends BaseActivity {


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
    }


}
