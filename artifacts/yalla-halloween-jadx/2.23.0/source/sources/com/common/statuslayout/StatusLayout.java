package com.common.statuslayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p165o00Ooo0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/common/statuslayout/StatusLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "OooO0o", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "", "OooO0oO", "J", "getDuration", "()J", "setDuration", "(J)V", "getDuration$annotations", "()V", "duration", "OooO0oo", "getAnimShowDuration", "setAnimShowDuration", "animShowDuration", "OooO", "getAnimHideDuration", "setAnimHideDuration", "animHideDuration", "", "OooOO0", "Z", "getEnableStateChangeAnim", "()Z", "setEnableStateChangeAnim", "(Z)V", "enableStateChangeAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "StatusLayout_release"}, k = 1, mv = {1, 4, 0})
public class StatusLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    public long animHideDuration;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f10510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public View contentView;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public State f10512OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public long duration;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    public long animShowDuration;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    public boolean enableStateChangeAnim;

    public static final class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ View f10517OooO0o0;

        public OooO00o(View view) {
            this.f10517OooO0o0 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Nullable Animator animator) {
            View contentView = StatusLayout.this.getContentView();
            View view = this.f10517OooO0o0;
            view.setVisibility(Intrinsics.areEqual(view, contentView) ? 4 : 8);
        }
    }

    public static final class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f10518OooO0Oo;

        public OooO0O0(View view) {
            this.f10518OooO0Oo = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Nullable Animator animator) {
            this.f10518OooO0Oo.setVisibility(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/common/statuslayout/StatusLayout$State;", "", "Content", "Loading", "Empty", "Error", "StatusLayout_release"}, k = 1, mv = {1, 4, 0})
    public enum State {
        Content,
        Loading,
        Empty,
        Error
    }

    @JvmOverloads
    public StatusLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getContentView() {
        View view = this.contentView;
        return view != null ? view : getChildAt(0);
    }

    @Deprecated(message = "使用 animShowDuration animHideDuration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    public final void OooO(State state) {
        View contentView;
        if (this.f10512OooO0o0 == state) {
            return;
        }
        int i = Oooo0.$EnumSwitchMapping$1[state.ordinal()];
        ArrayList arrayList = this.f10510OooO0Oo;
        if (i == 1) {
            View loadingView = getLoadingView();
            if (loadingView != null) {
                if (loadingView.getParent() == null) {
                    addView(loadingView);
                }
                OooO0oO(loadingView);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(State.Loading, loadingView);
                }
            }
        } else if (i == 2) {
            View emptyView = getEmptyView();
            if (emptyView != null) {
                if (emptyView.getParent() == null) {
                    addView(emptyView);
                }
                OooO0oO(emptyView);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Function2) it2.next()).invoke(State.Empty, emptyView);
                }
            }
        } else if (i == 3) {
            View errorView = getErrorView();
            if (errorView != null) {
                if (errorView.getParent() == null) {
                    addView(errorView);
                }
                OooO0oO(errorView);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((Function2) it3.next()).invoke(State.Error, errorView);
                }
            }
        } else if (i == 4 && (contentView = getContentView()) != null) {
            OooO0oO(contentView);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((Function2) it4.next()).invoke(State.Content, contentView);
            }
        }
        this.f10512OooO0o0 = state;
    }

    public final void OooO0O0(State state) {
        View contentView;
        State state2 = this.f10512OooO0o0;
        if (state2 == state) {
            return;
        }
        int i = Oooo0.$EnumSwitchMapping$0[state2.ordinal()];
        if (i == 1) {
            View loadingView = getLoadingView();
            if (loadingView != null) {
                OooO0OO(loadingView);
                return;
            }
            return;
        }
        if (i == 2) {
            View emptyView = getEmptyView();
            if (emptyView != null) {
                OooO0OO(emptyView);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (contentView = getContentView()) != null) {
                OooO0OO(contentView);
                return;
            }
            return;
        }
        View errorView = getErrorView();
        if (errorView != null) {
            OooO0OO(errorView);
        }
    }

    public final void OooO0OO(View view) {
        if (!this.enableStateChangeAnim) {
            view.setVisibility(Intrinsics.areEqual(view, getContentView()) ? 4 : 8);
        } else {
            view.animate().cancel();
            view.animate().alpha(0.0f).setDuration(this.animHideDuration).setListener(new OooO00o(view)).start();
        }
    }

    public final void OooO0Oo() {
        State state = State.Content;
        OooO0O0(state);
        OooO(state);
    }

    public final void OooO0o() {
        State state = State.Error;
        OooO0O0(state);
        OooO(state);
    }

    public final void OooO0o0() {
        State state = State.Empty;
        OooO0O0(state);
        OooO(state);
    }

    public final void OooO0oO(View view) {
        if (!this.enableStateChangeAnim) {
            view.setVisibility(0);
            return;
        }
        view.animate().cancel();
        if (!Intrinsics.areEqual(view, getContentView())) {
            view.setAlpha(0.0f);
        }
        view.animate().alpha(1.0f).setDuration(this.animShowDuration).setListener(new OooO0O0(view)).start();
    }

    public final void OooO0oo() {
        State state = State.Loading;
        OooO0O0(state);
        OooO(state);
    }

    public final long getAnimHideDuration() {
        return this.animHideDuration;
    }

    public final long getAnimShowDuration() {
        return this.animShowDuration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public View getEmptyView() {
        return null;
    }

    public final boolean getEnableStateChangeAnim() {
        return this.enableStateChangeAnim;
    }

    @Nullable
    public View getErrorView() {
        return null;
    }

    @Nullable
    public View getLoadingView() {
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (super.getChildCount() > 1) {
            throw new RuntimeException("最多只支持1个子View，Most only support three sub view");
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.contentView = childAt;
        }
    }

    public final void setAnimHideDuration(long j) {
        this.animHideDuration = j;
    }

    public final void setAnimShowDuration(long j) {
        this.animShowDuration = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableStateChangeAnim(boolean z) {
        this.enableStateChangeAnim = z;
    }

    @JvmOverloads
    public StatusLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ StatusLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatusLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10510OooO0Oo = new ArrayList();
        this.f10512OooO0o0 = State.Content;
        this.duration = 300L;
        this.animShowDuration = 300L;
        this.animHideDuration = 150L;
    }
}
