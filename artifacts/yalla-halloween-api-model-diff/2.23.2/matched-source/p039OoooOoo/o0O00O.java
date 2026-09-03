package p039OoooOoo;

import android.view.Surface;
import o00O0OOO.oo0o0Oo;
import p117o00O0OOo.o00000;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1699OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1700OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1701OooO0o0;

    public /* synthetic */ o0O00O(int i, Object obj, Object obj2) {
        this.f1699OooO0Oo = i;
        this.f1701OooO0o0 = obj;
        this.f1700OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1699OooO0Oo) {
            case 0:
                o0O00OOO o0o00ooo2 = (o0O00OOO) this.f1701OooO0o0;
                o0o00ooo2.f1712OooO0oo.OooO00o((Surface) this.f1700OooO0o);
                break;
            default:
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f1701OooO0o0;
                o00000O o00000o = (o00000O) this.f1700OooO0o;
                if (!(oo0o0oo.f36323OooO0Oo.f36334OooO0Oo instanceof o00000.OooO0O0)) {
                    o00000o.OooOO0O(oo0o0oo.f36326OooO0oO.OooO00o());
                } else {
                    o00000o.cancel(true);
                }
                break;
        }
    }
}
