package p203o00o0o0o;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.Player;
import com.google.firebase.perf.v1.PerfMetric;
import p176o00o0.Oooo0;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O000o implements o00O.OooO00o, Oooo0 {
    @Override // p176o00o0.Oooo0
    public final Object apply(Object obj) {
        return ((PerfMetric) obj).toByteArray();
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
    }
}
