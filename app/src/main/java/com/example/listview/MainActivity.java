package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listviewid);

        final ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(arrayAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity.this,firstActivity.class));
                    Toast.makeText(MainActivity.this, "Frist Activity is Running"+ arrayList.get(position), Toast.LENGTH_SHORT).show();

                }else if(position==1){
                    startActivity(new Intent(MainActivity.this,secondActivity.class));
                    Toast.makeText(MainActivity.this, "Second Activity is Running"+ arrayList.get(position), Toast.LENGTH_SHORT).show();

                }else{
                    startActivity(new Intent(MainActivity.this,trirdActivity.class));
                    Toast.makeText(MainActivity.this, "Third Activity is Running"+ arrayList.get(position), Toast.LENGTH_SHORT).show();


                }
            }
        });

//     lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//         @Override
//         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//         }
//     });
    }
}

