package o0O0OOOo;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements p301o0O0o0O.OooO0o {
    @Override // p301o0O0o0O.OooO0o
    public final Object get() {
        com.google.firebase.components.o0OoOo0<ScheduledExecutorService> o0oooo1 = ExecutorsRegistrar.f19382OooO00o;
        return new OooOOOO(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new OooO00o("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f19385OooO0Oo.get());
    }
}
