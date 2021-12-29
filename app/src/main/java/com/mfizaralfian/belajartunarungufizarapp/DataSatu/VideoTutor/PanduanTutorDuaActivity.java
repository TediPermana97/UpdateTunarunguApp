package com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Tutorial.MateriTutorDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial.TutorDuaActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class PanduanTutorDuaActivity extends AppCompatActivity {

    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_tutor_dua);


        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //-----------------------musik----------------------------------
    }

    public void onClickPlay(View v) {
        Intent i = new Intent(this, TutorDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClickTutor(View v) {
        Intent i = new Intent(this, MateriTutorDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }
}