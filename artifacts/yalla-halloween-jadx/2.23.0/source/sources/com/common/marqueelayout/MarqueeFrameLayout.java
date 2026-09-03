package com.common.marqueelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/common/marqueelayout/MarqueeFrameLayout;", "Landroid/widget/HorizontalScrollView;", "", "time", "", "setAnimTime", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAnimationListener", "", "animDirection", "setAnimDirection", "Landroid/view/View;", "OooO0o0", "Lkotlin/Lazy;", "getTargetLayout", "()Landroid/view/View;", "targetLayout", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MarqueeLayout_release"}, k = 1, mv = {1, 4, 0})
public final class MarqueeFrameLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Function0<Unit> f10506OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public final Lazy targetLayout;

    public static final class OooO00o extends Lambda implements Function0<View> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return MarqueeFrameLayout.this.getChildAt(0);
        }
    }

    public MarqueeFrameLayout(@NotNull Context context) {
        super(context);
        this.targetLayout = LazyKt.lazy(new OooO00o());
        if (getChildCount() > 2) {
            throw new RuntimeException("轮播控件不允许有两个及以上子View！");
        }
        setHorizontalScrollBarEnabled(false);
    }

    private final View getTargetLayout() {
        return (View) this.targetLayout.getValue();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        return true;
    }

    public final void setAnimDirection(int animDirection) {
    }

    public final void setAnimTime(long time) {
    }

    public final void setAnimationListener(@NotNull Function0<Unit> listener) {
        this.f10506OooO0Oo = listener;
    }

    public MarqueeFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.targetLayout = LazyKt.lazy(new OooO00o());
        if (getChildCount() <= 2) {
            setHorizontalScrollBarEnabled(false);
            return;
        }
        throw new RuntimeException("轮播控件不允许有两个及以上子View！");
    }

    public MarqueeFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.targetLayout = LazyKt.lazy(new OooO00o());
        if (getChildCount() <= 2) {
            setHorizontalScrollBarEnabled(false);
            return;
        }
        throw new RuntimeException("轮播控件不允许有两个及以上子View！");
    }
}
