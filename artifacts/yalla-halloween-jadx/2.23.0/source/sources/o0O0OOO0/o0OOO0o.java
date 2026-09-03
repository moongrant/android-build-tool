package o0O0OOO0;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o implements com.google.firebase.components.OooO {
    @Override // com.google.firebase.components.OooO
    public final Object OooO0OO(com.google.firebase.components.oo000o oo000oVar) {
        com.google.firebase.components.o000oOoO<ScheduledExecutorService> o000oooo2 = ExecutorsRegistrar.f19854OooO00o;
        return UiExecutor.INSTANCE;
    }
}
