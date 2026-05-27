package com.example.assignment5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
DatePicker dp;
TextView output;
int day,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            btn=findViewById(R.id.btn);
            dp=findViewById(R.id.datepicker);
            output=findViewById(R.id.output);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     day=dp.getDayOfMonth();
                     month=dp.getMonth()+1;
                     year=dp.getYear();
                    output.setText("Selected Date: "+day+"/"+month+"/"+year);
                }

            });

            return insets;
        });
    }
}