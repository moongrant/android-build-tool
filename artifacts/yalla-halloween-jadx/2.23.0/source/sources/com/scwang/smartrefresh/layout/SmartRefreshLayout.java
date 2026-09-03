package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o000000;
import androidx.core.view.o000OOo;
import androidx.core.view.o0OO00O;
import androidx.core.view.o0Oo0oo;
import androidx.core.widget.NestedScrollView;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.youth.banner.config.BannerConfig;
import java.util.LinkedList;
import org.jctools.util.Pow2;
import p333o0OO0o0o.OooOOOO;
import p333o0OO0o0o.OooOo;
import p335o0OO0oOo.OooOo00;
import p389o0OOoooO.o00O0OO;
import p389o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements o0OO0o.OooOOO0, o000OOo {

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f21303o00000O = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f21304OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f21305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f21306OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f21307OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21308OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f21309OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f21310OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f21311OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f21312OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f21313OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f21314OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final float f21315OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public char f21316OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f21317OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f21318OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f21319OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f21320OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f21321OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f21322OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f21323OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f21324OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Scroller f21325OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f21326OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final VelocityTracker f21327OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int[] f21328OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOo00 f21329OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f21330OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f21331OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f21332Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final boolean f21333Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final boolean f21334Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f21335Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final boolean f21336Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f21337Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final boolean f21338Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f21339Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f21340Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f21341Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f21342Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f21343OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f21344OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f21345OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f21346OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f21347OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f21348OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f21349OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o00O0OO f21350OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public oo0o0O0 f21351OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f21352OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f21353Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int[] f21354Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final o0OO00O f21355OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o000000 f21356OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f21357OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f21358Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o0OO0oO0.OooO00o f21359Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o0OO0oO0.OooO00o f21360OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final int f21361Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public Runnable f21362o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f21363o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f21364o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public MotionEvent f21365o000000o;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public ValueAnimator f21366o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f21367o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f21368o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f21369o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f21370o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f21371o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public o0OO0o.OooO f21372o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final Handler f21373o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public Paint f21374o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public o0OO0o.OooO0o f21375o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f21376o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f21377o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public long f21378o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f21379o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int f21380o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final OooOOO f21381o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public RefreshState f21382o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public RefreshState f21383o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public o0OO0oO.OooO00o f21384oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f21385oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f21386ooOO;

    public class OooO implements ValueAnimator.AnimatorUpdateListener {
        public OooO() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f21381o0ooOO0.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21390OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f21390OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21390OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21390OooO00o[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21390OooO00o[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21390OooO00o[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21390OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21390OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21390OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21390OooO00o[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21390OooO00o[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21390OooO00o[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21390OooO00o[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21390OooO00o[RefreshState.RefreshFinish.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21390OooO00o[RefreshState.LoadFinish.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21390OooO00o[RefreshState.TwoLevelReleased.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21390OooO00o[RefreshState.TwoLevelFinish.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21390OooO00o[RefreshState.TwoLevel.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21391OooO0Oo;

        public OooO0O0(boolean z) {
            this.f21391OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SmartRefreshLayout.this.setStateDirectLoading(this.f21391OooO0Oo);
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21393OooO0Oo;

        public OooO0OO(boolean z) {
            this.f21393OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.f21378o0OOO0o = jCurrentTimeMillis;
            smartRefreshLayout.OooOOo(RefreshState.Refreshing);
            o00O0OO o00o0oo2 = smartRefreshLayout.f21350OoooOo0;
            if (o00o0oo2 == null) {
                smartRefreshLayout.OooOOO0(BannerConfig.LOOP_TIME, true, Boolean.FALSE);
            } else if (this.f21393OooO0Oo) {
                o00o0oo2.OooO00o(smartRefreshLayout);
            }
            o0OO0o.OooO oooO = smartRefreshLayout.f21372o00o0O;
            if (oooO != null) {
                int i = smartRefreshLayout.f21357OooooOo;
                oooO.OooO0oo(smartRefreshLayout, i, (int) (smartRefreshLayout.f21386ooOO * i));
            }
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {
        public OooO0o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.f21366o00000O0 = null;
            if (smartRefreshLayout.f21307OooO0o0 == 0 && (refreshState = smartRefreshLayout.f21382o0ooOOo) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                smartRefreshLayout.OooOOo(refreshState2);
                return;
            }
            RefreshState refreshState3 = smartRefreshLayout.f21382o0ooOOo;
            if (refreshState3 != smartRefreshLayout.f21383o0ooOoO) {
                smartRefreshLayout.setViceState(refreshState3);
            }
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            oo0o0O0 oo0o0o0 = smartRefreshLayout.f21351OoooOoO;
            if (oo0o0o0 != null) {
                oo0o0o0.OooO00o(smartRefreshLayout);
            } else {
                smartRefreshLayout.OooOO0(2000, true, false);
            }
        }
    }

    public class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f21400OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f21402OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f21398OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f21401OooO0oO = 0.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f21399OooO0o = AnimationUtils.currentAnimationTimeMillis();

        public OooOO0O(float f, int i) {
            this.f21402OooO0oo = f;
            this.f21400OooO0o0 = i;
            SmartRefreshLayout.this.f21373o00oO0O.postDelayed(this, 10);
            OooOOO oooOOO = SmartRefreshLayout.this.f21381o0ooOO0;
            if (f > 0.0f) {
                oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
            } else {
                oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f21362o00000 != this || smartRefreshLayout.f21382o0ooOOo.isFinishing) {
                return;
            }
            int iAbs = Math.abs(smartRefreshLayout.f21307OooO0o0);
            int i = this.f21400OooO0o0;
            if (iAbs < Math.abs(i)) {
                double d = this.f21402OooO0oo;
                int i2 = this.f21398OooO0Oo + 1;
                this.f21398OooO0Oo = i2;
                this.f21402OooO0oo = (float) (Math.pow(0.949999988079071d, i2 * 2) * d);
            } else if (i != 0) {
                double d2 = this.f21402OooO0oo;
                int i3 = this.f21398OooO0Oo + 1;
                this.f21398OooO0Oo = i3;
                this.f21402OooO0oo = (float) (Math.pow(0.44999998807907104d, i3 * 2) * d2);
            } else {
                double d3 = this.f21402OooO0oo;
                int i4 = this.f21398OooO0Oo + 1;
                this.f21398OooO0Oo = i4;
                this.f21402OooO0oo = (float) (Math.pow(0.8500000238418579d, i4 * 2) * d3);
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.f21402OooO0oo * (((jCurrentAnimationTimeMillis - this.f21399OooO0o) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.f21399OooO0o = jCurrentAnimationTimeMillis;
                float f2 = this.f21401OooO0oO + f;
                this.f21401OooO0oO = f2;
                smartRefreshLayout.OooOOo0(f2);
                smartRefreshLayout.f21373o00oO0O.postDelayed(this, 10);
                return;
            }
            RefreshState refreshState = smartRefreshLayout.f21383o0ooOoO;
            boolean z = refreshState.isDragging;
            OooOOO oooOOO = smartRefreshLayout.f21381o0ooOO0;
            if (z && refreshState.isHeader) {
                oooOOO.OooO0Oo(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                oooOOO.OooO0Oo(RefreshState.PullUpCanceled);
            }
            smartRefreshLayout.f21362o00000 = null;
            if (Math.abs(smartRefreshLayout.f21307OooO0o0) >= Math.abs(i)) {
                smartRefreshLayout.OooO0oO(i, 0, smartRefreshLayout.f21329OooOoo0, Math.min(Math.max((int) (Math.abs(smartRefreshLayout.f21307OooO0o0 - i) / OooOo00.f43255OooO0O0), 30), 100) * 10);
            }
        }
    }

    public class OooOOO implements o0OO0o.OooOO0O {
        public OooOOO() {
        }

        public final ValueAnimator OooO00o(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.OooO0oO(i, 0, smartRefreshLayout.f21329OooOoo0, smartRefreshLayout.f21304OooO);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x008f  */
        public final OooOOO OooO0O0(int i, boolean z) {
            int i2;
            boolean z2;
            o0OO0o.OooO0o oooO0o;
            o0OO0o.OooO oooO;
            o0OO0o.OooO0o oooO0o2;
            o0OO0o.OooO oooO2;
            o0OO0o.OooO oooO3;
            o0OO0o.OooO0o oooO0o3;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f21307OooO0o0 == i && (((oooO3 = smartRefreshLayout.f21372o00o0O) == null || !oooO3.OooO0oO()) && ((oooO0o3 = smartRefreshLayout.f21375o00ooo) == null || !oooO0o3.OooO0oO()))) {
                return this;
            }
            int i3 = smartRefreshLayout.f21307OooO0o0;
            smartRefreshLayout.f21307OooO0o0 = i;
            if (z) {
                RefreshState refreshState = smartRefreshLayout.f21383o0ooOoO;
                if (refreshState.isDragging || refreshState.isOpening) {
                    float f = i;
                    float f2 = smartRefreshLayout.f21357OooooOo * smartRefreshLayout.f21370o00Oo0;
                    OooOOO oooOOO = smartRefreshLayout.f21381o0ooOO0;
                    if (f > f2) {
                        if (smartRefreshLayout.f21382o0ooOOo != RefreshState.ReleaseToTwoLevel) {
                            oooOOO.OooO0Oo(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i) > smartRefreshLayout.f21358Oooooo * smartRefreshLayout.f21371o00Ooo && !smartRefreshLayout.f21368o000oOoO) {
                        oooOOO.OooO0Oo(RefreshState.ReleaseToLoad);
                    } else if (i < 0 && !smartRefreshLayout.f21368o000oOoO) {
                        oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                    } else if (i > 0) {
                        oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                    }
                }
            }
            o0OO0oO.OooO00o oooO00o = smartRefreshLayout.f21384oo000o;
            o0OO0oO0.OooO0O0 oooO0O0 = o0OO0oO0.OooO0O0.f43237OooO0Oo;
            boolean z3 = smartRefreshLayout.f21333Oooo0;
            boolean z4 = smartRefreshLayout.f21336Oooo00o;
            if (oooO00o != null) {
                if (i < 0 || (oooO2 = smartRefreshLayout.f21372o00o0O) == null) {
                    i2 = 0;
                    z2 = false;
                } else {
                    if (smartRefreshLayout.OooOOOo(oooO2, z4)) {
                        i2 = i;
                    } else if (i3 < 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    z2 = true;
                }
                if (i <= 0 && (oooO0o2 = smartRefreshLayout.f21375o00ooo) != null) {
                    if (smartRefreshLayout.OooOOOo(oooO0o2, z3)) {
                        i2 = i;
                    } else if (i3 > 0) {
                        i2 = 0;
                    }
                    z2 = true;
                }
                if (z2) {
                    smartRefreshLayout.f21384oo000o.OooO0Oo(i2, smartRefreshLayout.f21321OooOo0, smartRefreshLayout.f21323OooOo0O);
                    if (smartRefreshLayout.f21368o000oOoO && smartRefreshLayout.f21348OoooOOO && smartRefreshLayout.f21337Oooo0O0) {
                        o0OO0o.OooO0o oooO0o4 = smartRefreshLayout.f21375o00ooo;
                        if ((oooO0o4 instanceof o0OO0o.OooO0o) && oooO0o4.getSpinnerStyle() == oooO0O0 && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo)) {
                            smartRefreshLayout.f21375o00ooo.getView().setTranslationY(Math.max(0, i2));
                        }
                    }
                    o0OO0oO0.OooO0O0 oooO0O1 = o0OO0oO0.OooO0O0.f43239OooO0o0;
                    boolean z5 = (smartRefreshLayout.f21334Oooo000 && (oooO = smartRefreshLayout.f21372o00o0O) != null && oooO.getSpinnerStyle() == oooO0O1) || smartRefreshLayout.f21379o0Oo0oo != 0;
                    boolean z6 = (smartRefreshLayout.f21335Oooo00O && (oooO0o = smartRefreshLayout.f21375o00ooo) != null && oooO0o.getSpinnerStyle() == oooO0O1) || smartRefreshLayout.f21377o0OO00O != 0;
                    if ((z5 && (i2 >= 0 || i3 > 0)) || (z6 && (i2 <= 0 || i3 < 0))) {
                        smartRefreshLayout.invalidate();
                    }
                }
            }
            if ((i >= 0 || i3 > 0) && smartRefreshLayout.f21372o00o0O != null) {
                int iMax = Math.max(i, 0);
                int i4 = smartRefreshLayout.f21357OooooOo;
                int i5 = (int) (i4 * smartRefreshLayout.f21386ooOO);
                float f3 = (iMax * 1.0f) / (i4 == 0 ? 1 : i4);
                if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO) || (smartRefreshLayout.f21382o0ooOOo == RefreshState.RefreshFinish && !z)) {
                    if (i3 != smartRefreshLayout.f21307OooO0o0) {
                        if (smartRefreshLayout.f21372o00o0O.getSpinnerStyle() == oooO0O0) {
                            smartRefreshLayout.f21372o00o0O.getView().setTranslationY(smartRefreshLayout.f21307OooO0o0);
                            if (smartRefreshLayout.f21379o0Oo0oo != 0 && smartRefreshLayout.f21374o00oO0o != null && !smartRefreshLayout.OooOOOo(smartRefreshLayout.f21372o00o0O, z4)) {
                                smartRefreshLayout.invalidate();
                            }
                        } else if (smartRefreshLayout.f21372o00o0O.getSpinnerStyle().f43244OooO0OO) {
                            View view = smartRefreshLayout.f21372o00o0O.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f21303o00000O;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(Math.max((smartRefreshLayout.f21307OooO0o0 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), Pow2.MAX_POW2));
                            int i6 = marginLayoutParams.leftMargin;
                            int i7 = marginLayoutParams.topMargin + smartRefreshLayout.f21361Ooooooo;
                            view.layout(i6, i7, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i7);
                        }
                        smartRefreshLayout.f21372o00o0O.OooO0o0(f3, iMax, i4, i5, z);
                    }
                    if (z && smartRefreshLayout.f21372o00o0O.OooO0oO()) {
                        int i8 = (int) smartRefreshLayout.f21314OooOOO0;
                        int width = smartRefreshLayout.getWidth();
                        smartRefreshLayout.f21372o00o0O.OooO(i8, smartRefreshLayout.f21314OooOOO0 / (width == 0 ? 1 : width), width);
                    }
                }
            }
            if ((i <= 0 || i3 < 0) && smartRefreshLayout.f21375o00ooo != null) {
                int i9 = -Math.min(i, 0);
                int i10 = smartRefreshLayout.f21358Oooooo;
                int i11 = (int) (i10 * smartRefreshLayout.f21369o00O0O);
                float f4 = (i9 * 1.0f) / (i10 == 0 ? 1 : i10);
                if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo) || (smartRefreshLayout.f21382o0ooOOo == RefreshState.LoadFinish && !z)) {
                    if (i3 != smartRefreshLayout.f21307OooO0o0) {
                        if (smartRefreshLayout.f21375o00ooo.getSpinnerStyle() == oooO0O0) {
                            smartRefreshLayout.f21375o00ooo.getView().setTranslationY(smartRefreshLayout.f21307OooO0o0);
                            if (smartRefreshLayout.f21377o0OO00O != 0 && smartRefreshLayout.f21374o00oO0o != null && !smartRefreshLayout.OooOOOo(smartRefreshLayout.f21375o00ooo, z3)) {
                                smartRefreshLayout.invalidate();
                            }
                        } else if (smartRefreshLayout.f21375o00ooo.getSpinnerStyle().f43244OooO0OO) {
                            View view2 = smartRefreshLayout.f21375o00ooo.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f21303o00000O;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(Math.max(((-smartRefreshLayout.f21307OooO0o0) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), Pow2.MAX_POW2));
                            int i12 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (smartRefreshLayout.getMeasuredHeight() + marginLayoutParams2.topMargin) - smartRefreshLayout.f21380o0OoOo0;
                            view2.layout(i12, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i12, measuredHeight);
                        }
                        smartRefreshLayout.f21375o00ooo.OooO0o0(f4, i9, i10, i11, z);
                    }
                    if (z && smartRefreshLayout.f21375o00ooo.OooO0oO()) {
                        int i13 = (int) smartRefreshLayout.f21314OooOOO0;
                        int width2 = smartRefreshLayout.getWidth();
                        smartRefreshLayout.f21375o00ooo.OooO(i13, smartRefreshLayout.f21314OooOOO0 / (width2 == 0 ? 1 : width2), width2);
                    }
                }
            }
            return this;
        }

        public final OooOOO OooO0OO(@NonNull o0OO0o.OooOO0 oooOO1, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f21374o00oO0o == null && i != 0) {
                smartRefreshLayout.f21374o00oO0o = new Paint();
            }
            if (oooOO1.equals(smartRefreshLayout.f21372o00o0O)) {
                smartRefreshLayout.f21379o0Oo0oo = i;
            } else if (oooOO1.equals(smartRefreshLayout.f21375o00ooo)) {
                smartRefreshLayout.f21377o0OO00O = i;
            }
            return this;
        }

        public final void OooO0Oo(@NonNull RefreshState refreshState) {
            int i = OooO00o.f21390OooO00o[refreshState.ordinal()];
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            switch (i) {
                case 1:
                    RefreshState refreshState2 = smartRefreshLayout.f21382o0ooOOo;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f21307OooO0o0 == 0) {
                        smartRefreshLayout.OooOOo(refreshState3);
                    } else if (smartRefreshLayout.f21307OooO0o0 != 0) {
                        OooO00o(0);
                    }
                    break;
                case 2:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.PullDownToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo)) {
                        RefreshState refreshState4 = smartRefreshLayout.f21382o0ooOOo;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout.f21368o000oOoO || !smartRefreshLayout.f21337Oooo0O0 || !smartRefreshLayout.f21348OoooOOO)) {
                            smartRefreshLayout.OooOOo(RefreshState.PullUpToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.PullDownCanceled);
                        OooO0Oo(RefreshState.None);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    if (!smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo) || smartRefreshLayout.f21382o0ooOOo.isOpening || (smartRefreshLayout.f21368o000oOoO && smartRefreshLayout.f21337Oooo0O0 && smartRefreshLayout.f21348OoooOOO)) {
                        smartRefreshLayout.setViceState(RefreshState.PullUpCanceled);
                    } else {
                        smartRefreshLayout.OooOOo(RefreshState.PullUpCanceled);
                        OooO0Oo(RefreshState.None);
                    }
                    break;
                case 6:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.ReleaseToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo)) {
                        RefreshState refreshState5 = smartRefreshLayout.f21382o0ooOOo;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout.f21368o000oOoO || !smartRefreshLayout.f21337Oooo0O0 || !smartRefreshLayout.f21348OoooOOO)) {
                            smartRefreshLayout.OooOOo(RefreshState.ReleaseToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.ReleaseToTwoLevel);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21330OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.RefreshReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    if (!smartRefreshLayout.f21382o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f21331OooOooo)) {
                        smartRefreshLayout.OooOOo(RefreshState.LoadReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    smartRefreshLayout.setStateRefreshing(true);
                    break;
                case 12:
                    smartRefreshLayout.setStateLoading(true);
                    break;
                case 13:
                    if (smartRefreshLayout.f21382o0ooOOo == RefreshState.Refreshing) {
                        smartRefreshLayout.OooOOo(RefreshState.RefreshFinish);
                    }
                    break;
                case 14:
                    if (smartRefreshLayout.f21382o0ooOOo == RefreshState.Loading) {
                        smartRefreshLayout.OooOOo(RefreshState.LoadFinish);
                    }
                    break;
                case 15:
                    smartRefreshLayout.OooOOo(RefreshState.TwoLevelReleased);
                    break;
                case 16:
                    smartRefreshLayout.OooOOo(RefreshState.TwoLevelFinish);
                    break;
                case 17:
                    smartRefreshLayout.OooOOo(RefreshState.TwoLevel);
                    break;
            }
        }
    }

    public class OooOOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f21404OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f21406OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f21405OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f21407OooO0oO = AnimationUtils.currentAnimationTimeMillis();

        public OooOOO0(float f) {
            this.f21406OooO0o0 = f;
            this.f21404OooO0Oo = SmartRefreshLayout.this.f21307OooO0o0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f21362o00000 != this || smartRefreshLayout.f21382o0ooOOo.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f21407OooO0oO;
            float fPow = (float) (Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.f21405OooO0o) / (1000.0f / 10)) * ((double) this.f21406OooO0o0));
            this.f21406OooO0o0 = fPow;
            float f = ((j * 1.0f) / 1000.0f) * fPow;
            if (Math.abs(f) <= 1.0f) {
                smartRefreshLayout.f21362o00000 = null;
                return;
            }
            this.f21407OooO0oO = jCurrentAnimationTimeMillis;
            int i = (int) (this.f21404OooO0Oo + f);
            this.f21404OooO0Oo = i;
            int i2 = smartRefreshLayout.f21307OooO0o0 * i;
            OooOOO oooOOO = smartRefreshLayout.f21381o0ooOO0;
            if (i2 > 0) {
                oooOOO.OooO0O0(i, true);
                smartRefreshLayout.f21373o00oO0O.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout.f21362o00000 = null;
            oooOOO.OooO0O0(0, true);
            View view = smartRefreshLayout.f21384oo000o.f43219OooO0o;
            int i3 = (int) (-this.f21406OooO0o0);
            float f2 = OooOo00.f43255OooO0O0;
            if (view instanceof ScrollView) {
                ((ScrollView) view).fling(i3);
            } else if (view instanceof AbsListView) {
                ((AbsListView) view).fling(i3);
            } else if (view instanceof WebView) {
                ((WebView) view).flingScroll(0, i3);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).OooO0o0(i3);
            } else if (view instanceof RecyclerView) {
                ((RecyclerView) view).fling(0, i3);
            }
            if (!smartRefreshLayout.f21363o000000 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout.f21363o000000 = false;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void setDefaultRefreshFooterCreator(@NonNull o0OO0o.OooO00o oooO00o) {
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull o0OO0o.OooO0O0 oooO0O0) {
    }

    public static void setDefaultRefreshInitializer(@NonNull o0OO0o.OooO0OO oooO0OO) {
    }

    public final void OooO() {
        RefreshState refreshState = this.f21382o0ooOOo;
        if (refreshState == RefreshState.Refreshing) {
            OooOO0o(true);
            return;
        }
        if (refreshState == RefreshState.Loading) {
            OooOO0O(true);
        } else if (this.f21307OooO0o0 != 0) {
            OooO0oO(0, 0, this.f21329OooOoo0, this.f21304OooO);
        }
    }

    public final ValueAnimator OooO0oO(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f21307OooO0o0 == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f21366o00000O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f21362o00000 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f21307OooO0o0, i);
        this.f21366o00000O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f21366o00000O0.setInterpolator(interpolator);
        this.f21366o00000O0.addListener(new OooO0o());
        this.f21366o00000O0.addUpdateListener(new OooO());
        this.f21366o00000O0.setStartDelay(i2);
        this.f21366o00000O0.start();
        return this.f21366o00000O0;
    }

    public final boolean OooO0oo() {
        if (this.f21382o0ooOOo != RefreshState.None || !OooOOOO(this.f21330OooOooO)) {
            return false;
        }
        OooOo oooOo = new OooOo((XRefreshLayout) this);
        setViceState(RefreshState.Refreshing);
        oooOo.run();
        return true;
    }

    public final void OooOO0(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        p333o0OO0o0o.OooOo00 oooOo00 = new p333o0OO0o0o.OooOo00(this, i2, z2, z);
        if (i3 > 0) {
            this.f21373o00oO0O.postDelayed(oooOo00, i3);
        } else {
            oooOo00.run();
        }
    }

    public final void OooOO0O(boolean z) {
        OooOO0(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f21378o0OOO0o))), 300) << 16 : 0, z, false);
    }

    public final SmartRefreshLayout OooOO0o(boolean z) {
        if (z) {
            OooOOO0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f21378o0OOO0o))), 300) << 16, true, Boolean.FALSE);
            return this;
        }
        OooOOO0(0, false, null);
        return this;
    }

    public final boolean OooOOO(int i) {
        if (i == 0) {
            if (this.f21366o00000O0 != null) {
                RefreshState refreshState = this.f21382o0ooOOo;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased) {
                    return true;
                }
                RefreshState refreshState2 = RefreshState.PullDownCanceled;
                OooOOO oooOOO = this.f21381o0ooOO0;
                if (refreshState == refreshState2) {
                    oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                }
                this.f21366o00000O0.cancel();
                this.f21366o00000O0 = null;
            }
            this.f21362o00000 = null;
        }
        return this.f21366o00000O0 != null;
    }

    public final void OooOOO0(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        OooOOOO oooOOOO = new OooOOOO(this, i2, bool, z);
        if (i3 > 0) {
            this.f21373o00oO0O.postDelayed(oooOOOO, i3);
        } else {
            oooOOOO.run();
        }
    }

    public final boolean OooOOOO(boolean z) {
        return z && !this.f21342Oooo0oo;
    }

    public final boolean OooOOOo(o0OO0o.OooOO0 oooOO1, boolean z) {
        return z || this.f21342Oooo0oo || oooOO1 == null || oooOO1.getSpinnerStyle() == o0OO0oO0.OooO0O0.f43239OooO0o0;
    }

    public final void OooOOo(RefreshState refreshState) {
        RefreshState refreshState2 = this.f21382o0ooOOo;
        if (refreshState2 == refreshState) {
            if (this.f21383o0ooOoO != refreshState2) {
                this.f21383o0ooOoO = refreshState2;
                return;
            }
            return;
        }
        this.f21382o0ooOOo = refreshState;
        this.f21383o0ooOoO = refreshState;
        o0OO0o.OooO oooO = this.f21372o00o0O;
        o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
        if (oooO != null) {
            oooO.OooO0OO(this, refreshState2, refreshState);
        }
        if (oooO0o != null) {
            oooO0o.OooO0OO(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f21363o000000 = false;
        }
    }

    public final void OooOOo0(float f) {
        OooOOO oooOOO;
        RefreshState refreshState;
        float f2 = (!this.f21353Ooooo00 || this.f21344OoooO0 || f >= 0.0f || this.f21384oo000o.OooO00o()) ? f : 0.0f;
        int i = this.f21310OooOO0;
        if (f2 > i * 5 && getTag() == null) {
            Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
            setTag("你这么死拉，臣妾做不到啊！");
        }
        RefreshState refreshState2 = this.f21382o0ooOOo;
        RefreshState refreshState3 = RefreshState.TwoLevel;
        OooOOO oooOOO2 = this.f21381o0ooOO0;
        if (refreshState2 != refreshState3 || f2 <= 0.0f) {
            RefreshState refreshState4 = RefreshState.Refreshing;
            float f3 = this.f21315OooOOOO;
            if (refreshState2 != refreshState4 || f2 < 0.0f) {
                oooOOO = oooOOO2;
                if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f21337Oooo0O0 && this.f21368o000oOoO && this.f21348OoooOOO && OooOOOO(this.f21331OooOooo)) || (this.f21341Oooo0oO && !this.f21368o000oOoO && OooOOOO(this.f21331OooOooo))))) {
                    int i2 = this.f21358Oooooo;
                    if (f2 > (-i2)) {
                        oooOOO.OooO0O0((int) f2, true);
                    } else {
                        double d = (this.f21369o00O0O - 1.0f) * i2;
                        int iMax = Math.max((i * 4) / 3, getHeight());
                        int i3 = this.f21358Oooooo;
                        double d2 = iMax - i3;
                        double d3 = -Math.min(0.0f, (i3 + f2) * f3);
                        double d4 = -d3;
                        if (d2 == 0.0d) {
                            d2 = 1.0d;
                        }
                        oooOOO.OooO0O0(((int) (-Math.min(d * (1.0d - Math.pow(100.0d, d4 / d2)), d3))) - this.f21358Oooooo, true);
                    }
                } else if (f2 >= 0.0f) {
                    double d5 = this.f21386ooOO * this.f21357OooooOo;
                    double dMax = Math.max(i / 2, getHeight());
                    double dMax2 = Math.max(0.0f, f3 * f2);
                    double d6 = -dMax2;
                    if (dMax == 0.0d) {
                        dMax = 1.0d;
                    }
                    oooOOO.OooO0O0((int) Math.min((1.0d - Math.pow(100.0d, d6 / dMax)) * d5, dMax2), true);
                } else {
                    double d7 = this.f21369o00O0O * this.f21358Oooooo;
                    double dMax3 = Math.max(i / 2, getHeight());
                    double d8 = -Math.min(0.0f, f3 * f2);
                    double d9 = -d8;
                    if (dMax3 == 0.0d) {
                        dMax3 = 1.0d;
                    }
                    oooOOO.OooO0O0((int) (-Math.min((1.0d - Math.pow(100.0d, d9 / dMax3)) * d7, d8)), true);
                }
            } else {
                float f4 = this.f21357OooooOo;
                if (f2 < f4) {
                    oooOOO2.OooO0O0((int) f2, true);
                } else {
                    double d10 = (this.f21386ooOO - 1.0f) * f4;
                    int iMax2 = Math.max((i * 4) / 3, getHeight());
                    int i4 = this.f21357OooooOo;
                    double d11 = iMax2 - i4;
                    double dMax4 = Math.max(0.0f, (f2 - i4) * f3);
                    double d12 = -dMax4;
                    if (d11 == 0.0d) {
                        d11 = 1.0d;
                    }
                    int iMin = ((int) Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / d11)), dMax4)) + this.f21357OooooOo;
                    oooOOO = oooOOO2;
                    oooOOO.OooO0O0(iMin, true);
                }
            }
            if (this.f21341Oooo0oO || this.f21368o000oOoO || !OooOOOO(this.f21331OooOooo) || f2 >= 0.0f || (refreshState = this.f21382o0ooOOo) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
                return;
            }
            if (this.f21347OoooOO0) {
                this.f21362o00000 = null;
                oooOOO.OooO00o(-this.f21358Oooooo);
            }
            setStateDirectLoading(false);
            this.f21373o00oO0O.postDelayed(new OooOO0(), this.f21304OooO);
            return;
        }
        oooOOO2.OooO0O0(Math.min((int) f2, getMeasuredHeight()), true);
        oooOOO = oooOOO2;
        if (this.f21341Oooo0oO) {
        }
    }

    public final void OooOOoo() {
        RefreshState refreshState = this.f21382o0ooOOo;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        OooOOO oooOOO = this.f21381o0ooOO0;
        if (refreshState == refreshState2) {
            if (this.f21326OooOoO0 > -1000 && this.f21307OooO0o0 > getMeasuredHeight() / 2) {
                ValueAnimator valueAnimatorOooO00o = oooOOO.OooO00o(getMeasuredHeight());
                if (valueAnimatorOooO00o != null) {
                    valueAnimatorOooO00o.setDuration(this.f21309OooO0oo);
                    return;
                }
                return;
            }
            if (this.f21318OooOOo0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f21382o0ooOOo == refreshState2) {
                    smartRefreshLayout.f21381o0ooOO0.OooO0Oo(RefreshState.TwoLevelFinish);
                    if (smartRefreshLayout.f21307OooO0o0 != 0) {
                        oooOOO.OooO00o(0).setDuration(smartRefreshLayout.f21309OooO0oo);
                        return;
                    } else {
                        oooOOO.OooO0O0(0, false);
                        smartRefreshLayout.OooOOo(RefreshState.None);
                        return;
                    }
                }
                return;
            }
            return;
        }
        RefreshState refreshState3 = RefreshState.Loading;
        if (refreshState == refreshState3 || (this.f21337Oooo0O0 && this.f21368o000oOoO && this.f21348OoooOOO && this.f21307OooO0o0 < 0 && OooOOOO(this.f21331OooOooo))) {
            int i = this.f21307OooO0o0;
            int i2 = -this.f21358Oooooo;
            if (i < i2) {
                oooOOO.OooO00o(i2);
                return;
            } else {
                if (i > 0) {
                    oooOOO.OooO00o(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState4 = this.f21382o0ooOOo;
        RefreshState refreshState5 = RefreshState.Refreshing;
        if (refreshState4 == refreshState5) {
            int i3 = this.f21307OooO0o0;
            int i4 = this.f21357OooooOo;
            if (i3 > i4) {
                oooOOO.OooO00o(i4);
                return;
            } else {
                if (i3 < 0) {
                    oooOOO.OooO00o(0);
                    return;
                }
                return;
            }
        }
        if (refreshState4 == RefreshState.PullDownToRefresh) {
            oooOOO.OooO0Oo(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState4 == RefreshState.PullUpToLoad) {
            oooOOO.OooO0Oo(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToRefresh) {
            oooOOO.OooO0Oo(refreshState5);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToLoad) {
            oooOOO.OooO0Oo(refreshState3);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToTwoLevel) {
            oooOOO.OooO0Oo(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState4 == RefreshState.RefreshReleased) {
            if (this.f21366o00000O0 == null) {
                oooOOO.OooO00o(this.f21357OooooOo);
            }
        } else if (refreshState4 == RefreshState.LoadReleased) {
            if (this.f21366o00000O0 == null) {
                oooOOO.OooO00o(-this.f21358Oooooo);
            }
        } else if (this.f21307OooO0o0 != 0) {
            oooOOO.OooO00o(0);
        }
    }

    public final void OooOo(@NonNull o0OO0o.OooO0o oooO0o) {
        o0OO0o.OooO0o oooO0o2;
        o0OO0o.OooO0o oooO0o3 = this.f21375o00ooo;
        if (oooO0o3 != null) {
            super.removeView(oooO0o3.getView());
        }
        this.f21375o00ooo = oooO0o;
        this.f21363o000000 = false;
        this.f21377o0OO00O = 0;
        this.f21348OoooOOO = false;
        this.f21376o0O0O00 = false;
        this.f21360OoooooO = this.f21360OoooooO.OooO0O0();
        this.f21331OooOooo = !this.f21349OoooOOo || this.f21331OooOooo;
        if (this.f21375o00ooo.getSpinnerStyle().f43243OooO0O0) {
            super.addView(this.f21375o00ooo.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f21375o00ooo.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f21328OooOoo;
        if (iArr == null || (oooO0o2 = this.f21375o00ooo) == null) {
            return;
        }
        oooO0o2.setPrimaryColors(iArr);
    }

    public final void OooOo0(float f) {
        this.f21369o00O0O = f;
        o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
        if (oooO0o == null || !this.f21367o000OOo) {
            this.f21360OoooooO = this.f21360OoooooO.OooO0O0();
            return;
        }
        int i = this.f21358Oooooo;
        oooO0o.OooO00o(this.f21381o0ooOO0, i, (int) (i * f));
    }

    public final void OooOo00(boolean z) {
        this.f21349OoooOOo = true;
        this.f21331OooOooo = z;
    }

    public final SmartRefreshLayout OooOo0O(float f) {
        this.f21386ooOO = f;
        o0OO0o.OooO oooO = this.f21372o00o0O;
        if (oooO == null || !this.f21367o000OOo) {
            this.f21359Oooooo0 = this.f21359Oooooo0.OooO0O0();
        } else {
            int i = this.f21357OooooOo;
            oooO.OooO00o(this.f21381o0ooOO0, i, (int) (f * i));
        }
        return this;
    }

    public final void OooOo0o(boolean z) {
        if (this.f21382o0ooOOo == RefreshState.Loading && z) {
            OooOO0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f21378o0OOO0o))), 300) << 16, true, true);
            return;
        }
        if (this.f21368o000oOoO != z) {
            this.f21368o000oOoO = z;
            o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
            if (oooO0o instanceof o0OO0o.OooO0o) {
                if (!oooO0o.OooO0O0(z)) {
                    this.f21348OoooOOO = false;
                    new RuntimeException("Footer:" + this.f21375o00ooo + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                    return;
                }
                this.f21348OoooOOO = true;
                if (this.f21368o000oOoO && this.f21337Oooo0O0 && this.f21307OooO0o0 > 0 && this.f21375o00ooo.getSpinnerStyle() == o0OO0oO0.OooO0O0.f43237OooO0Oo && OooOOOO(this.f21331OooOooo)) {
                    if (OooOOOo(this.f21372o00o0O, this.f21330OooOooO)) {
                        this.f21375o00ooo.getView().setTranslationY(this.f21307OooO0o0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    public final boolean OooOoO(float f) {
        RefreshState refreshState;
        if (f == 0.0f) {
            f = this.f21326OooOoO0;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f21384oo000o != null) {
            getScaleY();
            View view = this.f21384oo000o.f43218OooO0Oo;
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        int i = 0;
        if (Math.abs(f) > this.f21324OooOo0o) {
            int i2 = this.f21307OooO0o0;
            if (i2 * f < 0.0f) {
                RefreshState refreshState2 = this.f21382o0ooOOo;
                RefreshState refreshState3 = RefreshState.Refreshing;
                if (refreshState2 == refreshState3 || refreshState2 == RefreshState.Loading || (i2 < 0 && this.f21368o000oOoO)) {
                    OooOOO0 oooOOO0 = new OooOOO0(f);
                    RefreshState refreshState4 = this.f21382o0ooOOo;
                    if (refreshState4.isFinishing) {
                        oooOOO0 = null;
                    } else {
                        if (this.f21307OooO0o0 != 0 && ((!refreshState4.isOpening && (!this.f21368o000oOoO || !this.f21337Oooo0O0 || !this.f21348OoooOOO || !OooOOOO(this.f21331OooOooo))) || (((this.f21382o0ooOOo == RefreshState.Loading || (this.f21368o000oOoO && this.f21337Oooo0O0 && this.f21348OoooOOO && OooOOOO(this.f21331OooOooo))) && this.f21307OooO0o0 < (-this.f21358Oooooo)) || (this.f21382o0ooOOo == refreshState3 && this.f21307OooO0o0 > this.f21357OooooOo)))) {
                            int i3 = this.f21307OooO0o0;
                            float fPow = oooOOO0.f21406OooO0o0;
                            int i4 = i3;
                            while (true) {
                                if (i3 * i4 > 0) {
                                    i++;
                                    fPow = (float) (Math.pow(0.98f, (i * 10) / 10.0f) * ((double) fPow));
                                    float f2 = ((10 * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f2) < 1.0f) {
                                        RefreshState refreshState5 = this.f21382o0ooOOo;
                                        if (!refreshState5.isOpening || ((refreshState5 == (refreshState = RefreshState.Refreshing) && i4 > this.f21357OooooOo) || (refreshState5 != refreshState && i4 < (-this.f21358Oooooo)))) {
                                            oooOOO0 = null;
                                        }
                                    } else {
                                        i4 = (int) (i4 + f2);
                                    }
                                }
                            }
                        }
                        oooOOO0.f21405OooO0o = AnimationUtils.currentAnimationTimeMillis();
                        this.f21373o00oO0O.postDelayed(oooOOO0, 10);
                    }
                    this.f21362o00000 = oooOOO0;
                    return true;
                }
                if (refreshState2.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f21340Oooo0o0 && (this.f21331OooOooo || this.f21339Oooo0o)) || ((this.f21382o0ooOOo == RefreshState.Loading && i2 >= 0) || (this.f21341Oooo0oO && OooOOOO(this.f21331OooOooo))))) || (f > 0.0f && ((this.f21340Oooo0o0 && this.f21330OooOooO) || this.f21339Oooo0o || (this.f21382o0ooOOo == RefreshState.Refreshing && this.f21307OooO0o0 <= 0)))) {
                this.f21364o000000O = false;
                Scroller scroller = this.f21325OooOoO;
                scroller.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                scroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public final void OooOoO0(@NonNull o0OO0o.OooO oooO) {
        o0OO0o.OooO oooO2;
        o0OO0o.OooO oooO3 = this.f21372o00o0O;
        if (oooO3 != null) {
            super.removeView(oooO3.getView());
        }
        this.f21372o00o0O = oooO;
        this.f21379o0Oo0oo = 0;
        this.f21385oo0o0Oo = false;
        this.f21359Oooooo0 = this.f21359Oooooo0.OooO0O0();
        if (this.f21372o00o0O.getSpinnerStyle().f43243OooO0O0) {
            super.addView(this.f21372o00o0O.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f21372o00o0O.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f21328OooOoo;
        if (iArr == null || (oooO2 = this.f21372o00o0O) == null) {
            return;
        }
        oooO2.setPrimaryColors(iArr);
    }

    @Override // android.view.View
    public final void computeScroll() {
        RefreshState refreshState;
        Scroller scroller = this.f21325OooOoO;
        scroller.getCurrY();
        if (scroller.computeScrollOffset()) {
            int finalY = scroller.getFinalY();
            if ((finalY >= 0 || !((this.f21330OooOooO || this.f21339Oooo0o) && this.f21384oo000o.OooO0O0())) && (finalY <= 0 || !((this.f21331OooOooo || this.f21339Oooo0o) && this.f21384oo000o.OooO00o()))) {
                this.f21364o000000O = true;
                invalidate();
                return;
            }
            if (this.f21364o000000O) {
                float currVelocity = finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity();
                if (this.f21366o00000O0 == null) {
                    if (currVelocity > 0.0f && ((refreshState = this.f21382o0ooOOo) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                        this.f21362o00000 = new OooOO0O(currVelocity, this.f21357OooooOo);
                    } else if (currVelocity < 0.0f && (this.f21382o0ooOOo == RefreshState.Loading || ((this.f21337Oooo0O0 && this.f21368o000oOoO && this.f21348OoooOOO && OooOOOO(this.f21331OooOooo)) || (this.f21341Oooo0oO && !this.f21368o000oOoO && OooOOOO(this.f21331OooOooo) && this.f21382o0ooOOo != RefreshState.Refreshing)))) {
                        this.f21362o00000 = new OooOO0O(currVelocity, -this.f21358Oooooo);
                    } else if (this.f21307OooO0o0 == 0 && this.f21340Oooo0o0) {
                        this.f21362o00000 = new OooOO0O(currVelocity, 0);
                    }
                }
            }
            scroller.forceFinished(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:128:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0183  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01db  */
    /* JADX WARN: Code duplicated, block: B:173:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:176:0x0234  */
    /* JADX WARN: Code duplicated, block: B:182:0x0241  */
    /* JADX WARN: Code duplicated, block: B:189:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x025f  */
    /* JADX WARN: Code duplicated, block: B:197:0x027b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0284  */
    /* JADX WARN: Code duplicated, block: B:206:0x028e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0296  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:239:0x0337  */
    /* JADX WARN: Code duplicated, block: B:241:0x035d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0369  */
    /* JADX WARN: Code duplicated, block: B:245:0x036f  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
    
        if (r4.isFooter != false) goto L248;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RefreshState refreshState;
        RefreshState refreshState2;
        VelocityTracker velocityTracker;
        o0OO0oO.OooO00o oooO00o;
        PointF pointF;
        View view;
        View view2;
        MotionEvent motionEvent2;
        float f;
        float f2;
        boolean z;
        OooOOO oooOOO;
        int i;
        int i2;
        RefreshState refreshState3;
        long eventTime;
        MotionEvent motionEventObtain;
        RefreshState refreshState4;
        char c;
        int i3;
        RefreshState refreshState5;
        ViewParent parent;
        float f3;
        RefreshState refreshState6;
        o0OO0o.OooO0o oooO0o;
        o0OO0o.OooO oooO;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 0;
        boolean z2 = actionMasked == 6;
        int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (actionIndex != i5) {
                x += motionEvent.getX(i5);
                y += motionEvent.getY(i5);
            }
        }
        if (z2) {
            pointerCount--;
        }
        float f4 = pointerCount;
        float f5 = x / f4;
        float f6 = y / f4;
        if ((actionMasked == 6 || actionMasked == 5) && this.f21318OooOOo0) {
            this.f21312OooOO0o = (f6 - this.f21313OooOOO) + this.f21312OooOO0o;
        }
        this.f21314OooOOO0 = f5;
        this.f21313OooOOO = f6;
        if (this.f21353Ooooo00) {
            int i6 = this.f21352OoooOoo;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i6 == this.f21352OoooOoo) {
                int i7 = (int) this.f21314OooOOO0;
                int width = getWidth();
                float f7 = this.f21314OooOOO0 / (width != 0 ? width : 1);
                if (OooOOOO(this.f21330OooOooO) && this.f21307OooO0o0 > 0 && (oooO = this.f21372o00o0O) != null && oooO.OooO0oO()) {
                    this.f21372o00o0O.OooO(i7, f7, width);
                } else if (OooOOOO(this.f21331OooOooo) && this.f21307OooO0o0 < 0 && (oooO0o = this.f21375o00ooo) != null && oooO0o.OooO0oO()) {
                    this.f21375o00ooo.OooO(i7, f7, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.f21330OooOooO || this.f21331OooOooo || this.f21339Oooo0o)) {
            if (!this.f21385oo0o0Oo) {
                if (this.f21376o0O0O00) {
                    refreshState6 = this.f21382o0ooOOo;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOOO(actionMasked)) {
                    refreshState = this.f21382o0ooOOo;
                    if (!refreshState.isFinishing) {
                        velocityTracker = this.f21327OooOoOO;
                        if (actionMasked != 0) {
                            this.f21326OooOoO0 = 0;
                            velocityTracker.addMovement(motionEvent);
                            this.f21325OooOoO.forceFinished(true);
                            this.f21311OooOO0O = f5;
                            this.f21312OooOO0o = f6;
                            this.f21306OooO0o = 0;
                            this.f21308OooO0oO = this.f21307OooO0o0;
                            this.f21318OooOOo0 = false;
                            this.f21317OooOOo = super.dispatchTouchEvent(motionEvent);
                            if (this.f21382o0ooOOo != RefreshState.TwoLevel) {
                            }
                            oooO00o = this.f21384oo000o;
                            if (oooO00o != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooO00o.f43218OooO0Oo.getLeft(), -oooO00o.f43218OooO0Oo.getTop());
                                view = oooO00o.f43219OooO0o;
                                view2 = oooO00o.f43218OooO0Oo;
                                if (view != view2) {
                                    oooO00o.f43219OooO0o = o0OO0oO.OooO00o.OooO0OO(view2, pointF, view);
                                }
                                if (oooO00o.f43219OooO0o == oooO00o.f43218OooO0Oo) {
                                    oooO00o.f43225OooOO0o.f43226OooO00o = null;
                                } else {
                                    oooO00o.f43225OooOO0o.f43226OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f5 - this.f21311OooOO0O;
                                f2 = f6 - this.f21312OooOO0o;
                                velocityTracker.addMovement(motionEvent);
                                z = this.f21318OooOOo0;
                                oooOOO = this.f21381o0ooOO0;
                                i = this.f21305OooO0Oo;
                                if (!z) {
                                    if (c != 'v') {
                                        f3 = i;
                                        if (Math.abs(f2) < f3) {
                                        }
                                        if (Math.abs(f) >= f3) {
                                            this.f21316OooOOOo = 'h';
                                        }
                                    } else {
                                        this.f21316OooOOOo = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f21318OooOOo0 = true;
                                                this.f21312OooOO0o = i + f6;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f21318OooOOo0 = true;
                                            this.f21312OooOO0o = i + f6;
                                        }
                                        if (this.f21318OooOOo0) {
                                            f2 = f6 - this.f21312OooOO0o;
                                            if (this.f21317OooOOo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            i3 = this.f21307OooO0o0;
                                            if (i3 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            oooOOO.OooO0Oo(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f21318OooOOo0) {
                                    i2 = ((int) f2) + this.f21308OooO0oO;
                                    refreshState3 = this.f21383o0ooOoO;
                                    if (refreshState3.isHeader) {
                                        this.f21306OooO0o = i2;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f21365o000000o == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.f21311OooOO0O + f, this.f21312OooOO0o, 0);
                                            this.f21365o000000o = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f21311OooOO0O + f, this.f21312OooOO0o + i2, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f21363o000000) {
                                            this.f21363o000000 = false;
                                        }
                                        if (i2 <= 0) {
                                            if (i2 < 0) {
                                                i4 = i2;
                                            } else {
                                                i4 = i2;
                                            }
                                        } else if (i2 < 0) {
                                            i4 = i2;
                                        } else {
                                            i4 = i2;
                                        }
                                        refreshState4 = this.f21383o0ooOoO;
                                        if (!refreshState4.isHeader) {
                                            if (this.f21365o000000o != null) {
                                                this.f21365o000000o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i2 = i4;
                                        } else {
                                            if (this.f21365o000000o != null) {
                                                this.f21365o000000o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i2 = i4;
                                        }
                                        if (this.f21307OooO0o0 != 0) {
                                            OooOOo0(0.0f);
                                        }
                                        return true;
                                    }
                                    this.f21306OooO0o = i2;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.f21365o000000o == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.f21311OooOO0O + f, this.f21312OooOO0o, 0);
                                        this.f21365o000000o = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f21311OooOO0O + f, this.f21312OooOO0o + i2, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.f21363o000000) {
                                        this.f21363o000000 = false;
                                    }
                                    if (i2 <= 0) {
                                        if (i2 < 0) {
                                            i4 = i2;
                                        } else {
                                            i4 = i2;
                                        }
                                    } else if (i2 < 0) {
                                        i4 = i2;
                                    } else {
                                        i4 = i2;
                                    }
                                    refreshState4 = this.f21383o0ooOoO;
                                    if (!refreshState4.isHeader) {
                                        if (this.f21365o000000o != null) {
                                            this.f21365o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    } else {
                                        if (this.f21365o000000o != null) {
                                            this.f21365o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    }
                                    if (this.f21307OooO0o0 != 0) {
                                        OooOOo0(0.0f);
                                    }
                                    return true;
                                    OooOOo0(i2);
                                    return true;
                                }
                                if (this.f21363o000000) {
                                    this.f21363o000000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        velocityTracker.addMovement(motionEvent);
                        velocityTracker.computeCurrentVelocity(1000, this.f21320OooOo);
                        this.f21326OooOoO0 = (int) velocityTracker.getYVelocity();
                        OooOoO(0.0f);
                        velocityTracker.clear();
                        this.f21316OooOOOo = 'n';
                        motionEvent2 = this.f21365o000000o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f21365o000000o = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.f21311OooOO0O, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        OooOOoo();
                        if (this.f21318OooOOo0) {
                            this.f21318OooOOo0 = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.f21382o0ooOOo;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.f21376o0O0O00) {
                    refreshState6 = this.f21382o0ooOOo;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOOO(actionMasked)) {
                    refreshState = this.f21382o0ooOOo;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.f21347OoooOO0) && (refreshState != RefreshState.Refreshing || !this.f21343OoooO))) {
                        velocityTracker = this.f21327OooOoOO;
                        if (actionMasked != 0) {
                            this.f21326OooOoO0 = 0;
                            velocityTracker.addMovement(motionEvent);
                            this.f21325OooOoO.forceFinished(true);
                            this.f21311OooOO0O = f5;
                            this.f21312OooOO0o = f6;
                            this.f21306OooO0o = 0;
                            this.f21308OooO0oO = this.f21307OooO0o0;
                            this.f21318OooOOo0 = false;
                            this.f21317OooOOo = super.dispatchTouchEvent(motionEvent);
                            if (this.f21382o0ooOOo != RefreshState.TwoLevel && this.f21312OooOO0o < (getMeasuredHeight() * 5) / 6) {
                                this.f21316OooOOOo = 'h';
                                return this.f21317OooOOo;
                            }
                            oooO00o = this.f21384oo000o;
                            if (oooO00o != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooO00o.f43218OooO0Oo.getLeft(), -oooO00o.f43218OooO0Oo.getTop());
                                view = oooO00o.f43219OooO0o;
                                view2 = oooO00o.f43218OooO0Oo;
                                if (view != view2) {
                                    oooO00o.f43219OooO0o = o0OO0oO.OooO00o.OooO0OO(view2, pointF, view);
                                }
                                if (oooO00o.f43219OooO0o == oooO00o.f43218OooO0Oo) {
                                    oooO00o.f43225OooOO0o.f43226OooO00o = null;
                                } else {
                                    oooO00o.f43225OooOO0o.f43226OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f5 - this.f21311OooOO0O;
                                f2 = f6 - this.f21312OooOO0o;
                                velocityTracker.addMovement(motionEvent);
                                z = this.f21318OooOOo0;
                                oooOOO = this.f21381o0ooOO0;
                                i = this.f21305OooO0Oo;
                                if (!z && (c = this.f21316OooOOOo) != 'h' && this.f21384oo000o != null) {
                                    if (c != 'v') {
                                        f3 = i;
                                        if (Math.abs(f2) < f3 && Math.abs(f) < Math.abs(f2)) {
                                            this.f21316OooOOOo = 'v';
                                            if (f2 <= 0.0f && (this.f21307OooO0o0 < 0 || ((this.f21339Oooo0o || this.f21330OooOooO) && this.f21384oo000o.OooO0O0()))) {
                                                this.f21318OooOOo0 = true;
                                                this.f21312OooOO0o = f6 - i;
                                            } else if (f2 < 0.0f && (this.f21307OooO0o0 > 0 || ((this.f21339Oooo0o || this.f21331OooOooo) && ((this.f21382o0ooOOo == refreshState2 && this.f21363o000000) || this.f21384oo000o.OooO00o())))) {
                                                this.f21318OooOOo0 = true;
                                                this.f21312OooOO0o = i + f6;
                                            }
                                            if (this.f21318OooOOo0) {
                                                f2 = f6 - this.f21312OooOO0o;
                                                if (this.f21317OooOOo) {
                                                    motionEvent.setAction(3);
                                                    super.dispatchTouchEvent(motionEvent);
                                                }
                                                i3 = this.f21307OooO0o0;
                                                if (i3 <= 0 || (i3 == 0 && f2 > 0.0f)) {
                                                    refreshState5 = RefreshState.PullDownToRefresh;
                                                } else {
                                                    refreshState5 = RefreshState.PullUpToLoad;
                                                }
                                                oooOOO.OooO0Oo(refreshState5);
                                                parent = getParent();
                                                if (parent instanceof ViewGroup) {
                                                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                                }
                                            }
                                        } else if (Math.abs(f) >= f3 && Math.abs(f) > Math.abs(f2) && this.f21316OooOOOo != 'v') {
                                            this.f21316OooOOOo = 'h';
                                        }
                                    } else {
                                        this.f21316OooOOOo = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f21318OooOOo0 = true;
                                                this.f21312OooOO0o = i + f6;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f21318OooOOo0 = true;
                                            this.f21312OooOO0o = i + f6;
                                        }
                                        if (this.f21318OooOOo0) {
                                            f2 = f6 - this.f21312OooOO0o;
                                            if (this.f21317OooOOo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            i3 = this.f21307OooO0o0;
                                            if (i3 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            oooOOO.OooO0Oo(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f21318OooOOo0) {
                                    i2 = ((int) f2) + this.f21308OooO0oO;
                                    refreshState3 = this.f21383o0ooOoO;
                                    if ((refreshState3.isHeader && (i2 < 0 || this.f21306OooO0o < 0)) || (refreshState3.isFooter && (i2 > 0 || this.f21306OooO0o > 0))) {
                                        this.f21306OooO0o = i2;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f21365o000000o == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.f21311OooOO0O + f, this.f21312OooOO0o, 0);
                                            this.f21365o000000o = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f21311OooOO0O + f, this.f21312OooOO0o + i2, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f21363o000000 && f2 > i && this.f21307OooO0o0 < 0) {
                                            this.f21363o000000 = false;
                                        }
                                        if (i2 <= 0 && ((this.f21339Oooo0o || this.f21330OooOooO) && this.f21384oo000o.OooO0O0())) {
                                            this.f21313OooOOO = f6;
                                            this.f21312OooOO0o = f6;
                                            this.f21308OooO0oO = 0;
                                            oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                                        } else if (i2 < 0 || !((this.f21339Oooo0o || this.f21331OooOooo) && this.f21384oo000o.OooO00o())) {
                                            i4 = i2;
                                        } else {
                                            this.f21313OooOOO = f6;
                                            this.f21312OooOO0o = f6;
                                            this.f21308OooO0oO = 0;
                                            oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.f21383o0ooOoO;
                                        if ((!refreshState4.isHeader && i4 < 0) || (refreshState4.isFooter && i4 > 0)) {
                                            if (this.f21307OooO0o0 != 0) {
                                                OooOOo0(0.0f);
                                            }
                                            return true;
                                        }
                                        if (this.f21365o000000o != null) {
                                            this.f21365o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    }
                                    OooOOo0(i2);
                                    return true;
                                }
                                if (this.f21363o000000 && f2 > i && this.f21307OooO0o0 < 0) {
                                    this.f21363o000000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        velocityTracker.addMovement(motionEvent);
                        velocityTracker.computeCurrentVelocity(1000, this.f21320OooOo);
                        this.f21326OooOoO0 = (int) velocityTracker.getYVelocity();
                        OooOoO(0.0f);
                        velocityTracker.clear();
                        this.f21316OooOOOo = 'n';
                        motionEvent2 = this.f21365o000000o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f21365o000000o = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.f21311OooOO0O, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        OooOOoo();
                        if (this.f21318OooOOo0) {
                            this.f21318OooOOo0 = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        Paint paint2;
        o0OO0oO.OooO00o oooO00o = this.f21384oo000o;
        View view2 = oooO00o != null ? oooO00o.f43218OooO0Oo : null;
        o0OO0o.OooO oooO = this.f21372o00o0O;
        o0OO0oO0.OooO0O0 oooO0O0 = o0OO0oO0.OooO0O0.f43237OooO0Oo;
        o0OO0oO0.OooO0O0 oooO0O1 = o0OO0oO0.OooO0O0.f43239OooO0o0;
        boolean z = this.f21338Oooo0OO;
        if (oooO != null && oooO.getView() == view) {
            if (!OooOOOO(this.f21330OooOooO) || (!z && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f21307OooO0o0, view.getTop());
                int i = this.f21379o0Oo0oo;
                if (i != 0 && (paint2 = this.f21374o00oO0o) != null) {
                    paint2.setColor(i);
                    if (this.f21372o00o0O.getSpinnerStyle().f43244OooO0OO) {
                        iMax = view.getBottom();
                    } else if (this.f21372o00o0O.getSpinnerStyle() == oooO0O0) {
                        iMax = view.getBottom() + this.f21307OooO0o0;
                    }
                    int i2 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i2, this.f21374o00oO0o);
                    iMax = i2;
                }
                if (this.f21334Oooo000 && this.f21372o00o0O.getSpinnerStyle() == oooO0O1) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
        if (oooO0o != null && oooO0o.getView() == view) {
            if (!OooOOOO(this.f21331OooOooo) || (!z && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f21307OooO0o0, view.getBottom());
                int i3 = this.f21377o0OO00O;
                if (i3 != 0 && (paint = this.f21374o00oO0o) != null) {
                    paint.setColor(i3);
                    if (this.f21375o00ooo.getSpinnerStyle().f43244OooO0OO) {
                        iMin = view.getTop();
                    } else if (this.f21375o00ooo.getSpinnerStyle() == oooO0O0) {
                        iMin = view.getTop() + this.f21307OooO0o0;
                    }
                    int i4 = iMin;
                    canvas.drawRect(0.0f, i4, getWidth(), view.getBottom(), this.f21374o00oO0o);
                    iMin = i4;
                }
                if (this.f21335Oooo00O && this.f21375o00ooo.getSpinnerStyle() == oooO0O1) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // o0OO0o.OooOOO0
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o000000 o000000Var = this.f21356OooooOO;
        return o000000Var.f5414OooO0O0 | o000000Var.f5413OooO00o;
    }

    @Nullable
    public o0OO0o.OooO0o getRefreshFooter() {
        o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
        if (oooO0o instanceof o0OO0o.OooO0o) {
            return oooO0o;
        }
        return null;
    }

    @Nullable
    public o0OO0o.OooO getRefreshHeader() {
        o0OO0o.OooO oooO = this.f21372o00o0O;
        if (oooO instanceof o0OO0o.OooO) {
            return oooO;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f21382o0ooOOo;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f21346OoooO0O && (this.f21339Oooo0o || this.f21330OooOooO || this.f21331OooOooo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        OooOOO oooOOO;
        o0OO0o.OooO0o oooO0o;
        super.onAttachedToWindow();
        boolean z = true;
        this.f21367o000OOo = true;
        if (!isInEditMode()) {
            if (this.f21372o00o0O == null) {
                OooOoO0(new BezierRadarHeader(getContext()));
            }
            if (this.f21375o00ooo == null) {
                boolean z2 = this.f21331OooOooo;
                OooOo(new BallPulseFooter(getContext()));
                this.f21331OooOooo = z2;
            } else {
                this.f21331OooOooo = this.f21331OooOooo || !this.f21349OoooOOo;
            }
            if (this.f21384oo000o == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    o0OO0o.OooO oooO = this.f21372o00o0O;
                    if ((oooO == null || childAt != oooO.getView()) && ((oooO0o = this.f21375o00ooo) == null || childAt != oooO0o.getView())) {
                        this.f21384oo000o = new o0OO0oO.OooO00o(childAt);
                    }
                }
            }
            if (this.f21384oo000o == null) {
                int iOooO0OO = OooOo00.OooO0OO(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(p333o0OO0o0o.OooOOO0.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1));
                o0OO0oO.OooO00o oooO00o = new o0OO0oO.OooO00o(textView);
                this.f21384oo000o = oooO00o;
                oooO00o.f43218OooO0Oo.setPadding(iOooO0OO, iOooO0OO, iOooO0OO, iOooO0OO);
            }
            View viewFindViewById = findViewById(this.f21319OooOOoo);
            View viewFindViewById2 = findViewById(this.f21322OooOo00);
            o0OO0oO.OooO00o oooO00o2 = this.f21384oo000o;
            oooO00o2.getClass();
            View view = null;
            oooO00o2.f43225OooOO0o.f43227OooO0O0 = null;
            o0OO0oO.OooO00o oooO00o3 = this.f21384oo000o;
            oooO00o3.f43225OooOO0o.f43228OooO0OO = this.f21344OoooO0;
            View view2 = oooO00o3.f43218OooO0Oo;
            boolean zIsInEditMode = view2.isInEditMode();
            View view3 = null;
            while (true) {
                oooOOO = this.f21381o0ooOO0;
                if (view3 != null && (!(view3 instanceof o000OOo) || (view3 instanceof o0Oo0oo))) {
                    break;
                }
                boolean z3 = view3 == null ? z : false;
                LinkedList linkedList = new LinkedList();
                linkedList.add(view2);
                View view4 = view;
                while (linkedList.size() > 0 && view4 == null) {
                    View view5 = (View) linkedList.poll();
                    if (view5 != null) {
                        if ((z3 || view5 != view2) && OooOo00.OooO0Oo(view5)) {
                            view4 = view5;
                        } else if (view5 instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view5;
                            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                                linkedList.add(viewGroup.getChildAt(i2));
                            }
                        }
                    }
                }
                if (view4 == null) {
                    view4 = view2;
                }
                if (view4 == view3) {
                    break;
                }
                z = true;
                if (!zIsInEditMode) {
                    try {
                        if (view4 instanceof CoordinatorLayout) {
                            SmartRefreshLayout.this.setNestedScrollingEnabled(false);
                            ViewGroup viewGroup2 = (ViewGroup) view4;
                            int childCount2 = viewGroup2.getChildCount();
                            while (true) {
                                childCount2--;
                                if (childCount2 >= 0) {
                                    View childAt2 = viewGroup2.getChildAt(childCount2);
                                    if (childAt2 instanceof AppBarLayout) {
                                        ((AppBarLayout) childAt2).OooO00o(new p335o0OO0oOo.OooOOOO(oooO00o3));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                view2 = view4;
                view3 = view2;
                view = null;
            }
            if (view3 != null) {
                oooO00o3.f43219OooO0o = view3;
            }
            if (viewFindViewById != null || viewFindViewById2 != null) {
                oooO00o3.f43221OooO0oO = viewFindViewById;
                oooO00o3.f43222OooO0oo = viewFindViewById2;
                FrameLayout frameLayout = new FrameLayout(oooO00o3.f43218OooO0Oo.getContext());
                int iIndexOfChild = SmartRefreshLayout.this.getLayout().indexOfChild(oooO00o3.f43218OooO0Oo);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.getLayout().removeView(oooO00o3.f43218OooO0Oo);
                frameLayout.addView(oooO00o3.f43218OooO0Oo, 0, new ViewGroup.LayoutParams(-1, -1));
                smartRefreshLayout.getLayout().addView(frameLayout, iIndexOfChild, oooO00o3.f43218OooO0Oo.getLayoutParams());
                oooO00o3.f43218OooO0Oo = frameLayout;
                if (viewFindViewById != null) {
                    viewFindViewById.setTag("fixed-top");
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    ViewGroup viewGroup3 = (ViewGroup) viewFindViewById.getParent();
                    int iIndexOfChild2 = viewGroup3.indexOfChild(viewFindViewById);
                    viewGroup3.removeView(viewFindViewById);
                    layoutParams.height = OooOo00.OooO0o(viewFindViewById);
                    viewGroup3.addView(new Space(oooO00o3.f43218OooO0Oo.getContext()), iIndexOfChild2, layoutParams);
                    frameLayout.addView(viewFindViewById, 1, layoutParams);
                }
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setTag("fixed-bottom");
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                    ViewGroup viewGroup4 = (ViewGroup) viewFindViewById2.getParent();
                    int iIndexOfChild3 = viewGroup4.indexOfChild(viewFindViewById2);
                    viewGroup4.removeView(viewFindViewById2);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                    layoutParams2.height = OooOo00.OooO0o(viewFindViewById2);
                    viewGroup4.addView(new Space(oooO00o3.f43218OooO0Oo.getContext()), iIndexOfChild3, layoutParams2);
                    layoutParams3.gravity = 80;
                    frameLayout.addView(viewFindViewById2, 1, layoutParams3);
                }
            }
            if (this.f21307OooO0o0 != 0) {
                OooOOo(RefreshState.None);
                o0OO0oO.OooO00o oooO00o4 = this.f21384oo000o;
                this.f21307OooO0o0 = 0;
                oooO00o4.OooO0Oo(0, this.f21321OooOo0, this.f21323OooOo0O);
            }
        }
        int[] iArr = this.f21328OooOoo;
        if (iArr != null) {
            o0OO0o.OooO oooO2 = this.f21372o00o0O;
            if (oooO2 != null) {
                oooO2.setPrimaryColors(iArr);
            }
            o0OO0o.OooO0o oooO0o2 = this.f21375o00ooo;
            if (oooO0o2 != null) {
                oooO0o2.setPrimaryColors(iArr);
            }
        }
        o0OO0oO.OooO00o oooO00o5 = this.f21384oo000o;
        if (oooO00o5 != null) {
            super.bringChildToFront(oooO00o5.f43218OooO0Oo);
        }
        o0OO0o.OooO oooO3 = this.f21372o00o0O;
        if (oooO3 != null && oooO3.getSpinnerStyle().f43243OooO0O0) {
            super.bringChildToFront(this.f21372o00o0O.getView());
        }
        o0OO0o.OooO0o oooO0o3 = this.f21375o00ooo;
        if (oooO0o3 == null || !oooO0o3.getSpinnerStyle().f43243OooO0O0) {
            return;
        }
        super.bringChildToFront(this.f21375o00ooo.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21367o000OOo = false;
        this.f21381o0ooOO0.OooO0O0(0, true);
        OooOOo(RefreshState.None);
        Handler handler = this.f21373o00oO0O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f21349OoooOOo = true;
        this.f21362o00000 = null;
        ValueAnimator valueAnimator = this.f21366o00000O0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f21366o00000O0.removeAllUpdateListeners();
            this.f21366o00000O0.cancel();
            this.f21366o00000O0 = null;
        }
        this.f21363o000000 = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        int i;
        int i2;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i3 = -1;
        int i4 = 0;
        char c = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i4);
            if (OooOo00.OooO0Oo(childAt) && (c < 2 || i4 == 1)) {
                i3 = i4;
                c = 2;
            } else if (!(childAt instanceof o0OO0o.OooOO0) && c < 1) {
                c = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.f21384oo000o = new o0OO0oO.OooO00o(super.getChildAt(i3));
            if (i3 == 1) {
                i2 = childCount != 3 ? -1 : 2;
                i = 0;
            } else if (childCount == 2) {
                i = -1;
                i2 = 1;
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = -1;
            i2 = -1;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = super.getChildAt(i5);
            if (i5 == i || (i5 != i2 && i == -1 && this.f21372o00o0O == null && (childAt2 instanceof o0OO0o.OooO))) {
                this.f21372o00o0O = childAt2 instanceof o0OO0o.OooO ? (o0OO0o.OooO) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof o0OO0o.OooO0o))) {
                this.f21331OooOooo = this.f21331OooOooo || !this.f21349OoooOOo;
                this.f21375o00ooo = childAt2 instanceof o0OO0o.OooO0o ? (o0OO0o.OooO0o) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt.getTag(p333o0OO0o0o.OooOOO0.srl_component_falsify) != childAt) {
                o0OO0oO.OooO00o oooO00o = this.f21384oo000o;
                ViewGroup.MarginLayoutParams marginLayoutParams = f21303o00000O;
                boolean z2 = this.f21338Oooo0OO;
                if (oooO00o != null && oooO00o.f43218OooO0Oo == childAt) {
                    boolean z3 = isInEditMode() && z2 && OooOOOO(this.f21330OooOooO) && this.f21372o00o0O != null;
                    View view = this.f21384oo000o.f43218OooO0Oo;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams;
                    int i6 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams2.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z3) {
                        if (OooOOOo(this.f21372o00o0O, this.f21336Oooo00o)) {
                            int i8 = this.f21357OooooOo;
                            i7 += i8;
                            measuredHeight += i8;
                        }
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                o0OO0o.OooO oooO = this.f21372o00o0O;
                o0OO0oO0.OooO0O0 oooO0O0 = o0OO0oO0.OooO0O0.f43237OooO0Oo;
                if (oooO != null && oooO.getView() == childAt) {
                    boolean z4 = isInEditMode() && z2 && OooOOOO(this.f21330OooOooO);
                    View view2 = this.f21372o00o0O.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                    int i9 = marginLayoutParams3.leftMargin;
                    int i10 = marginLayoutParams3.topMargin + this.f21361Ooooooo;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z4 && this.f21372o00o0O.getSpinnerStyle() == oooO0O0) {
                        int i11 = this.f21357OooooOo;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
                if (oooO0o != null && oooO0o.getView() == childAt) {
                    boolean z5 = isInEditMode() && z2 && OooOOOO(this.f21331OooOooo);
                    View view3 = this.f21375o00ooo.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    }
                    o0OO0oO0.OooO0O0 spinnerStyle = this.f21375o00ooo.getSpinnerStyle();
                    int i12 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = getMeasuredHeight() + marginLayoutParams.topMargin;
                    int i13 = this.f21380o0OoOo0;
                    int measuredHeight4 = measuredHeight3 - i13;
                    if (this.f21368o000oOoO && this.f21348OoooOOO && this.f21337Oooo0O0 && this.f21384oo000o != null && this.f21375o00ooo.getSpinnerStyle() == oooO0O0 && OooOOOO(this.f21331OooOooo)) {
                        View view4 = this.f21384oo000o.f43218OooO0Oo;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight4 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == o0OO0oO0.OooO0O0.f43240OooO0oO) {
                        measuredHeight4 = marginLayoutParams.topMargin - i13;
                    } else {
                        if (z5 || spinnerStyle == o0OO0oO0.OooO0O0.f43238OooO0o || spinnerStyle == o0OO0oO0.OooO0O0.f43239OooO0o0) {
                            iMax = this.f21358Oooooo;
                        } else if (spinnerStyle.f43244OooO0OO && this.f21307OooO0o0 < 0) {
                            iMax = Math.max(OooOOOO(this.f21331OooOooo) ? -this.f21307OooO0o0 : 0, 0);
                        }
                        measuredHeight4 -= iMax;
                    }
                    view3.layout(i12, measuredHeight4, view3.getMeasuredWidth() + i12, view3.getMeasuredHeight() + measuredHeight4);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0291  */
    /* JADX WARN: Code duplicated, block: B:148:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        View view;
        int i8;
        int i9;
        int iMax;
        int size;
        int i10;
        int iMax2;
        int i11;
        o0OO0oO0.OooO00o oooO00o;
        boolean z;
        int i12 = i;
        boolean z2 = isInEditMode() && this.f21338Oooo0OO;
        int childCount = super.getChildCount();
        int i13 = i2;
        int i14 = 0;
        int measuredHeight = 0;
        while (i14 < childCount) {
            View childAt = super.getChildAt(i14);
            if (childAt.getVisibility() == 8 || childAt.getTag(p333o0OO0o0o.OooOOO0.srl_component_falsify) == childAt) {
                i3 = i12;
                childCount = childCount;
                i4 = i14;
            } else {
                o0OO0o.OooO oooO = this.f21372o00o0O;
                o0OO0oO0.OooO00o oooO00o2 = o0OO0oO0.OooO00o.f43230OooO0Oo;
                o0OO0oO0.OooO00o oooO00o3 = o0OO0oO0.OooO00o.f43232OooO0o0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = f21303o00000O;
                o0OO0oO0.OooO0O0 oooO0O0 = o0OO0oO0.OooO0O0.f43240OooO0oO;
                o0OO0oO0.OooO00o[] oooO00oArr = o0OO0oO0.OooO00o.f43234OooO0oo;
                OooOOO oooOOO = this.f21381o0ooOO0;
                if (oooO == null || oooO.getView() != childAt) {
                    childCount = childCount;
                    i4 = i14;
                    marginLayoutParams = marginLayoutParams2;
                } else {
                    View view2 = this.f21372o00o0O.getView();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams2;
                    marginLayoutParams = marginLayoutParams2;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams.width);
                    int i15 = this.f21357OooooOo;
                    o0OO0oO0.OooO00o oooO00o4 = this.f21359Oooooo0;
                    i4 = i14;
                    if (oooO00o4.f43235OooO00o >= 6) {
                        iMax2 = i15;
                    } else {
                        int i16 = layoutParams.height;
                        if (i16 > 0) {
                            iMax2 = i16 + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                            if (oooO00o4.OooO00o(oooO00o3)) {
                                this.f21357OooooOo = layoutParams.height + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                                this.f21359Oooooo0 = oooO00o3;
                            }
                        } else if (i16 != -2 || (this.f21372o00o0O.getSpinnerStyle() == oooO0O0 && this.f21359Oooooo0.f43236OooO0O0)) {
                            iMax2 = i15;
                        } else {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, 0);
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3 && this.f21359Oooooo0.OooO00o(oooO00o2)) {
                                    this.f21357OooooOo = measuredHeight2 + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                                    this.f21359Oooooo0 = oooO00o2;
                                }
                                iMax2 = -1;
                            } else {
                                iMax2 = i15;
                            }
                        }
                    }
                    if (this.f21372o00o0O.getSpinnerStyle() == oooO0O0) {
                        iMax2 = View.MeasureSpec.getSize(i2);
                    } else {
                        if (this.f21372o00o0O.getSpinnerStyle().f43244OooO0OO && !z2) {
                            i11 = 0;
                            iMax2 = Math.max(0, OooOOOO(this.f21330OooOooO) ? this.f21307OooO0o0 : 0);
                        }
                        if (iMax2 != -1) {
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, i11), Pow2.MAX_POW2));
                        }
                        oooO00o = this.f21359Oooooo0;
                        z = oooO00o.f43236OooO0O0;
                        if (!z) {
                            if (!z) {
                                oooO00o = oooO00oArr[oooO00o.f43235OooO00o + 1];
                            }
                            this.f21359Oooooo0 = oooO00o;
                            o0OO0o.OooO oooO2 = this.f21372o00o0O;
                            int i17 = this.f21357OooooOo;
                            oooO2.OooO00o(oooOOO, i17, (int) (this.f21386ooOO * i17));
                        }
                        if (z2 && OooOOOO(this.f21330OooOooO)) {
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i11 = 0;
                    if (iMax2 != -1) {
                        view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, i11), Pow2.MAX_POW2));
                    }
                    oooO00o = this.f21359Oooooo0;
                    z = oooO00o.f43236OooO0O0;
                    if (!z) {
                        if (!z) {
                            oooO00o = oooO00oArr[oooO00o.f43235OooO00o + 1];
                        }
                        this.f21359Oooooo0 = oooO00o;
                        o0OO0o.OooO oooO3 = this.f21372o00o0O;
                        int i18 = this.f21357OooooOo;
                        oooO3.OooO00o(oooOOO, i18, (int) (this.f21386ooOO * i18));
                    }
                    if (z2) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
                if (oooO0o == null || oooO0o.getView() != childAt) {
                    i5 = 1;
                    i6 = 0;
                } else {
                    View view3 = this.f21375o00ooo.getView();
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin, layoutParams2.width);
                    int i19 = this.f21358Oooooo;
                    o0OO0oO0.OooO00o oooO00o5 = this.f21360OoooooO;
                    if (oooO00o5.f43235OooO00o >= 6) {
                        iMax = i19;
                    } else {
                        int i20 = layoutParams2.height;
                        if (i20 > 0) {
                            iMax = i20 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                            if (oooO00o5.OooO00o(oooO00o3)) {
                                this.f21358Oooooo = layoutParams2.height + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                                this.f21360OoooooO = oooO00o3;
                            }
                        } else if (i20 != -2 || (this.f21375o00ooo.getSpinnerStyle() == oooO0O0 && this.f21360OoooooO.f43236OooO0O0)) {
                            iMax = i19;
                        } else {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams4.bottomMargin) - marginLayoutParams4.topMargin, 0);
                            view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view3.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4 && this.f21360OoooooO.OooO00o(oooO00o2)) {
                                    this.f21358Oooooo = measuredHeight3 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                                    this.f21360OoooooO = oooO00o2;
                                }
                                iMax = -1;
                            } else {
                                iMax = i19;
                            }
                        }
                    }
                    if (this.f21375o00ooo.getSpinnerStyle() == oooO0O0) {
                        size = View.MeasureSpec.getSize(i2);
                        i10 = -1;
                        i6 = 0;
                    } else {
                        if (!this.f21375o00ooo.getSpinnerStyle().f43244OooO0OO || z2) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            iMax = Math.max(0, OooOOOO(this.f21331OooOooo) ? -this.f21307OooO0o0 : 0);
                        }
                        size = iMax;
                        i10 = -1;
                    }
                    if (size != i10) {
                        view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((size - marginLayoutParams4.bottomMargin) - marginLayoutParams4.topMargin, i6), Pow2.MAX_POW2));
                    }
                    o0OO0oO0.OooO00o oooO00o6 = this.f21360OoooooO;
                    boolean z3 = oooO00o6.f43236OooO0O0;
                    if (z3) {
                        i5 = 1;
                    } else {
                        if (z3) {
                            i5 = 1;
                        } else {
                            i5 = 1;
                            oooO00o6 = oooO00oArr[oooO00o6.f43235OooO00o + 1];
                        }
                        this.f21360OoooooO = oooO00o6;
                        o0OO0o.OooO0o oooO0o2 = this.f21375o00ooo;
                        int i21 = this.f21358Oooooo;
                        oooO0o2.OooO00o(oooOOO, i21, (int) (this.f21369o00O0O * i21));
                    }
                    if (z2 && OooOOOO(this.f21331OooOooo)) {
                        measuredHeight = view3.getMeasuredHeight() + measuredHeight;
                    }
                }
                o0OO0oO.OooO00o oooO00o7 = this.f21384oo000o;
                if (oooO00o7 == null || (view = oooO00o7.f43218OooO0Oo) != childAt) {
                    i3 = i;
                    i7 = i2;
                } else {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : marginLayoutParams;
                    if (this.f21372o00o0O == null || !OooOOOO(this.f21330OooOooO)) {
                        i8 = i6;
                    } else if (OooOOOo(this.f21372o00o0O, this.f21336Oooo00o)) {
                        i8 = i5;
                    } else {
                        i8 = i6;
                    }
                    if (this.f21375o00ooo == null || !OooOOOO(this.f21331OooOooo)) {
                        i9 = i6;
                    } else if (OooOOOo(this.f21375o00ooo, this.f21333Oooo0)) {
                        i9 = i5;
                    } else {
                        i9 = i6;
                    }
                    i3 = i;
                    int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin, layoutParams3.width);
                    int paddingBottom = getPaddingBottom() + getPaddingTop() + marginLayoutParams5.topMargin + marginLayoutParams5.bottomMargin + ((!z2 || i8 == 0) ? i6 : this.f21357OooooOo);
                    i7 = i2;
                    view.measure(childMeasureSpec3, ViewGroup.getChildMeasureSpec(i7, paddingBottom + ((!z2 || i9 == 0) ? i6 : this.f21358Oooooo), layoutParams3.height));
                    measuredHeight += view.getMeasuredHeight();
                }
                i13 = i7;
            }
            i14 = i4 + 1;
            i12 = i3;
            childCount = childCount;
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i12), View.resolveSize(measuredHeight, i13));
        this.f21314OooOOO0 = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f21355OooooO0.OooO00o(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f21363o000000 && f2 > 0.0f) || OooOoO(-f2) || this.f21355OooooO0.OooO0O0(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f21352OoooOoo;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.f21352OoooOoo)) {
                int i5 = this.f21352OoooOoo;
                this.f21352OoooOoo = 0;
                i4 = i5;
            } else {
                this.f21352OoooOoo -= i2;
                i4 = i2;
            }
            OooOOo0(this.f21352OoooOoo);
        } else if (i2 > 0 && this.f21363o000000) {
            int i6 = i3 - i2;
            this.f21352OoooOoo = i6;
            OooOOo0(i6);
            i4 = i2;
        }
        this.f21355OooooO0.OooO0OO(i, i2 - i4, iArr, null, 0);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        boolean zOooO0o0 = this.f21355OooooO0.OooO0o0(i, i2, i3, i4, this.f21354Ooooo0o);
        int i5 = i4 + this.f21354Ooooo0o[1];
        if ((i5 < 0 && (this.f21330OooOooO || this.f21339Oooo0o)) || (i5 > 0 && (this.f21331OooOooo || this.f21339Oooo0o))) {
            RefreshState refreshState = this.f21383o0ooOoO;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f21381o0ooOO0.OooO0Oo(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zOooO0o0) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.f21352OoooOoo - i5;
            this.f21352OoooOoo = i6;
            OooOOo0(i6);
        }
        if (!this.f21363o000000 || i2 >= 0) {
            return;
        }
        this.f21363o000000 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f21356OooooOO.OooO00o(i, 0);
        this.f21355OooooO0.OooOO0(i & 2, 0);
        this.f21352OoooOoo = this.f21307OooO0o0;
        this.f21353Ooooo00 = true;
        OooOOO(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) && (this.f21339Oooo0o || this.f21330OooOooO || this.f21331OooOooo);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        this.f21356OooooOO.OooO0O0(0);
        this.f21353Ooooo00 = false;
        this.f21352OoooOoo = 0;
        OooOOoo();
        this.f21355OooooO0.OooOO0O(0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f21346OoooO0O = z;
        this.f21355OooooO0.OooO(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f21382o0ooOOo;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f21378o0OOO0o = System.currentTimeMillis();
            this.f21363o000000 = true;
            OooOOo(refreshState2);
            oo0o0O0 oo0o0o0 = this.f21351OoooOoO;
            if (oo0o0o0 == null) {
                OooOO0(2000, true, false);
            } else if (z) {
                oo0o0o0.OooO00o(this);
            }
            o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
            if (oooO0o != null) {
                int i = this.f21358Oooooo;
                oooO0o.OooO0oo(this, i, (int) (this.f21369o00O0O * i));
            }
        }
    }

    public void setStateLoading(boolean z) {
        OooO0O0 oooO0O0 = new OooO0O0(z);
        OooOOo(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorOooO00o = this.f21381o0ooOO0.OooO00o(-this.f21358Oooooo);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0O0);
        }
        o0OO0o.OooO0o oooO0o = this.f21375o00ooo;
        if (oooO0o != null) {
            int i = this.f21358Oooooo;
            oooO0o.OooO0o(this, i, (int) (this.f21369o00O0O * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0O0.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        OooO0OO oooO0OO = new OooO0OO(z);
        OooOOo(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorOooO00o = this.f21381o0ooOO0.OooO00o(this.f21357OooooOo);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0OO);
        }
        o0OO0o.OooO oooO = this.f21372o00o0O;
        if (oooO != null) {
            int i = this.f21357OooooOo;
            oooO.OooO0o(this, i, (int) (this.f21386ooOO * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0OO.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f21382o0ooOOo;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            OooOOo(RefreshState.None);
        }
        if (this.f21383o0ooOoO != refreshState) {
            this.f21383o0ooOoO = refreshState;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21309OooO0oo = 300;
        this.f21304OooO = 300;
        this.f21315OooOOOO = 0.5f;
        this.f21316OooOOOo = 'n';
        this.f21319OooOOoo = -1;
        this.f21322OooOo00 = -1;
        this.f21321OooOo0 = -1;
        this.f21323OooOo0O = -1;
        this.f21330OooOooO = true;
        this.f21331OooOooo = false;
        this.f21334Oooo000 = true;
        this.f21335Oooo00O = true;
        this.f21336Oooo00o = true;
        this.f21333Oooo0 = true;
        this.f21337Oooo0O0 = false;
        this.f21338Oooo0OO = true;
        this.f21340Oooo0o0 = true;
        this.f21339Oooo0o = false;
        this.f21341Oooo0oO = true;
        this.f21342Oooo0oo = false;
        this.f21332Oooo = true;
        this.f21345OoooO00 = true;
        this.f21344OoooO0 = true;
        this.f21346OoooO0O = true;
        this.f21343OoooO = false;
        this.f21347OoooOO0 = false;
        this.f21368o000oOoO = false;
        this.f21348OoooOOO = false;
        this.f21349OoooOOo = false;
        this.f21354Ooooo0o = new int[2];
        o0OO00O o0oo00o2 = new o0OO00O(this);
        this.f21355OooooO0 = o0oo00o2;
        this.f21356OooooOO = new o000000();
        o0OO0oO0.OooO00o oooO00o = o0OO0oO0.OooO00o.f43229OooO0OO;
        this.f21359Oooooo0 = oooO00o;
        this.f21360OoooooO = oooO00o;
        this.f21386ooOO = 2.5f;
        this.f21369o00O0O = 2.5f;
        this.f21370o00Oo0 = 1.0f;
        this.f21371o00Ooo = 1.0f;
        this.f21381o0ooOO0 = new OooOOO();
        RefreshState refreshState = RefreshState.None;
        this.f21382o0ooOOo = refreshState;
        this.f21383o0ooOoO = refreshState;
        this.f21378o0OOO0o = 0L;
        this.f21379o0Oo0oo = 0;
        this.f21377o0OO00O = 0;
        this.f21363o000000 = false;
        this.f21364o000000O = false;
        this.f21365o000000o = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21373o00oO0O = new Handler();
        this.f21325OooOoO = new Scroller(context);
        this.f21327OooOoOO = VelocityTracker.obtain();
        this.f21310OooOO0 = context.getResources().getDisplayMetrics().heightPixels;
        this.f21329OooOoo0 = new OooOo00(0);
        this.f21305OooO0Oo = viewConfiguration.getScaledTouchSlop();
        this.f21324OooOo0o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21320OooOo = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21358Oooooo = OooOo00.OooO0OO(60.0f);
        this.f21357OooooOo = OooOo00.OooO0OO(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p333o0OO0o0o.OooOOO.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(p333o0OO0o0o.OooOOO.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(p333o0OO0o0o.OooOOO.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        this.f21315OooOOOO = typedArrayObtainStyledAttributes.getFloat(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlDragRate, 0.5f);
        this.f21386ooOO = typedArrayObtainStyledAttributes.getFloat(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlHeaderMaxDragRate, this.f21386ooOO);
        this.f21369o00O0O = typedArrayObtainStyledAttributes.getFloat(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFooterMaxDragRate, this.f21369o00O0O);
        this.f21370o00Oo0 = typedArrayObtainStyledAttributes.getFloat(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlHeaderTriggerRate, this.f21370o00Oo0);
        this.f21371o00Ooo = typedArrayObtainStyledAttributes.getFloat(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFooterTriggerRate, this.f21371o00Ooo);
        this.f21330OooOooO = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableRefresh, this.f21330OooOooO);
        this.f21304OooO = typedArrayObtainStyledAttributes.getInt(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlReboundDuration, this.f21304OooO);
        int i = p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableLoadMore;
        this.f21331OooOooo = typedArrayObtainStyledAttributes.getBoolean(i, this.f21331OooOooo);
        int i2 = p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlHeaderHeight;
        this.f21357OooooOo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, this.f21357OooooOo);
        int i3 = p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFooterHeight;
        this.f21358Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i3, this.f21358Oooooo);
        this.f21361Ooooooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlHeaderInsetStart, this.f21361Ooooooo);
        this.f21380o0OoOo0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFooterInsetStart, this.f21380o0OoOo0);
        this.f21343OoooO = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlDisableContentWhenRefresh, this.f21343OoooO);
        this.f21347OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlDisableContentWhenLoading, this.f21347OoooOO0);
        int i4 = p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.f21336Oooo00o = typedArrayObtainStyledAttributes.getBoolean(i4, true);
        int i5 = p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.f21333Oooo0 = typedArrayObtainStyledAttributes.getBoolean(i5, true);
        this.f21338Oooo0OO = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnablePreviewInEditMode, true);
        this.f21341Oooo0oO = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableAutoLoadMore, this.f21341Oooo0oO);
        this.f21340Oooo0o0 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableOverScrollBounce, this.f21340Oooo0o0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnablePureScrollMode, false);
        this.f21342Oooo0oo = z;
        this.f21332Oooo = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.f21332Oooo);
        this.f21345OoooO00 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, true);
        this.f21344OoooO0 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.f21337Oooo0O0);
        this.f21337Oooo0O0 = z2;
        this.f21337Oooo0O0 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z2);
        this.f21334Oooo000 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, true);
        this.f21335Oooo00O = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, true);
        this.f21339Oooo0o = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableOverScrollDrag, this.f21339Oooo0o);
        this.f21319OooOOoo = typedArrayObtainStyledAttributes.getResourceId(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFixedHeaderViewId, -1);
        this.f21322OooOo00 = typedArrayObtainStyledAttributes.getResourceId(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFixedFooterViewId, -1);
        this.f21321OooOo0 = typedArrayObtainStyledAttributes.getResourceId(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlHeaderTranslationViewId, -1);
        this.f21323OooOo0O = typedArrayObtainStyledAttributes.getResourceId(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlFooterTranslationViewId, -1);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlEnableNestedScrolling, this.f21346OoooO0O);
        this.f21346OoooO0O = z3;
        o0oo00o2.OooO(z3);
        this.f21349OoooOOo = this.f21349OoooOOo || typedArrayObtainStyledAttributes.hasValue(i);
        typedArrayObtainStyledAttributes.hasValue(i4);
        typedArrayObtainStyledAttributes.hasValue(i5);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        o0OO0oO0.OooO00o oooO00o2 = o0OO0oO0.OooO00o.f43231OooO0o;
        this.f21359Oooooo0 = zHasValue ? oooO00o2 : this.f21359Oooooo0;
        this.f21360OoooooO = typedArrayObtainStyledAttributes.hasValue(i3) ? oooO00o2 : this.f21360OoooooO;
        int color = typedArrayObtainStyledAttributes.getColor(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(p333o0OO0o0o.OooOOO.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f21328OooOoo = new int[]{color2, color};
            } else {
                this.f21328OooOoo = new int[]{color2};
            }
        } else if (color != 0) {
            this.f21328OooOoo = new int[]{0, color};
        }
        if (z && !this.f21349OoooOOo && !this.f21331OooOooo) {
            this.f21331OooOooo = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f21387OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0OO0oO0.OooO0O0 f21388OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21387OooO00o = 0;
            this.f21388OooO0O0 = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p333o0OO0o0o.OooOOO.SmartRefreshLayout_Layout);
            this.f21387OooO00o = typedArrayObtainStyledAttributes.getColor(p333o0OO0o0o.OooOOO.SmartRefreshLayout_Layout_layout_srlBackgroundColor, 0);
            int i = p333o0OO0o0o.OooOOO.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.f21388OooO0O0 = o0OO0oO0.OooO0O0.f43241OooO0oo[typedArrayObtainStyledAttributes.getInt(i, 0)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i) {
            super(-1, i);
            this.f21387OooO00o = 0;
            this.f21388OooO0O0 = null;
        }
    }
}
