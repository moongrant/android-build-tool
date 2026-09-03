package p285o0O0OOoo;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p286o0O0Oo.OooOo00;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f42217OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Throwable f42218OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Thread f42219OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f42220OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42221OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f42222OooO0o0 = false;

    public o0OOO0o(o0O0O00 o0o0o00, long j, Throwable th, Thread thread, o0000Ooo o0000ooo) {
        this.f42221OooO0o = o0o0o00;
        this.f42217OooO00o = j;
        this.f42218OooO0O0 = th;
        this.f42219OooO0OO = thread;
        this.f42220OooO0Oo = o0000ooo;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        long j = this.f42217OooO00o;
        long j2 = j / 1000;
        o0O0O00 o0o0o00 = this.f42221OooO0o;
        String strOooO0o0 = o0o0o00.OooO0o0();
        if (strOooO0o0 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        o0o0o00.f42195OooO0OO.OooO00o();
        Throwable th = this.f42218OooO0O0;
        Thread thread = this.f42219OooO0OO;
        o0O0ooO o0o0ooo = o0o0o00.f42203OooOO0o;
        o0o0ooo.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strOooO0o0);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o0o0ooo.OooO0Oo(th, thread, strOooO0o0, AppMeasurement.CRASH_ORIGIN, j2, true);
        try {
            OooOo00 oooOo00 = o0o0o00.f42199OooO0oO;
            String str = ".ae" + j;
            oooOo00.getClass();
            if (!new File(oooOo00.f42242OooO0O0, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        o0000Ooo o0000ooo = this.f42220OooO0Oo;
        o0o0o00.OooO0OO(false, o0000ooo);
        new Oooo0(o0o0o00.f42197OooO0o);
        o0O0O00.OooO00o(o0o0o00, Oooo0.f42105OooO0O0);
        if (!o0o0o00.f42194OooO0O0.OooO00o()) {
            return Tasks.forResult(null);
        }
        Executor executor = o0o0o00.f42198OooO0o0.f42223OooO00o;
        return ((o00000O0) o0000ooo).f42296OooO.get().getTask().onSuccessTask(executor, new o0ooOOo(this, executor, strOooO0o0));
    }
}
