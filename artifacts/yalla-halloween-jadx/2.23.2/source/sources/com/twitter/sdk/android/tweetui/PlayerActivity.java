package com.twitter.sdk.android.tweetui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import java.io.Serializable;
import p211o00o0oo0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerActivity extends Activity {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oo000o f21851OooO0Oo;

    public class OooO00o implements com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0282OooO00o {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0282OooO00o
        public final void OooO00o() {
        }

        @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0282OooO00o
        public final void onDismiss() {
            PlayerActivity playerActivity = PlayerActivity.this;
            playerActivity.finish();
            playerActivity.overridePendingTransition(0, o00oO0o.tw__slide_out);
        }
    }

    public static class PlayerItem implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f21853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f21854OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f21855OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final String f21857OooO0oo = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f21856OooO0oO = null;

        public PlayerItem(String str, boolean z, boolean z2) {
            this.f21853OooO0Oo = str;
            this.f21855OooO0o0 = z;
            this.f21854OooO0o = z2;
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, o00oO0o.tw__slide_out);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        final String str;
        super.onCreate(bundle);
        setContentView(o0O0O00.tw__player_activity);
        PlayerItem playerItem = (PlayerItem) getIntent().getSerializableExtra("PLAYER_ITEM");
        View viewFindViewById = findViewById(R.id.content);
        final oo000o oo000oVar = new oo000o(viewFindViewById, new OooO00o());
        this.f21851OooO0Oo = oo000oVar;
        try {
            int i = 0;
            if (playerItem.f21857OooO0oo != null && (str = playerItem.f21856OooO0oO) != null) {
                TextView textView = oo000oVar.f21994OooO0Oo;
                textView.setVisibility(0);
                textView.setText(playerItem.f21857OooO0oo);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.twitter.sdk.android.tweetui.o00Oo0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        oo000o oo000oVar2 = oo000oVar;
                        oo000oVar2.getClass();
                        o000OOo0.OooO0O0(oo000oVar2.f21994OooO0Oo.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    }
                });
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.twitter.sdk.android.tweetui.o00O0O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TextView textView2 = oo000oVar.f21994OooO0Oo;
                        if (textView2.getVisibility() == 0) {
                            textView2.setVisibility(8);
                        } else {
                            textView2.setVisibility(0);
                        }
                    }
                });
            }
            boolean z = playerItem.f21854OooO0o;
            VideoControlView videoControlView = oo000oVar.f21992OooO0O0;
            VideoView videoView = oo000oVar.f21991OooO00o;
            boolean z2 = playerItem.f21855OooO0o0;
            if (!z2 || z) {
                videoView.setMediaController(videoControlView);
            } else {
                videoControlView.setVisibility(4);
                videoView.setOnClickListener(new o00Ooo(oo000oVar, i));
            }
            videoView.setOnTouchListener(com.twitter.sdk.android.tweetui.internal.OooO00o.OooO00o(videoView, oo000oVar.f21998OooO0oo));
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.twitter.sdk.android.tweetui.o000oOoO
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    oo000oVar.f21993OooO0OO.setVisibility(8);
                }
            });
            videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.twitter.sdk.android.tweetui.o0OoOo0
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                    ProgressBar progressBar = oo000oVar.f21993OooO0OO;
                    if (i2 == 702) {
                        progressBar.setVisibility(8);
                    } else {
                        if (i2 != 701) {
                            return false;
                        }
                        progressBar.setVisibility(0);
                    }
                    return true;
                }
            });
            videoView.f21924OooO0o0 = Uri.parse(playerItem.f21853OooO0Oo);
            videoView.f21940OooOo0O = z2;
            videoView.f21938OooOo0 = 0;
            videoView.OooO0Oo();
            videoView.requestLayout();
            videoView.invalidate();
            videoView.requestFocus();
        } catch (Exception e) {
            com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO0Oo("PlayerController", "Error occurred during video playback", e);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        VideoView videoView = this.f21851OooO0Oo.f21991OooO00o;
        MediaPlayer mediaPlayer = videoView.f21921OooO;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            videoView.f21921OooO.release();
            videoView.f21921OooO = null;
            videoView.f21923OooO0o = 0;
            videoView.f21925OooO0oO = 0;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        oo000o oo000oVar = this.f21851OooO0Oo;
        VideoView videoView = oo000oVar.f21991OooO00o;
        oo000oVar.f21997OooO0oO = videoView.OooO0OO();
        oo000oVar.f21995OooO0o = videoView.getCurrentPosition();
        videoView.OooO0o0();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        oo000o oo000oVar = this.f21851OooO0Oo;
        int i = oo000oVar.f21995OooO0o;
        VideoView videoView = oo000oVar.f21991OooO00o;
        if (i != 0) {
            videoView.OooO0o(i);
        }
        if (oo000oVar.f21997OooO0oO) {
            videoView.OooO0oO();
            oo000oVar.f21992OooO0O0.f21913OooO.sendEmptyMessage(1001);
        }
    }
}
