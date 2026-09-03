package p321o0O0oo0O;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.OooOOO;
import java.util.concurrent.Executor;
import p309o0O0oO0.o000OOo0;
import p626o0ooO.o0O0O00;
import p626o0ooO.o0OOO0o;
import p678oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {
    public o000000O(o0OOO0o o0ooo0o2, @Nullable o0O0O00 o0o0o00, Executor executor) {
        o0ooo0o2.OooO00o();
        Context context = o0ooo0o2.f57662OooO00o;
        o000OOo0 o000ooo0OooO0o0 = o000OOo0.OooO0o0();
        o000ooo0OooO0o0.getClass();
        o000OOo0.f41783OooO0Oo.f41826OooO0O0 = OooOOO.OooO00o(context);
        o000ooo0OooO0o0.f41787OooO0OO.OooO0O0(context);
        oo0o0Oo oo0o0ooOooO00o = oo0o0Oo.OooO00o();
        synchronized (oo0o0ooOooO00o) {
            if (!oo0o0ooOooO00o.f60392OooOOoo) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(oo0o0ooOooO00o);
                    oo0o0ooOooO00o.f60392OooOOoo = true;
                }
            }
        }
        oo0o0ooOooO00o.OooO0OO(new o00000O0());
        if (o0o0o00 != null) {
            AppStartTrace appStartTraceOooO0O0 = AppStartTrace.OooO0O0();
            appStartTraceOooO0O0.OooO0o(context);
            executor.execute(new AppStartTrace.OooO0O0(appStartTraceOooO0O0));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
