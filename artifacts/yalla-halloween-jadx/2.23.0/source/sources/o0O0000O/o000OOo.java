package o0O0000O;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f41622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Callable f41623OooO0o0;

    public o000OOo(o0O0O00 o0o0o00, Callable callable) {
        this.f41622OooO0Oo = o0o0o00;
        this.f41623OooO0o0 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0O0O00 o0o0o00 = this.f41622OooO0Oo;
        try {
            o0o0o00.OooO0O0(this.f41623OooO0o0.call());
        } catch (Exception e) {
            o0o0o00.OooO00o(e);
        } catch (Throwable th) {
            o0o0o00.OooO00o(new RuntimeException(th));
        }
    }
}
