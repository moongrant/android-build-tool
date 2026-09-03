package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p413o0Oo0o0o.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f27003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f27004OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f27005OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f27006OooO0oO;

    public o00000O(int i, LottieAnimationView lottieAnimationView, PrivateChatAdapter privateChatAdapter, ChatMessage chatMessage) {
        this.f27003OooO0Oo = i;
        this.f27005OooO0o0 = lottieAnimationView;
        this.f27004OooO0o = privateChatAdapter;
        this.f27006OooO0oO = chatMessage;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = this.f27003OooO0Oo;
        if (i > 0) {
            int[] iArr = o0O00oO0.f46383OooO00o;
            int[] iArr2 = o0O00oO0.f46383OooO00o;
            if (i <= 6) {
                LottieAnimationView lottieAnimationView = this.f27005OooO0o0;
                lottieAnimationView.clearAnimation();
                lottieAnimationView.setImageResource(iArr2[i - 1]);
                Function1<? super ChatMessage, Unit> function1 = this.f27004OooO0o.f26974OooOo0O;
                if (function1 != null) {
                    function1.invoke(this.f27006OooO0oO);
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
