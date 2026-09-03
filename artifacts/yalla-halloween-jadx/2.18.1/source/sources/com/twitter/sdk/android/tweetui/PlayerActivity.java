package com.twitter.sdk.android.tweetui;

import android.R;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.twitter.sdk.android.tweetui.OooO0O0;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import java.io.Serializable;
import java.util.Objects;
import p433o0OoOO0o.o0oO0Ooo;
import p439o0OoOOo0.o000OO0O;
import p439o0OoOOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerActivity extends Activity {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f20129Oooo0o;

    public class OooO00o implements com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o
        public final void OooO00o() {
        }

        @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o
        public final void onDismiss() {
            PlayerActivity.this.finish();
            PlayerActivity.this.overridePendingTransition(0, o000OO0O.tw__slide_out);
        }
    }

    public static class PlayerItem implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f20132Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final boolean f20133Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f20134Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final String f20135OoooO00 = null;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final String f20131Oooo = null;

        public PlayerItem(String str, boolean z, boolean z2) {
            this.f20132Oooo0o = str;
            this.f20133Oooo0oO = z;
            this.f20134Oooo0oo = z2;
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, o000OO0O.tw__slide_out);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o00O0000.tw__player_activity);
        PlayerItem playerItem = (PlayerItem) getIntent().getSerializableExtra("PLAYER_ITEM");
        final OooO0O0 oooO0O0 = new OooO0O0(findViewById(R.id.content), new OooO00o());
        this.f20129Oooo0o = oooO0O0;
        Objects.requireNonNull(oooO0O0);
        try {
            oooO0O0.OooO00o(playerItem);
            boolean z = playerItem.f20133Oooo0oO;
            boolean z2 = playerItem.f20134Oooo0oo;
            if (!z || z2) {
                oooO0O0.f20121OooO00o.setMediaController(oooO0O0.f20122OooO0O0);
            } else {
                oooO0O0.f20122OooO0O0.setVisibility(4);
                oooO0O0.f20121OooO00o.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOo0.o000O00O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OooO0O0 oooO0O1 = oooO0O0;
                        if (oooO0O1.f20121OooO00o.OooO0Oo()) {
                            oooO0O1.f20121OooO00o.OooO0o();
                        } else {
                            oooO0O1.f20121OooO00o.OooO();
                        }
                    }
                });
            }
            oooO0O0.f20121OooO00o.setOnTouchListener(com.twitter.sdk.android.tweetui.internal.OooO00o.OooO00o(oooO0O0.f20121OooO00o, oooO0O0.f20128OooO0oo));
            oooO0O0.f20121OooO00o.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o0OoOOo0.o000O00
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    oooO0O0.f20123OooO0OO.setVisibility(8);
                }
            });
            oooO0O0.f20121OooO00o.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: o0OoOOo0.o000Oo0
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                    OooO0O0 oooO0O1 = oooO0O0;
                    Objects.requireNonNull(oooO0O1);
                    if (i == 702) {
                        oooO0O1.f20123OooO0OO.setVisibility(8);
                    } else {
                        if (i != 701) {
                            return false;
                        }
                        oooO0O1.f20123OooO0OO.setVisibility(0);
                    }
                    return true;
                }
            });
            Uri uri = Uri.parse(playerItem.f20132Oooo0o);
            VideoView videoView = oooO0O0.f20121OooO00o;
            boolean z3 = playerItem.f20133Oooo0oO;
            videoView.f20202Oooo0oO = uri;
            videoView.f20217OooooOO = z3;
            videoView.f20216OooooO0 = 0;
            videoView.OooO0o0();
            videoView.requestLayout();
            videoView.invalidate();
            oooO0O0.f20121OooO00o.requestFocus();
        } catch (Exception e) {
            o0oO0Ooo.OooO0OO().OooO0O0("PlayerController", "Error occurred during video playback", e);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        VideoView videoView = this.f20129Oooo0o.f20121OooO00o;
        MediaPlayer mediaPlayer = videoView.f20205OoooO0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            videoView.f20205OoooO0.release();
            videoView.f20205OoooO0 = null;
            videoView.f20203Oooo0oo = 0;
            videoView.f20200Oooo = 0;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        OooO0O0 oooO0O0 = this.f20129Oooo0o;
        oooO0O0.f20127OooO0oO = oooO0O0.f20121OooO00o.OooO0Oo();
        oooO0O0.f20125OooO0o = oooO0O0.f20121OooO00o.getCurrentPosition();
        oooO0O0.f20121OooO00o.OooO0o();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        OooO0O0 oooO0O0 = this.f20129Oooo0o;
        int i = oooO0O0.f20125OooO0o;
        if (i != 0) {
            oooO0O0.f20121OooO00o.OooO0oo(i);
        }
        if (oooO0O0.f20127OooO0oO) {
            oooO0O0.f20121OooO00o.OooO();
            oooO0O0.f20122OooO0O0.f20196OoooO0.sendEmptyMessage(1001);
        }
    }
}
