package p289o0O0Oo0;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p292o0O0OoO.o00Ooo;
import p292o0O0OoO.o0ooOOo;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f41532OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Throwable f41533OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Thread f41534OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f41535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41536OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f41537OooO0o0 = false;

    public o000oOoO(o00Ooo o00ooo2, long j, Throwable th, Thread thread, o0ooOOo o0ooooo) {
        this.f41536OooO0o = o00ooo2;
        this.f41532OooO00o = j;
        this.f41533OooO0O0 = th;
        this.f41534OooO0OO = thread;
        this.f41535OooO0Oo = o0ooooo;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        long j = this.f41532OooO00o;
        long j2 = j / 1000;
        o00Ooo o00ooo2 = this.f41536OooO0o;
        String strOooO0o0 = o00ooo2.OooO0o0();
        if (strOooO0o0 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        o00ooo2.f41546OooO0OO.OooO00o();
        Throwable th = this.f41533OooO0O0;
        Thread thread = this.f41534OooO0OO;
        o000O00 o000o01 = o00ooo2.f41554OooOO0o;
        o000o01.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strOooO0o0);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o000o01.OooO0Oo(th, thread, strOooO0o0, AppMeasurement.CRASH_ORIGIN, j2, true);
        try {
            OooOo00 oooOo00 = o00ooo2.f41550OooO0oO;
            String str = ".ae" + j;
            oooOo00.getClass();
            if (!new File(oooOo00.f41695OooO0O0, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        o0ooOOo o0ooooo = this.f41535OooO0Oo;
        o00ooo2.OooO0OO(false, o0ooooo);
        new OooOO0(o00ooo2.f41548OooO0o);
        o00Ooo.OooO00o(o00ooo2, OooOO0.f41467OooO0O0);
        if (!o00ooo2.f41545OooO0O0.OooO00o()) {
            return Tasks.forResult(null);
        }
        Executor executor = o00ooo2.f41549OooO0o0.f41471OooO00o;
        return ((o00Ooo) o0ooooo).f41657OooO.get().getTask().onSuccessTask(executor, new Oooo0(this, executor, strOooO0o0));
    }
}
