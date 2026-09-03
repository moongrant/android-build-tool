package com.common.statuslayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.umeng.analytics.pro.d;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p266o00ooo0O.o00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/common/statuslayout/StatusLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "Oooo0oo", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "", "Oooo", "J", "getDuration", "()J", "setDuration", "(J)V", "getDuration$annotations", "()V", "duration", "OoooO00", "getAnimShowDuration", "setAnimShowDuration", "animShowDuration", "OoooO0", "getAnimHideDuration", "setAnimHideDuration", "animHideDuration", "", "OoooO0O", "Z", "getEnableStateChangeAnim", "()Z", "setEnableStateChangeAnim", "(Z)V", "enableStateChangeAnim", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "StatusLayout_release"}, k = 1, mv = {1, 4, 0})
public class StatusLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public long duration;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<Function2<State, View, Unit>> f12643Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public State f12644Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public View contentView;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public long animHideDuration;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    public long animShowDuration;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public boolean enableStateChangeAnim;

    public static final class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ View f12650Oooo0oO;

        public OooO00o(View view) {
            this.f12650Oooo0oO = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Nullable Animator animator) {
            View view = this.f12650Oooo0oO;
            view.setVisibility(Intrinsics.areEqual(view, StatusLayout.this.getContentView()) ? 4 : 8);
        }
    }

    public static final class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f12651Oooo0o;

        public OooO0O0(View view) {
            this.f12651Oooo0o = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Nullable Animator animator) {
            this.f12651Oooo0o.setVisibility(0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/common/statuslayout/StatusLayout$State;", "", "Content", "Loading", "Empty", "Error", "StatusLayout_release"}, k = 1, mv = {1, 4, 0})
    public enum State {
        Content,
        Loading,
        Empty,
        Error
    }

    @JvmOverloads
    public StatusLayout(@NotNull Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getContentView() {
        View view = this.contentView;
        return view != null ? view : getChildAt(0);
    }

    @Deprecated(message = "使用 animShowDuration animHideDuration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<com.common.statuslayout.StatusLayout$State, android.view.View, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<com.common.statuslayout.StatusLayout$State, android.view.View, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<com.common.statuslayout.StatusLayout$State, android.view.View, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<com.common.statuslayout.StatusLayout$State, android.view.View, kotlin.Unit>>] */
    public final void OooO(State state) {
        View contentView;
        if (this.f12644Oooo0oO == state) {
            return;
        }
        int i = o00O.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            View loadingView = getLoadingView();
            if (loadingView != null) {
                if (loadingView.getParent() == null) {
                    addView(loadingView);
                }
                OooO0oO(loadingView);
                Iterator it = this.f12643Oooo0o.iterator();
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
                Iterator it2 = this.f12643Oooo0o.iterator();
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
                Iterator it3 = this.f12643Oooo0o.iterator();
                while (it3.hasNext()) {
                    ((Function2) it3.next()).invoke(State.Error, errorView);
                }
            }
        } else if (i == 4 && (contentView = getContentView()) != null) {
            OooO0oO(contentView);
            Iterator it4 = this.f12643Oooo0o.iterator();
            while (it4.hasNext()) {
                ((Function2) it4.next()).invoke(State.Content, contentView);
            }
        }
        this.f12644Oooo0oO = state;
    }

    public final void OooO0O0(State state) {
        View contentView;
        State state2 = this.f12644Oooo0oO;
        if (state2 == state) {
            return;
        }
        int i = o00O.$EnumSwitchMapping$0[state2.ordinal()];
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
            view.animate().alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(this.animHideDuration).setListener(new OooO00o(view)).start();
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
            view.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
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
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatusLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12643Oooo0o = new ArrayList();
        this.f12644Oooo0oO = State.Content;
        this.duration = 300L;
        this.animShowDuration = 300L;
        this.animHideDuration = 150L;
    }
}
