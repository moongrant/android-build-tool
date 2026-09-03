package p466o0OooO0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p361o0OOOoOo.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements OooO0OO.OooO0O0, Continuation, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40486OooO0Oo;

    public /* synthetic */ o00000O(Object obj) {
        this.f40486OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) this.f40486OooO0Oo;
        oooO00o.Oooo0OO(oooO0O0.f13238Oooo0o.f40564OooOO0, oooO0O0.f13257o000oOoO);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicRecommendFragment.m363initView$lambda5((MainMomentsTopicRecommendFragment) this.f40486OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f40486OooO0Oo;
        ExecutorService executorService = o000Oo0.f38478OooO00o;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
