package com.example.assignment4;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button submit;
Button datedialog;

TextView output,navbar;
EditText name,mobile,address;
RadioGroup rg;
RadioButton rb;
CheckBox reading,dancing,singing,travelling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            submit=findViewById(R.id.submit);
         output=findViewById(R.id.output);

            rg=findViewById(R.id.rg);

            reading=findViewById(R.id.reading);
            dancing=findViewById(R.id.dancing);
            singing=findViewById(R.id.singing);
            travelling=findViewById(R.id.travelling);
            datedialog=findViewById(R.id.datedialoge);
            Calendar calender=Calendar.getInstance();
            int year=calender.get(Calendar.YEAR);
            int month=calender.get(Calendar.MONTH);
            int day=calender.get(Calendar.DAY_OF_MONTH);

            datedialog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DatePickerDialog dpd=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            month=month+1;
                            datedialog.setText(dayOfMonth+"/"+month+"/"+year);
                        }
                    },year,month,day);
                    dpd.show();
                }
            });
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                address=findViewById(R.id.address);
                                name=findViewById(R.id.name);
                                mobile=findViewById(R.id.mobile);
                                output.setText("My name is "+name.getText().toString()+" my mobile number is "+mobile.getText().toString());
                                int gender=rg.getCheckedRadioButtonId();
                                rb=findViewById(gender);
                                output.setText("My name "+name.getText().toString()+" my mobile number is "+mobile.getText().toString()+"My DOB is "+datedialog+"My Gender is " + rb.getText().toString());



                                output.setText("My name "+name.getText().toString()+" my mobile number is "+mobile.getText().toString()+"My Gender is " + rb.getText().toString()+"My Hobbies are ");
                                if(reading.isChecked()==true)
                                    output.setText(output.getText().toString()+reading.getText().toString()+",");
                                if(dancing.isChecked()==true)
                                    output.setText(output.getText().toString()+dancing.getText().toString()+",");

                                if(singing.isChecked()==true)
                                    output.setText(output.getText().toString()+singing.getText().toString()+",");

                                if(travelling.isChecked()==true)
                                    output.setText(output.getText().toString()+travelling.getText().toString()+",");

                            }

                        });

            return insets;
        });
    }
}