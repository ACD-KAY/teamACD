package com.teamacd.demo;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar;
import android.widget.Toolbar;


public class Activity_15 extends AppCompatActivity {
    private TextView btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votation);



        spinner();
        spinner2();

        btn1=(TextView)findViewById(R.id.B_release);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_15.this,Activity_08.class);
                startActivity(intent);
            }
        });

        btn2=(Button)findViewById(R.id.B_before);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_15.this,Activity_08.class);
                startActivity(intent);
            }
        });


        /**标题栏设置*/
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("");
    }

    /** 投票类型选择*/
    private void spinner() {
        Spinner spinner = (Spinner) findViewById(R.id.S_Vtype);
        String[] items = getResources().getStringArray(R.array.S_votationtype);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] select = getResources().getStringArray(R.array.S_votationtype);
                Toast.makeText(VotationActivity.this, "你选择了"+select[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /**提醒时间选择*/
    private void spinner2() {
        Spinner spinner = (Spinner) findViewById(R.id.S_Remind);
        String[] items = getResources().getStringArray(R.array.S_remind);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] select = getResources().getStringArray(R.array.S_remind);
                Toast.makeText(VotationActivity.this, "你选择了"+select[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

}