package p361o0OOOoOo;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p366o0OOo00O.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements SuccessContinuation<OooO, Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Executor f38511OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f38512OooO0O0;

    public o0OOO0o(o0Oo0oo o0oo0oo2, Executor executor) {
        this.f38512OooO0O0 = o0oo0oo2;
        this.f38511OooO00o = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable OooO oooO) throws Exception {
        if (oooO == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0OO00O.OooO0O0(o0OO00O.this);
        o0OO00O.this.f38504OooOO0O.OooO0Oo(this.f38511OooO00o, null);
        o0OO00O.this.f38508OooOOOO.trySetResult(null);
        return Tasks.forResult(null);
    }
}
