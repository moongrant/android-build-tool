package p093o000o0OO;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f35344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final WorkerParameters.OooO00o f35345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f35346OooO0o0;

    public o0O0O00(o0OOO0o o0ooo0o2, String str, WorkerParameters.OooO00o oooO00o) {
        this.f35344OooO0Oo = o0ooo0o2;
        this.f35346OooO0o0 = str;
        this.f35345OooO0o = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35344OooO0Oo.f35162OooO0o.OooO0oo(this.f35346OooO0o0, this.f35345OooO0o);
    }
}
