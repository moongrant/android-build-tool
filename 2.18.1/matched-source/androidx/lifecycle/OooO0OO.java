package androidx.lifecycle;

import p552o0oOO0Oo.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f8542Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f8543Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f8544Oooo0oo;

    public /* synthetic */ OooO0OO(Object obj, Object obj2, int i) {
        this.f8542Oooo0o = i;
        this.f8543Oooo0oO = obj;
        this.f8544Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8542Oooo0o) {
            case 0:
                DispatchQueue.m5dispatchAndEnqueue$lambda2$lambda1((DispatchQueue) this.f8543Oooo0oO, (Runnable) this.f8544Oooo0oo);
                break;
            default:
                o000O0o o000o0o2 = (o000O0o) this.f8543Oooo0oO;
                Exception exc = (Exception) this.f8544Oooo0oo;
                int i = o0Ooo0.OooO.OooO00o.f40353Oooo;
                if (o000o0o2 != null) {
                    o000o0o2.onFailure(exc);
                }
                break;
        }
    }
}
