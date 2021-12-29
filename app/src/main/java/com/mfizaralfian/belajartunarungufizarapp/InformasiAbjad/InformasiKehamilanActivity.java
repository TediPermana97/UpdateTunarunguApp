package com.mfizaralfian.belajartunarungufizarapp.InformasiAbjad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.mfizaralfian.belajartunarungufizarapp.Adafter.AdapterInformasiKehamilan;
import com.mfizaralfian.belajartunarungufizarapp.Model.DataModel;
import com.mfizaralfian.belajartunarungufizarapp.Model.InformasiData;
import com.mfizaralfian.belajartunarungufizarapp.R;

import java.util.ArrayList;

public class InformasiKehamilanActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    AdapterInformasiKehamilan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_kehamilan);

        MediaPlayer SuaraLagu = MediaPlayer.create(InformasiKehamilanActivity.this,R.raw.music);
        SuaraLagu.start();
        recyclerView = findViewById(R.id.recycler);
        pList.addAll(InformasiData.getListData());
        mManager = new LinearLayoutManager(InformasiKehamilanActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mManager);
        adapter = new AdapterInformasiKehamilan(InformasiKehamilanActivity.this,pList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}