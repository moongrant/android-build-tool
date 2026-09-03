package p285o0O0OOoo;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import kotlin.jvm.internal.Intrinsics;
import p389o0OOoooO.o00O0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O000o implements Continuation, o00O0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f42186OooO0Oo;

    public /* synthetic */ o00O000o(Object obj) {
        this.f42186OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.o00O0OO
    public final void OooO00o(SmartRefreshLayout it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f42186OooO0Oo;
        int i = VoteHistoryActivity.f26766OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOoO0(true);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42186OooO0Oo;
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }
}
