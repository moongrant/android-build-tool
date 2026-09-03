package p030OoooO;

import com.google.common.util.concurrent.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f1342OooO0Oo;

    public Oooo0(OooOO0O oooOO0O) {
        this.f1342OooO0Oo = oooOO0O;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1342OooO0Oo.cancel(true);
    }
}
