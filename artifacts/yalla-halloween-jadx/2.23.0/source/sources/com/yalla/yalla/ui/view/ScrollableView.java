package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.j2;
import p539o0o0OoOO.k2;
import p539o0o0OoOO.n2;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/ScrollableView;", "Landroid/widget/ScrollView;", "", "getNumber", "Landroid/widget/LinearLayout;", "OooO0o0", "Lkotlin/Lazy;", "getLinearLayout", "()Landroid/widget/LinearLayout;", "linearLayout", "OooOO0", "I", "getSmoothScrollDuration", "()I", "setSmoothScrollDuration", "(I)V", "smoothScrollDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public abstract class ScrollableView extends ScrollView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Scroller f30604OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f30605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f30606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy linearLayout;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f30608OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30609OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    public int smoothScrollDuration;

    public static final class OooO00o extends Lambda implements Function0<LinearLayout> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30611OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f30611OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout linearLayout = new LinearLayout(this.f30611OooO0Oo);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            return linearLayout;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getLinearLayout() {
        return (LinearLayout) this.linearLayout.getValue();
    }

    @NotNull
    public abstract NumberView OooO0O0(int i, @NotNull Context context);

    public final void OooO0OO(long j, @Nullable Function0 function0, boolean z, @IntRange(from = ULong.MIN_VALUE, to = 9) int i) {
        if (z) {
            this.f30605OooO0Oo.clear();
            getLinearLayout().removeAllViews();
        }
        this.f30609OooO0oo = i;
        j2 j2Var = new j2(this);
        int i2 = 0;
        while (true) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            j2Var.invoke(OooO0O0(i2, context));
            if (i2 == 9) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = this.f30609OooO0oo;
        k2 k2Var = new k2(this);
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                k2Var.invoke(OooO0O0(i4, context2));
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        LinearLayout linearLayout = getLinearLayout();
        n2 n2Var = new n2(this, j, function0);
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.measure(0, 0);
        n2Var.invoke(linearLayout);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        Scroller scroller = this.f30604OooO;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        super.fling(i / 4);
    }

    /* JADX INFO: renamed from: getNumber, reason: from getter */
    public final int getF30609OooO0oo() {
        return this.f30609OooO0oo;
    }

    public final int getSmoothScrollDuration() {
        return this.smoothScrollDuration;
    }

    public final void setSmoothScrollDuration(int i) {
        this.smoothScrollDuration = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScrollableView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30605OooO0Oo = new ArrayList();
        this.linearLayout = LazyKt.lazy(new OooO00o(context));
        this.f30606OooO0o = -1;
        this.f30608OooO0oO = -1;
        removeAllViews();
        addView(getLinearLayout());
        this.f30604OooO = new Scroller(context);
        this.smoothScrollDuration = 1000;
    }
}
