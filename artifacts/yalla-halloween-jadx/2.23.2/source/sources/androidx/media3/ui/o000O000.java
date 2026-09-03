package androidx.media3.ui;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface o000O000 {

    public interface OooO00o {
        void onScrubMove(o000O000 o000o001, long j);

        void onScrubStart(o000O000 o000o001, long j);

        void onScrubStop(o000O000 o000o001, long j, boolean z);
    }

    void OooO00o(OooO00o oooO00o);

    void OooO0O0(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
