package p535o0o0OOoO;

import android.view.animation.Animation;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ooooO0O0 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43737OooO00o;

    public ooooO0O0(TaskActivity taskActivity) {
        this.f43737OooO00o = taskActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        TaskActivity taskActivity = this.f43737OooO00o;
        TaskActivity.OooO00o oooO00o = TaskActivity.f22061o00Oo0;
        taskActivity.OooOooO().f49074OooO0OO.setVisibility(8);
        this.f43737OooO00o.Oooo00o();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        TaskActivity taskActivity = this.f43737OooO00o;
        TaskActivity.OooO00o oooO00o = TaskActivity.f22061o00Oo0;
        taskActivity.Oooo00O().taskList(1).observe(taskActivity, new OooOo(oOO0.f43675Oooo0o, null, null, false, 14));
    }
}
