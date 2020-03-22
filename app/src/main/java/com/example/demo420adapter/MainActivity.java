package com.example.demo420adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapters.NoticeListAdapters;
import model.Notice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        List<Notice> noticeList = new ArrayList<>();
        noticeList.add(new Notice("Dom", "Good Dom", "Somether", 1000d,
                                    1));
        noticeList.add(new Notice("Flat", "so so", "Mogilev", 123123000d,
                                    1));

        NoticeListAdapters noticeListAdapters = new NoticeListAdapters(noticeList, this);
        listView.setAdapter(noticeListAdapters);
    }
}
