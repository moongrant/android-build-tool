package p289o0O0Oo0;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p286o0O0OOoO.o00Ooo;
import p292o0O0OoO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f41489OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f41490OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f41491OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Ooo f41492OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f41493OooO0o0 = new AtomicBoolean(false);

    public interface OooO00o {
    }

    public o00000(Oooo000 oooo000, p292o0O0OoO.o00Ooo o00ooo2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, o00Ooo o00ooo3) {
        this.f41489OooO00o = oooo000;
        this.f41490OooO0O0 = o00ooo2;
        this.f41491OooO0OO = uncaughtExceptionHandler;
        this.f41492OooO0Oo = o00ooo3;
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
        if (!this.f41492OooO0Oo.OooO0O0()) {
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
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f41491OooO0OO;
        AtomicBoolean atomicBoolean = this.f41493OooO0o0;
        boolean z = true;
        atomicBoolean.set(true);
        try {
            if (OooO00o(thread, th)) {
                ((Oooo000) this.f41489OooO00o).OooO00o(this.f41490OooO0O0, thread, th);
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
