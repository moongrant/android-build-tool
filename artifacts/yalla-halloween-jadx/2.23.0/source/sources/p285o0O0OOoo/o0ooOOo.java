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
public final class o0ooOOo implements SuccessContinuation<o000000, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Executor f42228OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f42229OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f42230OooO0o0;

    public o0ooOOo(o0OOO0o o0ooo0o2, Executor executor, String str) {
        this.f42229OooO0o = o0ooo0o2;
        this.f42228OooO0Oo = executor;
        this.f42230OooO0o0 = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable o000000 o000000Var) throws Exception {
        if (o000000Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        o0OOO0o o0ooo0o2 = this.f42229OooO0o;
        taskArr[0] = o0O0O00.OooO0O0(o0ooo0o2.f42221OooO0o);
        taskArr[1] = o0ooo0o2.f42221OooO0o.f42203OooOO0o.OooO0o0(o0ooo0o2.f42222OooO0o0 ? this.f42230OooO0o0 : null, this.f42228OooO0Oo);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
