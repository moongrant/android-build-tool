package com.twitter.sdk.android.tweetui.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.material.TextFieldImplKt;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.twitter.sdk.android.tweetui.o000000;
import com.twitter.sdk.android.tweetui.o0O0O00;
import com.twitter.sdk.android.tweetui.o0OO00O;
import com.twitter.sdk.android.tweetui.oo0o0Oo;
import p353o0OOOo00.OooO0OO;
import p353o0OOOo00.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public class VideoControlView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public final OooO00o f21913OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f21914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f21915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageButton f21916OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f21917OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SeekBar f21918OooO0oo;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            VideoControlView videoControlView;
            OooO0O0 oooO0O0;
            if (message.what != 1001 || (oooO0O0 = (videoControlView = VideoControlView.this).f21914OooO0Oo) == null) {
                return;
            }
            int duration = oooO0O0.getDuration();
            int currentPosition = videoControlView.f21914OooO0Oo.getCurrentPosition();
            int bufferPercentage = videoControlView.f21914OooO0Oo.getBufferPercentage();
            videoControlView.setDuration(duration);
            videoControlView.setCurrentTime(currentPosition);
            videoControlView.f21918OooO0oo.setProgress((int) (duration > 0 ? (((long) currentPosition) * 1000) / ((long) duration) : 0L));
            videoControlView.f21918OooO0oo.setSecondaryProgress(bufferPercentage * 10);
            if (((VideoView) videoControlView.f21914OooO0Oo).OooO0OO()) {
                videoControlView.f21916OooO0o0.setImageResource(o0OO00O.tw__video_pause_btn);
                videoControlView.f21916OooO0o0.setContentDescription(videoControlView.getContext().getString(o000000.tw__pause));
            } else if (videoControlView.f21914OooO0Oo.getCurrentPosition() > Math.max(videoControlView.f21914OooO0Oo.getDuration() - 500, 0)) {
                videoControlView.f21916OooO0o0.setImageResource(o0OO00O.tw__video_replay_btn);
                videoControlView.f21916OooO0o0.setContentDescription(videoControlView.getContext().getString(o000000.tw__replay));
            } else {
                videoControlView.f21916OooO0o0.setImageResource(o0OO00O.tw__video_play_btn);
                videoControlView.f21916OooO0o0.setContentDescription(videoControlView.getContext().getString(o000000.tw__play));
            }
            if ((videoControlView.getVisibility() == 0) && ((VideoView) videoControlView.f21914OooO0Oo).OooO0OO()) {
                sendMessageDelayed(obtainMessage(1001), 500L);
            }
        }
    }

    public interface OooO0O0 {
        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();
    }

    public VideoControlView(Context context) {
        super(context);
        this.f21913OooO = new OooO00o();
    }

    public final void OooO00o() {
        this.f21913OooO.removeMessages(1001);
        if (getVisibility() == 0) {
            clearAnimation();
            animate().alpha(0.0f).setDuration(TextFieldImplKt.AnimationDuration).setListener(new OooO0OO(this));
        }
    }

    public final void OooO0O0() {
        this.f21913OooO.sendEmptyMessage(1001);
        if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
        }
        clearAnimation();
        animate().alpha(1.0f).setDuration(TextFieldImplKt.AnimationDuration).setListener(null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(o0O0O00.tw__video_control, this);
        this.f21916OooO0o0 = (ImageButton) findViewById(oo0o0Oo.tw__state_control);
        this.f21915OooO0o = (TextView) findViewById(oo0o0Oo.tw__current_time);
        this.f21917OooO0oO = (TextView) findViewById(oo0o0Oo.tw__duration);
        SeekBar seekBar = (SeekBar) findViewById(oo0o0Oo.tw__progress);
        this.f21918OooO0oo = seekBar;
        seekBar.setMax(1000);
        this.f21918OooO0oo.setOnSeekBarChangeListener(new com.twitter.sdk.android.tweetui.internal.OooO0O0(this));
        this.f21916OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0OOOo00.OooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoControlView videoControlView = this.f42895OooO0Oo;
                if (((VideoView) videoControlView.f21914OooO0Oo).OooO0OO()) {
                    ((VideoView) videoControlView.f21914OooO0Oo).OooO0o0();
                } else {
                    ((VideoView) videoControlView.f21914OooO0Oo).OooO0oO();
                }
                videoControlView.OooO0O0();
            }
        });
        setDuration(0);
        setCurrentTime(0);
        this.f21918OooO0oo.setProgress((int) 0);
        this.f21918OooO0oo.setSecondaryProgress(0);
    }

    public void setCurrentTime(int i) {
        this.f21915OooO0o.setText(OooOO0.OooO00o(i));
    }

    public void setDuration(int i) {
        this.f21917OooO0oO.setText(OooOO0.OooO00o(i));
    }

    public void setMediaPlayer(OooO0O0 oooO0O0) {
        this.f21914OooO0Oo = oooO0O0;
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21913OooO = new OooO00o();
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21913OooO = new OooO00o();
    }
}
