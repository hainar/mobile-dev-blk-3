package edu.ucucite.mobiledevblk3_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText eUsername;
        EditText ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername=findViewById(R.id.editUsername);
        ePassword=findViewById(R.id.editPassword);




    }//OnCreate

    public void clickSignUp(View view){

        startActivity(new Intent(MainActivity.this,SignUpActivity.class));

    }

    public void clickConnect(View view){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String stName=bundle.get("name").toString();//SignUp
        String stUser=bundle.get("username").toString();
        String stPassword=bundle.get("password").toString();

        String stUsernameMain=eUsername.getText().toString();
        String stPasswordMain=ePassword.getText().toString();

        if(stUser.equals(stUsernameMain) && stPassword.equals(stPasswordMain)){
            Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show();
            //startActivity(new Intent(MainActivity.this, HomeActivity.class));

            Intent intentHome=new Intent(MainActivity.this, HomeActivity.class);
            intentHome.putExtra("name", stName.toString());
            startActivity(intentHome);




        }else{
            Toast.makeText(this, "Invalid username and password", Toast.LENGTH_SHORT).show();
        }



        //Toast.makeText(this, "" + stName, Toast.LENGTH_SHORT).show();
    }
}
