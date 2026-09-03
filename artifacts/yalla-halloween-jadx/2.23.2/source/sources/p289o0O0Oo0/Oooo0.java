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
public final class Oooo0 implements SuccessContinuation<o0OoOo0, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Executor f41477OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f41478OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f41479OooO0o0;

    public Oooo0(o000oOoO o000oooo2, Executor executor, String str) {
        this.f41478OooO0o = o000oooo2;
        this.f41477OooO0Oo = executor;
        this.f41479OooO0o0 = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable o0OoOo0 o0oooo1) throws Exception {
        if (o0oooo1 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        o000oOoO o000oooo2 = this.f41478OooO0o;
        taskArr[0] = o00Ooo.OooO0O0(o000oooo2.f41536OooO0o);
        taskArr[1] = o000oooo2.f41536OooO0o.f41554OooOO0o.OooO0o0(o000oooo2.f41537OooO0o0 ? this.f41479OooO0o0 : null, this.f41477OooO0Oo);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
