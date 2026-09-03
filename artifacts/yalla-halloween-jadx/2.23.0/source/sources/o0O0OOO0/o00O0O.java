package o0O0OOO0;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements p298o0O0o00o.OooO0OO {
    @Override // p298o0O0o00o.OooO0OO
    public final Object get() {
        com.google.firebase.components.o000oOoO<ScheduledExecutorService> o000oooo2 = ExecutorsRegistrar.f19854OooO00o;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new Oooo0(Executors.newFixedThreadPool(4, new OooO0O0("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f19857OooO0Oo.get());
    }
}
