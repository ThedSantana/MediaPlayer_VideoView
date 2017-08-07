package vo.cvcompany.com.myapplication;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.videoView)
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPlay)
    public void btnPlay(){
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.neuluctruocemdungtoi);
        mediaPlayer.start();
    }

    @OnClick(R.id.btnPlaymp4)
    public void btnmp4(){
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tuminh));
        videoView.start();
        android.widget.MediaController mediaController = new android.widget.MediaController(this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
    }
}
