package androidx.lifecycle;

import p554o0oOO0Oo.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f8558Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f8559OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f8560OoooO00;

    public /* synthetic */ OooO0OO(Object obj, Object obj2, int i) {
        this.f8558Oooo = i;
        this.f8560OoooO00 = obj;
        this.f8559OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8558Oooo) {
            case 0:
                DispatchQueue.m5dispatchAndEnqueue$lambda2$lambda1((DispatchQueue) this.f8560OoooO00, (Runnable) this.f8559OoooO0);
                break;
            default:
                o000O0o o000o0o2 = (o000O0o) this.f8560OoooO00;
                Exception exc = (Exception) this.f8559OoooO0;
                int i = o0Ooo0.OooO.OooO00o.f40372OoooO0O;
                if (o000o0o2 != null) {
                    o000o0o2.onFailure(exc);
                }
                break;
        }
    }
}
