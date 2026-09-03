package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3262OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3263OooO0o0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f3262OooO0Oo = i;
        this.f3263OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3262OooO0Oo) {
            case 0:
                ((o000OOo0) this.f3263OooO0o0).OooO0OO(false);
                return;
            default:
                o000O0O0.OooOOO0 oooOOO0 = (o000O0O0.OooOOO0) this.f3263OooO0o0;
                synchronized (oooOOO0.f34209OooO00o) {
                    if (oooOOO0.f34219OooOO0o) {
                        return;
                    }
                    long j = oooOOO0.f34218OooOO0O - 1;
                    oooOOO0.f34218OooOO0O = j;
                    if (j > 0) {
                        return;
                    }
                    if (j < 0) {
                        oooOOO0.OooO0O0(new IllegalStateException());
                        return;
                    } else {
                        oooOOO0.OooO00o();
                        return;
                    }
                }
        }
    }
}
