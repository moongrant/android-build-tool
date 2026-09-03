package p304o0O0o0oO;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.OooOo00;
import java.util.concurrent.Executor;
import p281o0O0O0oO.OooOO0;
import p281o0O0O0oO.OooOOO;
import p305o0O0o0oo.o00Oo0;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 {
    public Oooo0(OooOO0 oooOO1, @Nullable OooOOO oooOOO, Executor executor) {
        oooOO1.OooO00o();
        Context context = oooOO1.f41949OooO00o;
        o0Oo0oo o0oo0ooOooO0o0 = o0Oo0oo.OooO0o0();
        o0oo0ooOooO0o0.getClass();
        o0Oo0oo.f42679OooO0Oo.f42478OooO0O0 = OooOo00.OooO00o(context);
        o0oo0ooOooO0o0.f42683OooO0OO.OooO0O0(context);
        o00Oo0 o00oo0OooO00o = o00Oo0.OooO00o();
        synchronized (o00oo0OooO00o) {
            if (!o00oo0OooO00o.f42435OooOOoo) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(o00oo0OooO00o);
                    o00oo0OooO00o.f42435OooOOoo = true;
                }
            }
        }
        o00oo0OooO00o.OooO0OO(new o0OoOo0());
        if (oooOOO != null) {
            AppStartTrace appStartTraceOooO0O0 = AppStartTrace.OooO0O0();
            appStartTraceOooO0O0.OooO0o(context);
            executor.execute(new AppStartTrace.OooO0O0(appStartTraceOooO0O0));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
