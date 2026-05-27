package com.example.assignment6;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    FloatingActionButton fab;

    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            listview=findViewById(R.id.listView);
            fab=findViewById(R.id.fab);
            ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
            listview.setAdapter(adapter);
            listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle("Delete")
                            .setMessage("Do You Want To Delete?")
                            .setNegativeButton("Cancel",null)
                            .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    arrayList.remove(position);
                                    adapter.notifyDataSetChanged();
                                }
                            });
                    alertDialog.show();
                    return true;
                }
            });
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
                    EditText input=new EditText(MainActivity.this);
                    alertDialog.setView(input);
                    alertDialog.setTitle("Add Task")
                            .setMessage("Do You Want To Add Task?")
                            .setNegativeButton("Cancel",null)
                            .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    String task=input.getText().toString();
                                    if(!task.isEmpty()){
                                     arrayList.add(task);
                                     adapter.notifyDataSetChanged();
                                        Toast.makeText(MainActivity.this, "Data Added Successfully..", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                    alertDialog.show();
                }
            });
            return insets;
        });
    }
}