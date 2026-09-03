package o0O0OOOo;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements p301o0O0o0O.OooO0o {
    @Override // p301o0O0o0O.OooO0o
    public final Object get() {
        com.google.firebase.components.o0OoOo0<ScheduledExecutorService> o0oooo1 = ExecutorsRegistrar.f19382OooO00o;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new OooOOOO(Executors.newFixedThreadPool(4, new OooO00o("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f19385OooO0Oo.get());
    }
}
