package p330o0O0ooo0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 extends o0O0ooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Callable f37063OooO0o;

    public /* synthetic */ o00O0000(Callable callable) {
        super(false, 1, null, null);
        this.f37063OooO0o = callable;
    }

    @Override // p330o0O0ooo0.o0O0ooO
    public final String OooO00o() {
        try {
            return (String) this.f37063OooO0o.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
