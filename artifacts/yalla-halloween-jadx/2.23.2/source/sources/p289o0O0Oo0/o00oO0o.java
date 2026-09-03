package p289o0O0Oo0;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f41561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Thread f41562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Throwable f41563OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41564OooO0oO;

    public o00oO0o(o00Ooo o00ooo2, long j, Throwable th, Thread thread) {
        this.f41564OooO0oO = o00ooo2;
        this.f41561OooO0Oo = j;
        this.f41563OooO0o0 = th;
        this.f41562OooO0o = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Ooo o00ooo2 = this.f41564OooO0oO;
        o00000 o00000Var = o00ooo2.f41556OooOOO0;
        if (o00000Var != null && o00000Var.f41493OooO0o0.get()) {
            return;
        }
        long j = this.f41561OooO0Oo / 1000;
        String strOooO0o0 = o00ooo2.OooO0o0();
        if (strOooO0o0 == null) {
            Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Throwable th = this.f41563OooO0o0;
        Thread thread = this.f41562OooO0o;
        o000O00 o000o01 = o00ooo2.f41554OooOO0o;
        o000o01.getClass();
        String strConcat = "Persisting non-fatal event for session ".concat(strOooO0o0);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o000o01.OooO0Oo(th, thread, strOooO0o0, "error", j, false);
    }
}
