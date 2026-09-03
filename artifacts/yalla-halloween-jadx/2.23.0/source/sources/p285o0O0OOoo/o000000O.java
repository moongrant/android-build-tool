package p285o0O0OOoo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f42116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42117OooO0O0;

    public o000000O(o0O0O00 o0o0o00, String str) {
        this.f42117OooO0O0 = o0o0o00;
        this.f42116OooO00o = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o0O0O00.OooO00o(this.f42117OooO0O0, this.f42116OooO00o);
        return null;
    }
}
