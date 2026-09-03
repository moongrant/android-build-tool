package p042OooooO0;

import androidx.camera.video.internal.audio.OooO0o;
import com.google.android.material.search.SearchView;
import p550o0oOOo.o0OO000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1805OooO0o0;

    public /* synthetic */ o00OOO00(Object obj, int i) {
        this.f1804OooO0Oo = i;
        this.f1805OooO0o0 = obj;
    }

    private final void OooO00o() {
        o0OO000 o0oo000 = (o0OO000) this.f1805OooO0o0;
        synchronized (o0oo000.f55923OooO00o) {
            if (o0oo000.f55933OooOO0o) {
                return;
            }
            long j = o0oo000.f55932OooOO0O - 1;
            o0oo000.f55932OooOO0O = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                o0oo000.OooO0O0(new IllegalStateException());
            } else {
                o0oo000.OooO00o();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1804OooO0Oo) {
            case 0:
                OooO0o oooO0o = (OooO0o) this.f1805OooO0o0;
                oooO0o.f4091OooOO0O.set(false);
                oooO0o.f4088OooO0oO.stop();
                synchronized (oooO0o.f4087OooO0o0) {
                    oooO0o.f4086OooO0o = null;
                    oooO0o.f4084OooO0OO.clear();
                    break;
                }
                return;
            case 1:
                OooO00o();
                return;
            default:
                ((SearchView) this.f1805OooO0o0).OooO0Oo();
                return;
        }
    }
}
