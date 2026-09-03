package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.AnalyticsEvents;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o000OOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/app/base/view/CrossRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "slopConstant", "", "setScrollingTouchSlop", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CrossRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11944Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11945Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11946Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f11947Oooo0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f11946Oooo0oO = motionEvent.getPointerId(0);
            Intrinsics.checkNotNull(motionEvent);
            this.f11947Oooo0oo = (int) (motionEvent.getX() + 0.5f);
            this.f11944Oooo = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f11946Oooo0oO = motionEvent.getPointerId(actionIndex);
            this.f11947Oooo0oo = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f11944Oooo = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f11946Oooo0oO);
        if (iFindPointerIndex < 0) {
            return false;
        }
        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = x - this.f11947Oooo0oo;
        int i2 = y - this.f11944Oooo;
        RecyclerView.Oooo000 layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        RecyclerView.Oooo000 layoutManager2 = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        boolean zCanScrollVertically = layoutManager2.canScrollVertically();
        boolean z = zCanScrollHorizontally && Math.abs(i) > this.f11945Oooo0o && (Math.abs(i) >= Math.abs(i2) || zCanScrollVertically);
        if (zCanScrollVertically && Math.abs(i2) > this.f11945Oooo0o && (Math.abs(i2) >= Math.abs(i) || zCanScrollHorizontally)) {
            z = true;
        }
        return z && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        if (slopConstant == 0) {
            this.f11945Oooo0o = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            Method method = o000OOo.f28122OooO00o;
            this.f11945Oooo0o = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11946Oooo0oO = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.f11945Oooo0o = viewConfiguration.getScaledTouchSlop();
    }
}
