package p026Oooo0o;

import android.view.Surface;
import p039OoooOoo.o0O000Oo;
import p206o00o0oOO.o0;
import p245o00oo0o.o0O00;
import p247o00oo0oO.oo00oO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1080OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1081OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1082OooO0o0;

    public /* synthetic */ OooOO0(int i, Object obj, Object obj2) {
        this.f1080OooO0Oo = i;
        this.f1082OooO0o0 = obj;
        this.f1081OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1080OooO0Oo) {
            case 0:
                ((OooOOO0) this.f1082OooO0o0).OooO0O0((o00O000.OooO00o) this.f1081OooO0o);
                break;
            case 1:
                o0O000Oo o0o000oo2 = (o0O000Oo) this.f1082OooO0o0;
                o0o000oo2.f1736OooO0oo.OooO00o((Surface) this.f1081OooO0o);
                break;
            default:
                oo00oO.OooO00o oooO00o = (oo00oO.OooO00o) this.f1082OooO0o0;
                o0 o0Var = (o0) this.f1081OooO0o;
                oooO00o.getClass();
                synchronized (o0Var) {
                }
                oo00oO oo00oo = oooO00o.f40869OooO0O0;
                int i = o0O00.f40595OooO00o;
                oo00oo.OooO0O0(o0Var);
                break;
        }
    }
}
