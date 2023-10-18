package com.example.adoptercode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String []  fruitsName = {"Apple", "Banana", "Orange", "Graphes", "Cherry","Apple", "Banana", "Orange", "Graphes", "Cherry","Apple", "Banana", "Orange", "Graphes", "Cherry","Apple", "Banana", "Orange", "Graphes", "Cherry","Apple", "Banana", "Orange", "Graphes", "Cherry"};

       // ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,fruitsName);


        MyCustomAdapter adapter = new MyCustomAdapter(this,fruitsName);

               listView.setAdapter(adapter);


    }
}