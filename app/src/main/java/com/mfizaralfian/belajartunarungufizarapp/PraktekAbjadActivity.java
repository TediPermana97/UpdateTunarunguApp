package com.mfizaralfian.belajartunarungufizarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.jarvanmo.exoplayerview.media.ExoMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleMediaSource;
import com.jarvanmo.exoplayerview.media.SimpleQuality;
import com.jarvanmo.exoplayerview.ui.ExoVideoView;

import java.util.ArrayList;
import java.util.List;

import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_LANDSCAPE;
import static com.jarvanmo.exoplayerview.orientation.OnOrientationChangedListener.SENSOR_PORTRAIT;

public class PraktekAbjadActivity extends AppCompatActivity {
    private ExoVideoView videoView;
    private View wrapper;
    private View contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktek_abjad);

        //contentView = findViewById(R.id.activity_video);

        videoView = findViewById(R.id.videoView);

        wrapper = findViewById(R.id.wrapper);


        videoView.setBackListener((view, isPortrait) -> {
            if (isPortrait) {
                finish();
            }
            return false;
        });


        videoView.setOrientationListener(orientation -> {
            if (orientation == SENSOR_PORTRAIT) {
                changeToPortrait();
            } else if (orientation == SENSOR_LANDSCAPE) {
                changeToLandscape();
            }
        });

        SimpleMediaSource mediaSource = new SimpleMediaSource("https://firebasestorage.googleapis.com/v0/b/edukasitunarunguapp.appspot.com/o/FILE%20VIDEO%2FPRAKTEK.mp4?alt=media&token=5a1fda03-d291-47fd-9292-a09f89ffec40");
//        SimpleMediaSource mediaSource = new SimpleMediaSource("http://stream1.hnntv.cn/lywsgq/sd/live.m3u8");

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