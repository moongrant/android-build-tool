package p285o0O0OOoo;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f42112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Thread f42113OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Throwable f42114OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42115OooO0oO;

    public o000000(o0O0O00 o0o0o00, long j, Throwable th, Thread thread) {
        this.f42115OooO0oO = o0o0o00;
        this.f42112OooO0Oo = j;
        this.f42114OooO0o0 = th;
        this.f42113OooO0o = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0O0O00 o0o0o00 = this.f42115OooO0oO;
        o0000O0O o0000o0o2 = o0o0o00.f42205OooOOO0;
        if (o0000o0o2 != null && o0000o0o2.f42132OooO0o0.get()) {
            return;
        }
        long j = this.f42112OooO0Oo / 1000;
        String strOooO0o0 = o0o0o00.OooO0o0();
        if (strOooO0o0 == null) {
            Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Throwable th = this.f42114OooO0o0;
        Thread thread = this.f42113OooO0o;
        o0O0ooO o0o0ooo = o0o0o00.f42203OooOO0o;
        o0o0ooo.getClass();
        String strConcat = "Persisting non-fatal event for session ".concat(strOooO0o0);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o0o0ooo.OooO0Oo(th, thread, strOooO0o0, "error", j, false);
    }
}
