package p285o0O0OOoo;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f42128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f42129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f42130OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0OOOo.OooO00o f42131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f42132OooO0o0 = new AtomicBoolean(false);

    public interface OooO00o {
    }

    public o0000O0O(o00oO0o o00oo0o2, o00000O0 o00000o1, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, o0O0OOOo.OooO00o oooO00o) {
        this.f42128OooO00o = o00oo0o2;
        this.f42129OooO0O0 = o00000o1;
        this.f42130OooO0OO = uncaughtExceptionHandler;
        this.f42131OooO0Oo = oooO00o;
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
        if (!this.f42131OooO0Oo.OooO0O0()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d A[DONT_GENERATE] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f42130OooO0OO;
        AtomicBoolean atomicBoolean = this.f42132OooO0o0;
        boolean z = true;
        atomicBoolean.set(true);
        try {
            if (OooO00o(thread, th)) {
                ((o00oO0o) this.f42128OooO00o).OooO00o(this.f42129OooO0O0, thread, th);
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
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}
