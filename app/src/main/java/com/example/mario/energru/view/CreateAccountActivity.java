package com.example.mario.energru.view;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mario.energru.LoginActivity;
import com.example.mario.energru.R;


public class CreateAccountActivity extends AppCompatActivity {

    TextView textView;


    EditText editTextname;
    EditText editTextusername;
    EditText editTextemail;

    Button btnRegister;

    EditText editTextpassword;
    EditText editTextrepeat_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        showToolbar(getResources().getString(R.string.toolbar_create_Account),true);
    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar)  findViewById(R.id.toolbar);

        editTextname = findViewById(R.id.first_name);
        editTextusername = findViewById(R.id.nickname);
        editTextemail = findViewById(R.id.email);

        editTextpassword = findViewById(R.id.password);
        editTextrepeat_password = findViewById(R.id.repeat_password);

        btnRegister = findViewById(R.id.login);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_bottom = getString(R.string.text_register);
                String password = editTextpassword.getText().toString();
                String password2 = editTextrepeat_password.getText().toString();

                if(btnRegister.getText().toString().equals(name_bottom)){

                    if(editTextname.getText().toString().equals(""))
                        Snackbar.make(view, "El nombre es necesario para continuar", Snackbar.LENGTH_LONG)
                                .show();
                    else if (editTextusername.getText().toString().equals(""))
                        Snackbar.make(view, "El nombre de usuario es necesario para continuar", Snackbar.LENGTH_LONG)
                                .show();
                    else if (editTextemail.getText().toString().equals(""))
                        Snackbar.make(view, "El Correo es necesario para continuar", Snackbar.LENGTH_LONG)
                                .show();
                    else if(editTextrepeat_password.getText().toString().equals(""))
                        Snackbar.make(view, "Agregue la contraseña para continuar", Snackbar.LENGTH_LONG)
                                .show();

                    else if(editTextrepeat_password.getText().toString().equals(""))
                        Snackbar.make(view, "Agregue la contraseña para continuar", Snackbar.LENGTH_LONG)
                                .show();
                    else if(!password.equals(password2))
                        Snackbar.make(view, "Las contraeñas no son iguales", Snackbar.LENGTH_LONG)
                                .show();
                    else {
                        Snackbar.make(view, "Ahora inicia sesion :D" , Snackbar.LENGTH_LONG)
                                .show();
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });

    }

}

