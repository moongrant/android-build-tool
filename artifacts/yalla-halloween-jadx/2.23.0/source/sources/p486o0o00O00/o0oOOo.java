package p486o0o00O00;

import android.view.animation.Animation;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48400OooO00o;

    public o0oOOo(TaskActivity taskActivity) {
        this.f48400OooO00o = taskActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = TaskActivity.f25537OooOooO;
        TaskActivity taskActivity = this.f48400OooO00o;
        taskActivity.OooOo().f58639OooO0OO.setVisibility(8);
        taskActivity.OooOoO();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = TaskActivity.f25537OooOooO;
        TaskActivity taskActivity = this.f48400OooO00o;
        ((TaskViewModel) taskActivity.f25545OooOoO0.getValue()).taskList(1).observe(taskActivity, new o0000OO0(o00OO.f48313OooO0Oo, null, null, false, 14));
    }
}
