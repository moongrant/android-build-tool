package p285o0O0OOoo;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p286o0O0Oo.OooOOOO;
import p286o0O0Oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Boolean f42231OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o f42232OooO0O0;

    public oo0o0Oo(o0O0O00.OooO00o oooO00o, Boolean bool) {
        this.f42232OooO0O0 = oooO00o;
        this.f42231OooO00o = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        Boolean bool = this.f42231OooO00o;
        boolean zBooleanValue = bool.booleanValue();
        o0O0O00.OooO00o oooO00o = this.f42232OooO0O0;
        if (zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue2 = bool.booleanValue();
            o000OO o000oo2 = o0O0O00.this.f42194OooO0O0;
            if (!zBooleanValue2) {
                o000oo2.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            o000oo2.f42173OooO0o.trySetResult(null);
            Executor executor = o0O0O00.this.f42198OooO0o0.f42223OooO00o;
            return oooO00o.f42208OooO0Oo.onSuccessTask(executor, new o0OO00O(this, executor));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        o0O0O00 o0o0o00 = o0O0O00.this;
        Iterator it = OooOo00.OooO0o0(o0o0o00.f42199OooO0oO.f42242OooO0O0.listFiles(o0O0O00.f42191OooOOo0)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        o0O0O00 o0o0o01 = o0O0O00.this;
        OooOo00 oooOo00 = o0o0o01.f42203OooOO0o.f42211OooO0O0.f42239OooO0O0;
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f42244OooO0Oo.listFiles()));
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f42246OooO0o0.listFiles()));
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f42245OooO0o.listFiles()));
        o0o0o01.f42207OooOOOo.trySetResult(null);
        return Tasks.forResult(null);
    }
}
