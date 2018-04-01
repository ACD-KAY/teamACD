package com.teamacd.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class Activity_07 extends AppCompatActivity {

public class meeting_Activity_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting__7);

        ListView mListView = (ListView) findViewById(R.id.list);

   MyAdapter adapter = new MyAdapter(this, 0);

        adapter.addAll(views);



        mListView.setAdapter(adapter);


        public static class MyAdapter extends ArrayAdapter<String> {



            private final String[] labels = {"报名", "签到", "结束"};



            public MyAdapter(Context context, int resource) {

                super(context, resource);

            }



            @Override

            public View getView(int position, View convertView, ViewGroup parent) {

                ViewHolder holder;

                if (convertView == null) {

                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, null);

                    holder = new ViewHolder(convertView);

                    convertView.setTag(holder);

                } else {

                    holder = (ViewHolder) convertView.getTag();

                }



                holder.mLabel.setText(getItem(position));



                holder.mStepsView.setCompletedPosition(position % labels.length)
                        .setLabels(labels)

                        .setBarColorIndicator(0xFF888888)

                        .setProgressColorIndicator(0xFF05A9F4)

                        .setLabelColorIndicator(0xFF888888)

                        .drawView();



                return convertView;

            }



            static class ViewHolder {



                TextView mLabel;

                StepsView mStepsView;



                public ViewHolder(View view) {

                    mLabel = (TextView) view.findViewById(R.id.label);

                    mStepsView = (StepsView) view.findViewById(R.id.stepsView);

                }

            }

        }
