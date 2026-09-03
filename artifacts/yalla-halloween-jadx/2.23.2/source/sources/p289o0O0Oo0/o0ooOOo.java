package p289o0O0Oo0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f41585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41586OooO0O0;

    public o0ooOOo(o00Ooo o00ooo2, String str) {
        this.f41586OooO0O0 = o00ooo2;
        this.f41585OooO00o = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o00Ooo.OooO00o(this.f41586OooO0O0, this.f41585OooO00o);
        return null;
    }
}
