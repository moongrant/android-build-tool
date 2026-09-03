package com.yalla.support.keyboardpanel.panel;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372o0OOo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010\f\u001a\u00020\n26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006 "}, d2 = {"Lcom/yalla/support/keyboardpanel/panel/PanelLayout;", "Landroid/widget/FrameLayout;", "Lo0OOo0oo/o0Oo0oo;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "show", "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnKeyBoardPanelShowDelayListener", "Landroid/view/View;", "getPanelView", "OooO0Oo", "Z", "isInvisibleChild", "()Z", "setInvisibleChild", "(Z)V", "OooO0o0", "getEnableChangeAnim", "setEnableChangeAnim", "enableChangeAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "KeyboardPanel_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPanelLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelLayout.kt\ncom/yalla/support/keyboardpanel/panel/PanelLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,95:1\n302#2:96\n32#3:97\n95#3,14:98\n*S KotlinDebug\n*F\n+ 1 PanelLayout.kt\ncom/yalla/support/keyboardpanel/panel/PanelLayout\n*L\n33#1:96\n84#1:97\n84#1:98,14\n*E\n"})
public final class PanelLayout extends FrameLayout implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f22165OooO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    public boolean isInvisibleChild;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f22167OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public boolean enableChangeAnim;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f22169OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public BaseInterpolator f22170OooO0oo;

    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 PanelLayout.kt\ncom/yalla/support/keyboardpanel/panel/PanelLayout\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n85#3,3:138\n98#4:141\n97#5:142\n*E\n"})
    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f22172OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f22173OooO0o0;

        public OooO00o(boolean z, int i) {
            this.f22173OooO0o0 = z;
            this.f22172OooO0o = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Function2<? super Boolean, ? super Integer, Unit> function2 = PanelLayout.this.f22167OooO0o;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(this.f22173OooO0o0), Integer.valueOf(this.f22172OooO0o));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PanelLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p372o0OOo0oo.o0Oo0oo
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
        this.f22170OooO0oo = new DecelerateInterpolator();
        this.f22169OooO0oO = 150L;
        OooO0Oo(i, true);
    }

    @Override // p372o0OOo0oo.o0Oo0oo
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
        this.f22169OooO0oO = 200L;
        this.f22170OooO0oo = new AccelerateDecelerateInterpolator();
        OooO0Oo(i, true);
    }

    @Override // p372o0OOo0oo.o0Oo0oo
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
        valueAnimator.setDuration(this.f22169OooO0oO);
        valueAnimator.setInterpolator(this.f22170OooO0oo);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OOo0oo.o0OO00O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i2 = PanelLayout.f22165OooO;
                PanelLayout this$0 = this.f43188OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ViewGroup.LayoutParams layoutParams = this$0.getLayoutParams();
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                this$0.requestLayout();
            }
        });
        valueAnimator.addListener(new OooO00o(z, i));
        valueAnimator.start();
    }

    public final boolean getEnableChangeAnim() {
        return this.enableChangeAnim;
    }

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
        this.f22167OooO0o = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PanelLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PanelLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PanelLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isInvisibleChild = true;
        this.enableChangeAnim = true;
        this.f22169OooO0oO = 300L;
        this.f22170OooO0oo = new AccelerateDecelerateInterpolator();
    }
}
