package p361o0OOOoOo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f38519OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f38520OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f38521OooO0OO;

    public oo0o0Oo(o0OO00O o0oo00o2, long j, String str) {
        this.f38521OooO0OO = o0oo00o2;
        this.f38519OooO00o = j;
        this.f38520OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o0000 o0000Var = this.f38521OooO0OO.f38505OooOO0o;
        if (o0000Var != null && o0000Var.f38415OooO0o0.get()) {
            return null;
        }
        this.f38521OooO0OO.f38502OooO0oo.f38549OooO0O0.OooO0OO(this.f38519OooO00o, this.f38520OooO0O0);
        return null;
    }
}
