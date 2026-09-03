package com.twitter.sdk.android.tweetui.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.ui.platform.o00O0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p438o0OoOOo.o0000O0;
import p438o0OoOOo.o000Oo0;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o000OOo0;
import p439o0OoOOo0.o00O0000;
import p439o0OoOOo0.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public class VideoControlView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f20192Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f20193Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageButton f20194Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f20195Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public final OooO00o f20196OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public SeekBar f20197OoooO00;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            VideoControlView videoControlView;
            OooO0O0 oooO0O0;
            if (message.what != 1001 || (oooO0O0 = (videoControlView = VideoControlView.this).f20193Oooo0o) == null) {
                return;
            }
            int duration = oooO0O0.getDuration();
            int currentPosition = videoControlView.f20193Oooo0o.getCurrentPosition();
            int bufferPercentage = videoControlView.f20193Oooo0o.getBufferPercentage();
            videoControlView.setDuration(duration);
            videoControlView.setCurrentTime(currentPosition);
            videoControlView.OooO0O0(currentPosition, duration, bufferPercentage);
            VideoControlView videoControlView2 = VideoControlView.this;
            if (((VideoView) videoControlView2.f20193Oooo0o).OooO0Oo()) {
                videoControlView2.f20194Oooo0oO.setImageResource(o000OOo0.tw__video_pause_btn);
                videoControlView2.f20194Oooo0oO.setContentDescription(videoControlView2.getContext().getString(o00oOoo.tw__pause));
            } else if (videoControlView2.f20193Oooo0o.getCurrentPosition() > Math.max(videoControlView2.f20193Oooo0o.getDuration() - 500, 0)) {
                videoControlView2.f20194Oooo0oO.setImageResource(o000OOo0.tw__video_replay_btn);
                videoControlView2.f20194Oooo0oO.setContentDescription(videoControlView2.getContext().getString(o00oOoo.tw__replay));
            } else {
                videoControlView2.f20194Oooo0oO.setImageResource(o000OOo0.tw__video_play_btn);
                videoControlView2.f20194Oooo0oO.setContentDescription(videoControlView2.getContext().getString(o00oOoo.tw__play));
            }
            if ((VideoControlView.this.getVisibility() == 0) && ((VideoView) VideoControlView.this.f20193Oooo0o).OooO0Oo()) {
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
        this.f20196OoooO0 = new OooO00o();
    }

    public final void OooO00o() {
        this.f20196OoooO0.removeMessages(1001);
        if (getVisibility() == 0) {
            clearAnimation();
            animate().alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(150).setListener(new o0000O0(this));
        }
    }

    public final void OooO0O0(int i, int i2, int i3) {
        this.f20197OoooO00.setProgress((int) (i2 > 0 ? (((long) i) * 1000) / ((long) i2) : 0L));
        this.f20197OoooO00.setSecondaryProgress(i3 * 10);
    }

    public final void OooO0OO() {
        this.f20196OoooO0.sendEmptyMessage(1001);
        if (getVisibility() != 0) {
            setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            setVisibility(0);
        }
        clearAnimation();
        animate().alpha(1.0f).setDuration(150).setListener(null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(o00O0000.tw__video_control, this);
        this.f20194Oooo0oO = (ImageButton) findViewById(o00.tw__state_control);
        this.f20195Oooo0oo = (TextView) findViewById(o00.tw__current_time);
        this.f20192Oooo = (TextView) findViewById(o00.tw__duration);
        SeekBar seekBar = (SeekBar) findViewById(o00.tw__progress);
        this.f20197OoooO00 = seekBar;
        seekBar.setMax(1000);
        this.f20197OoooO00.setOnSeekBarChangeListener(new com.twitter.sdk.android.tweetui.internal.OooO0O0(this));
        this.f20194Oooo0oO.setOnClickListener(new o000Oo0(this, 0));
        setDuration(0);
        setCurrentTime(0);
        OooO0O0(0, 0, 0);
    }

    public void setCurrentTime(int i) {
        this.f20195Oooo0oo.setText(o00O0.OooO0Oo(i));
    }

    public void setDuration(int i) {
        this.f20192Oooo.setText(o00O0.OooO0Oo(i));
    }

    public void setMediaPlayer(OooO0O0 oooO0O0) {
        this.f20193Oooo0o = oooO0O0;
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20196OoooO0 = new OooO00o();
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20196OoooO0 = new OooO00o();
    }
}
