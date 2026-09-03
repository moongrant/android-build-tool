package o0O0OOOo;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements p301o0O0o0O.OooO0o {
    @Override // p301o0O0o0O.OooO0o
    public final Object get() {
        com.google.firebase.components.o0OoOo0<ScheduledExecutorService> o0oooo1 = ExecutorsRegistrar.f19382OooO00o;
        return Executors.newSingleThreadScheduledExecutor(new OooO00o("Firebase Scheduler", 0, null));
    }
}
