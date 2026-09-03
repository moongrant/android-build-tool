package p022Oooo00O;

import androidx.camera.core.impl.o000oOoO;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Executor f614OooO0o0;

    public /* synthetic */ o00O0O(o0Oo0oo o0oo0oo2, Executor executor, o000oOoO o000oooo2) {
        this.f612OooO0Oo = o0oo0oo2;
        this.f614OooO0o0 = executor;
        this.f613OooO0o = o000oooo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0Oo0oo.OooO00o oooO00o = this.f612OooO0Oo.f863OooOo;
        HashSet hashSet = oooO00o.f868OooO00o;
        o000oOoO o000oooo2 = this.f613OooO0o;
        hashSet.add(o000oooo2);
        oooO00o.f869OooO0O0.put(o000oooo2, this.f614OooO0o0);
    }
}
