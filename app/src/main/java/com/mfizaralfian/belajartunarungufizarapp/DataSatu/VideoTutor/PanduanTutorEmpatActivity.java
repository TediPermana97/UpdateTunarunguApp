package com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.belajartunarungufizarapp.DataSatu.Tutorial.MateriTutorEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial.TutorEmpatActivity;
import com.mfizaralfian.belajartunarungufizarapp.R;

public class PanduanTutorEmpatActivity extends AppCompatActivity {

    ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_tutor_empat);

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
        Intent i = new Intent(this, TutorEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }

    public void onClickTutor(View v) {
        Intent i = new Intent(this, MateriTutorEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny

    }
}