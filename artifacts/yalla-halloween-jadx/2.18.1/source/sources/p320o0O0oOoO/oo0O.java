package p320o0O0oOoO;

import android.view.Surface;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0O.OooO00o f36832Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Surface f36833Oooo0oO;

    public /* synthetic */ oo0O(o00OOO0O.OooO00o oooO00o, Surface surface) {
        this.f36832Oooo0o = oooO00o;
        this.f36833Oooo0oO = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00OOO0O.OooO00o oooO00o = this.f36832Oooo0o;
        Surface surface = this.f36833Oooo0oO;
        o00OOO0O o00ooo0o2 = oooO00o.f36831OooO0O0;
        int i = o000OOo0.f36740OooO00o;
        o00ooo0o2.OooOOo(surface);
    }
}
