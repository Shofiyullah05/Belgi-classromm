package com.example.attemptone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Class_Model> classModels = new ArrayList<>();
    int [] image = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView1);

        setUpClassModel();

        Class_Adapter adapter = new Class_Adapter(this, classModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpClassModel(){
        String[] className = getResources().getStringArray(R.array.nama_kelas);

        for (int i = 0 ; i<className.length; i++){
            classModels.add(new Class_Model(className[i], image[i]));
        }
    }
}