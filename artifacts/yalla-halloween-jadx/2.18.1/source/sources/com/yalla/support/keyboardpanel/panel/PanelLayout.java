package com.yalla.support.keyboardpanel.panel;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471o0Oooo0o.o0O0o00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010\f\u001a\u00020\n26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006 "}, d2 = {"Lcom/yalla/support/keyboardpanel/panel/PanelLayout;", "Landroid/widget/FrameLayout;", "Lo0Oooo0o/o0O0o00O;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "show", "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnKeyBoardPanelShowDelayListener", "Landroid/view/View;", "getPanelView", "Oooo0o", "Z", "isInvisibleChild", "()Z", "setInvisibleChild", "(Z)V", "Oooo0oO", "getEnableChangeAnim", "setEnableChangeAnim", "enableChangeAnim", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "KeyboardPanel_release"}, k = 1, mv = {1, 4, 0})
public final class PanelLayout extends FrameLayout implements o0O0o00O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f20524Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public boolean isInvisibleChild;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public boolean enableChangeAnim;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Function2<? super Boolean, ? super Integer, Unit> f20527Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Interpolator f20528OoooO00;

    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f20530Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f20531Oooo0oo;

        public OooO00o(boolean z, int i) {
            this.f20530Oooo0oO = z;
            this.f20531Oooo0oo = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            Function2<? super Boolean, ? super Integer, Unit> function2 = PanelLayout.this.f20527Oooo0oo;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(this.f20530Oooo0oO), Integer.valueOf(this.f20531Oooo0oo));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public static final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            ViewGroup.LayoutParams layoutParams = PanelLayout.this.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Object animatedValue = it.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            PanelLayout.this.requestLayout();
        }
    }

    @JvmOverloads
    public PanelLayout(@NotNull Context context) {
        this(context, null, 0);
    }

    @Override // p471o0Oooo0o.o0O0o00O
    public final void OooO00o(int i) {
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        if (this.isInvisibleChild) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
        } else {
            setVisibility(4);
        }
        this.f20528OoooO00 = new DecelerateInterpolator();
        this.f20524Oooo = 150L;
        OooO0Oo(i, true);
    }

    @Override // p471o0Oooo0o.o0O0o00O
    public final void OooO0O0(int i) {
        setVisibility(0);
        if (this.isInvisibleChild) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(0);
                }
            }
        }
        this.f20524Oooo = 200L;
        this.f20528OoooO00 = new AccelerateDecelerateInterpolator();
        OooO0Oo(i, true);
    }

    @Override // p471o0Oooo0o.o0O0o00O
    public final void OooO0OO() {
        OooO0Oo(0, false);
    }

    public final void OooO0Oo(int i, boolean z) {
        if (!this.enableChangeAnim) {
            getLayoutParams().height = i;
            requestLayout();
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(getLayoutParams().height, i);
        valueAnimator.setDuration(this.f20524Oooo);
        valueAnimator.setInterpolator(this.f20528OoooO00);
        valueAnimator.addUpdateListener(new OooO0O0());
        valueAnimator.addListener(new OooO00o(z, i));
        valueAnimator.start();
    }

    public final boolean getEnableChangeAnim() {
        return this.enableChangeAnim;
    }

    @Override // p471o0Oooo0o.o0O0o00O
    @NotNull
    public View getPanelView() {
        return this;
    }

    public final void setEnableChangeAnim(boolean z) {
        this.enableChangeAnim = z;
    }

    public final void setInvisibleChild(boolean z) {
        this.isInvisibleChild = z;
    }

    public void setOnKeyBoardPanelShowDelayListener(@NotNull Function2<? super Boolean, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20527Oooo0oo = listener;
    }

    @JvmOverloads
    public PanelLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PanelLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isInvisibleChild = true;
        this.enableChangeAnim = true;
        this.f20524Oooo = 300L;
        this.f20528OoooO00 = new AccelerateDecelerateInterpolator();
    }
}
