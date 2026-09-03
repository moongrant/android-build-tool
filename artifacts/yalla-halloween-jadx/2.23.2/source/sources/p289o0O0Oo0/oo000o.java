package p289o0O0Oo0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f41587OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f41588OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41589OooO0OO;

    public oo000o(o00Ooo o00ooo2, long j, String str) {
        this.f41589OooO0OO = o00ooo2;
        this.f41587OooO00o = j;
        this.f41588OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        o00Ooo o00ooo2 = this.f41589OooO0OO;
        o00000 o00000Var = o00ooo2.f41556OooOOO0;
        if (o00000Var != null && o00000Var.f41493OooO0o0.get()) {
            return null;
        }
        o00ooo2.f41543OooO.f41594OooO0O0.OooO0OO(this.f41587OooO00o, this.f41588OooO0O0);
        return null;
    }
}
