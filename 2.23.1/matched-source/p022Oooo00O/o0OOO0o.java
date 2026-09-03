package p022Oooo00O;

import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import p029Oooo0oo.o0OOO0;
import p029Oooo0oo.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f833OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f834OooO0o0;

    public /* synthetic */ o0OOO0o(int i, Object obj, Object obj2) {
        this.f832OooO0Oo = i;
        this.f834OooO0o0 = obj;
        this.f833OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f832OooO0Oo;
        Object obj = this.f833OooO0o;
        Object obj2 = this.f834OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) obj2).OooO0O0((o00Oo0) obj);
                break;
            default:
                ((o0OOO0) obj2).f1299OooO0o0.remove((oo0ooO) obj);
                break;
        }
    }
}
