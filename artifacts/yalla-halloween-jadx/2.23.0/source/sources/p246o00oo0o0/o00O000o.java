package p246o00oo0o0;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f40729OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f40730OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(OooO0O0 oooO0O0, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f40730OooO0o0 = oooO0O0;
        this.f40729OooO0Oo = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f40730OooO0o0) {
            this.f40729OooO0Oo.open();
            OooO0O0.OooOO0O(this.f40730OooO0o0);
            this.f40730OooO0o0.f14305OooO0O0.OooO0o0();
        }
    }
}
