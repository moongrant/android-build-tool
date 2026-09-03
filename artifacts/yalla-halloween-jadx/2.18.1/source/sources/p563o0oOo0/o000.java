package p563o0oOo0;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f44959Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44960Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f44961Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f44962Oooo0oo;

    public o000(int i, PrivateChatAdapter privateChatAdapter, LottieAnimationView lottieAnimationView, ChatMessage chatMessage) {
        this.f44960Oooo0o = i;
        this.f44961Oooo0oO = privateChatAdapter;
        this.f44962Oooo0oo = lottieAnimationView;
        this.f44959Oooo = chatMessage;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = this.f44960Oooo0o;
        if (i <= 0 || i > this.f44961Oooo0oO.f23646OooOoO0.length) {
            return;
        }
        this.f44962Oooo0oo.clearAnimation();
        this.f44962Oooo0oo.setImageResource(this.f44961Oooo0oO.f23646OooOoO0[this.f44960Oooo0o - 1]);
        Function1<? super ChatMessage, Unit> function1 = this.f44961Oooo0oO.f23643OooOo0O;
        if (function1 != null) {
            function1.invoke(this.f44959Oooo);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
