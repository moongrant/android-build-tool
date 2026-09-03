package p107o000ooO0;

import com.google.common.util.concurrent.OooO0OO;
import p102o000oo.o0OoOo0;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f30014Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f30015Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f30016Oooo0oo;

    public o0ooOOo(o0Oo0oo o0oo0oo2, OooO0OO oooO0OO, o00OOOO0 o00oooo1) {
        this.f30016Oooo0oo = o0oo0oo2;
        this.f30014Oooo0o = oooO0OO;
        this.f30015Oooo0oO = o00oooo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30014Oooo0o.get();
            o0OoOo0.OooO0OO().OooO00o(o0Oo0oo.f29985OooooOo, String.format("Starting work for %s", this.f30016Oooo0oo.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
            o0Oo0oo o0oo0oo2 = this.f30016Oooo0oo;
            o0oo0oo2.f30002OooooO0 = o0oo0oo2.f29991OoooO0.OooO0o0();
            this.f30015Oooo0oO.OooOO0o(this.f30016Oooo0oo.f30002OooooO0);
        } catch (Throwable th) {
            this.f30015Oooo0oO.OooOO0O(th);
        }
    }
}
