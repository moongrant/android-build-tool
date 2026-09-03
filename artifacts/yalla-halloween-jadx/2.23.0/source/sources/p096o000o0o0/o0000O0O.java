package p096o000o0o0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p093o000o0OO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0000O0O implements o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f35389OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f35390OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f35391OooO0OO = new OooO00o();

    public class OooO00o implements Executor {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            o0000O0O.this.f35390OooO0O0.post(runnable);
        }
    }

    public o0000O0O(@NonNull ExecutorService executorService) {
        this.f35389OooO00o = new oo0o0Oo(executorService);
    }

    public final void OooO00o(Runnable runnable) {
        this.f35389OooO00o.execute(runnable);
    }
}
