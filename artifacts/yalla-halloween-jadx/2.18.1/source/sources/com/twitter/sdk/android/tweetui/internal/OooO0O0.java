package com.twitter.sdk.android.tweetui.internal;

import android.widget.SeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VideoControlView f20172OooO00o;

    public OooO0O0(VideoControlView videoControlView) {
        this.f20172OooO00o = videoControlView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int duration = (int) (((long) (this.f20172OooO00o.f20193Oooo0o.getDuration() * i)) / 1000);
            ((VideoView) this.f20172OooO00o.f20193Oooo0o).OooO0oo(duration);
            this.f20172OooO00o.setCurrentTime(duration);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f20172OooO00o.f20196OoooO0.removeMessages(1001);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f20172OooO00o.f20196OoooO0.sendEmptyMessage(1001);
    }
}
