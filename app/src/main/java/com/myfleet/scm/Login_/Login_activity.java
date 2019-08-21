package com.myfleet.scm.Login_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.myfleet.scm.R;

public class Login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }

    public void log(View view) {
        Intent is=new Intent(getApplicationContext(),Home_page.class);
        startActivity(is);
    }
}
