package p326o0O0ooO;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O00o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00oO0o f36992Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f36993Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public WorkerParameters.OooO00o f36994Oooo0oo;

    public o00O00o0(o00oO0o o00oo0o2, String str, WorkerParameters.OooO00o oooO00o) {
        this.f36992Oooo0o = o00oo0o2;
        this.f36993Oooo0oO = str;
        this.f36994Oooo0oo = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36992Oooo0o.f29978OooO0o.OooO0oO(this.f36993Oooo0oO, this.f36994Oooo0oo);
    }
}
