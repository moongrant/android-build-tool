package p331o0O0oooO;

import com.google.android.gms.common.api.internal.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f37132Oooo0o;

    public o0OOO00(OooO00o oooO00o) {
        this.f37132Oooo0o = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37132Oooo0o.f15285OooOOO0.lock();
        try {
            OooO00o.OooO0o(this.f37132Oooo0o);
        } finally {
            this.f37132Oooo0o.f15285OooOOO0.unlock();
        }
    }
}
