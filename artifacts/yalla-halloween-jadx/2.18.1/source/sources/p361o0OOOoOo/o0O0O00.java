package p361o0OOOoOo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f38492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f38493OooO0O0;

    public o0O0O00(o0OO00O o0oo00o2, String str) {
        this.f38493OooO0O0 = o0oo00o2;
        this.f38492OooO00o = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o0OO00O.OooO00o(this.f38493OooO0O0, this.f38492OooO00o);
        return null;
    }
}
