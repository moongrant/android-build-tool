package o0OO0o;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import p339o0OO0oo0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f42436OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Boolean f42437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f42438OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f42439OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f42440OooO0oo;

    public OooO(SmartRefreshLayout smartRefreshLayout, int i, Boolean bool, boolean z) {
        this.f42440OooO0oo = smartRefreshLayout;
        this.f42438OooO0o0 = i;
        this.f42437OooO0o = bool;
        this.f42439OooO0oO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42436OooO0Oo;
        SmartRefreshLayout smartRefreshLayout = this.f42440OooO0oo;
        if (i == 0) {
            RefreshState refreshState = smartRefreshLayout.f20909o0ooOOo;
            RefreshState refreshState2 = RefreshState.None;
            if (refreshState == refreshState2 && smartRefreshLayout.f20910o0ooOoO == RefreshState.Refreshing) {
                smartRefreshLayout.f20910o0ooOoO = refreshState2;
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f20893o00000O0;
            if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                smartRefreshLayout.f20893o00000O0 = null;
                valueAnimator.cancel();
                smartRefreshLayout.f20908o0ooOO0.OooO0Oo(refreshState2);
                return;
            } else {
                if (refreshState != RefreshState.Refreshing || smartRefreshLayout.f20899o00o0O == null || smartRefreshLayout.f20911oo000o == null) {
                    return;
                }
                this.f42436OooO0Oo = i + 1;
                smartRefreshLayout.f20900o00oO0O.postDelayed(this, this.f42438OooO0o0);
                smartRefreshLayout.OooOOo(RefreshState.RefreshFinish);
                Boolean bool = this.f42437OooO0o;
                if (bool != null) {
                    smartRefreshLayout.OooOo0o(bool == Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        int iOooO0OO = smartRefreshLayout.f20899o00o0O.OooO0OO(smartRefreshLayout, this.f42439OooO0oO);
        if (iOooO0OO < Integer.MAX_VALUE) {
            if (smartRefreshLayout.f20845OooOOo0 || smartRefreshLayout.f20880Ooooo00) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (smartRefreshLayout.f20845OooOOo0) {
                    float f = smartRefreshLayout.f20840OooOOO;
                    smartRefreshLayout.f20839OooOO0o = f;
                    smartRefreshLayout.f20835OooO0oO = 0;
                    smartRefreshLayout.f20845OooOOo0 = false;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f20841OooOOO0, (f + smartRefreshLayout.f20834OooO0o0) - (smartRefreshLayout.f20832OooO0Oo * 2), 0));
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f20841OooOOO0, smartRefreshLayout.f20840OooOOO + smartRefreshLayout.f20834OooO0o0, 0));
                }
                if (smartRefreshLayout.f20880Ooooo00) {
                    smartRefreshLayout.f20879OoooOoo = 0;
                    super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.f20841OooOOO0, smartRefreshLayout.f20840OooOOO, 0));
                    smartRefreshLayout.f20880Ooooo00 = false;
                    smartRefreshLayout.f20835OooO0oO = 0;
                }
            }
            int i2 = smartRefreshLayout.f20834OooO0o0;
            OooOOOO oooOOOO = smartRefreshLayout.f20856OooOoo0;
            if (i2 > 0) {
                ValueAnimator valueAnimatorOooO0oO = smartRefreshLayout.OooO0oO(0, iOooO0OO, oooOOOO, smartRefreshLayout.f20831OooO);
                p337o0OO0oOO.OooOOOO oooOOOOOooO0o0 = smartRefreshLayout.f20872OoooO00 ? smartRefreshLayout.f20911oo000o.OooO0o0(smartRefreshLayout.f20834OooO0o0) : null;
                if (valueAnimatorOooO0oO == null || oooOOOOOooO0o0 == null) {
                    return;
                }
                valueAnimatorOooO0oO.addUpdateListener(oooOOOOOooO0o0);
                return;
            }
            if (i2 < 0) {
                smartRefreshLayout.OooO0oO(0, iOooO0OO, oooOOOO, smartRefreshLayout.f20831OooO);
                return;
            }
            SmartRefreshLayout.OooOOO oooOOO = smartRefreshLayout.f20908o0ooOO0;
            oooOOO.OooO0O0(0, false);
            oooOOO.OooO0Oo(RefreshState.None);
        }
    }
}
