package p289o0O0Oo0;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p293o0O0OoO0.OooOOOO;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Boolean f41540OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo.OooO00o f41541OooO0O0;

    public o00Oo0(o00Ooo.OooO00o oooO00o, Boolean bool) {
        this.f41541OooO0O0 = oooO00o;
        this.f41540OooO00o = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        Boolean bool = this.f41540OooO00o;
        boolean zBooleanValue = bool.booleanValue();
        o00Ooo.OooO00o oooO00o = this.f41541OooO0O0;
        if (zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue2 = bool.booleanValue();
            o00000O0 o00000o1 = o00Ooo.this.f41545OooO0O0;
            if (!zBooleanValue2) {
                o00000o1.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            o00000o1.f41508OooO0o.trySetResult(null);
            Executor executor = o00Ooo.this.f41549OooO0o0.f41471OooO00o;
            return oooO00o.f41559OooO0Oo.onSuccessTask(executor, new o00O0O(this, executor));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        o00Ooo o00ooo2 = o00Ooo.this;
        Iterator it = OooOo00.OooO0o0(o00ooo2.f41550OooO0oO.f41695OooO0O0.listFiles(o00Ooo.f41542OooOOo0)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        o00Ooo o00ooo3 = o00Ooo.this;
        OooOo00 oooOo00 = o00ooo3.f41554OooOO0o.f41519OooO0O0.f41692OooO0O0;
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f41697OooO0Oo.listFiles()));
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f41699OooO0o0.listFiles()));
        OooOOOO.OooO00o(OooOo00.OooO0o0(oooOo00.f41698OooO0o.listFiles()));
        o00ooo3.f41558OooOOOo.trySetResult(null);
        return Tasks.forResult(null);
    }
}
