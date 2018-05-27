package com.example.mario.energru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mario.energru.view.ContainerActivity;
import com.example.mario.energru.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void goCreateAccount(View view){
        Intent intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
        startActivity(intent);

    }
    public void goHomeApplication(View view){
        Intent intent = new Intent(getApplicationContext(), ContainerActivity.class);
        startActivity(intent);
    }
}
