package p039OoooOoo;

import android.view.Surface;
import o00O0OOO.o0O0O00;
import p117o00O0OOo.o00000O0;
import p117o00O0OOo.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1702OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1703OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1704OooO0o0;

    public /* synthetic */ o0O00O(int i, Object obj, Object obj2) {
        this.f1702OooO0Oo = i;
        this.f1704OooO0o0 = obj;
        this.f1703OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1702OooO0Oo) {
            case 0:
                o0O00OOO o0o00ooo2 = (o0O00OOO) this.f1704OooO0o0;
                o0o00ooo2.f1715OooO0oo.OooO00o((Surface) this.f1703OooO0o);
                break;
            default:
                o0O0O00 o0o0o00 = (o0O0O00) this.f1704OooO0o0;
                o00000OO o00000oo2 = (o00000OO) this.f1703OooO0o;
                if (!(o0o0o00.f36308OooO0Oo.f36330OooO0Oo instanceof o00000O0.OooO0O0)) {
                    o00000oo2.OooOO0O(o0o0o00.f36311OooO0oO.OooO00o());
                } else {
                    o00000oo2.cancel(true);
                }
                break;
        }
    }
}
