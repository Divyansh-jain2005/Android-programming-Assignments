package com.example.assignment7;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    GridView gridview;
    ArrayList<Uri> arrayList=new ArrayList<>();
    BaseAdapter imageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},100);
            }
            gridview=findViewById(R.id.gridview);
            btn=findViewById(R.id.selectImage);
            imageAdapter=new ImageAdapter(this,arrayList);
            gridview.setAdapter(imageAdapter);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Intent.ACTION_PICK);
                    intent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
                    startActivityForResult(intent,100);
                }
            });

            return insets;
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100 && resultCode==RESULT_OK){
            if(data.getClipData()!=null)
            {
                int count=data.getClipData().getItemCount();
                for(int i=0;i<count;i++){
                    Uri uri=data.getClipData().getItemAt(i).getUri();
                    arrayList.add(uri);
                    gridview.setAdapter(imageAdapter);
                }
            }
            else if(data.getData()!=null){
                Uri uri=data.getData();
                arrayList.add(uri);
                gridview.setAdapter(imageAdapter);
            }
        }
        imageAdapter.notifyDataSetChanged();
        super.onActivityResult(requestCode,resultCode,data);
    }
}