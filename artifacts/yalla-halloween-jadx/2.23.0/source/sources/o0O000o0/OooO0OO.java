package o0O000o0;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import o0OO0o.OooOOO0;
import p285o0O0OOoo.o00O00;
import p389o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements Continuation, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41665OooO0Oo;

    public /* synthetic */ OooO0OO(Object obj) {
        this.f41665OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(OooOOO0 it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f41665OooO0Oo;
        int i = VoteHistoryActivity.f26766OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOoO0(false);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41665OooO0Oo;
        ExecutorService executorService = o00O00.f42181OooO00o;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }
}
