package com.example.assignment8;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button save,send,dial;
    EditText num1,num2,num3;
    SharedPreferences perferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},100);
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED)
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
            dial=findViewById(R.id.dial);
            save=findViewById(R.id.save);
            send=findViewById(R.id.send);
            num1=findViewById(R.id.num1);
            num2=findViewById(R.id.num2);
            num3=findViewById(R.id.num3);
            perferences=getSharedPreferences("contacts",MODE_PRIVATE);
            editor=perferences.edit();
            loadContacts();
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editor.putString("num1",num1.getText().toString());
                    editor.putString("num2",num2.getText().toString());
                    editor.putString("num3",num3.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(),"Your contacts are Saved",Toast.LENGTH_LONG).show();

                }
            });
            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String mob1=num1.getText().toString();
                    String mob2=num2.getText().toString();
                    String mob3=num3.getText().toString();

                    String numbers=mob1+";"+mob2+";"+mob3;
                    String message="I am in Problem!";
//                    SmsManager smsManager=SmsManager.getDefault();
//                    smsManager.sendTextMessage(mob1,null,message,null,null);
                    Intent intent=new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("smsto:"+numbers));
                    intent.putExtra("sms_body",message);
                    startActivity(intent);
                }
            });
            dial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(num1.getText().toString()!=null){
                        String mob1=num1.getText().toString();
//                    Intent intent=new Intent(Intent.ACTION_DIAL);
                        Intent intent=new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:"+mob1));
                        startActivity(intent);
                    } else if (num2.getText().toString()!=null) {
                        String mob2=num2.getText().toString();
//                    Intent intent=new Intent(Intent.ACTION_DIAL);
                        Intent intent=new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:"+mob2));
                        startActivity(intent);
                    } else if (num3.getText().toString()!=null) {
                        String mob3=num3.getText().toString();
//                    Intent intent=new Intent(Intent.ACTION_DIAL);
                        Intent intent=new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:"+mob3));
                        startActivity(intent);
                    }

                }
            });
            return insets;
        });
    }

    private void loadContacts() {
        num1.setText(perferences.getString("num1",null));
        num2.setText(perferences.getString("num2",null));
        num3.setText(perferences.getString("num3",null));

    }
}