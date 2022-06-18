package com.example.miniproject1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_item extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int image_s = getIntent().getIntExtra("image_s", 0);
        String name = getIntent().getStringExtra("kelas_s");

        TextView nameTextView = findViewById(R.id.titleKelas);
        ImageView imageview = findViewById(R.id.image_item);

        nameTextView.setText(name);
        imageview.setImageResource(image_s);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}