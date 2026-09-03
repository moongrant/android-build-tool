package o0O0OOO0;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements p298o0O0o00o.OooO0OO {
    @Override // p298o0O0o00o.OooO0OO
    public final Object get() {
        com.google.firebase.components.o000oOoO<ScheduledExecutorService> o000oooo2 = ExecutorsRegistrar.f19854OooO00o;
        return new Oooo0(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new OooO0O0("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f19857OooO0Oo.get());
    }
}
