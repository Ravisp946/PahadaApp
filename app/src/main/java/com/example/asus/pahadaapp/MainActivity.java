package com.example.asus.pahadaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar numSeekBar=(SeekBar)findViewById(R.id.numSeekBar);

        numSeekBar.setMin(1);
        numSeekBar.setMax(20);
        numSeekBar.setProgress(1);
        numSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Log.i("Current Number is!!",Integer.toString(progress));
                Toast.makeText(MainActivity.this, Integer.toString(progress), Toast.LENGTH_SHORT).show();
                ArrayList<Integer> table=new ArrayList<Integer>();
                ListView numListView=(ListView)findViewById(R.id.numListView);
                for(int i=1;i<=20;i++)
                {
                    table.add(progress*i);
                }
                ArrayAdapter<Integer> arrayAdapter=new ArrayAdapter<Integer>(MainActivity.this,android.R.layout.simple_list_item_1,table);

                numListView.setAdapter(arrayAdapter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
