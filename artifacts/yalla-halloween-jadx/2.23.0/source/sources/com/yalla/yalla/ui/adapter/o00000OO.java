package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f27471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f27472OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f27473OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f27474OooO0oO;

    public o00000OO(int i, LottieAnimationView lottieAnimationView, PrivateChatAdapter privateChatAdapter, ChatMessage chatMessage) {
        this.f27471OooO0Oo = i;
        this.f27473OooO0o0 = lottieAnimationView;
        this.f27472OooO0o = privateChatAdapter;
        this.f27474OooO0oO = chatMessage;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = this.f27471OooO0Oo;
        if (i > 0) {
            int[] iArr = p407o0Oo0o00.OooO0o.f45167OooO00o;
            int[] iArr2 = p407o0Oo0o00.OooO0o.f45168OooO0O0;
            if (i <= 3) {
                LottieAnimationView lottieAnimationView = this.f27473OooO0o0;
                lottieAnimationView.clearAnimation();
                lottieAnimationView.setImageResource(iArr2[i - 1]);
                Function1<? super ChatMessage, Unit> function1 = this.f27472OooO0o.f27439OooOo0O;
                if (function1 != null) {
                    function1.invoke(this.f27474OooO0oO);
                }
            }
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
