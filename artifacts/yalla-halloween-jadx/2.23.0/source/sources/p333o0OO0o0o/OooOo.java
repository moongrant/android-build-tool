package p333o0OO0o0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f43206OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f43203OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43205OooO0o0 = 200;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f43204OooO0o = false;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout smartRefreshLayout = OooOo.this.f43206OooO0oO;
            if (smartRefreshLayout.f21366o00000O0 != null) {
                smartRefreshLayout.f21381o0ooOO0.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooOo oooOo = OooOo.this;
            SmartRefreshLayout smartRefreshLayout = oooOo.f43206OooO0oO;
            if (smartRefreshLayout.f21366o00000O0 != null) {
                smartRefreshLayout.f21366o00000O0 = null;
                RefreshState refreshState = smartRefreshLayout.f21382o0ooOOo;
                RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                if (refreshState != refreshState2) {
                    smartRefreshLayout.f21381o0ooOO0.OooO0Oo(refreshState2);
                }
                oooOo.f43206OooO0oO.setStateRefreshing(!oooOo.f43204OooO0o);
            }
        }
    }

    public OooOo(XRefreshLayout xRefreshLayout) {
        this.f43206OooO0oO = xRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartRefreshLayout smartRefreshLayout = this.f43206OooO0oO;
        if (smartRefreshLayout.f21383o0ooOoO != RefreshState.Refreshing) {
            return;
        }
        ValueAnimator valueAnimator = smartRefreshLayout.f21366o00000O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        smartRefreshLayout.f21314OooOOO0 = smartRefreshLayout.getMeasuredWidth() / 2.0f;
        smartRefreshLayout.f21381o0ooOO0.OooO0Oo(RefreshState.PullDownToRefresh);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f21307OooO0o0, (int) (smartRefreshLayout.f21357OooooOo * this.f43203OooO0Oo));
        smartRefreshLayout.f21366o00000O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f43205OooO0o0);
        smartRefreshLayout.f21366o00000O0.setInterpolator(new OooOo00(0));
        smartRefreshLayout.f21366o00000O0.addUpdateListener(new OooO00o());
        smartRefreshLayout.f21366o00000O0.addListener(new OooO0O0());
        smartRefreshLayout.f21366o00000O0.start();
    }
}
