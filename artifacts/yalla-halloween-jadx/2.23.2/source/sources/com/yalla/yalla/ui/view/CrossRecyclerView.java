package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o000O00;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.AnalyticsEvents;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/CrossRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "slopConstant", "", "setScrollingTouchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class CrossRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f29827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f29828OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f29829OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f29830OooO0oO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f29829OooO0o0 = motionEvent.getPointerId(0);
            Intrinsics.checkNotNull(motionEvent);
            this.f29828OooO0o = (int) (motionEvent.getX() + 0.5f);
            this.f29830OooO0oO = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f29829OooO0o0 = motionEvent.getPointerId(actionIndex);
            this.f29828OooO0o = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f29830OooO0oO = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f29829OooO0o0);
        if (iFindPointerIndex < 0) {
            return false;
        }
        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = x - this.f29828OooO0o;
        int i2 = y - this.f29830OooO0oO;
        RecyclerView.Oooo000 layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        RecyclerView.Oooo000 layoutManager2 = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        boolean zCanScrollVertically = layoutManager2.canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f29827OooO0Oo && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f29827OooO0Oo && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(...)");
        if (slopConstant == 0) {
            this.f29827OooO0Oo = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            Method method = o000O00.f5447OooO00o;
            this.f29827OooO0Oo = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CrossRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29829OooO0o0 = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(...)");
        this.f29827OooO0Oo = viewConfiguration.getScaledTouchSlop();
    }
}
