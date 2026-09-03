package o000Oo0;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f34839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.datasource.cache.OooO0O0 f34840OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(androidx.media3.datasource.cache.OooO0O0 oooO0O0, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f34840OooO0o0 = oooO0O0;
        this.f34839OooO0Oo = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f34840OooO0o0) {
            this.f34839OooO0Oo.open();
            androidx.media3.datasource.cache.OooO0O0.OooOO0o(this.f34840OooO0o0);
            this.f34840OooO0o0.f7075OooO0O0.OooO0o0();
        }
    }
}
