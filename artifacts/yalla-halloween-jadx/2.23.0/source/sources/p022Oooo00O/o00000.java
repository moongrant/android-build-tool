package p022Oooo00O;

import androidx.lifecycle.DispatchQueue;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f472OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f473OooO0o0;

    public /* synthetic */ o00000(int i, Object obj, Object obj2) {
        this.f471OooO0Oo = i;
        this.f473OooO0o0 = obj;
        this.f472OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f471OooO0Oo;
        Object obj = this.f472OooO0o;
        Object obj2 = this.f473OooO0o0;
        switch (i) {
            case 0:
                o000OO o000oo2 = (o000OO) obj2;
                o00O000.OooO00o oooO00o = (o00O000.OooO00o) obj;
                o0O000Oo o0o000oo2 = o000oo2.f568OooOo0O;
                if (o0o000oo2 != null) {
                    oooO00o.OooO0O0(Boolean.valueOf(o000oo2.f550OooO0Oo.OooO0Oo(o000OO.OooOo0o(o0o000oo2))));
                } else {
                    oooO00o.OooO0O0(Boolean.FALSE);
                }
                break;
            default:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) obj2, (Runnable) obj);
                break;
        }
    }
}
