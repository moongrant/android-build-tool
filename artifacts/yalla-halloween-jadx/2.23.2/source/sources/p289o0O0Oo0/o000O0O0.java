package p289o0O0Oo0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.internal.OooOO0O;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0O0 implements Continuation, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41523OooO0Oo;

    public /* synthetic */ o000O0O0(Object obj) {
        this.f41523OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f41523OooO0Oo;
        int i2 = UserInfoTagActivity.f26868Oooo0O0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f26885Oooo00o) {
            this$0.f26885Oooo00o = false;
            view.postDelayed(new OooOO0O(this$0, 1), 500L);
            this$0.OooOooO(i);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41523OooO0Oo;
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
