package com.yalla.yalla.common.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.GraphResponse;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p417o0Oo0oOo.oO00OOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/yalla/yalla/common/ui/view/refresh/RefreshLayout;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "", "isRefresh", "", "setLoadSuccess", GraphResponse.SUCCESS_KEY, "setLoadComplete", "", "noMoreText", "setNoMoreText", "Lcom/yalla/yalla/common/ui/view/refresh/RefreshView;", "o000O0Oo", "Lcom/yalla/yalla/common/ui/view/refresh/RefreshView;", "getRefreshView", "()Lcom/yalla/yalla/common/ui/view/refresh/RefreshView;", "setRefreshView", "(Lcom/yalla/yalla/common/ui/view/refresh/RefreshView;)V", "refreshView", "Lcom/yalla/yalla/common/ui/view/refresh/LoadMoreView;", "o000OO0O", "Lcom/yalla/yalla/common/ui/view/refresh/LoadMoreView;", "getLoadMoreView", "()Lcom/yalla/yalla/common/ui/view/refresh/LoadMoreView;", "setLoadMoreView", "(Lcom/yalla/yalla/common/ui/view/refresh/LoadMoreView;)V", "loadMoreView", "Lkotlin/Function0;", "o000O0O0", "Lkotlin/jvm/functions/Function0;", "getDoOnTouchDown", "()Lkotlin/jvm/functions/Function0;", "setDoOnTouchDown", "(Lkotlin/jvm/functions/Function0;)V", "doOnTouchDown", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class RefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> doOnTouchDown;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public RefreshView refreshView;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoadMoreView loadMoreView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final oO000Oo Oooo0(@Nullable oO00OO0O oo00oo0o) {
        this.f19506o00000Oo = oo00oo0o;
        this.f19542o00Oo0 = this.f19542o00Oo0 || !this.f19499o00000;
        OooOoOO(true);
        return this;
    }

    public final void Oooo00o(boolean z, boolean z2, boolean z3) {
        if (z) {
            OooOo00(z2);
        } else {
            OooOOo0(z2);
        }
        if (z && z2 && !z3) {
            OooOoOO(true);
        }
        OooOooO(z3);
    }

    @NotNull
    public final oO000Oo Oooo0O0(@Nullable oO00OOO oo00ooo) {
        this.f19505o00000OO = oo00ooo;
        this.f19541o00O0O = true;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent e) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(e, "e");
        if (e.getAction() == 0 && (function0 = this.doOnTouchDown) != null) {
            function0.invoke();
        }
        return super.dispatchTouchEvent(e);
    }

    @Nullable
    public final Function0<Unit> getDoOnTouchDown() {
        return this.doOnTouchDown;
    }

    @NotNull
    public final LoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    @NotNull
    public final RefreshView getRefreshView() {
        return this.refreshView;
    }

    public final void setDoOnTouchDown(@Nullable Function0<Unit> function0) {
        this.doOnTouchDown = function0;
    }

    public final void setLoadComplete(boolean success) {
        if (getState() == RefreshState.Refreshing) {
            OooOo00(success);
        }
    }

    public final void setLoadMoreView(@NotNull LoadMoreView loadMoreView) {
        Intrinsics.checkNotNullParameter(loadMoreView, "<set-?>");
        this.loadMoreView = loadMoreView;
    }

    public final void setLoadSuccess(boolean isRefresh) {
        if (isRefresh) {
            OooOo00(true);
        }
    }

    public final void setNoMoreText(@NotNull String noMoreText) {
        Intrinsics.checkNotNullParameter(noMoreText, "noMoreText");
    }

    public final void setRefreshView(@NotNull RefreshView refreshView) {
        Intrinsics.checkNotNullParameter(refreshView, "<set-?>");
        this.refreshView = refreshView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.refreshView = new RefreshView(context, null, 0, 6, null);
        this.loadMoreView = new LoadMoreView(context, null, 0, 6, null);
        setTag("close egg");
        Oooo000(this.refreshView);
        OooOoo(2.5f);
        OooOooo(this.loadMoreView);
        OooOoo0(3.0f);
        this.f19541o00O0O = false;
        OooOoOO(false);
        this.f19537o000OOo = true;
        this.f19500o000000 = true;
        this.f19479OoooO0 = 500;
        this.f19551o0Oo0oo = true;
        this.f19554o0ooOOo = true;
        this.f19553o0ooOO0 = true;
        this.f19555o0ooOoO = false;
        this.f19546o00oO0o = true;
    }
}
