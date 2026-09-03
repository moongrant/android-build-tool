package o0O0OOO0;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Ooo implements p298o0O0o00o.OooO0OO {
    @Override // p298o0O0o00o.OooO0OO
    public final Object get() {
        com.google.firebase.components.o000oOoO<ScheduledExecutorService> o000oooo2 = ExecutorsRegistrar.f19854OooO00o;
        return new Oooo0(Executors.newCachedThreadPool(new OooO0O0("Firebase Blocking", 11, null)), ExecutorsRegistrar.f19857OooO0Oo.get());
    }
}
