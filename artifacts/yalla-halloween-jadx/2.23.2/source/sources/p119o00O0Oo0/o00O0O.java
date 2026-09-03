package p119o00O0Oo0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00O0OOO.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f36414OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f36415OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f36416OooO0OO = new OooO00o();

    public class OooO00o implements Executor {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            o00O0O.this.f36415OooO0O0.post(runnable);
        }
    }

    public o00O0O(@NonNull ExecutorService executorService) {
        this.f36414OooO00o = new oo000o(executorService);
    }

    public final void OooO00o(Runnable runnable) {
        this.f36414OooO00o.execute(runnable);
    }
}
