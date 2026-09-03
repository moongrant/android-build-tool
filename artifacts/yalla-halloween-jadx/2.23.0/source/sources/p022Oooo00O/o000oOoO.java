package p022Oooo00O;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f604OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.o000oOoO f605OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Executor f606OooO0o0;

    public /* synthetic */ o000oOoO(o0Oo0oo o0oo0oo2, Executor executor, androidx.camera.core.impl.o000oOoO o000oooo2) {
        this.f604OooO0Oo = o0oo0oo2;
        this.f606OooO0o0 = executor;
        this.f605OooO0o = o000oooo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0Oo0oo.OooO00o oooO00o = this.f604OooO0Oo.f856OooOo;
        HashSet hashSet = oooO00o.f861OooO00o;
        androidx.camera.core.impl.o000oOoO o000oooo2 = this.f605OooO0o;
        hashSet.add(o000oooo2);
        oooO00o.f862OooO0O0.put(o000oooo2, this.f606OooO0o0);
    }
}
