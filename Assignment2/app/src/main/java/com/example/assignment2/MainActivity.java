package com.example.assignment2;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nameET,cityEt,courseET,emailET;
    Button click;
    androidx.appcompat.widget.Toolbar appBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            appBar=findViewById(R.id.appBar);
            setSupportActionBar(appBar);
            getSupportActionBar().setTitle("Student Details..");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setSubtitle("Welcome To The Form..");


            nameET=findViewById(R.id.name);
            cityEt=findViewById(R.id.city);
            courseET=findViewById(R.id.course);
            emailET=findViewById(R.id.email);
            click=findViewById(R.id.submit);
            click.setOnHoverListener(new View.OnHoverListener() {
                @Override
                public boolean onHover(View v, MotionEvent event) {
                    click.setPointerIcon(PointerIcon.getSystemIcon(getApplicationContext(),1));
                    return true;
                }
            });
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name,city,course,email;
                    name=nameET.getText().toString();
                    city=cityEt.getText().toString();
                    course=courseET.getText().toString();
                    email=emailET.getText().toString();

                    String output="My name is "+ name+" " + "I Live in "+city+ "and my Course and Email id is :- "+course+" "+email;
                    Toast.makeText(getApplicationContext(),output, Toast.LENGTH_SHORT).show();
                }


            });
            return insets;
        });
    }
}