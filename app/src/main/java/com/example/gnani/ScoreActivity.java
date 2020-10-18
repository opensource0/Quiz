package com.example.gnani;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreActivity extends AppCompatActivity {

    Button replay;
    ListView answerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        replay = findViewById(R.id.replay);
        answerList = findViewById(R.id.answers);
        Intent intent = getIntent();
        ArrayList<HashMap<String, String>> answers = (ArrayList<HashMap<String, String>>) intent
                .getSerializableExtra("ANSWERS");
        ArrayAdapter<HashMap<String, String>> arrayAdapter = new ArrayAdapter<HashMap<String, String>>(getApplicationContext(), android.R.layout.simple_list_item_1, answers);

        answerList.setAdapter(arrayAdapter);


        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("SCORE");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Score : "+message);

    }

    public void replay(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}