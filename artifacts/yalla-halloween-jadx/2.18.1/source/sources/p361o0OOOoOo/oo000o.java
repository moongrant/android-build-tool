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
public final class oo000o implements SuccessContinuation<OooO, Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Executor f38516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f38517OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f38518OooO0OO;

    public oo000o(o00oO0o o00oo0o2, Executor executor, String str) {
        this.f38518OooO0OO = o00oo0o2;
        this.f38516OooO00o = executor;
        this.f38517OooO0O0 = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable OooO oooO) throws Exception {
        if (oooO == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = o0OO00O.OooO0O0(this.f38518OooO0OO.f38490OooO0o);
        o00oO0o o00oo0o2 = this.f38518OooO0OO;
        taskArr[1] = o00oo0o2.f38490OooO0o.f38504OooOO0O.OooO0Oo(this.f38516OooO00o, o00oo0o2.f38491OooO0o0 ? this.f38517OooO0O0 : null);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
