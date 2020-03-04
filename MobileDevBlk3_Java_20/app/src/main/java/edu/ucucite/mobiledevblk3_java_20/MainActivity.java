package edu.ucucite.mobiledevblk3_java_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView txtDis;
    Button btnLogin;
    EditText eUsername;
    EditText ePassword;
    TextView txtUCU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin=findViewById(R.id.btnLogin);
        eUsername=findViewById(R.id.editUsername);
        ePassword=findViewById(R.id.editPassword);
        txtDis=findViewById(R.id.txtDisplay);
        txtUCU=findViewById(R.id.txtUCU);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stUsername=eUsername.getText().toString();//Don
                String stPassword=ePassword.getText().toString();

            String stUcu=txtUCU.getText().toString();

                txtUCU.setText("Username: " + stUsername
                        +  "Password: " + stPassword);



            }
        });


      /*
        btnLogin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this,"Take me out", Toast.LENGTH_LONG).show();
                return false;
            }
        });*/

    }//OnCreate

    public void clickForgots(View view){
        Toast.makeText(this, "Short of Button", Toast.LENGTH_SHORT).show();
    }

}
