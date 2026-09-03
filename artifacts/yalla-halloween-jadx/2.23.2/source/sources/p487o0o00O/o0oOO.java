package p487o0o00O;

import android.view.animation.Animation;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48898OooO00o;

    public o0oOO(TaskActivity taskActivity) {
        this.f48898OooO00o = taskActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = TaskActivity.f25083OooOooO;
        TaskActivity taskActivity = this.f48898OooO00o;
        taskActivity.OooOo().f44333OooO0OO.setVisibility(8);
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
        int i = TaskActivity.f25083OooOooO;
        TaskActivity taskActivity = this.f48898OooO00o;
        ((TaskViewModel) taskActivity.f25091OooOoO0.getValue()).taskList(1).observe(taskActivity, new o000oOoO(o00OO0O0.f48818OooO0Oo, null, null, false, 14));
    }
}
