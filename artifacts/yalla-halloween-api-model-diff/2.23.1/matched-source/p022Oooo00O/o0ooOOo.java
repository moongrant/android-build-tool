package p022Oooo00O;

import androidx.camera.core.impl.o000oOoO;
import androidx.media3.ui.o0O0O00;
import p029Oooo0oo.o0OOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f891OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f892OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f891OooO0Oo = i;
        this.f892OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f891OooO0Oo;
        Object obj = this.f892OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) obj).OooO00o();
                break;
            case 1:
                o0OOO0 o0ooo1 = (o0OOO0) obj;
                o0ooo1.f1297OooO0Oo = null;
                o0ooo1.OooO0OO();
                break;
            default:
                o0O0O00 o0o0o00 = (o0O0O00) obj;
                o0o0o00.f9873OooOO0o.start();
                o0o0o00.f9863OooO00o.postDelayed(o0o0o00.f9882OooOo0, 2000L);
                break;
        }
    }
}
