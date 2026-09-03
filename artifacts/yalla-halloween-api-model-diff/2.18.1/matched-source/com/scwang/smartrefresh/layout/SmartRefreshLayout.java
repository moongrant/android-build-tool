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
import androidx.core.widget.NestedScrollView;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.LinkedList;
import java.util.Objects;
import o000O0O0.Oooo0;
import o000O0O0.o000oOoO;
import o000O0O0.o00Oo0;
import o000O0O0.o00Ooo;
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.oO0OOo0o;
import p407o0Oo0OOo.oO0Oo0oo;
import p407o0Oo0OOo.oO0OoOO0;
import p407o0Oo0OOo.oO0o0o;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;
import p411o0Oo0Ooo.oO00O0o;
import p411o0Oo0Ooo.oOo00OO0;
import p417o0Oo0oOo.oO00OO0O;
import p417o0Oo0oOo.oO00OOO;
import p586o0oOoo00.o0OO00O;
import p586o0oOoo00.o0OOO0o;
import p586o0oOoo00.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements oO000Oo, o00Oo0 {

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    public static ViewGroup.MarginLayoutParams f19471o000O0 = new ViewGroup.MarginLayoutParams(-1, -1);

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public static oO0OoOO0 f19472o000O00;

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public static oO0Oo0oo f19473o000O00O;
    public static oO0o0o o000Oo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f19474Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f19475Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f19476Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19477Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f19478OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f19479OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f19480OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f19481OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f19482OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f19483OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f19484OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public char f19485OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f19486OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f19487OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f19488Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f19489Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f19490OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f19491OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f19492OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f19493Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f19494Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Scroller f19495OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public VelocityTracker f19496Ooooooo;

    /* JADX INFO: renamed from: o000, reason: collision with root package name */
    public boolean f19497o000;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public o00Ooo f19498o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f19499o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f19500o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f19501o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public boolean f19502o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f19503o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f19504o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public oO00OOO f19505o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public oO00OO0O f19506o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public int f19507o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public int[] f19508o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public o000oOoO f19509o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public float f19510o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public p409o0Oo0Oo0.o000oOoO f19511o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public int f19512o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public int f19513o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public float f19514o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public float f19515o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public float f19516o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public ooOOOOoo f19517o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public p408o0Oo0Oo.OooO0o f19518o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public oO000OOo f19519o0000Oo0;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public Paint f19520o0000OoO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f19521o0000Ooo;

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public RefreshState f19522o0000o;

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    public Handler f19523o0000o0;

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public OooOo00 f19524o0000o0O;

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public RefreshState f19525o0000o0o;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public int f19526o0000oO;

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public long f19527o0000oO0;

    /* JADX INFO: renamed from: o0000oOO, reason: collision with root package name */
    public int f19528o0000oOO;

    /* JADX INFO: renamed from: o0000oOo, reason: collision with root package name */
    public int f19529o0000oOo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public p409o0Oo0Oo0.o000oOoO f19530o0000oo;

    /* JADX INFO: renamed from: o0000oo0, reason: collision with root package name */
    public boolean f19531o0000oo0;

    /* JADX INFO: renamed from: o0000ooO, reason: collision with root package name */
    public boolean f19532o0000ooO;

    /* JADX INFO: renamed from: o000O000, reason: collision with root package name */
    public boolean f19533o000O000;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public ValueAnimator f19534o000O0O;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public MotionEvent f19535o000O0o;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public int f19536o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f19537o000OOo;

    /* JADX INFO: renamed from: o000OoO, reason: collision with root package name */
    public boolean f19538o000OoO;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public Runnable f19539o000Ooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f19540o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f19541o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f19542o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f19543o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f19544o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f19545o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f19546o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f19547o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f19548o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f19549o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f19550o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f19551o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public oOo00OO0 f19552o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f19553o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f19554o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f19555o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f19556oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f19557oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int[] f19558ooOO;

    public class OooO implements ValueAnimator.AnimatorUpdateListener {
        public OooO() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.f19524o0000o0O.OooO0O0(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19562OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19562OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19562OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19562OooO00o[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19562OooO00o[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19562OooO00o[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19562OooO00o[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19562OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19562OooO00o[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19562OooO00o[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19562OooO00o[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19562OooO00o[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19562OooO00o[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19562OooO00o[RefreshState.RefreshFinish.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19562OooO00o[RefreshState.LoadFinish.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19562OooO00o[RefreshState.TwoLevelReleased.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19562OooO00o[RefreshState.TwoLevelFinish.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19562OooO00o[RefreshState.TwoLevel.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f19563Oooo0o;

        public OooO0O0(boolean z) {
            this.f19563Oooo0o = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SmartRefreshLayout.this.setStateDirectLoading(this.f19563Oooo0o);
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f19565Oooo0o;

        public OooO0OO(boolean z) {
            this.f19565Oooo0o = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SmartRefreshLayout.this.f19527o0000oO0 = System.currentTimeMillis();
            SmartRefreshLayout.this.OooOoO0(RefreshState.Refreshing);
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            oO00OOO oo00ooo = smartRefreshLayout.f19505o00000OO;
            if (oo00ooo == null) {
                smartRefreshLayout.OooOOoo(BannerConfig.LOOP_TIME, true, Boolean.FALSE);
            } else if (this.f19565Oooo0o) {
                oo00ooo.OooO0O0(smartRefreshLayout);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            ooOOOOoo oooooooo = smartRefreshLayout2.f19517o0000OOo;
            if (oooooooo != null) {
                int i = smartRefreshLayout2.f19512o0000O00;
                oooooooo.OooO(smartRefreshLayout2, i, (int) (smartRefreshLayout2.f19510o0000O * i));
            }
            Objects.requireNonNull(SmartRefreshLayout.this);
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
            smartRefreshLayout.f19534o000O0O = null;
            if (smartRefreshLayout.f19476Oooo0oO == 0 && (refreshState = smartRefreshLayout.f19525o0000o0o) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                smartRefreshLayout.OooOoO0(refreshState2);
                return;
            }
            RefreshState refreshState3 = smartRefreshLayout.f19525o0000o0o;
            if (refreshState3 != smartRefreshLayout.f19522o0000o) {
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
            oO00OO0O oo00oo0o = smartRefreshLayout.f19506o00000Oo;
            if (oo00oo0o != null) {
                oo00oo0o.OooO0OO(smartRefreshLayout);
            } else {
                Objects.requireNonNull(smartRefreshLayout);
                SmartRefreshLayout.this.OooOOOo(RecyclerView.MAX_SCROLL_DURATION, true, false);
            }
            Objects.requireNonNull(SmartRefreshLayout.this);
        }
    }

    public class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f19569Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f19570Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f19571Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f19572Oooo0oo;

        public OooOO0O(int i, Boolean bool, boolean z) {
            this.f19571Oooo0oO = i;
            this.f19572Oooo0oo = bool;
            this.f19569Oooo = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f19570Oooo0o;
            if (i == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.f19525o0000o0o;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f19522o0000o == RefreshState.Refreshing) {
                    smartRefreshLayout.f19522o0000o = refreshState2;
                    return;
                }
                ValueAnimator valueAnimator = smartRefreshLayout.f19534o000O0O;
                if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                    smartRefreshLayout.f19534o000O0O = null;
                    valueAnimator.cancel();
                    SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(refreshState2);
                    return;
                } else {
                    if (refreshState != RefreshState.Refreshing || smartRefreshLayout.f19517o0000OOo == null || smartRefreshLayout.f19518o0000Oo == null) {
                        return;
                    }
                    this.f19570Oooo0o = i + 1;
                    smartRefreshLayout.f19523o0000o0.postDelayed(this, this.f19571Oooo0oO);
                    SmartRefreshLayout.this.OooOoO0(RefreshState.RefreshFinish);
                    Boolean bool = this.f19572Oooo0oo;
                    if (bool != null) {
                        SmartRefreshLayout.this.OooOooO(bool == Boolean.TRUE);
                        return;
                    }
                    return;
                }
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            int iOooO0O0 = smartRefreshLayout2.f19517o0000OOo.OooO0O0(smartRefreshLayout2, this.f19569Oooo);
            Objects.requireNonNull(SmartRefreshLayout.this);
            if (iOooO0O0 < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                if (smartRefreshLayout3.f19486OoooOoO || smartRefreshLayout3.f19521o0000Ooo) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                    if (smartRefreshLayout4.f19486OoooOoO) {
                        float f = smartRefreshLayout4.f19483OoooOOO;
                        smartRefreshLayout4.f19482OoooOO0 = f;
                        smartRefreshLayout4.f19474Oooo = 0;
                        smartRefreshLayout4.f19486OoooOoO = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout4.f19540o000oOoO, (f + smartRefreshLayout4.f19476Oooo0oO) - (smartRefreshLayout4.f19475Oooo0o * 2), 0));
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout5.f19540o000oOoO, smartRefreshLayout5.f19483OoooOOO + smartRefreshLayout5.f19476Oooo0oO, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f19521o0000Ooo) {
                        smartRefreshLayout6.f19507o00000o0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout6.f19540o000oOoO, smartRefreshLayout6.f19483OoooOOO, 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        smartRefreshLayout7.f19521o0000Ooo = false;
                        smartRefreshLayout7.f19474Oooo = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout8.f19476Oooo0oO;
                if (i2 <= 0) {
                    if (i2 < 0) {
                        smartRefreshLayout8.OooO0oO(0, iOooO0O0, smartRefreshLayout8.f19552o0OoOo0, smartRefreshLayout8.f19479OoooO0);
                        return;
                    } else {
                        smartRefreshLayout8.f19524o0000o0O.OooO0O0(0, false);
                        SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorOooO0oO = smartRefreshLayout8.OooO0oO(0, iOooO0O0, smartRefreshLayout8.f19552o0OoOo0, smartRefreshLayout8.f19479OoooO0);
                SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerOooO0o0 = smartRefreshLayout9.f19549o0OO00O ? smartRefreshLayout9.f19518o0000Oo.OooO0o0(smartRefreshLayout9.f19476Oooo0oO) : null;
                if (valueAnimatorOooO0oO == null || animatorUpdateListenerOooO0o0 == null) {
                    return;
                }
                valueAnimatorOooO0oO.addUpdateListener(animatorUpdateListenerOooO0o0);
            }
        }
    }

    public class OooOOO implements Runnable {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f19576Oooo0oO;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public float f19579OoooO00;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f19575Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public float f19574Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public long f19577Oooo0oo = AnimationUtils.currentAnimationTimeMillis();

        public OooOOO(float f, int i) {
            this.f19579OoooO00 = f;
            this.f19576Oooo0oO = i;
            SmartRefreshLayout.this.f19523o0000o0.postDelayed(this, 10);
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f19539o000Ooo != this || smartRefreshLayout.f19525o0000o0o.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f19476Oooo0oO) < Math.abs(this.f19576Oooo0oO)) {
                double d = this.f19579OoooO00;
                int i = this.f19575Oooo0o + 1;
                this.f19575Oooo0o = i;
                this.f19579OoooO00 = (float) (Math.pow(0.949999988079071d, i * 2) * d);
            } else if (this.f19576Oooo0oO != 0) {
                double d2 = this.f19579OoooO00;
                int i2 = this.f19575Oooo0o + 1;
                this.f19575Oooo0o = i2;
                this.f19579OoooO00 = (float) (Math.pow(0.44999998807907104d, i2 * 2) * d2);
            } else {
                double d3 = this.f19579OoooO00;
                int i3 = this.f19575Oooo0o + 1;
                this.f19575Oooo0o = i3;
                this.f19579OoooO00 = (float) (Math.pow(0.8500000238418579d, i3 * 2) * d3);
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.f19579OoooO00 * (((jCurrentAnimationTimeMillis - this.f19577Oooo0oo) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.f19577Oooo0oo = jCurrentAnimationTimeMillis;
                float f2 = this.f19574Oooo + f;
                this.f19574Oooo = f2;
                SmartRefreshLayout.this.OooOo(f2);
                SmartRefreshLayout.this.f19523o0000o0.postDelayed(this, 10);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.f19522o0000o;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                smartRefreshLayout2.f19524o0000o0O.OooO0Oo(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                smartRefreshLayout2.f19524o0000o0O.OooO0Oo(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f19539o000Ooo = null;
            if (Math.abs(smartRefreshLayout3.f19476Oooo0oO) >= Math.abs(this.f19576Oooo0oO)) {
                int iMin = Math.min(Math.max((int) (Math.abs(SmartRefreshLayout.this.f19476Oooo0oO - this.f19576Oooo0oO) / oOo00OO0.f39170OooO0O0), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.OooO0oO(this.f19576Oooo0oO, 0, smartRefreshLayout4.f19552o0OoOo0, iMin);
            }
        }
    }

    public class OooOOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f19580Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f19581Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f19582Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f19583Oooo0oo;

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f19585Oooo0o;

            /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0175OooO00o extends AnimatorListenerAdapter {
                public C0175OooO00o() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    OooOOO0 oooOOO0 = OooOOO0.this;
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.f19533o000O000 = false;
                    if (oooOOO0.f19583Oooo0oo) {
                        smartRefreshLayout.OooOooO(true);
                    }
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (smartRefreshLayout2.f19525o0000o0o == RefreshState.LoadFinish) {
                        smartRefreshLayout2.OooOoO0(RefreshState.None);
                    }
                }
            }

            public OooO00o(int i) {
                this.f19585Oooo0o = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ValueAnimator valueAnimatorOooO00o;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerOooO0o0 = (!smartRefreshLayout.f19551o0Oo0oo || this.f19585Oooo0o >= 0) ? null : smartRefreshLayout.f19518o0000Oo.OooO0o0(smartRefreshLayout.f19476Oooo0oO);
                if (animatorUpdateListenerOooO0o0 != null) {
                    ((p408o0Oo0Oo.OooO0o) animatorUpdateListenerOooO0o0).onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                }
                C0175OooO00o c0175OooO00o = new C0175OooO00o();
                OooOOO0 oooOOO0 = OooOOO0.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i = smartRefreshLayout2.f19476Oooo0oO;
                if (i > 0) {
                    valueAnimatorOooO00o = smartRefreshLayout2.f19524o0000o0O.OooO00o(0);
                } else {
                    if (animatorUpdateListenerOooO0o0 != null || i == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.f19534o000O0O;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            SmartRefreshLayout.this.f19534o000O0O = null;
                        }
                        SmartRefreshLayout.this.f19524o0000o0O.OooO0O0(0, false);
                        SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(RefreshState.None);
                    } else if (oooOOO0.f19583Oooo0oo && smartRefreshLayout2.f19546o00oO0o) {
                        int i2 = -smartRefreshLayout2.f19526o0000oO;
                        if (i >= i2) {
                            smartRefreshLayout2.OooOoO0(RefreshState.None);
                        } else {
                            valueAnimatorOooO00o = smartRefreshLayout2.f19524o0000o0O.OooO00o(i2);
                        }
                    } else {
                        valueAnimatorOooO00o = smartRefreshLayout2.f19524o0000o0O.OooO00o(0);
                    }
                    valueAnimatorOooO00o = null;
                }
                if (valueAnimatorOooO00o != null) {
                    valueAnimatorOooO00o.addListener(c0175OooO00o);
                } else {
                    c0175OooO00o.onAnimationEnd(null);
                }
            }
        }

        public OooOOO0(int i, boolean z, boolean z2) {
            this.f19582Oooo0oO = i;
            this.f19583Oooo0oo = z;
            this.f19580Oooo = z2;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x008c  */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            int i = this.f19581Oooo0o;
            if (i == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.f19525o0000o0o;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.f19522o0000o == RefreshState.Loading) {
                    smartRefreshLayout.f19522o0000o = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f19534o000O0O;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        smartRefreshLayout.f19534o000O0O = null;
                        valueAnimator.cancel();
                        SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(refreshState2);
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.f19519o0000Oo0 != null && smartRefreshLayout.f19518o0000Oo != null) {
                        this.f19581Oooo0o = i + 1;
                        smartRefreshLayout.f19523o0000o0.postDelayed(this, this.f19582Oooo0oO);
                        SmartRefreshLayout.this.OooOoO0(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f19583Oooo0oo) {
                    SmartRefreshLayout.this.OooOooO(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            int iOooO0O0 = smartRefreshLayout2.f19519o0000Oo0.OooO0O0(smartRefreshLayout2, this.f19580Oooo);
            Objects.requireNonNull(SmartRefreshLayout.this);
            if (iOooO0O0 < Integer.MAX_VALUE) {
                if (this.f19583Oooo0oo) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    z = smartRefreshLayout3.f19546o00oO0o && smartRefreshLayout3.f19476Oooo0oO < 0 && smartRefreshLayout3.f19518o0000Oo.OooO00o();
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout4.f19476Oooo0oO;
                int iMax = i2 - (z ? Math.max(i2, -smartRefreshLayout4.f19526o0000oO) : 0);
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f19486OoooOoO || smartRefreshLayout5.f19521o0000Ooo) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f19486OoooOoO) {
                        float f = smartRefreshLayout6.f19483OoooOOO;
                        smartRefreshLayout6.f19482OoooOO0 = f;
                        smartRefreshLayout6.f19474Oooo = smartRefreshLayout6.f19476Oooo0oO - iMax;
                        smartRefreshLayout6.f19486OoooOoO = false;
                        float f2 = smartRefreshLayout6.f19556oo000o ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f19540o000oOoO, f + f2 + (smartRefreshLayout6.f19475Oooo0o * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f19540o000oOoO, smartRefreshLayout7.f19483OoooOOO + f2, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f19521o0000Ooo) {
                        smartRefreshLayout8.f19507o00000o0 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f19540o000oOoO, smartRefreshLayout8.f19483OoooOOO, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f19521o0000Ooo = false;
                        smartRefreshLayout9.f19474Oooo = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                smartRefreshLayout10.f19523o0000o0.postDelayed(new OooO00o(iMax), smartRefreshLayout10.f19476Oooo0oO < 0 ? iOooO0O0 : 0L);
            }
        }
    }

    public class OooOOOO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f19589Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f19590Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public long f19591Oooo0oo = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f19588Oooo = AnimationUtils.currentAnimationTimeMillis();

        public OooOOOO(float f) {
            this.f19590Oooo0oO = f;
            this.f19589Oooo0o = SmartRefreshLayout.this.f19476Oooo0oO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f19539o000Ooo != this || smartRefreshLayout.f19525o0000o0o.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.f19588Oooo;
            float fPow = (float) (Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.f19591Oooo0oo) / (1000.0f / 10)) * ((double) this.f19590Oooo0oO));
            this.f19590Oooo0oO = fPow;
            float f = ((j * 1.0f) / 1000.0f) * fPow;
            if (Math.abs(f) <= 1.0f) {
                SmartRefreshLayout.this.f19539o000Ooo = null;
                return;
            }
            this.f19588Oooo = jCurrentAnimationTimeMillis;
            int i = (int) (this.f19589Oooo0o + f);
            this.f19589Oooo0o = i;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f19476Oooo0oO * i > 0) {
                smartRefreshLayout2.f19524o0000o0O.OooO0O0(i, true);
                SmartRefreshLayout.this.f19523o0000o0.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout2.f19539o000Ooo = null;
            smartRefreshLayout2.f19524o0000o0O.OooO0O0(0, true);
            View view = SmartRefreshLayout.this.f19518o0000Oo.f39138Oooo0oo;
            int i2 = (int) (-this.f19590Oooo0oO);
            float f2 = oOo00OO0.f39170OooO0O0;
            if (view instanceof ScrollView) {
                ((ScrollView) view).fling(i2);
            } else if (view instanceof AbsListView) {
                ((AbsListView) view).fling(i2);
            } else if (view instanceof WebView) {
                ((WebView) view).flingScroll(0, i2);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).OooO0oo(i2);
            } else if (view instanceof RecyclerView) {
                ((RecyclerView) view).fling(0, i2);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f19533o000O000 || f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return;
            }
            smartRefreshLayout3.f19533o000O000 = false;
        }
    }

    public class OooOo00 implements oO000Oo0 {
        public OooOo00() {
        }

        public final ValueAnimator OooO00o(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.OooO0oO(i, 0, smartRefreshLayout.f19552o0OoOo0, smartRefreshLayout.f19479OoooO0);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0099  */
        public final oO000Oo0 OooO0O0(int i, boolean z) {
            int i2;
            boolean z2;
            oO000OOo oo000ooo;
            ooOOOOoo oooooooo;
            SmartRefreshLayout smartRefreshLayout;
            oO000OOo oo000ooo2;
            ooOOOOoo oooooooo2;
            ooOOOOoo oooooooo3;
            oO000OOo oo000ooo3;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f19476Oooo0oO == i && (((oooooooo3 = smartRefreshLayout2.f19517o0000OOo) == null || !oooooooo3.OooO0o0()) && ((oo000ooo3 = SmartRefreshLayout.this.f19519o0000Oo0) == null || !oo000ooo3.OooO0o0()))) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i3 = smartRefreshLayout3.f19476Oooo0oO;
            smartRefreshLayout3.f19476Oooo0oO = i;
            if (z) {
                RefreshState refreshState = smartRefreshLayout3.f19522o0000o;
                if (refreshState.isDragging || refreshState.isOpening) {
                    if (i > smartRefreshLayout3.f19512o0000O00 * smartRefreshLayout3.f19514o0000OO) {
                        if (smartRefreshLayout3.f19525o0000o0o != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout3.f19524o0000o0O.OooO0Oo(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i) > smartRefreshLayout3.f19526o0000oO * smartRefreshLayout3.f19516o0000OOO && !smartRefreshLayout3.f19501o000000O) {
                        smartRefreshLayout3.f19524o0000o0O.OooO0Oo(RefreshState.ReleaseToLoad);
                    } else if (i < 0 && !smartRefreshLayout3.f19501o000000O) {
                        smartRefreshLayout3.f19524o0000o0O.OooO0Oo(RefreshState.PullUpToLoad);
                    } else if (i > 0) {
                        smartRefreshLayout3.f19524o0000o0O.OooO0Oo(RefreshState.PullDownToRefresh);
                    }
                }
            }
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            if (smartRefreshLayout4.f19518o0000Oo != null) {
                if (i < 0 || (oooooooo2 = smartRefreshLayout4.f19517o0000OOo) == null) {
                    i2 = 0;
                    z2 = false;
                } else {
                    if (smartRefreshLayout4.OooOo0o(smartRefreshLayout4.f19547o00ooo, oooooooo2)) {
                        i2 = i;
                    } else if (i3 < 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    z2 = true;
                }
                if (i <= 0 && (oo000ooo2 = (smartRefreshLayout = SmartRefreshLayout.this).f19519o0000Oo0) != null) {
                    if (smartRefreshLayout.OooOo0o(smartRefreshLayout.f19556oo000o, oo000ooo2)) {
                        i2 = i;
                    } else if (i3 > 0) {
                        i2 = 0;
                    }
                    z2 = true;
                }
                if (z2) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    smartRefreshLayout5.f19518o0000Oo.OooO0Oo(i2, smartRefreshLayout5.f19490OooooO0, smartRefreshLayout5.f19491OooooOO);
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f19501o000000O && smartRefreshLayout6.f19502o000000o && smartRefreshLayout6.f19546o00oO0o) {
                        oO000OOo oo000ooo4 = smartRefreshLayout6.f19519o0000Oo0;
                        if ((oo000ooo4 instanceof oO000OOo) && oo000ooo4.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                            SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                            if (smartRefreshLayout7.OooOo0O(smartRefreshLayout7.f19542o00Oo0)) {
                                SmartRefreshLayout.this.f19519o0000Oo0.getView().setTranslationY(Math.max(0, i2));
                            }
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    boolean z3 = (smartRefreshLayout8.f19543o00Ooo && (oooooooo = smartRefreshLayout8.f19517o0000OOo) != null && oooooooo.getSpinnerStyle() == o0OoOo0.f39154OooO0o0) || SmartRefreshLayout.this.f19528o0000oOO != 0;
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    boolean z4 = (smartRefreshLayout9.f19544o00o0O && (oo000ooo = smartRefreshLayout9.f19519o0000Oo0) != null && oo000ooo.getSpinnerStyle() == o0OoOo0.f39154OooO0o0) || SmartRefreshLayout.this.f19529o0000oOo != 0;
                    if ((z3 && (i2 >= 0 || i3 > 0)) || (z4 && (i2 <= 0 || i3 < 0))) {
                        smartRefreshLayout3.invalidate();
                    }
                }
            }
            if ((i >= 0 || i3 > 0) && SmartRefreshLayout.this.f19517o0000OOo != null) {
                int iMax = Math.max(i, 0);
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i4 = smartRefreshLayout10.f19512o0000O00;
                int i5 = (int) (i4 * smartRefreshLayout10.f19510o0000O);
                float f = (iMax * 1.0f) / (i4 == 0 ? 1 : i4);
                if (smartRefreshLayout10.OooOo0O(smartRefreshLayout10.f19541o00O0O) || (SmartRefreshLayout.this.f19525o0000o0o == RefreshState.RefreshFinish && !z)) {
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (i3 != smartRefreshLayout11.f19476Oooo0oO) {
                        if (smartRefreshLayout11.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                            SmartRefreshLayout.this.f19517o0000OOo.getView().setTranslationY(SmartRefreshLayout.this.f19476Oooo0oO);
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (smartRefreshLayout12.f19528o0000oOO != 0 && smartRefreshLayout12.f19520o0000OoO != null && !smartRefreshLayout12.OooOo0o(smartRefreshLayout12.f19547o00ooo, smartRefreshLayout12.f19517o0000OOo)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.f19517o0000OOo.getSpinnerStyle().f39159OooO0OO) {
                            View view = SmartRefreshLayout.this.f19517o0000OOo.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f19471o000O0;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f19476Oooo0oO - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                            int i6 = marginLayoutParams.leftMargin;
                            int i7 = marginLayoutParams.topMargin + SmartRefreshLayout.this.f19513o0000O0O;
                            view.layout(i6, i7, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i7);
                        }
                        SmartRefreshLayout.this.f19517o0000OOo.OooO0oO(z, f, iMax, i4, i5);
                    }
                    if (z && SmartRefreshLayout.this.f19517o0000OOo.OooO0o0()) {
                        int i8 = (int) SmartRefreshLayout.this.f19540o000oOoO;
                        int width = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                        smartRefreshLayout13.f19517o0000OOo.OooO0Oo(smartRefreshLayout13.f19540o000oOoO / (width == 0 ? 1 : width), i8, width);
                    }
                }
                int i9 = SmartRefreshLayout.this.f19476Oooo0oO;
            }
            if ((i <= 0 || i3 < 0) && SmartRefreshLayout.this.f19519o0000Oo0 != null) {
                int i10 = -Math.min(i, 0);
                SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout14.f19526o0000oO;
                int i12 = (int) (i11 * smartRefreshLayout14.f19515o0000OO0);
                float f2 = (i10 * 1.0f) / (i11 == 0 ? 1 : i11);
                if (smartRefreshLayout14.OooOo0O(smartRefreshLayout14.f19542o00Oo0) || (SmartRefreshLayout.this.f19525o0000o0o == RefreshState.LoadFinish && !z)) {
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    if (i3 != smartRefreshLayout15.f19476Oooo0oO) {
                        if (smartRefreshLayout15.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                            SmartRefreshLayout.this.f19519o0000Oo0.getView().setTranslationY(SmartRefreshLayout.this.f19476Oooo0oO);
                            SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                            if (smartRefreshLayout16.f19529o0000oOo != 0 && smartRefreshLayout16.f19520o0000OoO != null && !smartRefreshLayout16.OooOo0o(smartRefreshLayout16.f19556oo000o, smartRefreshLayout16.f19519o0000Oo0)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.f19519o0000Oo0.getSpinnerStyle().f39159OooO0OO) {
                            View view2 = SmartRefreshLayout.this.f19519o0000Oo0.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f19471o000O0;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f19476Oooo0oO) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                            int i13 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (smartRefreshLayout3.getMeasuredHeight() + marginLayoutParams2.topMargin) - SmartRefreshLayout.this.f19536o000OO;
                            view2.layout(i13, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i13, measuredHeight);
                        }
                        SmartRefreshLayout.this.f19519o0000Oo0.OooO0oO(z, f2, i10, i11, i12);
                    }
                    if (z && SmartRefreshLayout.this.f19519o0000Oo0.OooO0o0()) {
                        int i14 = (int) SmartRefreshLayout.this.f19540o000oOoO;
                        int width2 = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                        smartRefreshLayout17.f19519o0000Oo0.OooO0Oo(smartRefreshLayout17.f19540o000oOoO / (width2 == 0 ? 1 : width2), i14, width2);
                    }
                }
                int i15 = SmartRefreshLayout.this.f19476Oooo0oO;
            }
            return this;
        }

        public final oO000Oo0 OooO0OO(@NonNull oO0OOo0o oo0ooo0o, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f19520o0000OoO == null && i != 0) {
                smartRefreshLayout.f19520o0000OoO = new Paint();
            }
            if (oo0ooo0o.equals(SmartRefreshLayout.this.f19517o0000OOo)) {
                SmartRefreshLayout.this.f19528o0000oOO = i;
            } else if (oo0ooo0o.equals(SmartRefreshLayout.this.f19519o0000Oo0)) {
                SmartRefreshLayout.this.f19529o0000oOo = i;
            }
            return this;
        }

        public final void OooO0Oo(@NonNull RefreshState refreshState) {
            switch (OooO00o.f19562OooO00o[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.f19525o0000o0o;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f19476Oooo0oO == 0) {
                        smartRefreshLayout.OooOoO0(refreshState3);
                    } else if (smartRefreshLayout.f19476Oooo0oO != 0) {
                        OooO00o(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.f19525o0000o0o.isOpening && smartRefreshLayout2.OooOo0O(smartRefreshLayout2.f19541o00O0O)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.OooOo0O(smartRefreshLayout3.f19542o00Oo0)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.f19525o0000o0o;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.f19501o000000O || !smartRefreshLayout4.f19546o00oO0o || !smartRefreshLayout4.f19502o000000o)) {
                            smartRefreshLayout4.OooOoO0(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.f19525o0000o0o.isOpening && smartRefreshLayout5.OooOo0O(smartRefreshLayout5.f19541o00O0O)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.PullDownCanceled);
                        OooO0Oo(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.OooOo0O(smartRefreshLayout6.f19542o00Oo0)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.f19525o0000o0o.isOpening && (!smartRefreshLayout7.f19501o000000O || !smartRefreshLayout7.f19546o00oO0o || !smartRefreshLayout7.f19502o000000o)) {
                            smartRefreshLayout7.OooOoO0(RefreshState.PullUpCanceled);
                            OooO0Oo(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.f19525o0000o0o.isOpening && smartRefreshLayout8.OooOo0O(smartRefreshLayout8.f19541o00O0O)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.OooOo0O(smartRefreshLayout9.f19542o00Oo0)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.f19525o0000o0o;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.f19501o000000O || !smartRefreshLayout10.f19546o00oO0o || !smartRefreshLayout10.f19502o000000o)) {
                            smartRefreshLayout10.OooOoO0(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.f19525o0000o0o.isOpening && smartRefreshLayout11.OooOo0O(smartRefreshLayout11.f19541o00O0O)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.f19525o0000o0o.isOpening && smartRefreshLayout12.OooOo0O(smartRefreshLayout12.f19541o00O0O)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.f19525o0000o0o.isOpening && smartRefreshLayout13.OooOo0O(smartRefreshLayout13.f19542o00Oo0)) {
                        SmartRefreshLayout.this.OooOoO0(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                case 13:
                    SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                    if (smartRefreshLayout14.f19525o0000o0o == RefreshState.Refreshing) {
                        smartRefreshLayout14.OooOoO0(RefreshState.RefreshFinish);
                    }
                    break;
                case 14:
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    if (smartRefreshLayout15.f19525o0000o0o == RefreshState.Loading) {
                        smartRefreshLayout15.OooOoO0(RefreshState.LoadFinish);
                    }
                    break;
                case 15:
                    SmartRefreshLayout.this.OooOoO0(RefreshState.TwoLevelReleased);
                    break;
                case 16:
                    SmartRefreshLayout.this.OooOoO0(RefreshState.TwoLevelFinish);
                    break;
                case 17:
                    SmartRefreshLayout.this.OooOoO0(RefreshState.TwoLevel);
                    break;
            }
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void setDefaultRefreshFooterCreator(@NonNull oO0o0o oo0o0o) {
        o000Oo0 = oo0o0o;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull oO0OoOO0 oo0oooo0) {
        f19472o000O00 = oo0oooo0;
    }

    public static void setDefaultRefreshInitializer(@NonNull oO0Oo0oo oo0oo0oo) {
        f19473o000O00O = oo0oo0oo;
    }

    public final oO000Oo OooO() {
        RefreshState refreshState = this.f19525o0000o0o;
        if (refreshState == RefreshState.Refreshing) {
            OooOOo();
        } else if (refreshState == RefreshState.Loading) {
            OooOOo0(true);
        } else if (this.f19476Oooo0oO != 0) {
            OooO0oO(0, 0, this.f19552o0OoOo0, this.f19479OoooO0);
        }
        return this;
    }

    public final ValueAnimator OooO0oO(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f19476Oooo0oO == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f19534o000O0O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f19539o000Ooo = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f19476Oooo0oO, i);
        this.f19534o000O0O = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.f19534o000O0O.setInterpolator(interpolator);
        this.f19534o000O0O.addListener(new OooO0o());
        this.f19534o000O0O.addUpdateListener(new OooO());
        this.f19534o000O0O.setStartDelay(i2);
        this.f19534o000O0O.start();
        return this.f19534o000O0O;
    }

    public final boolean OooO0oo() {
        if (this.f19525o0000o0o != RefreshState.None || !OooOo0O(this.f19541o00O0O)) {
            return false;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        setViceState(RefreshState.Refreshing);
        o0oo00o2.run();
        return true;
    }

    public final oO000Oo OooOOOo(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        OooOOO0 oooOOO0 = new OooOOO0(i2, z2, z);
        if (i3 > 0) {
            this.f19523o0000o0.postDelayed(oooOOO0, i3);
        } else {
            oooOOO0.run();
        }
        return this;
    }

    public final oO000Oo OooOOo() {
        return OooOo00(true);
    }

    public final oO000Oo OooOOo0(boolean z) {
        OooOOOo(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f19527o0000oO0))), ShopVehicleListModel.VehicleTagType_Vip300) << 16 : 0, z, false);
        return this;
    }

    public final oO000Oo OooOOoo(int i, boolean z, Boolean bool) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        OooOO0O oooOO0O = new OooOO0O(i2, bool, z);
        if (i3 > 0) {
            this.f19523o0000o0.postDelayed(oooOO0O, i3);
        } else {
            oooOO0O.run();
        }
        return this;
    }

    public final void OooOo(float f) {
        RefreshState refreshState;
        float f2 = (!this.f19521o0000Ooo || this.f19557oo0o0Oo || f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || this.f19518o0000Oo.OooO00o()) ? f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f2 > this.f19481OoooO0O * 5 && getTag() == null) {
            Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
            setTag("你这么死拉，臣妾做不到啊！");
        }
        RefreshState refreshState2 = this.f19525o0000o0o;
        if (refreshState2 == RefreshState.TwoLevel && f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f19524o0000o0O.OooO0O0(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float f3 = this.f19512o0000O00;
            if (f2 < f3) {
                this.f19524o0000o0O.OooO0O0((int) f2, true);
            } else {
                double d = (this.f19510o0000O - 1.0f) * f3;
                int iMax = Math.max((this.f19481OoooO0O * 4) / 3, getHeight());
                int i = this.f19512o0000O00;
                double d2 = iMax - i;
                double dMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (f2 - i) * this.f19484OoooOOo);
                double d3 = -dMax;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                this.f19524o0000o0O.OooO0O0(((int) Math.min((1.0d - Math.pow(100.0d, d3 / d2)) * d, dMax)) + this.f19512o0000O00, true);
            }
        } else if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (refreshState2 == RefreshState.Loading || ((this.f19546o00oO0o && this.f19501o000000O && this.f19502o000000o && OooOo0O(this.f19542o00Oo0)) || (this.f19555o0ooOoO && !this.f19501o000000O && OooOo0O(this.f19542o00Oo0))))) {
            int i2 = this.f19526o0000oO;
            if (f2 > (-i2)) {
                this.f19524o0000o0O.OooO0O0((int) f2, true);
            } else {
                double d4 = (this.f19515o0000OO0 - 1.0f) * i2;
                int iMax2 = Math.max((this.f19481OoooO0O * 4) / 3, getHeight());
                int i3 = this.f19526o0000oO;
                double d5 = iMax2 - i3;
                double d6 = -Math.min(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i3 + f2) * this.f19484OoooOOo);
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                this.f19524o0000o0O.OooO0O0(((int) (-Math.min((1.0d - Math.pow(100.0d, d7 / d5)) * d4, d6))) - this.f19526o0000oO, true);
            }
        } else if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            double d8 = this.f19510o0000O * this.f19512o0000O00;
            double dMax2 = Math.max(this.f19481OoooO0O / 2, getHeight());
            double dMax3 = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f19484OoooOOo * f2);
            double d9 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.f19524o0000o0O.OooO0O0((int) Math.min((1.0d - Math.pow(100.0d, d9 / dMax2)) * d8, dMax3), true);
        } else {
            double d10 = this.f19515o0000OO0 * this.f19526o0000oO;
            double dMax4 = Math.max(this.f19481OoooO0O / 2, getHeight());
            double d11 = -Math.min(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f19484OoooOOo * f2);
            double d12 = -d11;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            this.f19524o0000o0O.OooO0O0((int) (-Math.min((1.0d - Math.pow(100.0d, d12 / dMax4)) * d10, d11)), true);
        }
        if (!this.f19555o0ooOoO || this.f19501o000000O || !OooOo0O(this.f19542o00Oo0) || f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (refreshState = this.f19525o0000o0o) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.f19500o000000) {
            this.f19539o000Ooo = null;
            this.f19524o0000o0O.OooO00o(-this.f19526o0000oO);
        }
        setStateDirectLoading(false);
        this.f19523o0000o0.postDelayed(new OooOO0(), this.f19479OoooO0);
    }

    public final boolean OooOo0(int i) {
        if (i == 0) {
            if (this.f19534o000O0O != null) {
                RefreshState refreshState = this.f19525o0000o0o;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.f19524o0000o0O.OooO0Oo(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.f19524o0000o0O.OooO0Oo(RefreshState.PullUpToLoad);
                }
                this.f19534o000O0O.cancel();
                this.f19534o000O0O = null;
            }
            this.f19539o000Ooo = null;
        }
        return this.f19534o000O0O != null;
    }

    public final oO000Oo OooOo00(boolean z) {
        if (z) {
            OooOOoo(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f19527o0000oO0))), ShopVehicleListModel.VehicleTagType_Vip300) << 16, true, Boolean.FALSE);
            return this;
        }
        OooOOoo(0, false, null);
        return this;
    }

    public final boolean OooOo0O(boolean z) {
        return z && !this.f19550o0OOO0o;
    }

    public final boolean OooOo0o(boolean z, oO0OOo0o oo0ooo0o) {
        return z || this.f19550o0OOO0o || oo0ooo0o == null || oo0ooo0o.getSpinnerStyle() == o0OoOo0.f39154OooO0o0;
    }

    public final void OooOoO() {
        RefreshState refreshState = this.f19525o0000o0o;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        if (refreshState == refreshState2) {
            if (this.f19493Oooooo > -1000 && this.f19476Oooo0oO > getMeasuredHeight() / 2) {
                ValueAnimator valueAnimatorOooO00o = this.f19524o0000o0O.OooO00o(getMeasuredHeight());
                if (valueAnimatorOooO00o != null) {
                    valueAnimatorOooO00o.setDuration(this.f19480OoooO00);
                    return;
                }
                return;
            }
            if (this.f19486OoooOoO) {
                OooOo00 oooOo00 = this.f19524o0000o0O;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f19525o0000o0o == refreshState2) {
                    smartRefreshLayout.f19524o0000o0O.OooO0Oo(RefreshState.TwoLevelFinish);
                    if (SmartRefreshLayout.this.f19476Oooo0oO != 0) {
                        oooOo00.OooO00o(0).setDuration(SmartRefreshLayout.this.f19480OoooO00);
                        return;
                    } else {
                        oooOo00.OooO0O0(0, false);
                        SmartRefreshLayout.this.OooOoO0(RefreshState.None);
                        return;
                    }
                }
                return;
            }
            return;
        }
        RefreshState refreshState3 = RefreshState.Loading;
        if (refreshState == refreshState3 || (this.f19546o00oO0o && this.f19501o000000O && this.f19502o000000o && this.f19476Oooo0oO < 0 && OooOo0O(this.f19542o00Oo0))) {
            int i = this.f19476Oooo0oO;
            int i2 = -this.f19526o0000oO;
            if (i < i2) {
                this.f19524o0000o0O.OooO00o(i2);
                return;
            } else {
                if (i > 0) {
                    this.f19524o0000o0O.OooO00o(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState4 = this.f19525o0000o0o;
        RefreshState refreshState5 = RefreshState.Refreshing;
        if (refreshState4 == refreshState5) {
            int i3 = this.f19476Oooo0oO;
            int i4 = this.f19512o0000O00;
            if (i3 > i4) {
                this.f19524o0000o0O.OooO00o(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.f19524o0000o0O.OooO00o(0);
                    return;
                }
                return;
            }
        }
        if (refreshState4 == RefreshState.PullDownToRefresh) {
            this.f19524o0000o0O.OooO0Oo(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState4 == RefreshState.PullUpToLoad) {
            this.f19524o0000o0O.OooO0Oo(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToRefresh) {
            this.f19524o0000o0O.OooO0Oo(refreshState5);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToLoad) {
            this.f19524o0000o0O.OooO0Oo(refreshState3);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToTwoLevel) {
            this.f19524o0000o0O.OooO0Oo(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState4 == RefreshState.RefreshReleased) {
            if (this.f19534o000O0O == null) {
                this.f19524o0000o0O.OooO00o(this.f19512o0000O00);
            }
        } else if (refreshState4 == RefreshState.LoadReleased) {
            if (this.f19534o000O0O == null) {
                this.f19524o0000o0O.OooO00o(-this.f19526o0000oO);
            }
        } else if (this.f19476Oooo0oO != 0) {
            this.f19524o0000o0O.OooO00o(0);
        }
    }

    public final void OooOoO0(RefreshState refreshState) {
        RefreshState refreshState2 = this.f19525o0000o0o;
        if (refreshState2 == refreshState) {
            if (this.f19522o0000o != refreshState2) {
                this.f19522o0000o = refreshState2;
                return;
            }
            return;
        }
        this.f19525o0000o0o = refreshState;
        this.f19522o0000o = refreshState;
        ooOOOOoo oooooooo = this.f19517o0000OOo;
        oO000OOo oo000ooo = this.f19519o0000Oo0;
        if (oooooooo != null) {
            oooooooo.OooO0oo(this, refreshState2, refreshState);
        }
        if (oo000ooo != null) {
            oo000ooo.OooO0oo(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f19533o000O000 = false;
        }
    }

    public final oO000Oo OooOoOO(boolean z) {
        this.f19499o00000 = true;
        this.f19542o00Oo0 = z;
        return this;
    }

    public final oO000Oo OooOoo(float f) {
        this.f19510o0000O = f;
        ooOOOOoo oooooooo = this.f19517o0000OOo;
        if (oooooooo == null || !this.f19497o000) {
            this.f19530o0000oo = this.f19530o0000oo.OooO0O0();
        } else {
            OooOo00 oooOo00 = this.f19524o0000o0O;
            int i = this.f19512o0000O00;
            oooooooo.OooO0o(oooOo00, i, (int) (f * i));
        }
        return this;
    }

    public final oO000Oo OooOoo0(float f) {
        this.f19515o0000OO0 = f;
        oO000OOo oo000ooo = this.f19519o0000Oo0;
        if (oo000ooo == null || !this.f19497o000) {
            this.f19511o0000O0 = this.f19511o0000O0.OooO0O0();
        } else {
            OooOo00 oooOo00 = this.f19524o0000o0O;
            int i = this.f19526o0000oO;
            oo000ooo.OooO0o(oooOo00, i, (int) (i * f));
        }
        return this;
    }

    public final oO000Oo OooOooO(boolean z) {
        if (this.f19525o0000o0o == RefreshState.Loading && z) {
            OooOOOo(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f19527o0000oO0))), ShopVehicleListModel.VehicleTagType_Vip300) << 16, true, true);
            return this;
        }
        if (this.f19501o000000O != z) {
            this.f19501o000000O = z;
            oO000OOo oo000ooo = this.f19519o0000Oo0;
            if (oo000ooo instanceof oO000OOo) {
                if (oo000ooo.OooO0OO(z)) {
                    this.f19502o000000o = true;
                    if (this.f19501o000000O && this.f19546o00oO0o && this.f19476Oooo0oO > 0 && this.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo && OooOo0O(this.f19542o00Oo0) && OooOo0o(this.f19541o00O0O, this.f19517o0000OOo)) {
                        this.f19519o0000Oo0.getView().setTranslationY(this.f19476Oooo0oO);
                    }
                } else {
                    this.f19502o000000o = false;
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Footer:");
                    sbOooO0o0.append(this.f19519o0000Oo0);
                    sbOooO0o0.append(" NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])");
                    new RuntimeException(sbOooO0o0.toString()).printStackTrace();
                }
            }
        }
        return this;
    }

    public final oO000Oo OooOooo(@NonNull oO000OOo oo000ooo) {
        oO000OOo oo000ooo2;
        oO000OOo oo000ooo3 = this.f19519o0000Oo0;
        if (oo000ooo3 != null) {
            super.removeView(oo000ooo3.getView());
        }
        this.f19519o0000Oo0 = oo000ooo;
        this.f19533o000O000 = false;
        this.f19529o0000oOo = 0;
        this.f19502o000000o = false;
        this.f19532o0000ooO = false;
        this.f19511o0000O0 = this.f19511o0000O0.OooO0O0();
        this.f19542o00Oo0 = !this.f19499o00000 || this.f19542o00Oo0;
        if (this.f19519o0000Oo0.getSpinnerStyle().f39158OooO0O0) {
            super.addView(this.f19519o0000Oo0.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f19519o0000Oo0.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f19558ooOO;
        if (iArr != null && (oo000ooo2 = this.f19519o0000Oo0) != null) {
            oo000ooo2.setPrimaryColors(iArr);
        }
        return this;
    }

    public final oO000Oo Oooo000(@NonNull ooOOOOoo oooooooo) {
        ooOOOOoo oooooooo2;
        ooOOOOoo oooooooo3 = this.f19517o0000OOo;
        if (oooooooo3 != null) {
            super.removeView(oooooooo3.getView());
        }
        this.f19517o0000OOo = oooooooo;
        this.f19528o0000oOO = 0;
        this.f19531o0000oo0 = false;
        this.f19530o0000oo = this.f19530o0000oo.OooO0O0();
        if (this.f19517o0000OOo.getSpinnerStyle().f39158OooO0O0) {
            super.addView(this.f19517o0000OOo.getView(), getChildCount(), new LayoutParams(-2));
        } else {
            super.addView(this.f19517o0000OOo.getView(), 0, new LayoutParams(-2));
        }
        int[] iArr = this.f19558ooOO;
        if (iArr != null && (oooooooo2 = this.f19517o0000OOo) != null) {
            oooooooo2.setPrimaryColors(iArr);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    public final boolean Oooo00O(float f) {
        RefreshState refreshState;
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f = this.f19493Oooooo;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f19518o0000Oo != null) {
            getScaleY();
            View view = this.f19518o0000Oo.f39136Oooo0o;
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        int i = 0;
        if (Math.abs(f) > this.f19492OooooOo) {
            int i2 = this.f19476Oooo0oO;
            if (i2 * f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                RefreshState refreshState2 = this.f19525o0000o0o;
                RefreshState refreshState3 = RefreshState.Refreshing;
                if (refreshState2 == refreshState3 || refreshState2 == RefreshState.Loading || (i2 < 0 && this.f19501o000000O)) {
                    OooOOOO oooOOOO = new OooOOOO(f);
                    RefreshState refreshState4 = this.f19525o0000o0o;
                    if (refreshState4.isFinishing) {
                        oooOOOO = null;
                    } else {
                        if (this.f19476Oooo0oO != 0 && ((!refreshState4.isOpening && (!this.f19501o000000O || !this.f19546o00oO0o || !this.f19502o000000o || !OooOo0O(this.f19542o00Oo0))) || (((this.f19525o0000o0o == RefreshState.Loading || (this.f19501o000000O && this.f19546o00oO0o && this.f19502o000000o && OooOo0O(this.f19542o00Oo0))) && this.f19476Oooo0oO < (-this.f19526o0000oO)) || (this.f19525o0000o0o == refreshState3 && this.f19476Oooo0oO > this.f19512o0000O00)))) {
                            int i3 = this.f19476Oooo0oO;
                            float fPow = oooOOOO.f19590Oooo0oO;
                            int i4 = i3;
                            while (true) {
                                if (i3 * i4 > 0) {
                                    i++;
                                    fPow = (float) (Math.pow(0.98f, (i * 10) / 10.0f) * ((double) fPow));
                                    float f2 = ((10 * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f2) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                                        RefreshState refreshState5 = smartRefreshLayout.f19525o0000o0o;
                                        if (!refreshState5.isOpening || ((refreshState5 == (refreshState = RefreshState.Refreshing) && i4 > smartRefreshLayout.f19512o0000O00) || (refreshState5 != refreshState && i4 < (-smartRefreshLayout.f19526o0000oO)))) {
                                            oooOOOO = null;
                                        }
                                    } else {
                                        i4 = (int) (i4 + f2);
                                    }
                                }
                            }
                        }
                        oooOOOO.f19591Oooo0oo = AnimationUtils.currentAnimationTimeMillis();
                        SmartRefreshLayout.this.f19523o0000o0.postDelayed(oooOOOO, 10);
                    }
                    this.f19539o000Ooo = oooOOOO;
                    return true;
                }
                if (refreshState2.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((this.f19553o0ooOO0 && (this.f19542o00Oo0 || this.f19554o0ooOOo)) || ((this.f19525o0000o0o == RefreshState.Loading && i2 >= 0) || (this.f19555o0ooOoO && OooOo0O(this.f19542o00Oo0))))) || (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((this.f19553o0ooOO0 && this.f19541o00O0O) || this.f19554o0ooOOo || (this.f19525o0000o0o == RefreshState.Refreshing && this.f19476Oooo0oO <= 0)))) {
                this.f19538o000OoO = false;
                this.f19495OoooooO.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f19495OoooooO.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        RefreshState refreshState;
        this.f19495OoooooO.getCurrY();
        if (this.f19495OoooooO.computeScrollOffset()) {
            int finalY = this.f19495OoooooO.getFinalY();
            if ((finalY >= 0 || !((this.f19541o00O0O || this.f19554o0ooOOo) && this.f19518o0000Oo.OooO0O0())) && (finalY <= 0 || !((this.f19542o00Oo0 || this.f19554o0ooOOo) && this.f19518o0000Oo.OooO00o()))) {
                this.f19538o000OoO = true;
                invalidate();
                return;
            }
            if (this.f19538o000OoO) {
                float currVelocity = finalY > 0 ? -this.f19495OoooooO.getCurrVelocity() : this.f19495OoooooO.getCurrVelocity();
                if (this.f19534o000O0O == null) {
                    if (currVelocity > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && ((refreshState = this.f19525o0000o0o) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                        this.f19539o000Ooo = new OooOOO(currVelocity, this.f19512o0000O00);
                    } else if (currVelocity < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (this.f19525o0000o0o == RefreshState.Loading || ((this.f19546o00oO0o && this.f19501o000000O && this.f19502o000000o && OooOo0O(this.f19542o00Oo0)) || (this.f19555o0ooOoO && !this.f19501o000000O && OooOo0O(this.f19542o00Oo0) && this.f19525o0000o0o != RefreshState.Refreshing)))) {
                        this.f19539o000Ooo = new OooOOO(currVelocity, -this.f19526o0000oO);
                    } else if (this.f19476Oooo0oO == 0 && this.f19553o0ooOO0) {
                        this.f19539o000Ooo = new OooOOO(currVelocity, 0);
                    }
                }
            }
            this.f19495OoooooO.forceFinished(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01da  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:173:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x023a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0249  */
    /* JADX WARN: Code duplicated, block: B:189:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0269  */
    /* JADX WARN: Code duplicated, block: B:197:0x0287  */
    /* JADX WARN: Code duplicated, block: B:200:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0290  */
    /* JADX WARN: Code duplicated, block: B:206:0x029a  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:227:0x030b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0313  */
    /* JADX WARN: Code duplicated, block: B:239:0x034e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0374  */
    /* JADX WARN: Code duplicated, block: B:244:0x0380  */
    /* JADX WARN: Code duplicated, block: B:245:0x0385  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
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
        p408o0Oo0Oo.OooO0o oooO0o;
        PointF pointF;
        View view;
        View view2;
        MotionEvent motionEvent2;
        float f;
        float f2;
        int i;
        RefreshState refreshState3;
        long eventTime;
        MotionEvent motionEventObtain;
        RefreshState refreshState4;
        char c;
        int i2;
        RefreshState refreshState5;
        ViewParent parent;
        RefreshState refreshState6;
        oO000OOo oo000ooo;
        ooOOOOoo oooooooo;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 0;
        boolean z = actionMasked == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float y = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                x += motionEvent.getX(i4);
                y += motionEvent.getY(i4);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = pointerCount;
        float f4 = x / f3;
        float f5 = y / f3;
        if ((actionMasked == 6 || actionMasked == 5) && this.f19486OoooOoO) {
            this.f19482OoooOO0 = (f5 - this.f19483OoooOOO) + this.f19482OoooOO0;
        }
        this.f19540o000oOoO = f4;
        this.f19483OoooOOO = f5;
        if (this.f19521o0000Ooo) {
            int i5 = this.f19507o00000o0;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i5 == this.f19507o00000o0) {
                int i6 = (int) this.f19540o000oOoO;
                int width = getWidth();
                float f6 = this.f19540o000oOoO / (width != 0 ? width : 1);
                if (OooOo0O(this.f19541o00O0O) && this.f19476Oooo0oO > 0 && (oooooooo = this.f19517o0000OOo) != null && oooooooo.OooO0o0()) {
                    this.f19517o0000OOo.OooO0Oo(f6, i6, width);
                } else if (OooOo0O(this.f19542o00Oo0) && this.f19476Oooo0oO < 0 && (oo000ooo = this.f19519o0000Oo0) != null && oo000ooo.OooO0o0()) {
                    this.f19519o0000Oo0.OooO0Oo(f6, i6, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.f19541o00O0O || this.f19542o00Oo0 || this.f19554o0ooOOo)) {
            if (!this.f19531o0000oo0) {
                if (this.f19532o0000ooO) {
                    refreshState6 = this.f19525o0000o0o;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOo0(actionMasked)) {
                    refreshState = this.f19525o0000o0o;
                    if (!refreshState.isFinishing) {
                        if (actionMasked != 0) {
                            this.f19493Oooooo = 0;
                            this.f19496Ooooooo.addMovement(motionEvent);
                            this.f19495OoooooO.forceFinished(true);
                            this.f19478OoooO = f4;
                            this.f19482OoooOO0 = f5;
                            this.f19477Oooo0oo = 0;
                            this.f19474Oooo = this.f19476Oooo0oO;
                            this.f19486OoooOoO = false;
                            this.f19487OoooOoo = super.dispatchTouchEvent(motionEvent);
                            if (this.f19525o0000o0o != RefreshState.TwoLevel) {
                            }
                            oooO0o = this.f19518o0000Oo;
                            if (oooO0o != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooO0o.f39136Oooo0o.getLeft(), -oooO0o.f39136Oooo0o.getTop());
                                view = oooO0o.f39138Oooo0oo;
                                view2 = oooO0o.f39136Oooo0o;
                                if (view != view2) {
                                    oooO0o.f39138Oooo0oo = oooO0o.OooO0OO(view2, pointF, view);
                                }
                                if (oooO0o.f39138Oooo0oo == oooO0o.f39136Oooo0o) {
                                    oooO0o.f39143OoooOO0.f39132OooO00o = null;
                                } else {
                                    oooO0o.f39143OoooOO0.f39132OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f4 - this.f19478OoooO;
                                f2 = f5 - this.f19482OoooOO0;
                                this.f19496Ooooooo.addMovement(motionEvent);
                                if (!this.f19486OoooOoO) {
                                    if (c != 'v') {
                                        this.f19485OoooOo0 = 'v';
                                        if (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                this.f19486OoooOoO = true;
                                                this.f19482OoooOO0 = this.f19475Oooo0o + f5;
                                            }
                                        } else if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            this.f19486OoooOoO = true;
                                            this.f19482OoooOO0 = this.f19475Oooo0o + f5;
                                        }
                                        if (this.f19486OoooOoO) {
                                            f2 = f5 - this.f19482OoooOO0;
                                            if (this.f19487OoooOoo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            OooOo00 oooOo00 = this.f19524o0000o0O;
                                            i2 = this.f19476Oooo0oO;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            oooOo00.OooO0Oo(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else {
                                        this.f19485OoooOo0 = 'v';
                                        if (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                this.f19486OoooOoO = true;
                                                this.f19482OoooOO0 = this.f19475Oooo0o + f5;
                                            }
                                        } else if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            this.f19486OoooOoO = true;
                                            this.f19482OoooOO0 = this.f19475Oooo0o + f5;
                                        }
                                        if (this.f19486OoooOoO) {
                                            f2 = f5 - this.f19482OoooOO0;
                                            if (this.f19487OoooOoo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            OooOo00 oooOo01 = this.f19524o0000o0O;
                                            i2 = this.f19476Oooo0oO;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            oooOo01.OooO0Oo(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f19486OoooOoO) {
                                    i = ((int) f2) + this.f19474Oooo;
                                    refreshState3 = this.f19522o0000o;
                                    if (refreshState3.isHeader) {
                                        this.f19477Oooo0oo = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f19535o000O0o == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.f19478OoooO + f, this.f19482OoooOO0, 0);
                                            this.f19535o000O0o = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f19478OoooO + f, this.f19482OoooOO0 + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f19533o000O000) {
                                            this.f19533o000O000 = false;
                                        }
                                        if (i <= 0) {
                                            if (i < 0) {
                                                i3 = i;
                                            } else {
                                                i3 = i;
                                            }
                                        } else if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                        refreshState4 = this.f19522o0000o;
                                        if (!refreshState4.isHeader) {
                                            if (this.f19535o000O0o != null) {
                                                this.f19535o000O0o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        } else {
                                            if (this.f19535o000O0o != null) {
                                                this.f19535o000O0o = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        }
                                        if (this.f19476Oooo0oO != 0) {
                                            OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        }
                                        return true;
                                    }
                                    this.f19477Oooo0oo = i;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.f19535o000O0o == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.f19478OoooO + f, this.f19482OoooOO0, 0);
                                        this.f19535o000O0o = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f19478OoooO + f, this.f19482OoooOO0 + i, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.f19533o000O000) {
                                        this.f19533o000O000 = false;
                                    }
                                    if (i <= 0) {
                                        if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                    } else if (i < 0) {
                                        i3 = i;
                                    } else {
                                        i3 = i;
                                    }
                                    refreshState4 = this.f19522o0000o;
                                    if (!refreshState4.isHeader) {
                                        if (this.f19535o000O0o != null) {
                                            this.f19535o000O0o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    } else {
                                        if (this.f19535o000O0o != null) {
                                            this.f19535o000O0o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    if (this.f19476Oooo0oO != 0) {
                                        OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                    }
                                    return true;
                                    OooOo(i);
                                    return true;
                                }
                                if (this.f19533o000O000) {
                                    this.f19533o000O000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.f19496Ooooooo.addMovement(motionEvent);
                        this.f19496Ooooooo.computeCurrentVelocity(1000, this.f19494Oooooo0);
                        this.f19493Oooooo = (int) this.f19496Ooooooo.getYVelocity();
                        Oooo00O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        this.f19496Ooooooo.clear();
                        this.f19485OoooOo0 = 'n';
                        motionEvent2 = this.f19535o000O0o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f19535o000O0o = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.f19478OoooO, f5, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        OooOoO();
                        if (this.f19486OoooOoO) {
                            this.f19486OoooOoO = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.f19525o0000o0o;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.f19532o0000ooO) {
                    refreshState6 = this.f19525o0000o0o;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!OooOo0(actionMasked)) {
                    refreshState = this.f19525o0000o0o;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.f19500o000000) && (refreshState != RefreshState.Refreshing || !this.f19537o000OOo))) {
                        if (actionMasked != 0) {
                            this.f19493Oooooo = 0;
                            this.f19496Ooooooo.addMovement(motionEvent);
                            this.f19495OoooooO.forceFinished(true);
                            this.f19478OoooO = f4;
                            this.f19482OoooOO0 = f5;
                            this.f19477Oooo0oo = 0;
                            this.f19474Oooo = this.f19476Oooo0oO;
                            this.f19486OoooOoO = false;
                            this.f19487OoooOoo = super.dispatchTouchEvent(motionEvent);
                            if (this.f19525o0000o0o != RefreshState.TwoLevel && this.f19482OoooOO0 < (getMeasuredHeight() * 5) / 6) {
                                this.f19485OoooOo0 = 'h';
                                return this.f19487OoooOoo;
                            }
                            oooO0o = this.f19518o0000Oo;
                            if (oooO0o != null) {
                                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                                pointF.offset(-oooO0o.f39136Oooo0o.getLeft(), -oooO0o.f39136Oooo0o.getTop());
                                view = oooO0o.f39138Oooo0oo;
                                view2 = oooO0o.f39136Oooo0o;
                                if (view != view2) {
                                    oooO0o.f39138Oooo0oo = oooO0o.OooO0OO(view2, pointF, view);
                                }
                                if (oooO0o.f39138Oooo0oo == oooO0o.f39136Oooo0o) {
                                    oooO0o.f39143OoooOO0.f39132OooO00o = null;
                                } else {
                                    oooO0o.f39143OoooOO0.f39132OooO00o = pointF;
                                }
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f = f4 - this.f19478OoooO;
                                f2 = f5 - this.f19482OoooOO0;
                                this.f19496Ooooooo.addMovement(motionEvent);
                                if (!this.f19486OoooOoO && (c = this.f19485OoooOo0) != 'h' && this.f19518o0000Oo != null) {
                                    if (c != 'v' || (Math.abs(f2) >= this.f19475Oooo0o && Math.abs(f) < Math.abs(f2))) {
                                        this.f19485OoooOo0 = 'v';
                                        if (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (this.f19476Oooo0oO < 0 || ((this.f19554o0ooOOo || this.f19541o00O0O) && this.f19518o0000Oo.OooO0O0()))) {
                                            this.f19486OoooOoO = true;
                                            this.f19482OoooOO0 = f5 - this.f19475Oooo0o;
                                        } else if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (this.f19476Oooo0oO > 0 || ((this.f19554o0ooOOo || this.f19542o00Oo0) && ((this.f19525o0000o0o == refreshState2 && this.f19533o000O000) || this.f19518o0000Oo.OooO00o())))) {
                                            this.f19486OoooOoO = true;
                                            this.f19482OoooOO0 = this.f19475Oooo0o + f5;
                                        }
                                        if (this.f19486OoooOoO) {
                                            f2 = f5 - this.f19482OoooOO0;
                                            if (this.f19487OoooOoo) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            OooOo00 oooOo02 = this.f19524o0000o0O;
                                            i2 = this.f19476Oooo0oO;
                                            if (i2 <= 0 || (i2 == 0 && f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullUpToLoad;
                                            }
                                            oooOo02.OooO0Oo(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else if (Math.abs(f) >= this.f19475Oooo0o && Math.abs(f) > Math.abs(f2) && this.f19485OoooOo0 != 'v') {
                                        this.f19485OoooOo0 = 'h';
                                    }
                                }
                                if (this.f19486OoooOoO) {
                                    i = ((int) f2) + this.f19474Oooo;
                                    refreshState3 = this.f19522o0000o;
                                    if ((refreshState3.isHeader && (i < 0 || this.f19477Oooo0oo < 0)) || (refreshState3.isFooter && (i > 0 || this.f19477Oooo0oo > 0))) {
                                        this.f19477Oooo0oo = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.f19535o000O0o == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.f19478OoooO + f, this.f19482OoooOO0, 0);
                                            this.f19535o000O0o = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.f19478OoooO + f, this.f19482OoooOO0 + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.f19533o000O000 && f2 > this.f19475Oooo0o && this.f19476Oooo0oO < 0) {
                                            this.f19533o000O000 = false;
                                        }
                                        if (i <= 0 && ((this.f19554o0ooOOo || this.f19541o00O0O) && this.f19518o0000Oo.OooO0O0())) {
                                            this.f19483OoooOOO = f5;
                                            this.f19482OoooOO0 = f5;
                                            this.f19474Oooo = 0;
                                            this.f19524o0000o0O.OooO0Oo(RefreshState.PullDownToRefresh);
                                        } else if (i < 0 || !((this.f19554o0ooOOo || this.f19542o00Oo0) && this.f19518o0000Oo.OooO00o())) {
                                            i3 = i;
                                        } else {
                                            this.f19483OoooOOO = f5;
                                            this.f19482OoooOO0 = f5;
                                            this.f19474Oooo = 0;
                                            this.f19524o0000o0O.OooO0Oo(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.f19522o0000o;
                                        if ((!refreshState4.isHeader && i3 < 0) || (refreshState4.isFooter && i3 > 0)) {
                                            if (this.f19476Oooo0oO != 0) {
                                                OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            }
                                            return true;
                                        }
                                        if (this.f19535o000O0o != null) {
                                            this.f19535o000O0o = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    OooOo(i);
                                    return true;
                                }
                                if (this.f19533o000O000 && f2 > this.f19475Oooo0o && this.f19476Oooo0oO < 0) {
                                    this.f19533o000O000 = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.f19496Ooooooo.addMovement(motionEvent);
                        this.f19496Ooooooo.computeCurrentVelocity(1000, this.f19494Oooooo0);
                        this.f19493Oooooo = (int) this.f19496Ooooooo.getYVelocity();
                        Oooo00O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        this.f19496Ooooooo.clear();
                        this.f19485OoooOo0 = 'n';
                        motionEvent2 = this.f19535o000O0o;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f19535o000O0o = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.f19478OoooO, f5, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        OooOoO();
                        if (this.f19486OoooOoO) {
                            this.f19486OoooOoO = false;
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
        p408o0Oo0Oo.OooO0o oooO0o = this.f19518o0000Oo;
        View view2 = oooO0o != null ? oooO0o.f39136Oooo0o : null;
        ooOOOOoo oooooooo = this.f19517o0000OOo;
        if (oooooooo != null && oooooooo.getView() == view) {
            if (!OooOo0O(this.f19541o00O0O) || (!this.f19545o00oO0O && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f19476Oooo0oO, view.getTop());
                int i = this.f19528o0000oOO;
                if (i != 0 && (paint2 = this.f19520o0000OoO) != null) {
                    paint2.setColor(i);
                    if (this.f19517o0000OOo.getSpinnerStyle().f39159OooO0OO) {
                        iMax = view.getBottom();
                    } else if (this.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                        iMax = view.getBottom() + this.f19476Oooo0oO;
                    }
                    canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, view.getTop(), getWidth(), iMax, this.f19520o0000OoO);
                }
                if (this.f19543o00Ooo && this.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39154OooO0o0) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        oO000OOo oo000ooo = this.f19519o0000Oo0;
        if (oo000ooo != null && oo000ooo.getView() == view) {
            if (!OooOo0O(this.f19542o00Oo0) || (!this.f19545o00oO0O && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f19476Oooo0oO, view.getBottom());
                int i2 = this.f19529o0000oOo;
                if (i2 != 0 && (paint = this.f19520o0000OoO) != null) {
                    paint.setColor(i2);
                    if (this.f19519o0000Oo0.getSpinnerStyle().f39159OooO0OO) {
                        iMin = view.getTop();
                    } else if (this.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                        iMin = view.getTop() + this.f19476Oooo0oO;
                    }
                    canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, iMin, getWidth(), view.getBottom(), this.f19520o0000OoO);
                }
                if (this.f19544o00o0O && this.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39154OooO0o0) {
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

    @Override // p407o0Oo0OOo.oO000Oo
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00Ooo o00ooo2 = this.f19498o0000;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
    }

    @Nullable
    public oO000OOo getRefreshFooter() {
        oO000OOo oo000ooo = this.f19519o0000Oo0;
        if (oo000ooo instanceof oO000OOo) {
            return oo000ooo;
        }
        return null;
    }

    @Nullable
    public ooOOOOoo getRefreshHeader() {
        ooOOOOoo oooooooo = this.f19517o0000OOo;
        if (oooooooo instanceof ooOOOOoo) {
            return oooooooo;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.f19525o0000o0o;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f19548o0O0O00 && (this.f19554o0ooOOo || this.f19541o00O0O || this.f19542o00Oo0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        oO000OOo oo000ooo;
        super.onAttachedToWindow();
        this.f19497o000 = true;
        if (!isInEditMode()) {
            if (this.f19517o0000OOo == null) {
                oO0OoOO0 oo0oooo0 = f19472o000O00;
                if (oo0oooo0 != null) {
                    getContext();
                    Oooo000(oo0oooo0.OooO00o());
                } else {
                    Oooo000(new BezierRadarHeader(getContext()));
                }
            }
            if (this.f19519o0000Oo0 == null) {
                oO0o0o oo0o0o = o000Oo0;
                if (oo0o0o != null) {
                    getContext();
                    OooOooo(oo0o0o.OooO00o());
                } else {
                    boolean z = this.f19542o00Oo0;
                    OooOooo(new BallPulseFooter(getContext()));
                    this.f19542o00Oo0 = z;
                }
            } else {
                this.f19542o00Oo0 = this.f19542o00Oo0 || !this.f19499o00000;
            }
            if (this.f19518o0000Oo == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    ooOOOOoo oooooooo = this.f19517o0000OOo;
                    if ((oooooooo == null || childAt != oooooooo.getView()) && ((oo000ooo = this.f19519o0000Oo0) == null || childAt != oo000ooo.getView())) {
                        this.f19518o0000Oo = new p408o0Oo0Oo.OooO0o(childAt);
                    }
                }
            }
            if (this.f19518o0000Oo == null) {
                int iOooO0OO = oOo00OO0.OooO0OO(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(o0OOO0o.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1));
                p408o0Oo0Oo.OooO0o oooO0o = new p408o0Oo0Oo.OooO0o(textView);
                this.f19518o0000Oo = oooO0o;
                oooO0o.f39136Oooo0o.setPadding(iOooO0OO, iOooO0OO, iOooO0OO, iOooO0OO);
            }
            View viewFindViewById = findViewById(this.f19488Ooooo00);
            View viewFindViewById2 = findViewById(this.f19489Ooooo0o);
            p408o0Oo0Oo.OooO0o oooO0o2 = this.f19518o0000Oo;
            Objects.requireNonNull(oooO0o2);
            View view = null;
            oooO0o2.f39143OoooOO0.f39133OooO0O0 = null;
            p408o0Oo0Oo.OooO0o oooO0o3 = this.f19518o0000Oo;
            oooO0o3.f39143OoooOO0.f39134OooO0OO = this.f19557oo0o0Oo;
            OooOo00 oooOo00 = this.f19524o0000o0O;
            View view2 = oooO0o3.f39136Oooo0o;
            boolean zIsInEditMode = view2.isInEditMode();
            View view3 = null;
            while (true) {
                if (view3 != null && (!(view3 instanceof o00Oo0) || (view3 instanceof Oooo0))) {
                    break;
                }
                boolean z2 = view3 == null;
                LinkedList linkedList = new LinkedList();
                linkedList.add(view2);
                View view4 = view;
                while (linkedList.size() > 0 && view4 == null) {
                    View view5 = (View) linkedList.poll();
                    if (view5 != null) {
                        if ((z2 || view5 != view2) && oOo00OO0.OooO0Oo(view5)) {
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
                                        ((AppBarLayout) childAt2).OooO00o(new oO00O0o(oooO0o3));
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
                oooO0o3.f39138Oooo0oo = view3;
            }
            if (viewFindViewById != null || viewFindViewById2 != null) {
                oooO0o3.f39135Oooo = viewFindViewById;
                oooO0o3.f39141OoooO00 = viewFindViewById2;
                FrameLayout frameLayout = new FrameLayout(oooO0o3.f39136Oooo0o.getContext());
                int iIndexOfChild = SmartRefreshLayout.this.getLayout().indexOfChild(oooO0o3.f39136Oooo0o);
                SmartRefreshLayout.this.getLayout().removeView(oooO0o3.f39136Oooo0o);
                frameLayout.addView(oooO0o3.f39136Oooo0o, 0, new ViewGroup.LayoutParams(-1, -1));
                SmartRefreshLayout.this.getLayout().addView(frameLayout, iIndexOfChild, oooO0o3.f39136Oooo0o.getLayoutParams());
                oooO0o3.f39136Oooo0o = frameLayout;
                if (viewFindViewById != null) {
                    viewFindViewById.setTag("fixed-top");
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    ViewGroup viewGroup3 = (ViewGroup) viewFindViewById.getParent();
                    int iIndexOfChild2 = viewGroup3.indexOfChild(viewFindViewById);
                    viewGroup3.removeView(viewFindViewById);
                    layoutParams.height = oOo00OO0.OooO0oO(viewFindViewById);
                    viewGroup3.addView(new Space(oooO0o3.f39136Oooo0o.getContext()), iIndexOfChild2, layoutParams);
                    frameLayout.addView(viewFindViewById, 1, layoutParams);
                }
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setTag("fixed-bottom");
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                    ViewGroup viewGroup4 = (ViewGroup) viewFindViewById2.getParent();
                    int iIndexOfChild3 = viewGroup4.indexOfChild(viewFindViewById2);
                    viewGroup4.removeView(viewFindViewById2);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                    layoutParams2.height = oOo00OO0.OooO0oO(viewFindViewById2);
                    viewGroup4.addView(new Space(oooO0o3.f39136Oooo0o.getContext()), iIndexOfChild3, layoutParams2);
                    layoutParams3.gravity = 80;
                    frameLayout.addView(viewFindViewById2, 1, layoutParams3);
                }
            }
            if (this.f19476Oooo0oO != 0) {
                OooOoO0(RefreshState.None);
                p408o0Oo0Oo.OooO0o oooO0o4 = this.f19518o0000Oo;
                this.f19476Oooo0oO = 0;
                oooO0o4.OooO0Oo(0, this.f19490OooooO0, this.f19491OooooOO);
            }
        }
        int[] iArr = this.f19558ooOO;
        if (iArr != null) {
            ooOOOOoo oooooooo2 = this.f19517o0000OOo;
            if (oooooooo2 != null) {
                oooooooo2.setPrimaryColors(iArr);
            }
            oO000OOo oo000ooo2 = this.f19519o0000Oo0;
            if (oo000ooo2 != null) {
                oo000ooo2.setPrimaryColors(this.f19558ooOO);
            }
        }
        p408o0Oo0Oo.OooO0o oooO0o5 = this.f19518o0000Oo;
        if (oooO0o5 != null) {
            super.bringChildToFront(oooO0o5.f39136Oooo0o);
        }
        ooOOOOoo oooooooo3 = this.f19517o0000OOo;
        if (oooooooo3 != null && oooooooo3.getSpinnerStyle().f39158OooO0O0) {
            super.bringChildToFront(this.f19517o0000OOo.getView());
        }
        oO000OOo oo000ooo3 = this.f19519o0000Oo0;
        if (oo000ooo3 == null || !oo000ooo3.getSpinnerStyle().f39158OooO0O0) {
            return;
        }
        super.bringChildToFront(this.f19519o0000Oo0.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19497o000 = false;
        this.f19524o0000o0O.OooO0O0(0, true);
        OooOoO0(RefreshState.None);
        Handler handler = this.f19523o0000o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f19499o00000 = true;
        this.f19539o000Ooo = null;
        ValueAnimator valueAnimator = this.f19534o000O0O;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f19534o000O0O.removeAllUpdateListeners();
            this.f19534o000O0O.cancel();
            this.f19534o000O0O = null;
        }
        this.f19533o000O000 = false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
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
        int i3 = 0;
        int i4 = -1;
        char c = 0;
        while (true) {
            i = 2;
            if (i3 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i3);
            if (oOo00OO0.OooO0Oo(childAt) && (c < 2 || i3 == 1)) {
                i4 = i3;
                c = 2;
            } else if (!(childAt instanceof oO0OOo0o) && c < 1) {
                c = i3 > 0 ? (char) 1 : (char) 0;
                i4 = i3;
            }
            i3++;
        }
        if (i4 >= 0) {
            this.f19518o0000Oo = new p408o0Oo0Oo.OooO0o(super.getChildAt(i4));
            if (i4 == 1) {
                if (childCount == 3) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    i = -1;
                }
            } else if (childCount == 2) {
                i2 = -1;
                i = 1;
            } else {
                i2 = -1;
                i = -1;
            }
        } else {
            i2 = -1;
            i = -1;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = super.getChildAt(i5);
            if (i5 == i2 || (i5 != i && i2 == -1 && this.f19517o0000OOo == null && (childAt2 instanceof ooOOOOoo))) {
                this.f19517o0000OOo = childAt2 instanceof ooOOOOoo ? (ooOOOOoo) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i || (i == -1 && (childAt2 instanceof oO000OOo))) {
                this.f19542o00Oo0 = this.f19542o00Oo0 || !this.f19499o00000;
                this.f19519o0000Oo0 = childAt2 instanceof oO000OOo ? (oO000OOo) childAt2 : new RefreshFooterWrapper(childAt2);
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
            if (childAt.getVisibility() != 8 && childAt.getTag(o0OOO0o.srl_component_falsify) != childAt) {
                p408o0Oo0Oo.OooO0o oooO0o = this.f19518o0000Oo;
                if (oooO0o != null && oooO0o.f39136Oooo0o == childAt) {
                    boolean z2 = isInEditMode() && this.f19545o00oO0O && OooOo0O(this.f19541o00O0O) && this.f19517o0000OOo != null;
                    View view = this.f19518o0000Oo.f39136Oooo0o;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f19471o000O0;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z2 && OooOo0o(this.f19547o00ooo, this.f19517o0000OOo)) {
                        int i8 = this.f19512o0000O00;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                ooOOOOoo oooooooo = this.f19517o0000OOo;
                if (oooooooo != null && oooooooo.getView() == childAt) {
                    boolean z3 = isInEditMode() && this.f19545o00oO0O && OooOo0O(this.f19541o00O0O);
                    View view2 = this.f19517o0000OOo.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f19471o000O0;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.f19513o0000O0O;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z3 && this.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo) {
                        int i11 = this.f19512o0000O00;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                oO000OOo oo000ooo = this.f19519o0000Oo0;
                if (oo000ooo != null && oo000ooo.getView() == childAt) {
                    boolean z4 = isInEditMode() && this.f19545o00oO0O && OooOo0O(this.f19542o00Oo0);
                    View view3 = this.f19519o0000Oo0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f19471o000O0;
                    o0OoOo0 spinnerStyle = this.f19519o0000Oo0.getSpinnerStyle();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (getMeasuredHeight() + marginLayoutParams3.topMargin) - this.f19536o000OO;
                    if (this.f19501o000000O && this.f19502o000000o && this.f19546o00oO0o && this.f19518o0000Oo != null && this.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo && OooOo0O(this.f19542o00Oo0)) {
                        View view4 = this.f19518o0000Oo.f39136Oooo0o;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == o0OoOo0.f39155OooO0oO) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.f19536o000OO;
                    } else {
                        if (z4 || spinnerStyle == o0OoOo0.f39153OooO0o || spinnerStyle == o0OoOo0.f39154OooO0o0) {
                            iMax = this.f19526o0000oO;
                        } else if (spinnerStyle.f39159OooO0OO && this.f19476Oooo0oO < 0) {
                            iMax = Math.max(OooOo0O(this.f19542o00Oo0) ? -this.f19476Oooo0oO : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i12, measuredHeight3, view3.getMeasuredWidth() + i12, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int i3;
        int size;
        int iMax;
        int i4;
        int size2;
        boolean z = isInEditMode() && this.f19545o00oO0O;
        int childCount = super.getChildCount();
        int measuredHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt.getTag(o0OOO0o.srl_component_falsify) != childAt) {
                ooOOOOoo oooooooo = this.f19517o0000OOo;
                if (oooooooo != null && oooooooo.getView() == childAt) {
                    View view2 = this.f19517o0000OOo.getView();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f19471o000O0;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int i6 = this.f19512o0000O00;
                    p409o0Oo0Oo0.o000oOoO o000oooo2 = this.f19530o0000oo;
                    if (o000oooo2.f39150OooO00o >= 6) {
                        iMax = i6;
                    } else {
                        int i7 = layoutParams.height;
                        if (i7 > 0) {
                            iMax = i7 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            p409o0Oo0Oo0.o000oOoO o000oooo3 = p409o0Oo0Oo0.o000oOoO.f39147OooO0o0;
                            if (o000oooo2.OooO00o(o000oooo3)) {
                                this.f19512o0000O00 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.f19530o0000oo = o000oooo3;
                            }
                        } else if (i7 != -2 || (this.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39155OooO0oO && this.f19530o0000oo.f39151OooO0O0)) {
                            iMax = i6;
                        } else {
                            int iMax2 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE));
                            int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax2) {
                                    p409o0Oo0Oo0.o000oOoO o000oooo4 = this.f19530o0000oo;
                                    p409o0Oo0Oo0.o000oOoO o000oooo5 = p409o0Oo0Oo0.o000oOoO.f39145OooO0Oo;
                                    if (o000oooo4.OooO00o(o000oooo5)) {
                                        this.f19512o0000O00 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.f19530o0000oo = o000oooo5;
                                    }
                                }
                                iMax = -1;
                            } else {
                                iMax = i6;
                            }
                        }
                    }
                    if (this.f19517o0000OOo.getSpinnerStyle() == o0OoOo0.f39155OooO0oO) {
                        size2 = View.MeasureSpec.getSize(i2);
                        i4 = 0;
                    } else {
                        if (!this.f19517o0000OOo.getSpinnerStyle().f39159OooO0OO || z) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            iMax = Math.max(0, OooOo0O(this.f19541o00O0O) ? this.f19476Oooo0oO : 0);
                        }
                        size2 = iMax;
                    }
                    if (size2 != -1) {
                        view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((size2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i4), 1073741824));
                    }
                    p409o0Oo0Oo0.o000oOoO o000oooo6 = this.f19530o0000oo;
                    boolean z2 = o000oooo6.f39151OooO0O0;
                    if (!z2) {
                        if (!z2) {
                            o000oooo6 = p409o0Oo0Oo0.o000oOoO.f39149OooO0oo[o000oooo6.f39150OooO00o + 1];
                        }
                        this.f19530o0000oo = o000oooo6;
                        ooOOOOoo oooooooo2 = this.f19517o0000OOo;
                        OooOo00 oooOo00 = this.f19524o0000o0O;
                        int i8 = this.f19512o0000O00;
                        oooooooo2.OooO0o(oooOo00, i8, (int) (this.f19510o0000O * i8));
                    }
                    if (z && OooOo0O(this.f19541o00O0O)) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                oO000OOo oo000ooo = this.f19519o0000Oo0;
                if (oo000ooo != null && oo000ooo.getView() == childAt) {
                    View view3 = this.f19519o0000Oo0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f19471o000O0;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int iMax3 = this.f19526o0000oO;
                    p409o0Oo0Oo0.o000oOoO o000oooo7 = this.f19511o0000O0;
                    if (o000oooo7.f39150OooO00o < 6) {
                        int i9 = layoutParams2.height;
                        if (i9 > 0) {
                            iMax3 = marginLayoutParams2.bottomMargin + i9 + marginLayoutParams2.topMargin;
                            p409o0Oo0Oo0.o000oOoO o000oooo8 = p409o0Oo0Oo0.o000oOoO.f39147OooO0o0;
                            if (o000oooo7.OooO00o(o000oooo8)) {
                                this.f19526o0000oO = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.f19511o0000O0 = o000oooo8;
                            }
                        } else if (i9 == -2 && (this.f19519o0000Oo0.getSpinnerStyle() != o0OoOo0.f39155OooO0oO || !this.f19511o0000O0.f39151OooO0O0)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view3.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    p409o0Oo0Oo0.o000oOoO o000oooo9 = this.f19511o0000O0;
                                    p409o0Oo0Oo0.o000oOoO o000oooo10 = p409o0Oo0Oo0.o000oOoO.f39145OooO0Oo;
                                    if (o000oooo9.OooO00o(o000oooo10)) {
                                        this.f19526o0000oO = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.f19511o0000O0 = o000oooo10;
                                    }
                                }
                                iMax3 = -1;
                            }
                        }
                    }
                    if (this.f19519o0000Oo0.getSpinnerStyle() == o0OoOo0.f39155OooO0oO) {
                        size = View.MeasureSpec.getSize(i2);
                        i3 = 0;
                    } else {
                        if (!this.f19519o0000Oo0.getSpinnerStyle().f39159OooO0OO || z) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            iMax3 = Math.max(0, OooOo0O(this.f19542o00Oo0) ? -this.f19476Oooo0oO : 0);
                        }
                        size = iMax3;
                    }
                    if (size != -1) {
                        view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((size - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                    }
                    p409o0Oo0Oo0.o000oOoO o000oooo11 = this.f19511o0000O0;
                    boolean z3 = o000oooo11.f39151OooO0O0;
                    if (!z3) {
                        if (!z3) {
                            o000oooo11 = p409o0Oo0Oo0.o000oOoO.f39149OooO0oo[o000oooo11.f39150OooO00o + 1];
                        }
                        this.f19511o0000O0 = o000oooo11;
                        oO000OOo oo000ooo2 = this.f19519o0000Oo0;
                        OooOo00 oooOo01 = this.f19524o0000o0O;
                        int i10 = this.f19526o0000oO;
                        oo000ooo2.OooO0o(oooOo01, i10, (int) (this.f19515o0000OO0 * i10));
                    }
                    if (z && OooOo0O(this.f19542o00Oo0)) {
                        measuredHeight = view3.getMeasuredHeight() + measuredHeight;
                    }
                }
                p408o0Oo0Oo.OooO0o oooO0o = this.f19518o0000Oo;
                if (oooO0o != null && (view = oooO0o.f39136Oooo0o) == childAt) {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f19471o000O0;
                    view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((z && (this.f19517o0000OOo != null && OooOo0O(this.f19541o00O0O) && OooOo0o(this.f19547o00ooo, this.f19517o0000OOo))) ? this.f19512o0000O00 : 0) + ((z && (this.f19519o0000Oo0 != null && OooOo0O(this.f19542o00Oo0) && OooOo0o(this.f19556oo000o, this.f19519o0000Oo0))) ? this.f19526o0000oO : 0), layoutParams3.height));
                    measuredHeight += view.getMeasuredHeight();
                }
            }
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i), View.resolveSize(measuredHeight, i2));
        this.f19540o000oOoO = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.f19509o00000oo.OooO00o(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.f19533o000O000 && f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || Oooo00O(-f2) || this.f19509o00000oo.OooO0O0(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.f19507o00000o0;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.f19507o00000o0)) {
                int i5 = this.f19507o00000o0;
                this.f19507o00000o0 = 0;
                i4 = i5;
            } else {
                this.f19507o00000o0 -= i2;
                i4 = i2;
            }
            OooOo(this.f19507o00000o0);
        } else if (i2 > 0 && this.f19533o000O000) {
            int i6 = i3 - i2;
            this.f19507o00000o0 = i6;
            OooOo(i6);
            i4 = i2;
        }
        this.f19509o00000oo.OooO0OO(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        boolean zOooO0o = this.f19509o00000oo.OooO0o(i, i2, i3, i4, this.f19508o00000oO);
        int i5 = i4 + this.f19508o00000oO[1];
        if ((i5 < 0 && (this.f19541o00O0O || this.f19554o0ooOOo)) || (i5 > 0 && (this.f19542o00Oo0 || this.f19554o0ooOOo))) {
            RefreshState refreshState = this.f19522o0000o;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.f19524o0000o0O.OooO0Oo(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zOooO0o) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.f19507o00000o0 - i5;
            this.f19507o00000o0 = i6;
            OooOo(i6);
        }
        if (!this.f19533o000O000 || i2 >= 0) {
            return;
        }
        this.f19533o000O000 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f19498o0000.OooO00o(i, 0);
        this.f19509o00000oo.OooOO0O(i & 2);
        this.f19507o00000o0 = this.f19476Oooo0oO;
        this.f19521o0000Ooo = true;
        OooOo0(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) {
            return this.f19554o0ooOOo || this.f19541o00O0O || this.f19542o00Oo0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        this.f19498o0000.OooO0O0(0);
        this.f19521o0000Ooo = false;
        this.f19507o00000o0 = 0;
        OooOoO();
        this.f19509o00000oo.OooOOO0(0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f19548o0O0O00 = z;
        this.f19509o00000oo.OooOO0(z);
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.f19525o0000o0o;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f19527o0000oO0 = System.currentTimeMillis();
            this.f19533o000O000 = true;
            OooOoO0(refreshState2);
            oO00OO0O oo00oo0o = this.f19506o00000Oo;
            if (oo00oo0o == null) {
                OooOOOo(RecyclerView.MAX_SCROLL_DURATION, true, false);
            } else if (z) {
                oo00oo0o.OooO0OO(this);
            }
            oO000OOo oo000ooo = this.f19519o0000Oo0;
            if (oo000ooo != null) {
                int i = this.f19526o0000oO;
                oo000ooo.OooO(this, i, (int) (this.f19515o0000OO0 * i));
            }
        }
    }

    public void setStateLoading(boolean z) {
        OooO0O0 oooO0O0 = new OooO0O0(z);
        OooOoO0(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorOooO00o = this.f19524o0000o0O.OooO00o(-this.f19526o0000oO);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0O0);
        }
        oO000OOo oo000ooo = this.f19519o0000Oo0;
        if (oo000ooo != null) {
            int i = this.f19526o0000oO;
            oo000ooo.OooO00o(this, i, (int) (this.f19515o0000OO0 * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0O0.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        OooO0OO oooO0OO = new OooO0OO(z);
        OooOoO0(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorOooO00o = this.f19524o0000o0O.OooO00o(this.f19512o0000O00);
        if (valueAnimatorOooO00o != null) {
            valueAnimatorOooO00o.addListener(oooO0OO);
        }
        ooOOOOoo oooooooo = this.f19517o0000OOo;
        if (oooooooo != null) {
            int i = this.f19512o0000O00;
            oooooooo.OooO00o(this, i, (int) (this.f19510o0000O * i));
        }
        if (valueAnimatorOooO00o == null) {
            oooO0OO.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f19525o0000o0o;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            OooOoO0(RefreshState.None);
        }
        if (this.f19522o0000o != refreshState) {
            this.f19522o0000o = refreshState;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19480OoooO00 = ShopVehicleListModel.VehicleTagType_Vip300;
        this.f19479OoooO0 = ShopVehicleListModel.VehicleTagType_Vip300;
        this.f19484OoooOOo = 0.5f;
        this.f19485OoooOo0 = 'n';
        this.f19488Ooooo00 = -1;
        this.f19489Ooooo0o = -1;
        this.f19490OooooO0 = -1;
        this.f19491OooooOO = -1;
        this.f19541o00O0O = true;
        this.f19542o00Oo0 = false;
        this.f19543o00Ooo = true;
        this.f19544o00o0O = true;
        this.f19547o00ooo = true;
        this.f19556oo000o = true;
        this.f19546o00oO0o = false;
        this.f19545o00oO0O = true;
        this.f19553o0ooOO0 = true;
        this.f19554o0ooOOo = false;
        this.f19555o0ooOoO = true;
        this.f19550o0OOO0o = false;
        this.f19551o0Oo0oo = true;
        this.f19549o0OO00O = true;
        this.f19557oo0o0Oo = true;
        this.f19548o0O0O00 = true;
        this.f19537o000OOo = false;
        this.f19500o000000 = false;
        this.f19501o000000O = false;
        this.f19502o000000o = false;
        this.f19499o00000 = false;
        this.f19504o00000O0 = false;
        this.f19503o00000O = false;
        this.f19508o00000oO = new int[2];
        this.f19509o00000oo = new o000oOoO(this);
        this.f19498o0000 = new o00Ooo();
        p409o0Oo0Oo0.o000oOoO o000oooo2 = p409o0Oo0Oo0.o000oOoO.f39144OooO0OO;
        this.f19530o0000oo = o000oooo2;
        this.f19511o0000O0 = o000oooo2;
        this.f19510o0000O = 2.5f;
        this.f19515o0000OO0 = 2.5f;
        this.f19514o0000OO = 1.0f;
        this.f19516o0000OOO = 1.0f;
        this.f19524o0000o0O = new OooOo00();
        RefreshState refreshState = RefreshState.None;
        this.f19525o0000o0o = refreshState;
        this.f19522o0000o = refreshState;
        this.f19527o0000oO0 = 0L;
        this.f19528o0000oOO = 0;
        this.f19529o0000oOo = 0;
        this.f19533o000O000 = false;
        this.f19538o000OoO = false;
        this.f19535o000O0o = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f19523o0000o0 = new Handler();
        this.f19495OoooooO = new Scroller(context);
        this.f19496Ooooooo = VelocityTracker.obtain();
        this.f19481OoooO0O = context.getResources().getDisplayMetrics().heightPixels;
        float f = oOo00OO0.f39170OooO0O0;
        this.f19552o0OoOo0 = new oOo00OO0(0);
        this.f19475Oooo0o = viewConfiguration.getScaledTouchSlop();
        this.f19492OooooOo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19494Oooooo0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19526o0000oO = oOo00OO0.OooO0OO(60.0f);
        this.f19512o0000O00 = oOo00OO0.OooO0OO(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(o0Oo0oo.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(o0Oo0oo.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        oO0Oo0oo oo0oo0oo = f19473o000O00O;
        if (oo0oo0oo != null) {
            oo0oo0oo.initialize();
        }
        this.f19484OoooOOo = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.SmartRefreshLayout_srlDragRate, this.f19484OoooOOo);
        this.f19510o0000O = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.SmartRefreshLayout_srlHeaderMaxDragRate, this.f19510o0000O);
        this.f19515o0000OO0 = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.SmartRefreshLayout_srlFooterMaxDragRate, this.f19515o0000OO0);
        this.f19514o0000OO = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.SmartRefreshLayout_srlHeaderTriggerRate, this.f19514o0000OO);
        this.f19516o0000OOO = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.SmartRefreshLayout_srlFooterTriggerRate, this.f19516o0000OOO);
        this.f19541o00O0O = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableRefresh, this.f19541o00O0O);
        this.f19479OoooO0 = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.SmartRefreshLayout_srlReboundDuration, this.f19479OoooO0);
        int i = o0Oo0oo.SmartRefreshLayout_srlEnableLoadMore;
        this.f19542o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(i, this.f19542o00Oo0);
        int i2 = o0Oo0oo.SmartRefreshLayout_srlHeaderHeight;
        this.f19512o0000O00 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, this.f19512o0000O00);
        int i3 = o0Oo0oo.SmartRefreshLayout_srlFooterHeight;
        this.f19526o0000oO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i3, this.f19526o0000oO);
        this.f19513o0000O0O = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o0Oo0oo.SmartRefreshLayout_srlHeaderInsetStart, this.f19513o0000O0O);
        this.f19536o000OO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o0Oo0oo.SmartRefreshLayout_srlFooterInsetStart, this.f19536o000OO);
        this.f19537o000OOo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlDisableContentWhenRefresh, this.f19537o000OOo);
        this.f19500o000000 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlDisableContentWhenLoading, this.f19500o000000);
        int i4 = o0Oo0oo.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.f19547o00ooo = typedArrayObtainStyledAttributes.getBoolean(i4, this.f19547o00ooo);
        int i5 = o0Oo0oo.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.f19556oo000o = typedArrayObtainStyledAttributes.getBoolean(i5, this.f19556oo000o);
        this.f19545o00oO0O = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnablePreviewInEditMode, this.f19545o00oO0O);
        this.f19555o0ooOoO = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableAutoLoadMore, this.f19555o0ooOoO);
        this.f19553o0ooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableOverScrollBounce, this.f19553o0ooOO0);
        this.f19550o0OOO0o = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnablePureScrollMode, this.f19550o0OOO0o);
        this.f19551o0Oo0oo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.f19551o0Oo0oo);
        this.f19549o0OO00O = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.f19549o0OO00O);
        this.f19557oo0o0Oo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.f19557oo0o0Oo);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.f19546o00oO0o);
        this.f19546o00oO0o = z;
        this.f19546o00oO0o = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z);
        this.f19543o00Ooo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.f19543o00Ooo);
        this.f19544o00o0O = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.f19544o00o0O);
        this.f19554o0ooOOo = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableOverScrollDrag, this.f19554o0ooOOo);
        this.f19488Ooooo00 = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.SmartRefreshLayout_srlFixedHeaderViewId, this.f19488Ooooo00);
        this.f19489Ooooo0o = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.SmartRefreshLayout_srlFixedFooterViewId, this.f19489Ooooo0o);
        this.f19490OooooO0 = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.SmartRefreshLayout_srlHeaderTranslationViewId, this.f19490OooooO0);
        this.f19491OooooOO = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.SmartRefreshLayout_srlFooterTranslationViewId, this.f19491OooooOO);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.SmartRefreshLayout_srlEnableNestedScrolling, this.f19548o0O0O00);
        this.f19548o0O0O00 = z2;
        this.f19509o00000oo.OooOO0(z2);
        this.f19499o00000 = this.f19499o00000 || typedArrayObtainStyledAttributes.hasValue(i);
        this.f19504o00000O0 = this.f19504o00000O0 || typedArrayObtainStyledAttributes.hasValue(i4);
        this.f19503o00000O = this.f19503o00000O || typedArrayObtainStyledAttributes.hasValue(i5);
        this.f19530o0000oo = typedArrayObtainStyledAttributes.hasValue(i2) ? p409o0Oo0Oo0.o000oOoO.f39146OooO0o : this.f19530o0000oo;
        this.f19511o0000O0 = typedArrayObtainStyledAttributes.hasValue(i3) ? p409o0Oo0Oo0.o000oOoO.f39146OooO0o : this.f19511o0000O0;
        int color = typedArrayObtainStyledAttributes.getColor(o0Oo0oo.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(o0Oo0oo.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f19558ooOO = new int[]{color2, color};
            } else {
                this.f19558ooOO = new int[]{color2};
            }
        } else if (color != 0) {
            this.f19558ooOO = new int[]{0, color};
        }
        if (this.f19550o0OOO0o && !this.f19499o00000 && !this.f19542o00Oo0) {
            this.f19542o00Oo0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f19559OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0OoOo0 f19560OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19559OooO00o = 0;
            this.f19560OooO0O0 = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.SmartRefreshLayout_Layout);
            this.f19559OooO00o = typedArrayObtainStyledAttributes.getColor(o0Oo0oo.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f19559OooO00o);
            int i = o0Oo0oo.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.f19560OooO0O0 = o0OoOo0.f39156OooO0oo[typedArrayObtainStyledAttributes.getInt(i, 0)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i) {
            super(-1, i);
            this.f19559OooO00o = 0;
            this.f19560OooO0O0 = null;
        }
    }
}
