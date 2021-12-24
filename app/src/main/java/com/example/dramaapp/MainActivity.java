package com.example.dramaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Alif","Dil Lagi","Ye Dil Mera","Dastaan","Mere pas tum ho"};
    String mDescription[] = {"Alif is a 2019 Pakistani spiritual-romantic TV series created by Sana Shahnawaz", "Dil Lagi is a 2021Pakistani romantic-drama television series", "Yeh Dil Mera is a 2019 Pakistani romantic thriller television series ", "Dastaan is a Pakistani TV series based on the novel Bano by Razia Butt", "Meray Paas Tum Ho is a 2019 Pakistani romantic drama television series produced by Humayun Saeed"};
    int images[] = {R.drawable.drama1,R.drawable.drama5,R.drawable.drama4,R.drawable.drama3,R.drawable.drama2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent();
                if (position ==  0) {
                    String url = "https://en.wikipedia.org/wiki/Alif_(TV_series)";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position ==  1) {
                    String url = "https://en.wikipedia.org/wiki/Dil_Lagi";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position ==  2) {
                    String url = "https://en.wikipedia.org/wiki/Yeh_Dil_Mera";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position ==  3) {
                    String url = "https://en.wikipedia.org/wiki/Dastaan_(2010_TV_series)";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position ==  4) {
                    String url = "https://en.wikipedia.org/wiki/Meray_Paas_Tum_Ho";
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            }
        });

    }


}
