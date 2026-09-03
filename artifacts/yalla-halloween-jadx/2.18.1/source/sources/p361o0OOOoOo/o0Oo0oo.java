package p361o0OOOoOo;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o0OOo000.OooO;
import o0OOo000.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Boolean f38513OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO00O.OooO00o f38514OooO0O0;

    public o0Oo0oo(o0OO00O.OooO00o oooO00o, Boolean bool) {
        this.f38514OooO0O0 = oooO00o;
        this.f38513OooO00o = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        if (this.f38513OooO00o.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = this.f38513OooO00o.booleanValue();
            o0000O00 o0000o00 = o0OO00O.this.f38496OooO0O0;
            Objects.requireNonNull(o0000o00);
            if (!zBooleanValue) {
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            o0000o00.f38453OooO0o.trySetResult(null);
            o0OO00O.OooO00o oooO00o = this.f38514OooO0O0;
            Executor executor = o0OO00O.this.f38498OooO0Oo.f38479OooO00o;
            return oooO00o.f38509OooO00o.onSuccessTask(executor, new o0OOO0o(this, executor));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        OooOO0 oooOO1 = o0OO00O.this.f38499OooO0o;
        Iterator it = OooOO0.OooOO0(oooOO1.f38617OooO0O0.listFiles(o00Oo0.f38484OooO00o)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        OooO oooO = o0OO00O.this.f38504OooOO0O.f38461OooO0O0;
        oooO.OooO00o(oooO.f38610OooO0O0.OooO0o0());
        oooO.OooO00o(oooO.f38610OooO0O0.OooO0Oo());
        oooO.OooO00o(oooO.f38610OooO0O0.OooO0OO());
        o0OO00O.this.f38508OooOOOO.trySetResult(null);
        return Tasks.forResult(null);
    }
}
