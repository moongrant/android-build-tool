package p285o0O0OOoo;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p291o0O0OoO0.o000000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements SuccessContinuation<o000000, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Executor f42215OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f42216OooO0o0;

    public o0OO00O(oo0o0Oo oo0o0oo, Executor executor) {
        this.f42216OooO0o0 = oo0o0oo;
        this.f42215OooO0Oo = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable o000000 o000000Var) throws Exception {
        if (o000000Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        oo0o0Oo oo0o0oo = this.f42216OooO0o0;
        o0O0O00.OooO0O0(o0O0O00.this);
        o0O0O00.OooO00o oooO00o = oo0o0oo.f42232OooO0O0;
        o0O0O00.this.f42203OooOO0o.OooO0o0(null, this.f42215OooO0Oo);
        o0O0O00.this.f42207OooOOOo.trySetResult(null);
        return Tasks.forResult(null);
    }
}
