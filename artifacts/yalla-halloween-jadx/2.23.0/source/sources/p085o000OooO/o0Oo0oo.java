package p085o000OooO;

import com.google.common.util.concurrent.OooO00o;
import p084o000Ooo0.o000oOoO;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35166OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f35167OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f35168OooO0o0;

    public o0Oo0oo(oo0o0Oo oo0o0oo, o0000O00 o0000o00, o0000O00 o0000o01) {
        this.f35167OooO0o = oo0o0oo;
        this.f35166OooO0Oo = o0000o00;
        this.f35168OooO0o0 = o0000o01;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0000O00 o0000o00 = this.f35168OooO0o0;
        oo0o0Oo oo0o0oo = this.f35167OooO0o;
        try {
            this.f35166OooO0Oo.get();
            o000oOoO.OooO0OO().OooO00o(oo0o0Oo.f35170OooOo0O, String.format("Starting work for %s", oo0o0oo.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
            o0000O00 o0000o00OooO0o0 = oo0o0oo.f35176OooO0oo.OooO0o0();
            oo0o0oo.f35188OooOo00 = o0000o00OooO0o0;
            o0000o00.OooOO0O(o0000o00OooO0o0);
        } catch (Throwable th) {
            o0000o00.OooOO0(th);
        }
    }
}
