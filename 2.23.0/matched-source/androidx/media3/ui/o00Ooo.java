package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6757OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f6756OooO0Oo = i;
        this.f6757OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6756OooO0Oo;
        Object obj = this.f6757OooO0o0;
        switch (i) {
            case 0:
                ((oo0o0Oo) obj).f6778OooOOO.start();
                break;
            default:
                ((com.google.android.exoplayer2.ui.o0000) obj).OooO(2);
                break;
        }
    }
}
