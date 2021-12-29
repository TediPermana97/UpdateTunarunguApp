package com.mfizaralfian.belajartunarungufizarapp.DataSatu.VideoTutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.jarvanmo.exoplayerview.media.ExoMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleQuality;
import com.jarvanmo.exoplayerview.ui.ExoVideoView;
import com.mfizaralfian.belajartunarungufizarapp.R;

import java.util.ArrayList;
import java.util.List;

import ar.library.justify.JustifiedTextView;

import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_LANDSCAPE;
import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_PORTRAIT;

public class TutorTigaActivity extends AppCompatActivity {


    private ExoVideoView videoView;

    private View wrapper;

    private View contentView;
    private JustifiedTextView mJTv, mJTv2, mJTv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_tiga);


        mJTv3=(JustifiedTextView)findViewById(R.id.tiga);
        mJTv3.setText(getResources().getString(R.string.tutorial3));
        mJTv3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        mJTv3.setLineSpacing(15);
        mJTv3.setTypeFace(Typeface.createFromAsset(getAssets(),"fonts/salsa_regular.ttf"));
        mJTv3.setAlignment(Paint.Align.LEFT);

        //contentView = findViewById(R.id.activity_video);

        videoView = findViewById(R.id.videoView);

        wrapper = findViewById(R.id.wrapper);


        videoView.setBackListener((view, isPortrait) -> {
            if (isPortrait) {
                finish();
            }
            return false;
        });


//
//


        videoView.setOrientationListener(orientation -> {
            if (orientation == SENSOR_PORTRAIT) {
                changeToPortrait();
            } else if (orientation == SENSOR_LANDSCAPE) {
                changeToLandscape();
            }
        });



        SimpleMediaSource mediaSource = new SimpleMediaSource("https://firebasestorage.googleapis.com/v0/b/edukasitunarunguapp.appspot.com/o/FILE%20VIDEO%2FVideo%20Materi%2F08.mp4?alt=media&token=e2beb978-d730-4e62-bb21-a9174e9bf82e");

        mediaSource.setDisplayName("VideoPlaying");
        List<ExoMediaSource.Quality> qualities = new ArrayList<>();
        ExoMediaSource.Quality quality;

        for (int i = 0; i < 6; i++) {
            SpannableString spannableString = new SpannableString("Quality" + i);
            if (i % 2 == 0) {
                ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.YELLOW);
                spannableString.setSpan(colorSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

            } else {
                ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.RED);
                spannableString.setSpan(colorSpan, 0, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            }

            quality = new SimpleQuality(spannableString, mediaSource.uri());
            qualities.add(quality);
        }
        mediaSource.setQualities(qualities);

        videoView.play(mediaSource, false);

    }

    private void changeToPortrait() {

        WindowManager.LayoutParams attr = getWindow().getAttributes();
//        attr.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Window window = getWindow();
        window.setAttributes(attr);
        window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        wrapper.setVisibility(View.VISIBLE);
    }


    private void changeToLandscape() {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
//        lp.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        Window window = getWindow();
        window.setAttributes(lp);
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        wrapper.setVisibility(View.GONE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT > 23) {
            videoView.resume();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if ((Build.VERSION.SDK_INT <= 23)) {
            videoView.resume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT <= 23) {
            videoView.pause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT > 23) {
            videoView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoView.releasePlayer();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return videoView.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);

    }
}