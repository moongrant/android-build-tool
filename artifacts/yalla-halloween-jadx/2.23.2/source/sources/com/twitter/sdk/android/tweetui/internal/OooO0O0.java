package com.twitter.sdk.android.tweetui.internal;

import android.widget.SeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VideoControlView f21894OooO00o;

    public OooO0O0(VideoControlView videoControlView) {
        this.f21894OooO00o = videoControlView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            VideoControlView videoControlView = this.f21894OooO00o;
            int duration = (int) (((long) (videoControlView.f21914OooO0Oo.getDuration() * i)) / 1000);
            ((VideoView) videoControlView.f21914OooO0Oo).OooO0o(duration);
            videoControlView.setCurrentTime(duration);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f21894OooO00o.f21913OooO.removeMessages(1001);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f21894OooO00o.f21913OooO.sendEmptyMessage(1001);
    }
}
