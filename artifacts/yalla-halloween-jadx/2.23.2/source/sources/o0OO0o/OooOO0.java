package o0OO0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import p337o0OO0oOO.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f42441OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f42442OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42443OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f42444OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f42445OooO0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f42446OooO0Oo;

        /* JADX INFO: renamed from: o0OO0o.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0445OooO00o extends AnimatorListenerAdapter {
            public C0445OooO00o() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                OooO00o oooO00o = OooO00o.this;
                OooOO0 oooOO1 = OooOO0.this;
                SmartRefreshLayout smartRefreshLayout = oooOO1.f42445OooO0oo;
                smartRefreshLayout.f20890o000000 = false;
                if (oooOO1.f42442OooO0o) {
                    smartRefreshLayout.OooOo0o(true);
                }
                SmartRefreshLayout smartRefreshLayout2 = OooOO0.this.f42445OooO0oo;
                if (smartRefreshLayout2.f20909o0ooOOo == RefreshState.LoadFinish) {
                    smartRefreshLayout2.OooOOo(RefreshState.None);
                }
            }
        }

        public OooO00o(int i) {
            this.f42446OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOooO00o;
            OooOO0 oooOO1 = OooOO0.this;
            SmartRefreshLayout smartRefreshLayout = oooOO1.f42445OooO0oo;
            OooOOOO oooOOOOOooO0o0 = (!smartRefreshLayout.f20859Oooo || this.f42446OooO0Oo >= 0) ? null : smartRefreshLayout.f20911oo000o.OooO0o0(smartRefreshLayout.f20834OooO0o0);
            if (oooOOOOOooO0o0 != null) {
                oooOOOOOooO0o0.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
            }
            C0445OooO00o c0445OooO00o = new C0445OooO00o();
            SmartRefreshLayout smartRefreshLayout2 = oooOO1.f42445OooO0oo;
            int i = smartRefreshLayout2.f20834OooO0o0;
            SmartRefreshLayout.OooOOO oooOOO = smartRefreshLayout2.f20908o0ooOO0;
            if (i > 0) {
                valueAnimatorOooO00o = oooOOO.OooO00o(0);
            } else {
                if (oooOOOOOooO0o0 != null || i == 0) {
                    ValueAnimator valueAnimator = smartRefreshLayout2.f20893o00000O0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        smartRefreshLayout2.f20893o00000O0 = null;
                    }
                    smartRefreshLayout2.f20908o0ooOO0.OooO0O0(0, false);
                    smartRefreshLayout2.f20908o0ooOO0.OooO0Oo(RefreshState.None);
                } else if (oooOO1.f42442OooO0o && smartRefreshLayout2.f20864Oooo0O0) {
                    int i2 = -smartRefreshLayout2.f20885Oooooo;
                    if (i >= i2) {
                        smartRefreshLayout2.OooOOo(RefreshState.None);
                    } else {
                        valueAnimatorOooO00o = oooOOO.OooO00o(i2);
                    }
                } else {
                    valueAnimatorOooO00o = oooOOO.OooO00o(0);
                }
                valueAnimatorOooO00o = null;
            }
            if (valueAnimatorOooO00o != null) {
                valueAnimatorOooO00o.addListener(c0445OooO00o);
            } else {
                c0445OooO00o.onAnimationEnd(null);
            }
        }
    }

    public OooOO0(SmartRefreshLayout smartRefreshLayout, int i, boolean z, boolean z2) {
        this.f42445OooO0oo = smartRefreshLayout;
        this.f42443OooO0o0 = i;
        this.f42442OooO0o = z;
        this.f42444OooO0oO = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42441OooO0Oo;
        boolean z = this.f42442OooO0o;
        SmartRefreshLayout smartRefreshLayout = this.f42445OooO0oo;
        if (i == 0) {
            RefreshState refreshState = smartRefreshLayout.f20909o0ooOOo;
            RefreshState refreshState2 = RefreshState.None;
            if (refreshState == refreshState2 && smartRefreshLayout.f20910o0ooOoO == RefreshState.Loading) {
                smartRefreshLayout.f20910o0ooOoO = refreshState2;
            } else {
                ValueAnimator valueAnimator = smartRefreshLayout.f20893o00000O0;
                if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                    smartRefreshLayout.f20893o00000O0 = null;
                    valueAnimator.cancel();
                    smartRefreshLayout.f20908o0ooOO0.OooO0Oo(refreshState2);
                } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f20902o00ooo != null && smartRefreshLayout.f20911oo000o != null) {
                    this.f42441OooO0Oo = i + 1;
                    smartRefreshLayout.f20900o00oO0O.postDelayed(this, this.f42443OooO0o0);
                    smartRefreshLayout.OooOOo(RefreshState.LoadFinish);
                    return;
                }
            }
            if (z) {
                smartRefreshLayout.OooOo0o(true);
                return;
            }
            return;
        }
        int iOooO0OO = smartRefreshLayout.f20902o00ooo.OooO0OO(smartRefreshLayout, this.f42444OooO0oO);
        if (iOooO0OO < Integer.MAX_VALUE) {
            boolean z2 = z && smartRefreshLayout.f20864Oooo0O0 && smartRefreshLayout.f20834OooO0o0 < 0 && smartRefreshLayout.f20911oo000o.OooO00o();
            int i2 = smartRefreshLayout.f20834OooO0o0;
            int iMax = i2 - (z2 ? Math.max(i2, -smartRefreshLayout.f20885Oooooo) : 0);
            if (smartRefreshLayout.f20845OooOOo0 || smartRefreshLayout.f20880Ooooo00) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f20845OooOOo0) {
                    float f = smartRefreshLayout.f20840OooOOO;
                    smartRefreshLayout.f20839OooOO0o = f;
                    smartRefreshLayout.f20835OooO0oO = smartRefreshLayout.f20834OooO0o0 - iMax;
                    smartRefreshLayout.f20845OooOOo0 = false;
                    float f2 = smartRefreshLayout.f20860Oooo0 ? iMax : 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f20841OooOOO0, f + f2 + (smartRefreshLayout.f20832OooO0Oo * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f20841OooOOO0, smartRefreshLayout.f20840OooOOO + f2, 0));
                }
                if (smartRefreshLayout.f20880Ooooo00) {
                    smartRefreshLayout.f20879OoooOoo = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.f20841OooOOO0, smartRefreshLayout.f20840OooOOO, 0));
                    smartRefreshLayout.f20880Ooooo00 = false;
                    smartRefreshLayout.f20835OooO0oO = 0;
                }
            }
            smartRefreshLayout.f20900o00oO0O.postDelayed(new OooO00o(iMax), smartRefreshLayout.f20834OooO0o0 < 0 ? iOooO0OO : 0L);
        }
    }
}
