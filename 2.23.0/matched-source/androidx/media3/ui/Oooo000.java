package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6576OooO0o0;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f6575OooO0Oo = i;
        this.f6576OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6575OooO0Oo;
        Object obj = this.f6576OooO0o0;
        switch (i) {
            case 0:
                ((oo0o0Oo) obj).OooOO0O();
                break;
            default:
                ((com.google.android.exoplayer2.ui.o0000) obj).f14045OooOOO.start();
                break;
        }
    }
}
