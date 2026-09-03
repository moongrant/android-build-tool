package o00O000;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import p326o0O0ooO.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 implements o00O000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00OO f30114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f30115OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f30116OooO0OO = new OooO00o();

    public class OooO00o implements Executor {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            OooO0O0.this.f30115OooO0O0.post(runnable);
        }
    }

    public OooO0O0(@NonNull Executor executor) {
        this.f30114OooO00o = new o00O00OO(executor);
    }

    public final void OooO00o(Runnable runnable) {
        this.f30114OooO00o.execute(runnable);
    }
}
