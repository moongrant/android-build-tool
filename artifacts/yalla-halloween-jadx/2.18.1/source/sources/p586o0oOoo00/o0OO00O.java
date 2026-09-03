package p586o0oOoo00;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import p411o0Oo0Ooo.oOo00OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f46967Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f46968Oooo0o = 1.0f;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46969Oooo0oO = 200;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f46970Oooo0oo = false;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout smartRefreshLayout = o0OO00O.this.f46967Oooo;
            if (smartRefreshLayout.f19534o000O0O != null) {
                smartRefreshLayout.f19524o0000o0O.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SmartRefreshLayout smartRefreshLayout = o0OO00O.this.f46967Oooo;
            if (smartRefreshLayout.f19534o000O0O != null) {
                smartRefreshLayout.f19534o000O0O = null;
                RefreshState refreshState = smartRefreshLayout.f19525o0000o0o;
                RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                if (refreshState != refreshState2) {
                    smartRefreshLayout.f19524o0000o0O.OooO0Oo(refreshState2);
                }
                o0OO00O o0oo00o2 = o0OO00O.this;
                o0oo00o2.f46967Oooo.setStateRefreshing(!o0oo00o2.f46970Oooo0oo);
            }
        }
    }

    public o0OO00O(SmartRefreshLayout smartRefreshLayout) {
        this.f46967Oooo = smartRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartRefreshLayout smartRefreshLayout = this.f46967Oooo;
        if (smartRefreshLayout.f19522o0000o != RefreshState.Refreshing) {
            return;
        }
        ValueAnimator valueAnimator = smartRefreshLayout.f19534o000O0O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        SmartRefreshLayout smartRefreshLayout2 = this.f46967Oooo;
        smartRefreshLayout2.f19540o000oOoO = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
        this.f46967Oooo.f19524o0000o0O.OooO0Oo(RefreshState.PullDownToRefresh);
        SmartRefreshLayout smartRefreshLayout3 = this.f46967Oooo;
        smartRefreshLayout3.f19534o000O0O = ValueAnimator.ofInt(smartRefreshLayout3.f19476Oooo0oO, (int) (smartRefreshLayout3.f19512o0000O00 * this.f46968Oooo0o));
        this.f46967Oooo.f19534o000O0O.setDuration(this.f46969Oooo0oO);
        ValueAnimator valueAnimator2 = this.f46967Oooo.f19534o000O0O;
        float f = oOo00OO0.f39170OooO0O0;
        valueAnimator2.setInterpolator(new oOo00OO0(0));
        this.f46967Oooo.f19534o000O0O.addUpdateListener(new OooO00o());
        this.f46967Oooo.f19534o000O0O.addListener(new OooO0O0());
        this.f46967Oooo.f19534o000O0O.start();
    }
}
