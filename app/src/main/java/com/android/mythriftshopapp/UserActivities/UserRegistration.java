package com.android.mythriftshopapp.UserActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.mythriftshopapp.R;

public class UserRegistration extends AppCompatActivity {

    private EditText edtFirstName;
    private EditText edtSecondName;
    private EditText edtUserName;
    private EditText edtPhoneNumber;
    private EditText edtEmail;
    private EditText edtPassword;
    private EditText edtConfirmPassword;
    private Button btnRegister;

    private String userFirstName,userSecondName,userName,userEmail,userPassword,userPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtSecondName = findViewById(R.id.edtSecondName);
        edtUserName = findViewById(R.id.edtUsername);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnRegister = findViewById(R.id.buttonRegister);

        //Set on click listener to Registration button

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    //Validate user input
    private void validateInput() {

        //Getting User Input
        userFirstName = edtFirstName.getText().toString();
        userSecondName = edtSecondName.getText().toString();
        userName = edtUserName.getText().toString();
        userPhoneNumber = edtPhoneNumber.getText().toString();
        userEmail = edtEmail.getText().toString();
        userPassword = edtPassword.getText().toString();
    }

}


            

                                
                                
                                
                                
                                
                                
                                
                                
                            
                            
                            

                                
                                        
                                
                            
                                        
                            
                        
                        
                        
                    
                    
                
                
            
            
    
        
