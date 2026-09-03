package p333o0OO0o0o;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o0OO0oO.OooO00o;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43198OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Boolean f43199OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f43200OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f43201OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f43202OooO0oo;

    public OooOOOO(SmartRefreshLayout smartRefreshLayout, int i, Boolean bool, boolean z) {
        this.f43202OooO0oo = smartRefreshLayout;
        this.f43200OooO0o0 = i;
        this.f43199OooO0o = bool;
        this.f43201OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f43198OooO0Oo;
        SmartRefreshLayout smartRefreshLayout = this.f43202OooO0oo;
        if (i == 0) {
            RefreshState refreshState = smartRefreshLayout.f21382o0ooOOo;
            RefreshState refreshState2 = RefreshState.None;
            if (refreshState == refreshState2 && smartRefreshLayout.f21383o0ooOoO == RefreshState.Refreshing) {
                smartRefreshLayout.f21383o0ooOoO = refreshState2;
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f21366o00000O0;
            if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                smartRefreshLayout.f21366o00000O0 = null;
                valueAnimator.cancel();
                smartRefreshLayout.f21381o0ooOO0.OooO0Oo(refreshState2);
                return;
            } else {
                if (refreshState != RefreshState.Refreshing || smartRefreshLayout.f21372o00o0O == null || smartRefreshLayout.f21384oo000o == null) {
                    return;
                }
                this.f43198OooO0Oo = i + 1;
                smartRefreshLayout.f21373o00oO0O.postDelayed(this, this.f43200OooO0o0);
                smartRefreshLayout.OooOOo(RefreshState.RefreshFinish);
                Boolean bool = this.f43199OooO0o;
                if (bool != null) {
                    smartRefreshLayout.OooOo0o(bool == Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        int iOooO0Oo = smartRefreshLayout.f21372o00o0O.OooO0Oo(smartRefreshLayout, this.f43201OooO0oO);
        if (iOooO0Oo < Integer.MAX_VALUE) {
            if (smartRefreshLayout.f21318OooOOo0 || smartRefreshLayout.f21353Ooooo00) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f21318OooOOo0) {
                    float f = smartRefreshLayout.f21313OooOOO;
                    smartRefreshLayout.f21312OooOO0o = f;
                    smartRefreshLayout.f21308OooO0oO = 0;
                    smartRefreshLayout.f21318OooOOo0 = false;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f21314OooOOO0, (f + smartRefreshLayout.f21307OooO0o0) - (smartRefreshLayout.f21305OooO0Oo * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f21314OooOOO0, smartRefreshLayout.f21313OooOOO + smartRefreshLayout.f21307OooO0o0, 0));
                }
                if (smartRefreshLayout.f21353Ooooo00) {
                    smartRefreshLayout.f21352OoooOoo = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.f21314OooOOO0, smartRefreshLayout.f21313OooOOO, 0));
                    smartRefreshLayout.f21353Ooooo00 = false;
                    smartRefreshLayout.f21308OooO0oO = 0;
                }
            }
            int i2 = smartRefreshLayout.f21307OooO0o0;
            OooOo00 oooOo00 = smartRefreshLayout.f21329OooOoo0;
            if (i2 > 0) {
                ValueAnimator valueAnimatorOooO0oO = smartRefreshLayout.OooO0oO(0, iOooO0Oo, oooOo00, smartRefreshLayout.f21304OooO);
                OooO00o oooO00oOooO0o0 = smartRefreshLayout.f21345OoooO00 ? smartRefreshLayout.f21384oo000o.OooO0o0(smartRefreshLayout.f21307OooO0o0) : null;
                if (valueAnimatorOooO0oO == null || oooO00oOooO0o0 == null) {
                    return;
                }
                valueAnimatorOooO0oO.addUpdateListener(oooO00oOooO0o0);
                return;
            }
            if (i2 < 0) {
                smartRefreshLayout.OooO0oO(0, iOooO0Oo, oooOo00, smartRefreshLayout.f21304OooO);
                return;
            }
            SmartRefreshLayout.OooOOO oooOOO = smartRefreshLayout.f21381o0ooOO0;
            oooOOO.OooO0O0(0, false);
            oooOOO.OooO0Oo(RefreshState.None);
        }
    }
}
