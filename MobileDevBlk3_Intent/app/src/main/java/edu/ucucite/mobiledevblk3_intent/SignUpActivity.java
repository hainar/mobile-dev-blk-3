package edu.ucucite.mobiledevblk3_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class SignUpActivity extends AppCompatActivity {

        EditText eName;
        EditText eUsername;
        EditText ePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        eName=findViewById(R.id.sEditName);
        eUsername=findViewById(R.id.sEditUsername);
        ePassword=findViewById(R.id.sEditPassword);
    }//
    public void sSignUp(View view){
        String stName=eName.getText().toString();
        String stUsername=eUsername.getText().toString();
        String stPassword=ePassword.getText().toString();

        //PutExtra
        Intent intent=new Intent(SignUpActivity.this, MainActivity.class);
        intent.putExtra("name", stName.toString());
        intent.putExtra("username", stUsername.toString());
        intent.putExtra("password", stPassword.toString());
        startActivity(intent);


    }
}
