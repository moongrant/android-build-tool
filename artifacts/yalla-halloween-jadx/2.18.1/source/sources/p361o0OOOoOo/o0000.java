package p361o0OOOoOo;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p354o0OOOo.OooOO0;
import p366o0OOo00O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f38412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f38413OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f38414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f38415OooO0o0 = new AtomicBoolean(false);

    public interface OooO00o {
    }

    public o0000(OooO00o oooO00o, OooOOOO oooOOOO, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, OooOO0 oooOO1) {
        this.f38411OooO00o = oooO00o;
        this.f38412OooO0O0 = oooOOOO;
        this.f38413OooO0OO = uncaughtExceptionHandler;
        this.f38414OooO0Oo = oooOO1;
    }

    public final boolean OooO00o(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f38414OooO0Oo.OooO0O0()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[DONT_GENERATE] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z = true;
        this.f38415OooO0o0.set(true);
        try {
            if (OooO00o(thread, th)) {
                ((o00Ooo) this.f38411OooO00o).OooO00o(this.f38412OooO0O0, thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
        } finally {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            this.f38413OooO0OO.uncaughtException(thread, th);
            this.f38415OooO0o0.set(false);
        }
    }
}
