package p289o0O0Oo0;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment;
import o0OO0oO0.OooOOO0;
import p338o0OO0oOo.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Continuation, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41516OooO0Oo;

    public /* synthetic */ o000O(Object obj) {
        this.f41516OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(OooOOO0 oooOOO0) {
        MomentDetailGiftFragment.init$lambda$1((MomentDetailGiftFragment) this.f41516OooO0Oo, oooOOO0);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41516OooO0Oo;
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
