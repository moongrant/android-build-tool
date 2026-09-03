package o0OO0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p339o0OO0oo0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f42452OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f42449OooO0Oo = 1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42451OooO0o0 = 200;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f42450OooO0o = false;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout smartRefreshLayout = OooOO0O.this.f42452OooO0oO;
            if (smartRefreshLayout.f20893o00000O0 != null) {
                smartRefreshLayout.f20908o0ooOO0.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooOO0O oooOO0O = OooOO0O.this;
            SmartRefreshLayout smartRefreshLayout = oooOO0O.f42452OooO0oO;
            if (smartRefreshLayout.f20893o00000O0 != null) {
                smartRefreshLayout.f20893o00000O0 = null;
                RefreshState refreshState = smartRefreshLayout.f20909o0ooOOo;
                RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                if (refreshState != refreshState2) {
                    smartRefreshLayout.f20908o0ooOO0.OooO0Oo(refreshState2);
                }
                oooOO0O.f42452OooO0oO.setStateRefreshing(!oooOO0O.f42450OooO0o);
            }
        }
    }

    public OooOO0O(XRefreshLayout xRefreshLayout) {
        this.f42452OooO0oO = xRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartRefreshLayout smartRefreshLayout = this.f42452OooO0oO;
        if (smartRefreshLayout.f20910o0ooOoO != RefreshState.Refreshing) {
            return;
        }
        ValueAnimator valueAnimator = smartRefreshLayout.f20893o00000O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        smartRefreshLayout.f20841OooOOO0 = smartRefreshLayout.getMeasuredWidth() / 2.0f;
        smartRefreshLayout.f20908o0ooOO0.OooO0Oo(RefreshState.PullDownToRefresh);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f20834OooO0o0, (int) (smartRefreshLayout.f20884OooooOo * this.f42449OooO0Oo));
        smartRefreshLayout.f20893o00000O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f42451OooO0o0);
        smartRefreshLayout.f20893o00000O0.setInterpolator(new OooOOOO(0));
        smartRefreshLayout.f20893o00000O0.addUpdateListener(new OooO00o());
        smartRefreshLayout.f20893o00000O0.addListener(new OooO0O0());
        smartRefreshLayout.f20893o00000O0.start();
    }
}
