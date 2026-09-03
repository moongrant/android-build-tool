package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o0000O0 {

    public interface OooO00o {
        void onScrubMove(o0000O0 o0000o1, long j);

        void onScrubStart(o0000O0 o0000o1, long j);

        void onScrubStop(o0000O0 o0000o1, long j, boolean z);
    }

    void OooO00o(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    void OooO0O0(OooO00o oooO00o);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
