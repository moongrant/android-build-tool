package p466o0OooO0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p186o00o00Oo.o0ooOOo;
import p361o0OOOoOo.o000Oo0;
import p649o0ooOOoo.kg;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements OooO0OO.OooO0O0, Continuation, o0ooOOo, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40488OooO0Oo;

    public /* synthetic */ o00000OO(Object obj) {
        this.f40488OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooO0oO(((OooOO0.OooO0O0) this.f40488OooO0Oo).f13238Oooo0o.f40565OooOO0O);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        KickRecordActivity this$0 = (KickRecordActivity) this.f40488OooO0Oo;
        int i = KickRecordActivity.f22842Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        kg kgVar = this$0.f22849Oooooo0;
        if (kgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            kgVar = null;
        }
        if (StringsKt.isBlank(kgVar.f49873OooO0O0.getSearchText())) {
            this$0.OooOooO(false);
        } else {
            this$0.OooOooo(false);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicRecommendFragment.m364initView$lambda6((MainMomentsTopicRecommendFragment) this.f40488OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f40488OooO0Oo;
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
