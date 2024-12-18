package com.example.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddVisitorActivitiy extends AppCompatActivity {

    Button b1,b2;
    EditText et1,et2,et3,et4;

    String getName,getName1,getPur,getMeet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_visitor_activitiy);

        b1=(Button) findViewById(R.id.submitbutt);
        b2=(Button) findViewById(R.id.backtobutt);
        et1=(EditText) findViewById(R.id.name);
        et2=(EditText) findViewById(R.id.name1);
        et3=(EditText) findViewById(R.id.purpose);
        et4=(EditText) findViewById(R.id.meet);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getName=et1.getText().toString();
               getName1=et2.getText().toString();
               getPur=et3.getText().toString();
               getMeet=et4.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getName1+" "+getPur+" "+getMeet,Toast.LENGTH_LONG).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplication(), MainActivity.class);
                startActivity(ob);
            }
        });
    }
}