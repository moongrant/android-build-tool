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
import p338o0OO0oOo.Oooo0;
import p338o0OO0oOo.Oooo000;
import p339o0OO0oo0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements o0OO0oO0.OooOOO0, o000OOo {

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f20830o00000O = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f20831OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f20833OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f20834OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f20835OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f20836OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f20837OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f20838OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f20839OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f20840OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f20841OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final float f20842OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public char f20843OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f20844OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f20845OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f20846OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f20847OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f20848OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f20849OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f20850OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f20851OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Scroller f20852OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f20853OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final VelocityTracker f20854OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int[] f20855OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOOOO f20856OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f20857OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f20858OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f20859Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final boolean f20860Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final boolean f20861Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f20862Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final boolean f20863Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f20864Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final boolean f20865Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f20866Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f20867Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f20868Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f20869Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f20870OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f20871OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f20872OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f20873OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20874OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f20875OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f20876OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Oooo0 f20877OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Oooo000 f20878OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20879OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f20880Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int[] f20881Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final o0OO00O f20882OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o000000 f20883OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f20884OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f20885Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o0OO0oO.OooO00o f20886Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o0OO0oO.OooO00o f20887OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final int f20888Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public Runnable f20889o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f20890o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f20891o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public MotionEvent f20892o000000o;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public ValueAnimator f20893o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f20894o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f20895o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f20896o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f20897o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f20898o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public o0OO0oO0.OooO f20899o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final Handler f20900o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public Paint f20901o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public o0OO0oO0.OooO0o f20902o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f20903o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public int f20904o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public long f20905o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f20906o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int f20907o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final OooOOO f20908o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public RefreshState f20909o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public RefreshState f20910o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public p337o0OO0oOO.OooOOOO f20911oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f20912oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f20913ooOO;

    public class OooO implements ValueAnimator.AnimatorUpdateListener {
        public OooO() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f20908o0ooOO0.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20917OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f20917OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20917OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20917OooO00o[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20917OooO00o[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20917OooO00o[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20917OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20917OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20917OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20917OooO00o[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20917OooO00o[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20917OooO00o[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20917OooO00o[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20917OooO00o[RefreshState.RefreshFinish.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20917OooO00o[RefreshState.LoadFinish.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20917OooO00o[RefreshState.TwoLevelReleased.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20917OooO00o[RefreshState.TwoLevelFinish.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20917OooO00o[RefreshState.TwoLevel.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f20918OooO0Oo;

        public OooO0O0(boolean z) {
            this.f20918OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SmartRefreshLayout.this.setStateDirectLoading(this.f20918OooO0Oo);
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f20920OooO0Oo;

        public OooO0OO(boolean z) {
            this.f20920OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.f20905o0OOO0o = jCurrentTimeMillis;
            smartRefreshLayout.OooOOo(RefreshState.Refreshing);
            Oooo0 oooo0 = smartRefreshLayout.f20877OoooOo0;
            if (oooo0 == null) {
                smartRefreshLayout.OooOOO0(BannerConfig.LOOP_TIME, true, Boolean.FALSE);
            } else if (this.f20920OooO0Oo) {
                oooo0.OooO00o(smartRefreshLayout);
            }
            o0OO0oO0.OooO oooO = smartRefreshLayout.f20899o00o0O;
            if (oooO != null) {
                int i = smartRefreshLayout.f20884OooooOo;
                oooO.OooO0o0(smartRefreshLayout, i, (int) (smartRefreshLayout.f20913ooOO * i));
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
            smartRefreshLayout.f20893o00000O0 = null;
            if (smartRefreshLayout.f20834OooO0o0 == 0 && (refreshState = smartRefreshLayout.f20909o0ooOOo) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                smartRefreshLayout.OooOOo(refreshState2);
                return;
            }
            RefreshState refreshState3 = smartRefreshLayout.f20909o0ooOOo;
            if (refreshState3 != smartRefreshLayout.f20910o0ooOoO) {
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
            Oooo000 oooo000 = smartRefreshLayout.f20878OoooOoO;
            if (oooo000 != null) {
                oooo000.OooO00o(smartRefreshLayout);
            } else {
                smartRefreshLayout.OooOO0(2000, true, false);
            }
        }
    }

    public class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f20927OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f20929OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20925OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f20928OooO0oO = 0.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f20926OooO0o = AnimationUtils.currentAnimationTimeMillis();

        public OooOO0O(float f, int i) {
            this.f20929OooO0oo = f;
            this.f20927OooO0o0 = i;
            SmartRefreshLayout.this.f20900o00oO0O.postDelayed(this, 10);
            OooOOO oooOOO = SmartRefreshLayout.this.f20908o0ooOO0;
            if (f > 0.0f) {
                oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
            } else {
                oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f20889o00000 != this || smartRefreshLayout.f20909o0ooOOo.isFinishing) {
                return;
            }
            int iAbs = Math.abs(smartRefreshLayout.f20834OooO0o0);
            int i = this.f20927OooO0o0;
            if (iAbs < Math.abs(i)) {
                double d = this.f20929OooO0oo;
                int i2 = this.f20925OooO0Oo + 1;
                this.f20925OooO0Oo = i2;
                this.f20929OooO0oo = (float) (Math.pow(0.949999988079071d, i2 * 2) * d);
            } else if (i != 0) {
                double d2 = this.f20929OooO0oo;
                int i3 = this.f20925OooO0Oo + 1;
                this.f20925OooO0Oo = i3;
                this.f20929OooO0oo = (float) (Math.pow(0.44999998807907104d, i3 * 2) * d2);
            } else {
                double d3 = this.f20929OooO0oo;
                int i4 = this.f20925OooO0Oo + 1;
                this.f20925OooO0Oo = i4;
                this.f20929OooO0oo = (float) (Math.pow(0.8500000238418579d, i4 * 2) * d3);
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.f20929OooO0oo * (((jCurrentAnimationTimeMillis - this.f20926OooO0o) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.f20926OooO0o = jCurrentAnimationTimeMillis;
                float f2 = this.f20928OooO0oO + f;
                this.f20928OooO0oO = f2;
                smartRefreshLayout.OooOOo0(f2);
                smartRefreshLayout.f20900o00oO0O.postDelayed(this, 10);
                return;
            }
            RefreshState refreshState = smartRefreshLayout.f20910o0ooOoO;
            boolean z = refreshState.isDragging;
            OooOOO oooOOO = smartRefreshLayout.f20908o0ooOO0;
            if (z && refreshState.isHeader) {
                oooOOO.OooO0Oo(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                oooOOO.OooO0Oo(RefreshState.PullUpCanceled);
            }
            smartRefreshLayout.f20889o00000 = null;
            if (Math.abs(smartRefreshLayout.f20834OooO0o0) >= Math.abs(i)) {
                smartRefreshLayout.OooO0oO(i, 0, smartRefreshLayout.f20856OooOoo0, Math.min(Math.max((int) (Math.abs(smartRefreshLayout.f20834OooO0o0 - i) / OooOOOO.f42525OooO0O0), 30), 100) * 10);
            }
        }
    }

    public class OooOOO implements o0OO0oO0.OooOO0O {
        public OooOOO() {
        }

        public final ValueAnimator OooO00o(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.OooO0oO(i, 0, smartRefreshLayout.f20856OooOoo0, smartRefreshLayout.f20831OooO);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x008f  */
        public final OooOOO OooO0O0(int i, boolean z) {
            int i2;
            boolean z2;
            o0OO0oO0.OooO0o oooO0o;
            o0OO0oO0.OooO oooO;
            o0OO0oO0.OooO0o oooO0o2;
            o0OO0oO0.OooO oooO2;
            o0OO0oO0.OooO oooO3;
            o0OO0oO0.OooO0o oooO0o3;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f20834OooO0o0 == i && (((oooO3 = smartRefreshLayout.f20899o00o0O) == null || !oooO3.OooO0oO()) && ((oooO0o3 = smartRefreshLayout.f20902o00ooo) == null || !oooO0o3.OooO0oO()))) {
                return this;
            }
            int i3 = smartRefreshLayout.f20834OooO0o0;
            smartRefreshLayout.f20834OooO0o0 = i;
            if (z) {
                RefreshState refreshState = smartRefreshLayout.f20910o0ooOoO;
                if (refreshState.isDragging || refreshState.isOpening) {
                    float f = i;
                    float f2 = smartRefreshLayout.f20884OooooOo * smartRefreshLayout.f20897o00Oo0;
                    OooOOO oooOOO = smartRefreshLayout.f20908o0ooOO0;
                    if (f > f2) {
                        if (smartRefreshLayout.f20909o0ooOOo != RefreshState.ReleaseToTwoLevel) {
                            oooOOO.OooO0Oo(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i) > smartRefreshLayout.f20885Oooooo * smartRefreshLayout.f20898o00Ooo && !smartRefreshLayout.f20895o000oOoO) {
                        oooOOO.OooO0Oo(RefreshState.ReleaseToLoad);
                    } else if (i < 0 && !smartRefreshLayout.f20895o000oOoO) {
                        oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                    } else if (i > 0) {
                        oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                    }
                }
            }
            p337o0OO0oOO.OooOOOO oooOOOO = smartRefreshLayout.f20911oo000o;
            o0OO0oO.OooO0O0 oooO0O0 = o0OO0oO.OooO0O0.f42504OooO0Oo;
            boolean z3 = smartRefreshLayout.f20860Oooo0;
            boolean z4 = smartRefreshLayout.f20863Oooo00o;
            if (oooOOOO != null) {
                if (i < 0 || (oooO2 = smartRefreshLayout.f20899o00o0O) == null) {
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
                if (i <= 0 && (oooO0o2 = smartRefreshLayout.f20902o00ooo) != null) {
                    if (smartRefreshLayout.OooOOOo(oooO0o2, z3)) {
                        i2 = i;
                    } else if (i3 > 0) {
                        i2 = 0;
                    }
                    z2 = true;
                }
                if (z2) {
                    smartRefreshLayout.f20911oo000o.OooO0Oo(i2, smartRefreshLayout.f20848OooOo0, smartRefreshLayout.f20850OooOo0O);
                    if (smartRefreshLayout.f20895o000oOoO && smartRefreshLayout.f20875OoooOOO && smartRefreshLayout.f20864Oooo0O0) {
                        o0OO0oO0.OooO0o oooO0o4 = smartRefreshLayout.f20902o00ooo;
                        if ((oooO0o4 instanceof o0OO0oO0.OooO0o) && oooO0o4.getSpinnerStyle() == oooO0O0 && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo)) {
                            smartRefreshLayout.f20902o00ooo.getView().setTranslationY(Math.max(0, i2));
                        }
                    }
                    o0OO0oO.OooO0O0 oooO0O1 = o0OO0oO.OooO0O0.f42506OooO0o0;
                    boolean z5 = (smartRefreshLayout.f20861Oooo000 && (oooO = smartRefreshLayout.f20899o00o0O) != null && oooO.getSpinnerStyle() == oooO0O1) || smartRefreshLayout.f20906o0Oo0oo != 0;
                    boolean z6 = (smartRefreshLayout.f20862Oooo00O && (oooO0o = smartRefreshLayout.f20902o00ooo) != null && oooO0o.getSpinnerStyle() == oooO0O1) || smartRefreshLayout.f20904o0OO00O != 0;
                    if ((z5 && (i2 >= 0 || i3 > 0)) || (z6 && (i2 <= 0 || i3 < 0))) {
                        smartRefreshLayout.invalidate();
                    }
                }
            }
            if ((i >= 0 || i3 > 0) && smartRefreshLayout.f20899o00o0O != null) {
                int iMax = Math.max(i, 0);
                int i4 = smartRefreshLayout.f20884OooooOo;
                int i5 = (int) (i4 * smartRefreshLayout.f20913ooOO);
                float f3 = (iMax * 1.0f) / (i4 == 0 ? 1 : i4);
                if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO) || (smartRefreshLayout.f20909o0ooOOo == RefreshState.RefreshFinish && !z)) {
                    if (i3 != smartRefreshLayout.f20834OooO0o0) {
                        if (smartRefreshLayout.f20899o00o0O.getSpinnerStyle() == oooO0O0) {
                            smartRefreshLayout.f20899o00o0O.getView().setTranslationY(smartRefreshLayout.f20834OooO0o0);
                            if (smartRefreshLayout.f20906o0Oo0oo != 0 && smartRefreshLayout.f20901o00oO0o != null && !smartRefreshLayout.OooOOOo(smartRefreshLayout.f20899o00o0O, z4)) {
                                smartRefreshLayout.invalidate();
                            }
                        } else if (smartRefreshLayout.f20899o00o0O.getSpinnerStyle().f42511OooO0OO) {
                            View view = smartRefreshLayout.f20899o00o0O.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f20830o00000O;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(Math.max((smartRefreshLayout.f20834OooO0o0 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), Pow2.MAX_POW2));
                            int i6 = marginLayoutParams.leftMargin;
                            int i7 = marginLayoutParams.topMargin + smartRefreshLayout.f20888Ooooooo;
                            view.layout(i6, i7, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i7);
                        }
                        smartRefreshLayout.f20899o00o0O.OooO0o(f3, iMax, i4, i5, z);
                    }
                    if (z && smartRefreshLayout.f20899o00o0O.OooO0oO()) {
                        int i8 = (int) smartRefreshLayout.f20841OooOOO0;
                        int width = smartRefreshLayout.getWidth();
                        smartRefreshLayout.f20899o00o0O.OooO(i8, smartRefreshLayout.f20841OooOOO0 / (width == 0 ? 1 : width), width);
                    }
                }
            }
            if ((i <= 0 || i3 < 0) && smartRefreshLayout.f20902o00ooo != null) {
                int i9 = -Math.min(i, 0);
                int i10 = smartRefreshLayout.f20885Oooooo;
                int i11 = (int) (i10 * smartRefreshLayout.f20896o00O0O);
                float f4 = (i9 * 1.0f) / (i10 == 0 ? 1 : i10);
                if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo) || (smartRefreshLayout.f20909o0ooOOo == RefreshState.LoadFinish && !z)) {
                    if (i3 != smartRefreshLayout.f20834OooO0o0) {
                        if (smartRefreshLayout.f20902o00ooo.getSpinnerStyle() == oooO0O0) {
                            smartRefreshLayout.f20902o00ooo.getView().setTranslationY(smartRefreshLayout.f20834OooO0o0);
                            if (smartRefreshLayout.f20904o0OO00O != 0 && smartRefreshLayout.f20901o00oO0o != null && !smartRefreshLayout.OooOOOo(smartRefreshLayout.f20902o00ooo, z3)) {
                                smartRefreshLayout.invalidate();
                            }
                        } else if (smartRefreshLayout.f20902o00ooo.getSpinnerStyle().f42511OooO0OO) {
                            View view2 = smartRefreshLayout.f20902o00ooo.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f20830o00000O;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(Math.max(((-smartRefreshLayout.f20834OooO0o0) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), Pow2.MAX_POW2));
                            int i12 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (smartRefreshLayout.getMeasuredHeight() + marginLayoutParams2.topMargin) - smartRefreshLayout.f20907o0OoOo0;
                            view2.layout(i12, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i12, measuredHeight);
                        }
                        smartRefreshLayout.f20902o00ooo.OooO0o(f4, i9, i10, i11, z);
                    }
                    if (z && smartRefreshLayout.f20902o00ooo.OooO0oO()) {
                        int i13 = (int) smartRefreshLayout.f20841OooOOO0;
                        int width2 = smartRefreshLayout.getWidth();
                        smartRefreshLayout.f20902o00ooo.OooO(i13, smartRefreshLayout.f20841OooOOO0 / (width2 == 0 ? 1 : width2), width2);
                    }
                }
            }
            return this;
        }

        public final OooOOO OooO0OO(@NonNull o0OO0oO0.OooOO0 oooOO1, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f20901o00oO0o == null && i != 0) {
                smartRefreshLayout.f20901o00oO0o = new Paint();
            }
            if (oooOO1.equals(smartRefreshLayout.f20899o00o0O)) {
                smartRefreshLayout.f20906o0Oo0oo = i;
            } else if (oooOO1.equals(smartRefreshLayout.f20902o00ooo)) {
                smartRefreshLayout.f20904o0OO00O = i;
            }
            return this;
        }

        public final void OooO0Oo(@NonNull RefreshState refreshState) {
            int i = OooO00o.f20917OooO00o[refreshState.ordinal()];
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            switch (i) {
                case 1:
                    RefreshState refreshState2 = smartRefreshLayout.f20909o0ooOOo;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f20834OooO0o0 == 0) {
                        smartRefreshLayout.OooOOo(refreshState3);
                    } else if (smartRefreshLayout.f20834OooO0o0 != 0) {
                        OooO00o(0);
                    }
                    break;
                case 2:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.PullDownToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo)) {
                        RefreshState refreshState4 = smartRefreshLayout.f20909o0ooOOo;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout.f20895o000oOoO || !smartRefreshLayout.f20864Oooo0O0 || !smartRefreshLayout.f20875OoooOOO)) {
                            smartRefreshLayout.OooOOo(RefreshState.PullUpToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.PullDownCanceled);
                        OooO0Oo(RefreshState.None);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    if (!smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo) || smartRefreshLayout.f20909o0ooOOo.isOpening || (smartRefreshLayout.f20895o000oOoO && smartRefreshLayout.f20864Oooo0O0 && smartRefreshLayout.f20875OoooOOO)) {
                        smartRefreshLayout.setViceState(RefreshState.PullUpCanceled);
                    } else {
                        smartRefreshLayout.OooOOo(RefreshState.PullUpCanceled);
                        OooO0Oo(RefreshState.None);
                    }
                    break;
                case 6:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.ReleaseToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    if (smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo)) {
                        RefreshState refreshState5 = smartRefreshLayout.f20909o0ooOOo;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout.f20895o000oOoO || !smartRefreshLayout.f20864Oooo0O0 || !smartRefreshLayout.f20875OoooOOO)) {
                            smartRefreshLayout.OooOOo(RefreshState.ReleaseToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.ReleaseToTwoLevel);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20857OooOooO)) {
                        smartRefreshLayout.OooOOo(RefreshState.RefreshReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    if (!smartRefreshLayout.f20909o0ooOOo.isOpening && smartRefreshLayout.OooOOOO(smartRefreshLayout.f20858OooOooo)) {
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
                    if (smartRefreshLayout.f20909o0ooOOo == RefreshState.Refreshing) {
                        smartRefreshLayout.OooOOo(RefreshState.RefreshFinish);
                    }
                    break;
                case 14:
                    if (smartRefreshLayout.f20909o0ooOOo == RefreshState.Loading) {
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
        public int f20931OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f20933OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f20932OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f20934OooO0oO = AnimationUtils.currentAnimationTimeMillis();

        public OooOOO0(float f) {
            this.f20933OooO0o0 = f;
            this.f20931OooO0Oo = SmartRefreshLayout.this.f20834OooO0o0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f20889o00000 != this || smartRefreshLayout.f20909o0ooOOo.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f20934OooO0oO;
            float fPow = (float) (Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.f20932OooO0o) / (1000.0f / 10)) * ((double) this.f20933OooO0o0));
            this.f20933OooO0o0 = fPow;
            float f = ((j * 1.0f) / 1000.0f) * fPow;
            if (Math.abs(f) <= 1.0f) {
                smartRefreshLayout.f20889o00000 = null;
                return;
            }
            this.f20934OooO0oO = jCurrentAnimationTimeMillis;
            int i = (int) (this.f20931OooO0Oo + f);
            this.f20931OooO0Oo = i;
            int i2 = smartRefreshLayout.f20834OooO0o0 * i;
            OooOOO oooOOO = smartRefreshLayout.f20908o0ooOO0;
            if (i2 > 0) {
                oooOOO.OooO0O0(i, true);
                smartRefreshLayout.f20900o00oO0O.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout.f20889o00000 = null;
            oooOOO.OooO0O0(0, true);
            View view = smartRefreshLayout.f20911oo000o.f42514OooO0o;
            int i3 = (int) (-this.f20933OooO0o0);
            float f2 = OooOOOO.f42525OooO0O0;
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
            if (!smartRefreshLayout.f20890o000000 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout.f20890o000000 = false;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void setDefaultRefreshFooterCreator(@NonNull o0OO0oO0.OooO00o oooO00o) {
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull o0OO0oO0.OooO0O0 oooO0O0) {
    }

    public static void setDefaultRefreshInitializer(@NonNull o0OO0oO0.OooO0OO oooO0OO) {
    }

    public final void OooO() {
        RefreshState refreshState = this.f20909o0ooOOo;
        if (refreshState == RefreshState.Refreshing) {
            OooOO0o(true);
            return;
        }
        if (refreshState == RefreshState.Loading) {
            OooOO0O(true);
        } else if (this.f20834OooO0o0 != 0) {
            OooO0oO(0, 0, this.f20856OooOoo0, this.f20831OooO);
        }
    }

    public final ValueAnimator OooO0oO(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f20834OooO0o0 == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f20893o00000O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20889o00000 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f20834OooO0o0, i);
        this.f20893o00000O0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f20893o00000O0.setInterpolator(interpolator);
        this.f20893o00000O0.addListener(new OooO0o());
        this.f20893o00000O0.addUpdateListener(new OooO());
        this.f20893o00000O0.setStartDelay(i2);
        this.f20893o00000O0.start();
        return this.f20893o00000O0;
    }

    public final boolean OooO0oo() {
        if (this.f20909o0ooOOo != RefreshState.None || !OooOOOO(this.f20857OooOooO)) {
            return false;
        }
        o0OO0o.OooOO0O oooOO0O = new o0OO0o.OooOO0O((XRefreshLayout) this);
        setViceState(RefreshState.Refreshing);
        oooOO0O.run();
        return true;
    }

    public final void OooOO0(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        o0OO0o.OooOO0 oooOO1 = new o0OO0o.OooOO0(this, i2, z2, z);
        if (i3 > 0) {
            this.f20900o00oO0O.postDelayed(oooOO1, i3);
        } else {
            oooOO1.run();
        }
    }

    public final void OooOO0O(boolean z) {
        OooOO0(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f20905o0OOO0o))), 300) << 16 : 0, z, false);
    }

    public final SmartRefreshLayout OooOO0o(boolean z) {
        if (z) {
            OooOOO0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f20905o0OOO0o))), 300) << 16, true, Boolean.FALSE);
            return this;
        }
        OooOOO0(0, false, null);
        return this;
    }

    public final boolean OooOOO(int i) {
        if (i == 0) {
            if (this.f20893o00000O0 != null) {
                RefreshState refreshState = this.f20909o0ooOOo;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased) {
                    return true;
                }
                RefreshState refreshState2 = RefreshState.PullDownCanceled;
                OooOOO oooOOO = this.f20908o0ooOO0;
                if (refreshState == refreshState2) {
                    oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                }
                this.f20893o00000O0.cancel();
                this.f20893o00000O0 = null;
            }
            this.f20889o00000 = null;
        }
        return this.f20893o00000O0 != null;
    }

    public final void OooOOO0(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        o0OO0o.OooO oooO = new o0OO0o.OooO(this, i2, bool, z);
        if (i3 > 0) {
            this.f20900o00oO0O.postDelayed(oooO, i3);
        } else {
            oooO.run();
        }
    }

    public final boolean OooOOOO(boolean z) {
        return z && !this.f20869Oooo0oo;
    }

    public final boolean OooOOOo(o0OO0oO0.OooOO0 oooOO1, boolean z) {
        return z || this.f20869Oooo0oo || oooOO1 == null || oooOO1.getSpinnerStyle() == o0OO0oO.OooO0O0.f42506OooO0o0;
    }

    public final void OooOOo(RefreshState refreshState) {
        RefreshState refreshState2 = this.f20909o0ooOOo;
        if (refreshState2 == refreshState) {
            if (this.f20910o0ooOoO != refreshState2) {
                this.f20910o0ooOoO = refreshState2;
                return;
            }
            return;
        }
        this.f20909o0ooOOo = refreshState;
        this.f20910o0ooOoO = refreshState;
        o0OO0oO0.OooO oooO = this.f20899o00o0O;
        o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
        if (oooO != null) {
            oooO.OooO00o(this, refreshState2, refreshState);
        }
        if (oooO0o != null) {
            oooO0o.OooO00o(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f20890o000000 = false;
        }
    }

    public final void OooOOo0(float f) {
        OooOOO oooOOO;
        RefreshState refreshState;
        float f2 = (!this.f20880Ooooo00 || this.f20871OoooO0 || f >= 0.0f || this.f20911oo000o.OooO00o()) ? f : 0.0f;
        int i = this.f20837OooOO0;
        if (f2 > i * 5 && getTag() == null) {
            Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
            setTag("你这么死拉，臣妾做不到啊！");
        }
        RefreshState refreshState2 = this.f20909o0ooOOo;
        RefreshState refreshState3 = RefreshState.TwoLevel;
        OooOOO oooOOO2 = this.f20908o0ooOO0;
        if (refreshState2 != refreshState3 || f2 <= 0.0f) {
            RefreshState refreshState4 = RefreshState.Refreshing;
            float f3 = this.f20842OooOOOO;
            if (refreshState2 != refreshState4 || f2 < 0.0f) {
                oooOOO = oooOOO2;
                if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f20864Oooo0O0 && this.f20895o000oOoO && this.f20875OoooOOO && OooOOOO(this.f20858OooOooo)) || (this.f20868Oooo0oO && !this.f20895o000oOoO && OooOOOO(this.f20858OooOooo))))) {
                    int i2 = this.f20885Oooooo;
                    if (f2 > (-i2)) {
                        oooOOO.OooO0O0((int) f2, true);
                    } else {
                        double d = (this.f20896o00O0O - 1.0f) * i2;
                        int iMax = Math.max((i * 4) / 3, getHeight());
                        int i3 = this.f20885Oooooo;
                        double d2 = iMax - i3;
                        double d3 = -Math.min(0.0f, (i3 + f2) * f3);
                        double d4 = -d3;
                        if (d2 == 0.0d) {
                            d2 = 1.0d;
                        }
                        oooOOO.OooO0O0(((int) (-Math.min(d * (1.0d - Math.pow(100.0d, d4 / d2)), d3))) - this.f20885Oooooo, true);
                    }
                } else if (f2 >= 0.0f) {
                    double d5 = this.f20913ooOO * this.f20884OooooOo;
                    double dMax = Math.max(i / 2, getHeight());
                    double dMax2 = Math.max(0.0f, f3 * f2);
                    double d6 = -dMax2;
                    if (dMax == 0.0d) {
                        dMax = 1.0d;
                    }
                    oooOOO.OooO0O0((int) Math.min((1.0d - Math.pow(100.0d, d6 / dMax)) * d5, dMax2), true);
                } else {
                    double d7 = this.f20896o00O0O * this.f20885Oooooo;
                    double dMax3 = Math.max(i / 2, getHeight());
                    double d8 = -Math.min(0.0f, f3 * f2);
                    double d9 = -d8;
                    if (dMax3 == 0.0d) {
                        dMax3 = 1.0d;
                    }
                    oooOOO.OooO0O0((int) (-Math.min((1.0d - Math.pow(100.0d, d9 / dMax3)) * d7, d8)), true);
                }
            } else {
                float f4 = this.f20884OooooOo;
                if (f2 < f4) {
                    oooOOO2.OooO0O0((int) f2, true);
                } else {
                    double d10 = (this.f20913ooOO - 1.0f) * f4;
                    int iMax2 = Math.max((i * 4) / 3, getHeight());
                    int i4 = this.f20884OooooOo;
                    double d11 = iMax2 - i4;
                    double dMax4 = Math.max(0.0f, (f2 - i4) * f3);
                    double d12 = -dMax4;
                    if (d11 == 0.0d) {
                        d11 = 1.0d;
                    }
                    int iMin = ((int) Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / d11)), dMax4)) + this.f20884OooooOo;
                    oooOOO = oooOOO2;
                    oooOOO.OooO0O0(iMin, true);
                }
            }
            if (this.f20868Oooo0oO || this.f20895o000oOoO || !OooOOOO(this.f20858OooOooo) || f2 >= 0.0f || (refreshState = this.f20909o0ooOOo) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
                return;
            }
            if (this.f20874OoooOO0) {
                this.f20889o00000 = null;
                oooOOO.OooO00o(-this.f20885Oooooo);
            }
            setStateDirectLoading(false);
            this.f20900o00oO0O.postDelayed(new OooOO0(), this.f20831OooO);
            return;
        }
        oooOOO2.OooO0O0(Math.min((int) f2, getMeasuredHeight()), true);
        oooOOO = oooOOO2;
        if (this.f20868Oooo0oO) {
        }
    }

    public final void OooOOoo() {
        RefreshState refreshState = this.f20909o0ooOOo;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        OooOOO oooOOO = this.f20908o0ooOO0;
        if (refreshState == refreshState2) {
            if (this.f20853OooOoO0 > -1000 && this.f20834OooO0o0 > getMeasuredHeight() / 2) {
                ValueAnimator valueAnimatorOooO00o = oooOOO.OooO00o(getMeasuredHeight());
                if (valueAnimatorOooO00o != null) {
                    valueAnimatorOooO00o.setDuration(this.f20836OooO0oo);
                    return;
                }
                return;
            }
            if (this.f20845OooOOo0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f20909o0ooOOo == refreshState2) {
                    smartRefreshLayout.f20908o0ooOO0.OooO0Oo(RefreshState.TwoLevelFinish);
                    if (smartRefreshLayout.f20834OooO0o0 != 0) {
                        oooOOO.OooO00o(0).setDuration(smartRefreshLayout.f20836OooO0oo);
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
        if (refreshState == refreshState3 || (this.f20864Oooo0O0 && this.f20895o000oOoO && this.f20875OoooOOO && this.f20834OooO0o0 < 0 && OooOOOO(this.f20858OooOooo))) {
            int i = this.f20834OooO0o0;
            int i2 = -this.f20885Oooooo;
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
        RefreshState refreshState4 = this.f20909o0ooOOo;
        RefreshState refreshState5 = RefreshState.Refreshing;
        if (refreshState4 == refreshState5) {
            int i3 = this.f20834OooO0o0;
            int i4 = this.f20884OooooOo;
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
            if (this.f20893o00000O0 == null) {
                oooOOO.OooO00o(this.f20884OooooOo);
            }
        } else if (refreshState4 == RefreshState.LoadReleased) {
            if (this.f20893o00000O0 == null) {
                oooOOO.OooO00o(-this.f20885Oooooo);
            }
        } else if (this.f20834OooO0o0 != 0) {
            oooOOO.OooO00o(0);
        }
    }

    public final void OooOo(@NonNull o0OO0oO0.OooO0o oooO0o) {
        o0OO0oO0.OooO0o oooO0o2;
        o0OO0oO0.OooO0o oooO0o3 = this.f20902o00ooo;
        if (oooO0o3 != null) {
            super.removeView(oooO0o3.getView());
        }
        this.f20902o00ooo = oooO0o;
        this.f20890o000000 = false;
        this.f20904o0OO00O = 0;
        this.f20875OoooOOO = false;
        this.f20903o0O0O00 = false;
        this.f20887OoooooO = this.f20887OoooooO.OooO0O0();
        this.f20858OooOooo = !this.f20876OoooOOo || this.f20858OooOooo;
        if (this.f20902o00ooo.getSpinnerStyle().f42510OooO0O0) {
            super.addView(this.f20902o00ooo.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f20902o00ooo.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f20855OooOoo;
        if (iArr == null || (oooO0o2 = this.f20902o00ooo) == null) {
            return;
        }
        oooO0o2.setPrimaryColors(iArr);
    }

    public final void OooOo0(float f) {
        this.f20896o00O0O = f;
        o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
        if (oooO0o == null || !this.f20894o000OOo) {
            this.f20887OoooooO = this.f20887OoooooO.OooO0O0();
            return;
        }
        int i = this.f20885Oooooo;
        oooO0o.OooO0oo(this.f20908o0ooOO0, i, (int) (i * f));
    }

    public final void OooOo00(boolean z) {
        this.f20876OoooOOo = true;
        this.f20858OooOooo = z;
    }

    public final SmartRefreshLayout OooOo0O(float f) {
        this.f20913ooOO = f;
        o0OO0oO0.OooO oooO = this.f20899o00o0O;
        if (oooO == null || !this.f20894o000OOo) {
            this.f20886Oooooo0 = this.f20886Oooooo0.OooO0O0();
        } else {
            int i = this.f20884OooooOo;
            oooO.OooO0oo(this.f20908o0ooOO0, i, (int) (f * i));
        }
        return this;
    }

    public final void OooOo0o(boolean z) {
        if (this.f20909o0ooOOo == RefreshState.Loading && z) {
            OooOO0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f20905o0OOO0o))), 300) << 16, true, true);
            return;
        }
        if (this.f20895o000oOoO != z) {
            this.f20895o000oOoO = z;
            o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
            if (oooO0o instanceof o0OO0oO0.OooO0o) {
                if (!oooO0o.OooO0O0(z)) {
                    this.f20875OoooOOO = false;
                    new RuntimeException("Footer:" + this.f20902o00ooo + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                    return;
                }
                this.f20875OoooOOO = true;
                if (this.f20895o000oOoO && this.f20864Oooo0O0 && this.f20834OooO0o0 > 0 && this.f20902o00ooo.getSpinnerStyle() == o0OO0oO.OooO0O0.f42504OooO0Oo && OooOOOO(this.f20858OooOooo)) {
                    if (OooOOOo(this.f20899o00o0O, this.f20857OooOooO)) {
                        this.f20902o00ooo.getView().setTranslationY(this.f20834OooO0o0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    public final boolean OooOoO(float f) {
        RefreshState refreshState;
        if (f == 0.0f) {
            f = this.f20853OooOoO0;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f20911oo000o != null) {
            getScaleY();
            View view = this.f20911oo000o.f42513OooO0Oo;
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        int i = 0;
        if (Math.abs(f) > this.f20851OooOo0o) {
            int i2 = this.f20834OooO0o0;
            if (i2 * f < 0.0f) {
                RefreshState refreshState2 = this.f20909o0ooOOo;
                RefreshState refreshState3 = RefreshState.Refreshing;
                if (refreshState2 == refreshState3 || refreshState2 == RefreshState.Loading || (i2 < 0 && this.f20895o000oOoO)) {
                    OooOOO0 oooOOO0 = new OooOOO0(f);
                    RefreshState refreshState4 = this.f20909o0ooOOo;
                    if (refreshState4.isFinishing) {
                        oooOOO0 = null;
                    } else {
                        if (this.f20834OooO0o0 != 0 && ((!refreshState4.isOpening && (!this.f20895o000oOoO || !this.f20864Oooo0O0 || !this.f20875OoooOOO || !OooOOOO(this.f20858OooOooo))) || (((this.f20909o0ooOOo == RefreshState.Loading || (this.f20895o000oOoO && this.f20864Oooo0O0 && this.f20875OoooOOO && OooOOOO(this.f20858OooOooo))) && this.f20834OooO0o0 < (-this.f20885Oooooo)) || (this.f20909o0ooOOo == refreshState3 && this.f20834OooO0o0 > this.f20884OooooOo)))) {
                            int i3 = this.f20834OooO0o0;
                            float fPow = oooOOO0.f20933OooO0o0;
                            int i4 = i3;
                            while (true) {
                                if (i3 * i4 > 0) {
                                    i++;
                                    fPow = (float) (Math.pow(0.98f, (i * 10) / 10.0f) * ((double) fPow));
                                    float f2 = ((10 * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f2) < 1.0f) {
                                        RefreshState refreshState5 = this.f20909o0ooOOo;
                                        if (!refreshState5.isOpening || ((refreshState5 == (refreshState = RefreshState.Refreshing) && i4 > this.f20884OooooOo) || (refreshState5 != refreshState && i4 < (-this.f20885Oooooo)))) {
                                            oooOOO0 = null;
                                        }
                                    } else {
                                        i4 = (int) (i4 + f2);
                                    }
                                }
                            }
                        }
                        oooOOO0.f20932OooO0o = AnimationUtils.currentAnimationTimeMillis();
                        this.f20900o00oO0O.postDelayed(oooOOO0, 10);
                    }
                    this.f20889o00000 = oooOOO0;
                    return true;
                }
                if (refreshState2.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f20867Oooo0o0 && (this.f20858OooOooo || this.f20866Oooo0o)) || ((this.f20909o0ooOOo == RefreshState.Loading && i2 >= 0) || (this.f20868Oooo0oO && OooOOOO(this.f20858OooOooo))))) || (f > 0.0f && ((this.f20867Oooo0o0 && this.f20857OooOooO) || this.f20866Oooo0o || (this.f20909o0ooOOo == RefreshState.Refreshing && this.f20834OooO0o0 <= 0)))) {
                this.f20891o000000O = false;
                Scroller scroller = this.f20852OooOoO;
                scroller.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                scroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public final void OooOoO0(@NonNull o0OO0oO0.OooO oooO) {
        o0OO0oO0.OooO oooO2;
        o0OO0oO0.OooO oooO3 = this.f20899o00o0O;
        if (oooO3 != null) {
            super.removeView(oooO3.getView());
        }
        this.f20899o00o0O = oooO;
        this.f20906o0Oo0oo = 0;
        this.f20912oo0o0Oo = false;
        this.f20886Oooooo0 = this.f20886Oooooo0.OooO0O0();
        if (this.f20899o00o0O.getSpinnerStyle().f42510OooO0O0) {
            super.addView(this.f20899o00o0O.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f20899o00o0O.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f20855OooOoo;
        if (iArr == null || (oooO2 = this.f20899o00o0O) == null) {
            return;
        }
        oooO2.setPrimaryColors(iArr);
    }

    @Override // android.view.View
    public final void computeScroll() {
        RefreshState refreshState;
        Scroller scroller = this.f20852OooOoO;
        scroller.getCurrY();
        if (scroller.computeScrollOffset()) {
            int finalY = scroller.getFinalY();
            if ((finalY >= 0 || !((this.f20857OooOooO || this.f20866Oooo0o) && this.f20911oo000o.OooO0O0())) && (finalY <= 0 || !((this.f20858OooOooo || this.f20866Oooo0o) && this.f20911oo000o.OooO00o()))) {
                this.f20891o000000O = true;
                invalidate();
                return;
            }
            if (this.f20891o000000O) {
                float currVelocity = finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity();
                if (this.f20893o00000O0 == null) {
                    if (currVelocity > 0.0f && ((refreshState = this.f20909o0ooOOo) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                        this.f20889o00000 = new OooOO0O(currVelocity, this.f20884OooooOo);
                    } else if (currVelocity < 0.0f && (this.f20909o0ooOOo == RefreshState.Loading || ((this.f20864Oooo0O0 && this.f20895o000oOoO && this.f20875OoooOOO && OooOOOO(this.f20858OooOooo)) || (this.f20868Oooo0oO && !this.f20895o000oOoO && OooOOOO(this.f20858OooOooo) && this.f20909o0ooOOo != RefreshState.Refreshing)))) {
                        this.f20889o00000 = new OooOO0O(currVelocity, -this.f20885Oooooo);
                    } else if (this.f20834OooO0o0 == 0 && this.f20867Oooo0o0) {
                        this.f20889o00000 = new OooOO0O(currVelocity, 0);
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
        p337o0OO0oOO.OooOOOO oooOOOO;
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
        o0OO0oO0.OooO0o oooO0o;
        o0OO0oO0.OooO oooO;
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
        if ((actionMasked == 6 || actionMasked == 5) && this.f20845OooOOo0) {
            this.f20839OooOO0o = (f6 - this.f20840OooOOO) + this.f20839OooOO0o;
        }
        this.f20841OooOOO0 = f5;
        this.f20840OooOOO = f6;
        if (this.f20880Ooooo00) {
            int i6 = this.f20879OoooOoo;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i6 == this.f20879OoooOoo) {
                int i7 = (int) this.f20841OooOOO0;
                int width = getWidth();
                float f7 = this.f20841OooOOO0 / (width != 0 ? width : 1);
                if (OooOOOO(this.f20857OooOooO) && this.f20834OooO0o0 > 0 && (oooO = this.f20899o00o0O) != null && oooO.OooO0oO()) {
                    this.f20899o00o0O.OooO(i7, f7, width);
                } else if (OooOOOO(this.f20858OooOooo) && this.f20834OooO0o0 < 0 && (oooO0o = this.f20902o00ooo) != null && oooO0o.OooO0oO()) {
                    this.f20902o00ooo.OooO(i7, f7, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.f20857OooOooO || this.f20858OooOooo || this.f20866Oooo0o)) {
            if (!this.f20912oo0o0Oo) {
                if (this.f20903o0O0O00) {
                    refreshState6 = this.f20909o0ooOOo;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOOO(actionMasked)) {
                    refreshState = this.f20909o0ooOOo;
                    if (!refreshState.isFinishing) {
                        velocityTracker = this.f20854OooOoOO;
                        if (actionMasked != 0) {
                            this.f20853OooOoO0 = 0;
                            velocityTracker.addMovement(motionEvent);
                            this.f20852OooOoO.forceFinished(true);
                            this.f20838OooOO0O = f5;
                            this.f20839OooOO0o = f6;
                            this.f20833OooO0o = 0;
                            this.f20835OooO0oO = this.f20834OooO0o0;
                            this.f20845OooOOo0 = false;
                            this.f20844OooOOo = super.dispatchTouchEvent(motionEvent);
                            if (this.f20909o0ooOOo != RefreshState.TwoLevel) {
                            }
                            oooOOOO = this.f20911oo000o;
                            if (oooOOOO != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooOOOO.f42513OooO0Oo.getLeft(), -oooOOOO.f42513OooO0Oo.getTop());
                                view = oooOOOO.f42514OooO0o;
                                view2 = oooOOOO.f42513OooO0Oo;
                                if (view != view2) {
                                    oooOOOO.f42514OooO0o = p337o0OO0oOO.OooOOOO.OooO0OO(view2, pointF, view);
                                }
                                if (oooOOOO.f42514OooO0o == oooOOOO.f42513OooO0Oo) {
                                    oooOOOO.f42520OooOO0o.f42521OooO00o = null;
                                } else {
                                    oooOOOO.f42520OooOO0o.f42521OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f5 - this.f20838OooOO0O;
                                f2 = f6 - this.f20839OooOO0o;
                                velocityTracker.addMovement(motionEvent);
                                z = this.f20845OooOOo0;
                                oooOOO = this.f20908o0ooOO0;
                                i = this.f20832OooO0Oo;
                                if (!z) {
                                    if (c != 'v') {
                                        f3 = i;
                                        if (Math.abs(f2) < f3) {
                                        }
                                        if (Math.abs(f) >= f3) {
                                            this.f20843OooOOOo = 'h';
                                        }
                                    } else {
                                        this.f20843OooOOOo = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f20845OooOOo0 = true;
                                                this.f20839OooOO0o = i + f6;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f20845OooOOo0 = true;
                                            this.f20839OooOO0o = i + f6;
                                        }
                                        if (this.f20845OooOOo0) {
                                            f2 = f6 - this.f20839OooOO0o;
                                            if (this.f20844OooOOo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            i3 = this.f20834OooO0o0;
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
                                if (this.f20845OooOOo0) {
                                    i2 = ((int) f2) + this.f20835OooO0oO;
                                    refreshState3 = this.f20910o0ooOoO;
                                    if (refreshState3.isHeader) {
                                        this.f20833OooO0o = i2;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f20892o000000o == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.f20838OooOO0O + f, this.f20839OooOO0o, 0);
                                            this.f20892o000000o = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f20838OooOO0O + f, this.f20839OooOO0o + i2, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f20890o000000) {
                                            this.f20890o000000 = false;
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
                                        refreshState4 = this.f20910o0ooOoO;
                                        if (!refreshState4.isHeader) {
                                            if (this.f20892o000000o != null) {
                                                this.f20892o000000o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i2 = i4;
                                        } else {
                                            if (this.f20892o000000o != null) {
                                                this.f20892o000000o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i2 = i4;
                                        }
                                        if (this.f20834OooO0o0 != 0) {
                                            OooOOo0(0.0f);
                                        }
                                        return true;
                                    }
                                    this.f20833OooO0o = i2;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.f20892o000000o == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.f20838OooOO0O + f, this.f20839OooOO0o, 0);
                                        this.f20892o000000o = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f20838OooOO0O + f, this.f20839OooOO0o + i2, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.f20890o000000) {
                                        this.f20890o000000 = false;
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
                                    refreshState4 = this.f20910o0ooOoO;
                                    if (!refreshState4.isHeader) {
                                        if (this.f20892o000000o != null) {
                                            this.f20892o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    } else {
                                        if (this.f20892o000000o != null) {
                                            this.f20892o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    }
                                    if (this.f20834OooO0o0 != 0) {
                                        OooOOo0(0.0f);
                                    }
                                    return true;
                                    OooOOo0(i2);
                                    return true;
                                }
                                if (this.f20890o000000) {
                                    this.f20890o000000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        velocityTracker.addMovement(motionEvent);
                        velocityTracker.computeCurrentVelocity(1000, this.f20847OooOo);
                        this.f20853OooOoO0 = (int) velocityTracker.getYVelocity();
                        OooOoO(0.0f);
                        velocityTracker.clear();
                        this.f20843OooOOOo = 'n';
                        motionEvent2 = this.f20892o000000o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f20892o000000o = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.f20838OooOO0O, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        OooOOoo();
                        if (this.f20845OooOOo0) {
                            this.f20845OooOOo0 = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.f20909o0ooOOo;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.f20903o0O0O00) {
                    refreshState6 = this.f20909o0ooOOo;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOOO(actionMasked)) {
                    refreshState = this.f20909o0ooOOo;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.f20874OoooOO0) && (refreshState != RefreshState.Refreshing || !this.f20870OoooO))) {
                        velocityTracker = this.f20854OooOoOO;
                        if (actionMasked != 0) {
                            this.f20853OooOoO0 = 0;
                            velocityTracker.addMovement(motionEvent);
                            this.f20852OooOoO.forceFinished(true);
                            this.f20838OooOO0O = f5;
                            this.f20839OooOO0o = f6;
                            this.f20833OooO0o = 0;
                            this.f20835OooO0oO = this.f20834OooO0o0;
                            this.f20845OooOOo0 = false;
                            this.f20844OooOOo = super.dispatchTouchEvent(motionEvent);
                            if (this.f20909o0ooOOo != RefreshState.TwoLevel && this.f20839OooOO0o < (getMeasuredHeight() * 5) / 6) {
                                this.f20843OooOOOo = 'h';
                                return this.f20844OooOOo;
                            }
                            oooOOOO = this.f20911oo000o;
                            if (oooOOOO != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooOOOO.f42513OooO0Oo.getLeft(), -oooOOOO.f42513OooO0Oo.getTop());
                                view = oooOOOO.f42514OooO0o;
                                view2 = oooOOOO.f42513OooO0Oo;
                                if (view != view2) {
                                    oooOOOO.f42514OooO0o = p337o0OO0oOO.OooOOOO.OooO0OO(view2, pointF, view);
                                }
                                if (oooOOOO.f42514OooO0o == oooOOOO.f42513OooO0Oo) {
                                    oooOOOO.f42520OooOO0o.f42521OooO00o = null;
                                } else {
                                    oooOOOO.f42520OooOO0o.f42521OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f5 - this.f20838OooOO0O;
                                f2 = f6 - this.f20839OooOO0o;
                                velocityTracker.addMovement(motionEvent);
                                z = this.f20845OooOOo0;
                                oooOOO = this.f20908o0ooOO0;
                                i = this.f20832OooO0Oo;
                                if (!z && (c = this.f20843OooOOOo) != 'h' && this.f20911oo000o != null) {
                                    if (c != 'v') {
                                        f3 = i;
                                        if (Math.abs(f2) < f3 && Math.abs(f) < Math.abs(f2)) {
                                            this.f20843OooOOOo = 'v';
                                            if (f2 <= 0.0f && (this.f20834OooO0o0 < 0 || ((this.f20866Oooo0o || this.f20857OooOooO) && this.f20911oo000o.OooO0O0()))) {
                                                this.f20845OooOOo0 = true;
                                                this.f20839OooOO0o = f6 - i;
                                            } else if (f2 < 0.0f && (this.f20834OooO0o0 > 0 || ((this.f20866Oooo0o || this.f20858OooOooo) && ((this.f20909o0ooOOo == refreshState2 && this.f20890o000000) || this.f20911oo000o.OooO00o())))) {
                                                this.f20845OooOOo0 = true;
                                                this.f20839OooOO0o = i + f6;
                                            }
                                            if (this.f20845OooOOo0) {
                                                f2 = f6 - this.f20839OooOO0o;
                                                if (this.f20844OooOOo) {
                                                    motionEvent.setAction(3);
                                                    super.dispatchTouchEvent(motionEvent);
                                                }
                                                i3 = this.f20834OooO0o0;
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
                                        } else if (Math.abs(f) >= f3 && Math.abs(f) > Math.abs(f2) && this.f20843OooOOOo != 'v') {
                                            this.f20843OooOOOo = 'h';
                                        }
                                    } else {
                                        this.f20843OooOOOo = 'v';
                                        if (f2 <= 0.0f) {
                                            if (f2 < 0.0f) {
                                                this.f20845OooOOo0 = true;
                                                this.f20839OooOO0o = i + f6;
                                            }
                                        } else if (f2 < 0.0f) {
                                            this.f20845OooOOo0 = true;
                                            this.f20839OooOO0o = i + f6;
                                        }
                                        if (this.f20845OooOOo0) {
                                            f2 = f6 - this.f20839OooOO0o;
                                            if (this.f20844OooOOo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            i3 = this.f20834OooO0o0;
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
                                if (this.f20845OooOOo0) {
                                    i2 = ((int) f2) + this.f20835OooO0oO;
                                    refreshState3 = this.f20910o0ooOoO;
                                    if ((refreshState3.isHeader && (i2 < 0 || this.f20833OooO0o < 0)) || (refreshState3.isFooter && (i2 > 0 || this.f20833OooO0o > 0))) {
                                        this.f20833OooO0o = i2;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f20892o000000o == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.f20838OooOO0O + f, this.f20839OooOO0o, 0);
                                            this.f20892o000000o = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f20838OooOO0O + f, this.f20839OooOO0o + i2, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f20890o000000 && f2 > i && this.f20834OooO0o0 < 0) {
                                            this.f20890o000000 = false;
                                        }
                                        if (i2 <= 0 && ((this.f20866Oooo0o || this.f20857OooOooO) && this.f20911oo000o.OooO0O0())) {
                                            this.f20840OooOOO = f6;
                                            this.f20839OooOO0o = f6;
                                            this.f20835OooO0oO = 0;
                                            oooOOO.OooO0Oo(RefreshState.PullDownToRefresh);
                                        } else if (i2 < 0 || !((this.f20866Oooo0o || this.f20858OooOooo) && this.f20911oo000o.OooO00o())) {
                                            i4 = i2;
                                        } else {
                                            this.f20840OooOOO = f6;
                                            this.f20839OooOO0o = f6;
                                            this.f20835OooO0oO = 0;
                                            oooOOO.OooO0Oo(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.f20910o0ooOoO;
                                        if ((!refreshState4.isHeader && i4 < 0) || (refreshState4.isFooter && i4 > 0)) {
                                            if (this.f20834OooO0o0 != 0) {
                                                OooOOo0(0.0f);
                                            }
                                            return true;
                                        }
                                        if (this.f20892o000000o != null) {
                                            this.f20892o000000o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i2 = i4;
                                    }
                                    OooOOo0(i2);
                                    return true;
                                }
                                if (this.f20890o000000 && f2 > i && this.f20834OooO0o0 < 0) {
                                    this.f20890o000000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        velocityTracker.addMovement(motionEvent);
                        velocityTracker.computeCurrentVelocity(1000, this.f20847OooOo);
                        this.f20853OooOoO0 = (int) velocityTracker.getYVelocity();
                        OooOoO(0.0f);
                        velocityTracker.clear();
                        this.f20843OooOOOo = 'n';
                        motionEvent2 = this.f20892o000000o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f20892o000000o = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.f20838OooOO0O, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        OooOOoo();
                        if (this.f20845OooOOo0) {
                            this.f20845OooOOo0 = false;
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
        p337o0OO0oOO.OooOOOO oooOOOO = this.f20911oo000o;
        View view2 = oooOOOO != null ? oooOOOO.f42513OooO0Oo : null;
        o0OO0oO0.OooO oooO = this.f20899o00o0O;
        o0OO0oO.OooO0O0 oooO0O0 = o0OO0oO.OooO0O0.f42504OooO0Oo;
        o0OO0oO.OooO0O0 oooO0O1 = o0OO0oO.OooO0O0.f42506OooO0o0;
        boolean z = this.f20865Oooo0OO;
        if (oooO != null && oooO.getView() == view) {
            if (!OooOOOO(this.f20857OooOooO) || (!z && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f20834OooO0o0, view.getTop());
                int i = this.f20906o0Oo0oo;
                if (i != 0 && (paint2 = this.f20901o00oO0o) != null) {
                    paint2.setColor(i);
                    if (this.f20899o00o0O.getSpinnerStyle().f42511OooO0OO) {
                        iMax = view.getBottom();
                    } else if (this.f20899o00o0O.getSpinnerStyle() == oooO0O0) {
                        iMax = view.getBottom() + this.f20834OooO0o0;
                    }
                    int i2 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i2, this.f20901o00oO0o);
                    iMax = i2;
                }
                if (this.f20861Oooo000 && this.f20899o00o0O.getSpinnerStyle() == oooO0O1) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
        if (oooO0o != null && oooO0o.getView() == view) {
            if (!OooOOOO(this.f20858OooOooo) || (!z && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f20834OooO0o0, view.getBottom());
                int i3 = this.f20904o0OO00O;
                if (i3 != 0 && (paint = this.f20901o00oO0o) != null) {
                    paint.setColor(i3);
                    if (this.f20902o00ooo.getSpinnerStyle().f42511OooO0OO) {
                        iMin = view.getTop();
                    } else if (this.f20902o00ooo.getSpinnerStyle() == oooO0O0) {
                        iMin = view.getTop() + this.f20834OooO0o0;
                    }
                    int i4 = iMin;
                    canvas.drawRect(0.0f, i4, getWidth(), view.getBottom(), this.f20901o00oO0o);
                    iMin = i4;
                }
                if (this.f20862Oooo00O && this.f20902o00ooo.getSpinnerStyle() == oooO0O1) {
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

    @Override // o0OO0oO0.OooOOO0
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o000000 o000000Var = this.f20883OooooOO;
        return o000000Var.f5428OooO0O0 | o000000Var.f5427OooO00o;
    }

    @Nullable
    public o0OO0oO0.OooO0o getRefreshFooter() {
        o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
        if (oooO0o instanceof o0OO0oO0.OooO0o) {
            return oooO0o;
        }
        return null;
    }

    @Nullable
    public o0OO0oO0.OooO getRefreshHeader() {
        o0OO0oO0.OooO oooO = this.f20899o00o0O;
        if (oooO instanceof o0OO0oO0.OooO) {
            return oooO;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f20909o0ooOOo;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f20873OoooO0O && (this.f20866Oooo0o || this.f20857OooOooO || this.f20858OooOooo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        OooOOO oooOOO;
        o0OO0oO0.OooO0o oooO0o;
        super.onAttachedToWindow();
        boolean z = true;
        this.f20894o000OOo = true;
        if (!isInEditMode()) {
            if (this.f20899o00o0O == null) {
                OooOoO0(new BezierRadarHeader(getContext()));
            }
            if (this.f20902o00ooo == null) {
                boolean z2 = this.f20858OooOooo;
                OooOo(new BallPulseFooter(getContext()));
                this.f20858OooOooo = z2;
            } else {
                this.f20858OooOooo = this.f20858OooOooo || !this.f20876OoooOOo;
            }
            if (this.f20911oo000o == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    o0OO0oO0.OooO oooO = this.f20899o00o0O;
                    if ((oooO == null || childAt != oooO.getView()) && ((oooO0o = this.f20902o00ooo) == null || childAt != oooO0o.getView())) {
                        this.f20911oo000o = new p337o0OO0oOO.OooOOOO(childAt);
                    }
                }
            }
            if (this.f20911oo000o == null) {
                int iOooO0OO = OooOOOO.OooO0OO(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(o0OO0o.OooO0OO.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1));
                p337o0OO0oOO.OooOOOO oooOOOO = new p337o0OO0oOO.OooOOOO(textView);
                this.f20911oo000o = oooOOOO;
                oooOOOO.f42513OooO0Oo.setPadding(iOooO0OO, iOooO0OO, iOooO0OO, iOooO0OO);
            }
            View viewFindViewById = findViewById(this.f20846OooOOoo);
            View viewFindViewById2 = findViewById(this.f20849OooOo00);
            p337o0OO0oOO.OooOOOO oooOOOO2 = this.f20911oo000o;
            oooOOOO2.getClass();
            View view = null;
            oooOOOO2.f42520OooOO0o.f42522OooO0O0 = null;
            p337o0OO0oOO.OooOOOO oooOOOO3 = this.f20911oo000o;
            oooOOOO3.f42520OooOO0o.f42523OooO0OO = this.f20871OoooO0;
            View view2 = oooOOOO3.f42513OooO0Oo;
            boolean zIsInEditMode = view2.isInEditMode();
            View view3 = null;
            while (true) {
                oooOOO = this.f20908o0ooOO0;
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
                        if ((z3 || view5 != view2) && OooOOOO.OooO0Oo(view5)) {
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
                                        ((AppBarLayout) childAt2).OooO00o(new p339o0OO0oo0.OooOOO(oooOOOO3));
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
                oooOOOO3.f42514OooO0o = view3;
            }
            if (viewFindViewById != null || viewFindViewById2 != null) {
                oooOOOO3.f42516OooO0oO = viewFindViewById;
                oooOOOO3.f42517OooO0oo = viewFindViewById2;
                FrameLayout frameLayout = new FrameLayout(oooOOOO3.f42513OooO0Oo.getContext());
                int iIndexOfChild = SmartRefreshLayout.this.getLayout().indexOfChild(oooOOOO3.f42513OooO0Oo);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.getLayout().removeView(oooOOOO3.f42513OooO0Oo);
                frameLayout.addView(oooOOOO3.f42513OooO0Oo, 0, new ViewGroup.LayoutParams(-1, -1));
                smartRefreshLayout.getLayout().addView(frameLayout, iIndexOfChild, oooOOOO3.f42513OooO0Oo.getLayoutParams());
                oooOOOO3.f42513OooO0Oo = frameLayout;
                if (viewFindViewById != null) {
                    viewFindViewById.setTag("fixed-top");
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    ViewGroup viewGroup3 = (ViewGroup) viewFindViewById.getParent();
                    int iIndexOfChild2 = viewGroup3.indexOfChild(viewFindViewById);
                    viewGroup3.removeView(viewFindViewById);
                    layoutParams.height = OooOOOO.OooO0o(viewFindViewById);
                    viewGroup3.addView(new Space(oooOOOO3.f42513OooO0Oo.getContext()), iIndexOfChild2, layoutParams);
                    frameLayout.addView(viewFindViewById, 1, layoutParams);
                }
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setTag("fixed-bottom");
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                    ViewGroup viewGroup4 = (ViewGroup) viewFindViewById2.getParent();
                    int iIndexOfChild3 = viewGroup4.indexOfChild(viewFindViewById2);
                    viewGroup4.removeView(viewFindViewById2);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                    layoutParams2.height = OooOOOO.OooO0o(viewFindViewById2);
                    viewGroup4.addView(new Space(oooOOOO3.f42513OooO0Oo.getContext()), iIndexOfChild3, layoutParams2);
                    layoutParams3.gravity = 80;
                    frameLayout.addView(viewFindViewById2, 1, layoutParams3);
                }
            }
            if (this.f20834OooO0o0 != 0) {
                OooOOo(RefreshState.None);
                p337o0OO0oOO.OooOOOO oooOOOO4 = this.f20911oo000o;
                this.f20834OooO0o0 = 0;
                oooOOOO4.OooO0Oo(0, this.f20848OooOo0, this.f20850OooOo0O);
            }
        }
        int[] iArr = this.f20855OooOoo;
        if (iArr != null) {
            o0OO0oO0.OooO oooO2 = this.f20899o00o0O;
            if (oooO2 != null) {
                oooO2.setPrimaryColors(iArr);
            }
            o0OO0oO0.OooO0o oooO0o2 = this.f20902o00ooo;
            if (oooO0o2 != null) {
                oooO0o2.setPrimaryColors(iArr);
            }
        }
        p337o0OO0oOO.OooOOOO oooOOOO5 = this.f20911oo000o;
        if (oooOOOO5 != null) {
            super.bringChildToFront(oooOOOO5.f42513OooO0Oo);
        }
        o0OO0oO0.OooO oooO3 = this.f20899o00o0O;
        if (oooO3 != null && oooO3.getSpinnerStyle().f42510OooO0O0) {
            super.bringChildToFront(this.f20899o00o0O.getView());
        }
        o0OO0oO0.OooO0o oooO0o3 = this.f20902o00ooo;
        if (oooO0o3 == null || !oooO0o3.getSpinnerStyle().f42510OooO0O0) {
            return;
        }
        super.bringChildToFront(this.f20902o00ooo.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20894o000OOo = false;
        this.f20908o0ooOO0.OooO0O0(0, true);
        OooOOo(RefreshState.None);
        Handler handler = this.f20900o00oO0O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f20876OoooOOo = true;
        this.f20889o00000 = null;
        ValueAnimator valueAnimator = this.f20893o00000O0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f20893o00000O0.removeAllUpdateListeners();
            this.f20893o00000O0.cancel();
            this.f20893o00000O0 = null;
        }
        this.f20890o000000 = false;
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
            if (OooOOOO.OooO0Oo(childAt) && (c < 2 || i4 == 1)) {
                i3 = i4;
                c = 2;
            } else if (!(childAt instanceof o0OO0oO0.OooOO0) && c < 1) {
                c = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.f20911oo000o = new p337o0OO0oOO.OooOOOO(super.getChildAt(i3));
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
            if (i5 == i || (i5 != i2 && i == -1 && this.f20899o00o0O == null && (childAt2 instanceof o0OO0oO0.OooO))) {
                this.f20899o00o0O = childAt2 instanceof o0OO0oO0.OooO ? (o0OO0oO0.OooO) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof o0OO0oO0.OooO0o))) {
                this.f20858OooOooo = this.f20858OooOooo || !this.f20876OoooOOo;
                this.f20902o00ooo = childAt2 instanceof o0OO0oO0.OooO0o ? (o0OO0oO0.OooO0o) childAt2 : new RefreshFooterWrapper(childAt2);
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
            if (childAt.getVisibility() != 8 && childAt.getTag(o0OO0o.OooO0OO.srl_component_falsify) != childAt) {
                p337o0OO0oOO.OooOOOO oooOOOO = this.f20911oo000o;
                ViewGroup.MarginLayoutParams marginLayoutParams = f20830o00000O;
                boolean z2 = this.f20865Oooo0OO;
                if (oooOOOO != null && oooOOOO.f42513OooO0Oo == childAt) {
                    boolean z3 = isInEditMode() && z2 && OooOOOO(this.f20857OooOooO) && this.f20899o00o0O != null;
                    View view = this.f20911oo000o.f42513OooO0Oo;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams;
                    int i6 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams2.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z3) {
                        if (OooOOOo(this.f20899o00o0O, this.f20863Oooo00o)) {
                            int i8 = this.f20884OooooOo;
                            i7 += i8;
                            measuredHeight += i8;
                        }
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                o0OO0oO0.OooO oooO = this.f20899o00o0O;
                o0OO0oO.OooO0O0 oooO0O0 = o0OO0oO.OooO0O0.f42504OooO0Oo;
                if (oooO != null && oooO.getView() == childAt) {
                    boolean z4 = isInEditMode() && z2 && OooOOOO(this.f20857OooOooO);
                    View view2 = this.f20899o00o0O.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                    int i9 = marginLayoutParams3.leftMargin;
                    int i10 = marginLayoutParams3.topMargin + this.f20888Ooooooo;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z4 && this.f20899o00o0O.getSpinnerStyle() == oooO0O0) {
                        int i11 = this.f20884OooooOo;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
                if (oooO0o != null && oooO0o.getView() == childAt) {
                    boolean z5 = isInEditMode() && z2 && OooOOOO(this.f20858OooOooo);
                    View view3 = this.f20902o00ooo.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    }
                    o0OO0oO.OooO0O0 spinnerStyle = this.f20902o00ooo.getSpinnerStyle();
                    int i12 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = getMeasuredHeight() + marginLayoutParams.topMargin;
                    int i13 = this.f20907o0OoOo0;
                    int measuredHeight4 = measuredHeight3 - i13;
                    if (this.f20895o000oOoO && this.f20875OoooOOO && this.f20864Oooo0O0 && this.f20911oo000o != null && this.f20902o00ooo.getSpinnerStyle() == oooO0O0 && OooOOOO(this.f20858OooOooo)) {
                        View view4 = this.f20911oo000o.f42513OooO0Oo;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight4 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == o0OO0oO.OooO0O0.f42507OooO0oO) {
                        measuredHeight4 = marginLayoutParams.topMargin - i13;
                    } else {
                        if (z5 || spinnerStyle == o0OO0oO.OooO0O0.f42505OooO0o || spinnerStyle == o0OO0oO.OooO0O0.f42506OooO0o0) {
                            iMax = this.f20885Oooooo;
                        } else if (spinnerStyle.f42511OooO0OO && this.f20834OooO0o0 < 0) {
                            iMax = Math.max(OooOOOO(this.f20858OooOooo) ? -this.f20834OooO0o0 : 0, 0);
                        }
                        measuredHeight4 -= iMax;
                    }
                    view3.layout(i12, measuredHeight4, view3.getMeasuredWidth() + i12, view3.getMeasuredHeight() + measuredHeight4);
                }
            }
        }
    }

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
        int iMax;
        int size;
        int i8;
        int iMax2;
        int i9;
        o0OO0oO.OooO00o oooO00o;
        boolean z;
        int i10 = i;
        boolean z2 = isInEditMode() && this.f20865Oooo0OO;
        int childCount = super.getChildCount();
        int i11 = i2;
        int i12 = 0;
        int measuredHeight = 0;
        while (i12 < childCount) {
            View childAt = super.getChildAt(i12);
            if (childAt.getVisibility() == 8 || childAt.getTag(o0OO0o.OooO0OO.srl_component_falsify) == childAt) {
                i3 = i10;
                childCount = childCount;
                i4 = i12;
            } else {
                o0OO0oO0.OooO oooO = this.f20899o00o0O;
                o0OO0oO.OooO00o oooO00o2 = o0OO0oO.OooO00o.f42497OooO0Oo;
                o0OO0oO.OooO00o oooO00o3 = o0OO0oO.OooO00o.f42499OooO0o0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = f20830o00000O;
                o0OO0oO.OooO0O0 oooO0O0 = o0OO0oO.OooO0O0.f42507OooO0oO;
                o0OO0oO.OooO00o[] oooO00oArr = o0OO0oO.OooO00o.f42501OooO0oo;
                OooOOO oooOOO = this.f20908o0ooOO0;
                if (oooO == null || oooO.getView() != childAt) {
                    childCount = childCount;
                    i4 = i12;
                    marginLayoutParams = marginLayoutParams2;
                } else {
                    View view2 = this.f20899o00o0O.getView();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams2;
                    marginLayoutParams = marginLayoutParams2;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams.width);
                    int i13 = this.f20884OooooOo;
                    o0OO0oO.OooO00o oooO00o4 = this.f20886Oooooo0;
                    i4 = i12;
                    if (oooO00o4.f42502OooO00o >= 6) {
                        iMax2 = i13;
                    } else {
                        int i14 = layoutParams.height;
                        if (i14 > 0) {
                            iMax2 = i14 + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                            if (oooO00o4.OooO00o(oooO00o3)) {
                                this.f20884OooooOo = layoutParams.height + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                                this.f20886Oooooo0 = oooO00o3;
                            }
                        } else if (i14 != -2 || (this.f20899o00o0O.getSpinnerStyle() == oooO0O0 && this.f20886Oooooo0.f42503OooO0O0)) {
                            iMax2 = i13;
                        } else {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, 0);
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3 && this.f20886Oooooo0.OooO00o(oooO00o2)) {
                                    this.f20884OooooOo = measuredHeight2 + marginLayoutParams3.bottomMargin + marginLayoutParams3.topMargin;
                                    this.f20886Oooooo0 = oooO00o2;
                                }
                                iMax2 = -1;
                            } else {
                                iMax2 = i13;
                            }
                        }
                    }
                    if (this.f20899o00o0O.getSpinnerStyle() == oooO0O0) {
                        iMax2 = View.MeasureSpec.getSize(i2);
                    } else {
                        if (this.f20899o00o0O.getSpinnerStyle().f42511OooO0OO && !z2) {
                            i9 = 0;
                            iMax2 = Math.max(0, OooOOOO(this.f20857OooOooO) ? this.f20834OooO0o0 : 0);
                        }
                        if (iMax2 != -1) {
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, i9), Pow2.MAX_POW2));
                        }
                        oooO00o = this.f20886Oooooo0;
                        z = oooO00o.f42503OooO0O0;
                        if (!z) {
                            if (!z) {
                                oooO00o = oooO00oArr[oooO00o.f42502OooO00o + 1];
                            }
                            this.f20886Oooooo0 = oooO00o;
                            o0OO0oO0.OooO oooO2 = this.f20899o00o0O;
                            int i15 = this.f20884OooooOo;
                            oooO2.OooO0oo(oooOOO, i15, (int) (this.f20913ooOO * i15));
                        }
                        if (z2 && OooOOOO(this.f20857OooOooO)) {
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i9 = 0;
                    if (iMax2 != -1) {
                        view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, i9), Pow2.MAX_POW2));
                    }
                    oooO00o = this.f20886Oooooo0;
                    z = oooO00o.f42503OooO0O0;
                    if (!z) {
                        if (!z) {
                            oooO00o = oooO00oArr[oooO00o.f42502OooO00o + 1];
                        }
                        this.f20886Oooooo0 = oooO00o;
                        o0OO0oO0.OooO oooO3 = this.f20899o00o0O;
                        int i16 = this.f20884OooooOo;
                        oooO3.OooO0oo(oooOOO, i16, (int) (this.f20913ooOO * i16));
                    }
                    if (z2) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
                if (oooO0o == null || oooO0o.getView() != childAt) {
                    i5 = 1;
                    i6 = 0;
                } else {
                    View view3 = this.f20902o00ooo.getView();
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin, layoutParams2.width);
                    int i17 = this.f20885Oooooo;
                    o0OO0oO.OooO00o oooO00o5 = this.f20887OoooooO;
                    if (oooO00o5.f42502OooO00o >= 6) {
                        iMax = i17;
                    } else {
                        int i18 = layoutParams2.height;
                        if (i18 > 0) {
                            iMax = i18 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                            if (oooO00o5.OooO00o(oooO00o3)) {
                                this.f20885Oooooo = layoutParams2.height + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                                this.f20887OoooooO = oooO00o3;
                            }
                        } else if (i18 != -2 || (this.f20902o00ooo.getSpinnerStyle() == oooO0O0 && this.f20887OoooooO.f42503OooO0O0)) {
                            iMax = i17;
                        } else {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams4.bottomMargin) - marginLayoutParams4.topMargin, 0);
                            view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view3.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4 && this.f20887OoooooO.OooO00o(oooO00o2)) {
                                    this.f20885Oooooo = measuredHeight3 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                                    this.f20887OoooooO = oooO00o2;
                                }
                                iMax = -1;
                            } else {
                                iMax = i17;
                            }
                        }
                    }
                    if (this.f20902o00ooo.getSpinnerStyle() == oooO0O0) {
                        size = View.MeasureSpec.getSize(i2);
                        i8 = -1;
                        i6 = 0;
                    } else {
                        if (!this.f20902o00ooo.getSpinnerStyle().f42511OooO0OO || z2) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            iMax = Math.max(0, OooOOOO(this.f20858OooOooo) ? -this.f20834OooO0o0 : 0);
                        }
                        size = iMax;
                        i8 = -1;
                    }
                    if (size != i8) {
                        view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((size - marginLayoutParams4.bottomMargin) - marginLayoutParams4.topMargin, i6), Pow2.MAX_POW2));
                    }
                    o0OO0oO.OooO00o oooO00o6 = this.f20887OoooooO;
                    boolean z3 = oooO00o6.f42503OooO0O0;
                    if (z3) {
                        i5 = 1;
                    } else {
                        if (z3) {
                            i5 = 1;
                        } else {
                            i5 = 1;
                            oooO00o6 = oooO00oArr[oooO00o6.f42502OooO00o + 1];
                        }
                        this.f20887OoooooO = oooO00o6;
                        o0OO0oO0.OooO0o oooO0o2 = this.f20902o00ooo;
                        int i19 = this.f20885Oooooo;
                        oooO0o2.OooO0oo(oooOOO, i19, (int) (this.f20896o00O0O * i19));
                    }
                    if (z2 && OooOOOO(this.f20858OooOooo)) {
                        measuredHeight = view3.getMeasuredHeight() + measuredHeight;
                    }
                }
                p337o0OO0oOO.OooOOOO oooOOOO = this.f20911oo000o;
                if (oooOOOO == null || (view = oooOOOO.f42513OooO0Oo) != childAt) {
                    i3 = i;
                    i7 = i2;
                } else {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : marginLayoutParams;
                    int i20 = (this.f20899o00o0O != null && OooOOOO(this.f20857OooOooO) && OooOOOo(this.f20899o00o0O, this.f20863Oooo00o)) ? i5 : i6;
                    int i21 = (this.f20902o00ooo != null && OooOOOO(this.f20858OooOooo) && OooOOOo(this.f20902o00ooo, this.f20860Oooo0)) ? i5 : i6;
                    i3 = i;
                    int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin, layoutParams3.width);
                    int paddingBottom = getPaddingBottom() + getPaddingTop() + marginLayoutParams5.topMargin + marginLayoutParams5.bottomMargin + ((!z2 || i20 == 0) ? i6 : this.f20884OooooOo);
                    i7 = i2;
                    view.measure(childMeasureSpec3, ViewGroup.getChildMeasureSpec(i7, paddingBottom + ((!z2 || i21 == 0) ? i6 : this.f20885Oooooo), layoutParams3.height));
                    measuredHeight += view.getMeasuredHeight();
                }
                i11 = i7;
            }
            i12 = i4 + 1;
            i10 = i3;
            childCount = childCount;
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i10), View.resolveSize(measuredHeight, i11));
        this.f20841OooOOO0 = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f20882OooooO0.OooO00o(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f20890o000000 && f2 > 0.0f) || OooOoO(-f2) || this.f20882OooooO0.OooO0O0(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f20879OoooOoo;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.f20879OoooOoo)) {
                int i5 = this.f20879OoooOoo;
                this.f20879OoooOoo = 0;
                i4 = i5;
            } else {
                this.f20879OoooOoo -= i2;
                i4 = i2;
            }
            OooOOo0(this.f20879OoooOoo);
        } else if (i2 > 0 && this.f20890o000000) {
            int i6 = i3 - i2;
            this.f20879OoooOoo = i6;
            OooOOo0(i6);
            i4 = i2;
        }
        this.f20882OooooO0.OooO0OO(i, i2 - i4, iArr, null, 0);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        boolean zOooO0o0 = this.f20882OooooO0.OooO0o0(i, i2, i3, i4, this.f20881Ooooo0o);
        int i5 = i4 + this.f20881Ooooo0o[1];
        if ((i5 < 0 && (this.f20857OooOooO || this.f20866Oooo0o)) || (i5 > 0 && (this.f20858OooOooo || this.f20866Oooo0o))) {
            RefreshState refreshState = this.f20910o0ooOoO;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f20908o0ooOO0.OooO0Oo(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zOooO0o0) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.f20879OoooOoo - i5;
            this.f20879OoooOoo = i6;
            OooOOo0(i6);
        }
        if (!this.f20890o000000 || i2 >= 0) {
            return;
        }
        this.f20890o000000 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f20883OooooOO.OooO00o(i, 0);
        this.f20882OooooO0.OooOO0(i & 2, 0);
        this.f20879OoooOoo = this.f20834OooO0o0;
        this.f20880Ooooo00 = true;
        OooOOO(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) && (this.f20866Oooo0o || this.f20857OooOooO || this.f20858OooOooo);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        this.f20883OooooOO.OooO0O0(0);
        this.f20880Ooooo00 = false;
        this.f20879OoooOoo = 0;
        OooOOoo();
        this.f20882OooooO0.OooOO0O(0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f20873OoooO0O = z;
        this.f20882OooooO0.OooO(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f20909o0ooOOo;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f20905o0OOO0o = System.currentTimeMillis();
            this.f20890o000000 = true;
            OooOOo(refreshState2);
            Oooo000 oooo000 = this.f20878OoooOoO;
            if (oooo000 == null) {
                OooOO0(2000, true, false);
            } else if (z) {
                oooo000.OooO00o(this);
            }
            o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
            if (oooO0o != null) {
                int i = this.f20885Oooooo;
                oooO0o.OooO0o0(this, i, (int) (this.f20896o00O0O * i));
            }
        }
    }

    public void setStateLoading(boolean z) {
        OooO0O0 oooO0O0 = new OooO0O0(z);
        OooOOo(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorOooO00o = this.f20908o0ooOO0.OooO00o(-this.f20885Oooooo);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0O0);
        }
        o0OO0oO0.OooO0o oooO0o = this.f20902o00ooo;
        if (oooO0o != null) {
            int i = this.f20885Oooooo;
            oooO0o.OooO0Oo(this, i, (int) (this.f20896o00O0O * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0O0.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        OooO0OO oooO0OO = new OooO0OO(z);
        OooOOo(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorOooO00o = this.f20908o0ooOO0.OooO00o(this.f20884OooooOo);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0OO);
        }
        o0OO0oO0.OooO oooO = this.f20899o00o0O;
        if (oooO != null) {
            int i = this.f20884OooooOo;
            oooO.OooO0Oo(this, i, (int) (this.f20913ooOO * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0OO.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f20909o0ooOOo;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            OooOOo(RefreshState.None);
        }
        if (this.f20910o0ooOoO != refreshState) {
            this.f20910o0ooOoO = refreshState;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20836OooO0oo = 300;
        this.f20831OooO = 300;
        this.f20842OooOOOO = 0.5f;
        this.f20843OooOOOo = 'n';
        this.f20846OooOOoo = -1;
        this.f20849OooOo00 = -1;
        this.f20848OooOo0 = -1;
        this.f20850OooOo0O = -1;
        this.f20857OooOooO = true;
        this.f20858OooOooo = false;
        this.f20861Oooo000 = true;
        this.f20862Oooo00O = true;
        this.f20863Oooo00o = true;
        this.f20860Oooo0 = true;
        this.f20864Oooo0O0 = false;
        this.f20865Oooo0OO = true;
        this.f20867Oooo0o0 = true;
        this.f20866Oooo0o = false;
        this.f20868Oooo0oO = true;
        this.f20869Oooo0oo = false;
        this.f20859Oooo = true;
        this.f20872OoooO00 = true;
        this.f20871OoooO0 = true;
        this.f20873OoooO0O = true;
        this.f20870OoooO = false;
        this.f20874OoooOO0 = false;
        this.f20895o000oOoO = false;
        this.f20875OoooOOO = false;
        this.f20876OoooOOo = false;
        this.f20881Ooooo0o = new int[2];
        o0OO00O o0oo00o2 = new o0OO00O(this);
        this.f20882OooooO0 = o0oo00o2;
        this.f20883OooooOO = new o000000();
        o0OO0oO.OooO00o oooO00o = o0OO0oO.OooO00o.f42496OooO0OO;
        this.f20886Oooooo0 = oooO00o;
        this.f20887OoooooO = oooO00o;
        this.f20913ooOO = 2.5f;
        this.f20896o00O0O = 2.5f;
        this.f20897o00Oo0 = 1.0f;
        this.f20898o00Ooo = 1.0f;
        this.f20908o0ooOO0 = new OooOOO();
        RefreshState refreshState = RefreshState.None;
        this.f20909o0ooOOo = refreshState;
        this.f20910o0ooOoO = refreshState;
        this.f20905o0OOO0o = 0L;
        this.f20906o0Oo0oo = 0;
        this.f20904o0OO00O = 0;
        this.f20890o000000 = false;
        this.f20891o000000O = false;
        this.f20892o000000o = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f20900o00oO0O = new Handler();
        this.f20852OooOoO = new Scroller(context);
        this.f20854OooOoOO = VelocityTracker.obtain();
        this.f20837OooOO0 = context.getResources().getDisplayMetrics().heightPixels;
        this.f20856OooOoo0 = new OooOOOO(0);
        this.f20832OooO0Oo = viewConfiguration.getScaledTouchSlop();
        this.f20851OooOo0o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f20847OooOo = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20885Oooooo = OooOOOO.OooO0OO(60.0f);
        this.f20884OooooOo = OooOOOO.OooO0OO(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OO0o.OooO0o.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(o0OO0o.OooO0o.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(o0OO0o.OooO0o.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        this.f20842OooOOOO = typedArrayObtainStyledAttributes.getFloat(o0OO0o.OooO0o.SmartRefreshLayout_srlDragRate, 0.5f);
        this.f20913ooOO = typedArrayObtainStyledAttributes.getFloat(o0OO0o.OooO0o.SmartRefreshLayout_srlHeaderMaxDragRate, this.f20913ooOO);
        this.f20896o00O0O = typedArrayObtainStyledAttributes.getFloat(o0OO0o.OooO0o.SmartRefreshLayout_srlFooterMaxDragRate, this.f20896o00O0O);
        this.f20897o00Oo0 = typedArrayObtainStyledAttributes.getFloat(o0OO0o.OooO0o.SmartRefreshLayout_srlHeaderTriggerRate, this.f20897o00Oo0);
        this.f20898o00Ooo = typedArrayObtainStyledAttributes.getFloat(o0OO0o.OooO0o.SmartRefreshLayout_srlFooterTriggerRate, this.f20898o00Ooo);
        this.f20857OooOooO = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableRefresh, this.f20857OooOooO);
        this.f20831OooO = typedArrayObtainStyledAttributes.getInt(o0OO0o.OooO0o.SmartRefreshLayout_srlReboundDuration, this.f20831OooO);
        int i = o0OO0o.OooO0o.SmartRefreshLayout_srlEnableLoadMore;
        this.f20858OooOooo = typedArrayObtainStyledAttributes.getBoolean(i, this.f20858OooOooo);
        int i2 = o0OO0o.OooO0o.SmartRefreshLayout_srlHeaderHeight;
        this.f20884OooooOo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, this.f20884OooooOo);
        int i3 = o0OO0o.OooO0o.SmartRefreshLayout_srlFooterHeight;
        this.f20885Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i3, this.f20885Oooooo);
        this.f20888Ooooooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o0OO0o.OooO0o.SmartRefreshLayout_srlHeaderInsetStart, this.f20888Ooooooo);
        this.f20907o0OoOo0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o0OO0o.OooO0o.SmartRefreshLayout_srlFooterInsetStart, this.f20907o0OoOo0);
        this.f20870OoooO = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlDisableContentWhenRefresh, this.f20870OoooO);
        this.f20874OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlDisableContentWhenLoading, this.f20874OoooOO0);
        int i4 = o0OO0o.OooO0o.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.f20863Oooo00o = typedArrayObtainStyledAttributes.getBoolean(i4, true);
        int i5 = o0OO0o.OooO0o.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.f20860Oooo0 = typedArrayObtainStyledAttributes.getBoolean(i5, true);
        this.f20865Oooo0OO = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnablePreviewInEditMode, true);
        this.f20868Oooo0oO = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableAutoLoadMore, this.f20868Oooo0oO);
        this.f20867Oooo0o0 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableOverScrollBounce, this.f20867Oooo0o0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnablePureScrollMode, false);
        this.f20869Oooo0oo = z;
        this.f20859Oooo = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.f20859Oooo);
        this.f20872OoooO00 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, true);
        this.f20871OoooO0 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.f20864Oooo0O0);
        this.f20864Oooo0O0 = z2;
        this.f20864Oooo0O0 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z2);
        this.f20861Oooo000 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, true);
        this.f20862Oooo00O = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, true);
        this.f20866Oooo0o = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableOverScrollDrag, this.f20866Oooo0o);
        this.f20846OooOOoo = typedArrayObtainStyledAttributes.getResourceId(o0OO0o.OooO0o.SmartRefreshLayout_srlFixedHeaderViewId, -1);
        this.f20849OooOo00 = typedArrayObtainStyledAttributes.getResourceId(o0OO0o.OooO0o.SmartRefreshLayout_srlFixedFooterViewId, -1);
        this.f20848OooOo0 = typedArrayObtainStyledAttributes.getResourceId(o0OO0o.OooO0o.SmartRefreshLayout_srlHeaderTranslationViewId, -1);
        this.f20850OooOo0O = typedArrayObtainStyledAttributes.getResourceId(o0OO0o.OooO0o.SmartRefreshLayout_srlFooterTranslationViewId, -1);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(o0OO0o.OooO0o.SmartRefreshLayout_srlEnableNestedScrolling, this.f20873OoooO0O);
        this.f20873OoooO0O = z3;
        o0oo00o2.OooO(z3);
        this.f20876OoooOOo = this.f20876OoooOOo || typedArrayObtainStyledAttributes.hasValue(i);
        typedArrayObtainStyledAttributes.hasValue(i4);
        typedArrayObtainStyledAttributes.hasValue(i5);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        o0OO0oO.OooO00o oooO00o2 = o0OO0oO.OooO00o.f42498OooO0o;
        this.f20886Oooooo0 = zHasValue ? oooO00o2 : this.f20886Oooooo0;
        this.f20887OoooooO = typedArrayObtainStyledAttributes.hasValue(i3) ? oooO00o2 : this.f20887OoooooO;
        int color = typedArrayObtainStyledAttributes.getColor(o0OO0o.OooO0o.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(o0OO0o.OooO0o.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f20855OooOoo = new int[]{color2, color};
            } else {
                this.f20855OooOoo = new int[]{color2};
            }
        } else if (color != 0) {
            this.f20855OooOoo = new int[]{0, color};
        }
        if (z && !this.f20876OoooOOo && !this.f20858OooOooo) {
            this.f20858OooOooo = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f20914OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0OO0oO.OooO0O0 f20915OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20914OooO00o = 0;
            this.f20915OooO0O0 = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OO0o.OooO0o.SmartRefreshLayout_Layout);
            this.f20914OooO00o = typedArrayObtainStyledAttributes.getColor(o0OO0o.OooO0o.SmartRefreshLayout_Layout_layout_srlBackgroundColor, 0);
            int i = o0OO0o.OooO0o.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.f20915OooO0O0 = o0OO0oO.OooO0O0.f42508OooO0oo[typedArrayObtainStyledAttributes.getInt(i, 0)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i) {
            super(-1, i);
            this.f20914OooO00o = 0;
            this.f20915OooO0O0 = null;
        }
    }
}
