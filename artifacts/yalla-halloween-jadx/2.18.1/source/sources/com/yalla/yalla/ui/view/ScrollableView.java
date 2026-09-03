package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.OooOO0O;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.view.ScrollableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p601o0oo00Oo.o0OO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/ScrollableView;", "Landroid/widget/ScrollView;", "", "getNumber", "Landroid/widget/LinearLayout;", "Oooo0oO", "Lkotlin/Lazy;", "getLinearLayout", "()Landroid/widget/LinearLayout;", "linearLayout", "OoooO0O", "I", "getSmoothScrollDuration", "()I", "setSmoothScrollDuration", "(I)V", "smoothScrollDuration", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public abstract class ScrollableView extends ScrollView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f25124Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final List<View> f25125Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy linearLayout;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f25127Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public Scroller f25128OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f25129OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public int smoothScrollDuration;

    public static final class OooO00o extends Lambda implements Function0<LinearLayout> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f25131Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f25131Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            LinearLayout linearLayout = new LinearLayout(this.f25131Oooo0o);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            return linearLayout;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            ScrollableView.OooO0O0(ScrollableView.this, it);
            ScrollableView.this.f25125Oooo0o.add(it);
            ScrollableView.this.getLinearLayout().addView(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            ScrollableView.OooO0O0(ScrollableView.this, it);
            if (!Intrinsics.areEqual(it.getTag(), Integer.valueOf(ScrollableView.this.f25129OoooO00))) {
                ScrollableView.this.f25125Oooo0o.add(it);
            }
            ScrollableView.this.getLinearLayout().addView(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25135Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f25136Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Function0<Unit> function0) {
            super(1);
            this.f25135Oooo0oO = j;
            this.f25136Oooo0oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            final int measuredHeight = ScrollableView.this.getLinearLayout().getMeasuredHeight();
            LinearLayout linearLayout = ScrollableView.this.getLinearLayout();
            final long j = this.f25135Oooo0oO;
            final ScrollableView scrollableView = ScrollableView.this;
            final Function0<Unit> function0 = this.f25136Oooo0oo;
            linearLayout.postDelayed(new Runnable() { // from class: o0oo00Oo.o0OOO00
                @Override // java.lang.Runnable
                public final void run() {
                    long j2 = j;
                    ScrollableView this$0 = scrollableView;
                    int i = measuredHeight;
                    Function0 function1 = function0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    int smoothScrollDuration = j2 > 0 ? this$0.getSmoothScrollDuration() : 0;
                    this$0.f25128OoooO0.startScroll(this$0.getScrollX(), this$0.getScrollY(), 0 - this$0.getScrollX(), (i - this$0.f25127Oooo0oo) - this$0.getScrollY(), smoothScrollDuration);
                    this$0.invalidate();
                    this$0.getLinearLayout().postDelayed(new OooOO0O(this$0, function1, 1), ((long) smoothScrollDuration) + 100);
                }
            }, j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScrollableView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public static final void OooO0O0(ScrollableView scrollableView, View view) {
        if (scrollableView.f25127Oooo0oo == -1) {
            o0OO o0oo = new o0OO(scrollableView);
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.measure(0, 0);
            o0oo.invoke(view);
            scrollableView.setLayoutParams(new FrameLayout.LayoutParams(scrollableView.f25124Oooo, scrollableView.f25127Oooo0oo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getLinearLayout() {
        return (LinearLayout) this.linearLayout.getValue();
    }

    public final void OooO0OO(int i, Function1<? super View, Unit> function1) {
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            function1.invoke(OooO0Oo(i2, context));
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @NotNull
    public abstract View OooO0Oo(int i, @NotNull Context context);

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final void OooO0o0(@IntRange(from = ULong.MIN_VALUE, to = 9) int i, long j, boolean z, @Nullable Function0<Unit> function0) {
        if (z) {
            this.f25125Oooo0o.clear();
            getLinearLayout().removeAllViews();
        }
        this.f25129OoooO00 = i;
        OooO0OO(9, new OooO0O0());
        OooO0OO(this.f25129OoooO00, new OooO0OO());
        LinearLayout linearLayout = getLinearLayout();
        OooO0o oooO0o = new OooO0o(j, function0);
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.measure(0, 0);
        oooO0o.invoke(linearLayout);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        if (this.f25128OoooO0.computeScrollOffset()) {
            scrollTo(this.f25128OoooO0.getCurrX(), this.f25128OoooO0.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        super.fling(i / 4);
    }

    /* JADX INFO: renamed from: getNumber, reason: from getter */
    public final int getF25129OoooO00() {
        return this.f25129OoooO00;
    }

    public final int getSmoothScrollDuration() {
        return this.smoothScrollDuration;
    }

    public final void setSmoothScrollDuration(int i) {
        this.smoothScrollDuration = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25125Oooo0o = new ArrayList();
        this.linearLayout = LazyKt.lazy(new OooO00o(context));
        this.f25127Oooo0oo = -1;
        this.f25124Oooo = -1;
        removeAllViews();
        addView(getLinearLayout());
        this.f25128OoooO0 = new Scroller(context);
        this.smoothScrollDuration = 1000;
    }
}
