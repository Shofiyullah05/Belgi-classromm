package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements rv_interface{
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterData adapterData;
    List<String> listData;
    List<Integer> pic;
    private RecyclerView rvTask;
    private ArrayList<Task> list = new ArrayList<>();

    int [] image = {
            R.drawable.flat_01,
            R.drawable.flat_02,
            R.drawable.flat_03,
            R.drawable.flat_04,
            R.drawable.flat_05,
            R.drawable.flat_06,
            R.drawable.flat_07,
            R.drawable.flat_08,
            R.drawable.flat_09,
            R.drawable.flat_01,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyvlerViewData);
        listData = new ArrayList<>();
        pic = new ArrayList<>();

        for(int p=0; p<10; p++){
            pic.add(image[p]);
        }
        
        listData = Arrays.asList(getResources().getStringArray(R.array.itemKelas));


        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapterData = new AdapterData(this, listData, pic, this);
        recyclerView.setAdapter(adapterData);
        adapterData.notifyDataSetChanged();
        rvTask = findViewById(R.id.rv_task);
        rvTask.setHasFixedSize(true);

        list.addAll(DataTask.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvTask.setLayoutManager(new LinearLayoutManager(this));
        ListTaskAdapter listTaskAdapter = new ListTaskAdapter(list);
        rvTask.setAdapter(listTaskAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, activity_item.class);

        intent.putExtra("image_s", pic.get(position));
        intent.putExtra("kelas_s", listData.get(position));

        startActivity(intent);
    }

}