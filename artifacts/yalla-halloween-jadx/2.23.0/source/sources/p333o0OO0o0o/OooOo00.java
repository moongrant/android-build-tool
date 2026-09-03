package p333o0OO0o0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43209OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f43210OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43211OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f43212OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f43213OooO0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f43214OooO0Oo;

        /* JADX INFO: renamed from: o0OO0o0o.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0455OooO00o extends AnimatorListenerAdapter {
            public C0455OooO00o() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                OooO00o oooO00o = OooO00o.this;
                OooOo00 oooOo00 = OooOo00.this;
                SmartRefreshLayout smartRefreshLayout = oooOo00.f43213OooO0oo;
                smartRefreshLayout.f21363o000000 = false;
                if (oooOo00.f43210OooO0o) {
                    smartRefreshLayout.OooOo0o(true);
                }
                SmartRefreshLayout smartRefreshLayout2 = OooOo00.this.f43213OooO0oo;
                if (smartRefreshLayout2.f21382o0ooOOo == RefreshState.LoadFinish) {
                    smartRefreshLayout2.OooOOo(RefreshState.None);
                }
            }
        }

        public OooO00o(int i) {
            this.f43214OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOooO00o;
            OooOo00 oooOo00 = OooOo00.this;
            SmartRefreshLayout smartRefreshLayout = oooOo00.f43213OooO0oo;
            o0OO0oO.OooO00o oooO00oOooO0o0 = (!smartRefreshLayout.f21332Oooo || this.f43214OooO0Oo >= 0) ? null : smartRefreshLayout.f21384oo000o.OooO0o0(smartRefreshLayout.f21307OooO0o0);
            if (oooO00oOooO0o0 != null) {
                oooO00oOooO0o0.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
            }
            C0455OooO00o c0455OooO00o = new C0455OooO00o();
            SmartRefreshLayout smartRefreshLayout2 = oooOo00.f43213OooO0oo;
            int i = smartRefreshLayout2.f21307OooO0o0;
            SmartRefreshLayout.OooOOO oooOOO = smartRefreshLayout2.f21381o0ooOO0;
            if (i > 0) {
                valueAnimatorOooO00o = oooOOO.OooO00o(0);
            } else {
                if (oooO00oOooO0o0 != null || i == 0) {
                    ValueAnimator valueAnimator = smartRefreshLayout2.f21366o00000O0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        smartRefreshLayout2.f21366o00000O0 = null;
                    }
                    smartRefreshLayout2.f21381o0ooOO0.OooO0O0(0, false);
                    smartRefreshLayout2.f21381o0ooOO0.OooO0Oo(RefreshState.None);
                } else if (oooOo00.f43210OooO0o && smartRefreshLayout2.f21337Oooo0O0) {
                    int i2 = -smartRefreshLayout2.f21358Oooooo;
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
                valueAnimatorOooO00o.addListener(c0455OooO00o);
            } else {
                c0455OooO00o.onAnimationEnd(null);
            }
        }
    }

    public OooOo00(SmartRefreshLayout smartRefreshLayout, int i, boolean z, boolean z2) {
        this.f43213OooO0oo = smartRefreshLayout;
        this.f43211OooO0o0 = i;
        this.f43210OooO0o = z;
        this.f43212OooO0oO = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f43209OooO0Oo;
        boolean z = this.f43210OooO0o;
        SmartRefreshLayout smartRefreshLayout = this.f43213OooO0oo;
        if (i == 0) {
            RefreshState refreshState = smartRefreshLayout.f21382o0ooOOo;
            RefreshState refreshState2 = RefreshState.None;
            if (refreshState == refreshState2 && smartRefreshLayout.f21383o0ooOoO == RefreshState.Loading) {
                smartRefreshLayout.f21383o0ooOoO = refreshState2;
            } else {
                ValueAnimator valueAnimator = smartRefreshLayout.f21366o00000O0;
                if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                    smartRefreshLayout.f21366o00000O0 = null;
                    valueAnimator.cancel();
                    smartRefreshLayout.f21381o0ooOO0.OooO0Oo(refreshState2);
                } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f21375o00ooo != null && smartRefreshLayout.f21384oo000o != null) {
                    this.f43209OooO0Oo = i + 1;
                    smartRefreshLayout.f21373o00oO0O.postDelayed(this, this.f43211OooO0o0);
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
        int iOooO0Oo = smartRefreshLayout.f21375o00ooo.OooO0Oo(smartRefreshLayout, this.f43212OooO0oO);
        if (iOooO0Oo < Integer.MAX_VALUE) {
            boolean z2 = z && smartRefreshLayout.f21337Oooo0O0 && smartRefreshLayout.f21307OooO0o0 < 0 && smartRefreshLayout.f21384oo000o.OooO00o();
            int i2 = smartRefreshLayout.f21307OooO0o0;
            int iMax = i2 - (z2 ? Math.max(i2, -smartRefreshLayout.f21358Oooooo) : 0);
            if (smartRefreshLayout.f21318OooOOo0 || smartRefreshLayout.f21353Ooooo00) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f21318OooOOo0) {
                    float f = smartRefreshLayout.f21313OooOOO;
                    smartRefreshLayout.f21312OooOO0o = f;
                    smartRefreshLayout.f21308OooO0oO = smartRefreshLayout.f21307OooO0o0 - iMax;
                    smartRefreshLayout.f21318OooOOo0 = false;
                    float f2 = smartRefreshLayout.f21333Oooo0 ? iMax : 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f21314OooOOO0, f + f2 + (smartRefreshLayout.f21305OooO0Oo * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f21314OooOOO0, smartRefreshLayout.f21313OooOOO + f2, 0));
                }
                if (smartRefreshLayout.f21353Ooooo00) {
                    smartRefreshLayout.f21352OoooOoo = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.f21314OooOOO0, smartRefreshLayout.f21313OooOOO, 0));
                    smartRefreshLayout.f21353Ooooo00 = false;
                    smartRefreshLayout.f21308OooO0oO = 0;
                }
            }
            smartRefreshLayout.f21373o00oO0O.postDelayed(new OooO00o(iMax), smartRefreshLayout.f21307OooO0o0 < 0 ? iOooO0Oo : 0L);
        }
    }
}
