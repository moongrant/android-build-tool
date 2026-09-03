package com.yalla.yalla.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.GraphResponse;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p338o0OO0oOo.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/view/refresh/RefreshLayout;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "", "isRefresh", "", "setLoadSuccess", GraphResponse.SUCCESS_KEY, "setLoadComplete", "", "noMoreText", "setNoMoreText", "Lcom/yalla/yalla/ui/view/refresh/RefreshView;", "o00000OO", "Lcom/yalla/yalla/ui/view/refresh/RefreshView;", "getRefreshView", "()Lcom/yalla/yalla/ui/view/refresh/RefreshView;", "setRefreshView", "(Lcom/yalla/yalla/ui/view/refresh/RefreshView;)V", "refreshView", "Lcom/yalla/yalla/ui/view/refresh/LoadMoreView;", "o00000Oo", "Lcom/yalla/yalla/ui/view/refresh/LoadMoreView;", "getLoadMoreView", "()Lcom/yalla/yalla/ui/view/refresh/LoadMoreView;", "setLoadMoreView", "(Lcom/yalla/yalla/ui/view/refresh/LoadMoreView;)V", "loadMoreView", "Lkotlin/Function0;", "o00000o0", "Lkotlin/jvm/functions/Function0;", "getDoOnTouchDown", "()Lkotlin/jvm/functions/Function0;", "setDoOnTouchDown", "(Lkotlin/jvm/functions/Function0;)V", "doOnTouchDown", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public class RefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public RefreshView refreshView;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoadMoreView loadMoreView;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> doOnTouchDown;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooOoOO(boolean z, boolean z2, boolean z3) {
        if (z) {
            OooOO0o(z2);
        } else {
            OooOO0O(z2);
        }
        if (z && z2 && !z3) {
            OooOo00(true);
        }
        OooOo0o(z3);
    }

    @NotNull
    public final void OooOoo0(@Nullable Oooo000 oooo000) {
        this.f20878OoooOoO = oooo000;
        this.f20858OooOooo = this.f20858OooOooo || !this.f20876OoooOOo;
        OooOo00(true);
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
            OooOO0o(success);
        }
    }

    public final void setLoadMoreView(@NotNull LoadMoreView loadMoreView) {
        Intrinsics.checkNotNullParameter(loadMoreView, "<set-?>");
        this.loadMoreView = loadMoreView;
    }

    public final void setLoadSuccess(boolean isRefresh) {
        if (isRefresh) {
            OooOO0o(true);
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
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RefreshLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i2 = 6;
        int i3 = 0;
        this.refreshView = new RefreshView(context, attributeSet2, i2, i3);
        this.loadMoreView = new LoadMoreView(context, attributeSet2, i2, i3);
        setTag("close egg");
        OooOoO0(this.refreshView);
        OooOo0O(2.5f);
        OooOo(this.loadMoreView);
        OooOo0(3.0f);
        this.f20857OooOooO = false;
        OooOo00(false);
        this.f20870OoooO = true;
        this.f20874OoooOO0 = true;
        this.f20831OooO = 500;
        this.f20859Oooo = true;
        this.f20866Oooo0o = true;
        this.f20867Oooo0o0 = true;
        this.f20868Oooo0oO = false;
        this.f20864Oooo0O0 = true;
    }
}
