package p289o0O0Oo0;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p292o0O0OoO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements SuccessContinuation<o0OoOo0, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Executor f41538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f41539OooO0o0;

    public o00O0O(o00Oo0 o00oo1, Executor executor) {
        this.f41539OooO0o0 = o00oo1;
        this.f41538OooO0Oo = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable o0OoOo0 o0oooo1) throws Exception {
        if (o0oooo1 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o00Oo0 o00oo1 = this.f41539OooO0o0;
        o00Ooo.OooO0O0(o00Ooo.this);
        o00Ooo.OooO00o oooO00o = o00oo1.f41541OooO0O0;
        o00Ooo.this.f41554OooOO0o.OooO0o0(null, this.f41538OooO0Oo);
        o00Ooo.this.f41558OooOOOo.trySetResult(null);
        return Tasks.forResult(null);
    }
}
