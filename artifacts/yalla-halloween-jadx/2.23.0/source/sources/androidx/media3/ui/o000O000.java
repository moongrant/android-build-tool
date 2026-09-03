package androidx.media3.ui;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface o000O000 {

    public interface OooO00o {
        void OooO00o(long j);

        void OooO0O0(long j);

        void OooO0OO(long j, boolean z);
    }

    void OooO00o(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    void OooO0O0(OooO00o oooO00o);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
