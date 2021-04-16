package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Patterns;
import android.widget.Button;

import android.content.Intent;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sign_Up extends AppCompatActivity {

    DatabaseReference reference;

    Button registerBtn;
    EditText fullName, email, password, confirmPass, phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        //Register Button
        registerBtn = findViewById(R.id.register);

        //EditText ID
        fullName = findViewById(R.id.fullName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPass = findViewById(R.id.confirmPass);
        phoneNo = findViewById(R.id.phoneNo);

        //Input Values
        String getName =  fullName.getText().toString();
        String getEmail = email.getText().toString();
        String getPassword = password.getText().toString();
        String getconfirmPass = confirmPass.getText().toString();
        String getphoneNo = phoneNo.getText().toString();

        //Login confirmation

        if (!getName.isEmpty() && !getphoneNo.isEmpty() && !getPassword.isEmpty() && !getconfirmPass.isEmpty() && !getEmail.isEmpty()){
            if (Patterns.EMAIL_ADDRESS.matcher(getEmail).matches()){

                //Initialize Firebase Instance
                reference = FirebaseDatabase.getInstance().getReference("users/" + getphoneNo);

                //Register class instantiated
                RegisterHelperClass helperClass = new RegisterHelperClass(getName, getEmail, getPassword, getconfirmPass, getphoneNo);
                reference.setValue(helperClass).addOnCompleteListener(task ->{
                    if (task.isSuccessful()){
                        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                        fullName.setText("");
                        email.setText("");
                        password.setText("");
                        confirmPass.setText("");
                        phoneNo.setText("");

                        Intent intent = new Intent(Sign_Up.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(this, "something went wrong", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }


    }
}