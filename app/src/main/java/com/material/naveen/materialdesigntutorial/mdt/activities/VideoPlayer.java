package com.material.naveen.materialdesigntutorial.mdt.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.material.naveen.materialdesigntutorial.mdt.R;

/**
 * Created by Naveen on 2/20/2016.
 */
public class VideoPlayer extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    String vid;
    private YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        vid = getIntent().getStringExtra("vid");
        setContentView(R.layout.activity_player);
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);

        // Initializing video activity_player with developer key
        youTubeView.initialize("YOUR_API_KEY", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {

        if (!b) {

            // loadVideo() will auto play video
            // Use cueVideo() method, if you don't want to play it automatically
            player.loadVideo(vid);

            // Hiding activity_player controls
            //activity_player.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
            player.setFullscreen(true);

            player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {

        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, 1).show();
        } else {
            String errorMessage = "Error in Playing Video";
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize("YOUR_API_KEY", this);
        }
    }

    private YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.youtube_view);
    }
}
