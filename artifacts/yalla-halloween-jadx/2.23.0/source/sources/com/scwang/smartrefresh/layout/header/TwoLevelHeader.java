package com.scwang.smartrefresh.layout.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import o0OO0o.OooO;
import o0OO0o.OooOO0;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p333o0OO0o0o.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public class TwoLevelHeader extends InternalAbstract implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f21469OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21470OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f21471OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f21472OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f21473OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f21474OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f21475OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f21476OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f21477OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooOO0 f21478OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooOO0O f21479OooOOo0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21480OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f21480OooO00o = iArr;
            try {
                iArr[RefreshState.TwoLevelReleased.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21480OooO00o[RefreshState.TwoLevel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21480OooO00o[RefreshState.TwoLevelFinish.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21480OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TwoLevelHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO00o(@NonNull OooOO0O oooOO0O, int i, int i2) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        if (oooOO1 == null) {
            return;
        }
        float f = ((i2 + i) * 1.0f) / i;
        float f2 = this.f21469OooO;
        if (f != f2 && this.f21477OooOOOO == 0) {
            this.f21477OooOOOO = i;
            this.f21478OooOOOo = null;
            SmartRefreshLayout.this.OooOo0O(f2);
            this.f21478OooOOOo = oooOO1;
        }
        if (this.f21479OooOOo0 == null && oooOO1.getSpinnerStyle() == OooO0O0.f43237OooO0Oo && !isInEditMode()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oooOO1.getView().getLayoutParams();
            marginLayoutParams.topMargin -= i;
            oooOO1.getView().setLayoutParams(marginLayoutParams);
        }
        this.f21477OooOOOO = i;
        this.f21479OooOOo0 = oooOO0O;
        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
        smartRefreshLayout.f21309OooO0oo = this.f21475OooOOO;
        boolean z = !this.f21476OooOOO0;
        if (equals(smartRefreshLayout.f21372o00o0O)) {
            smartRefreshLayout.f21385oo0o0Oo = z;
        } else if (equals(smartRefreshLayout.f21375o00ooo)) {
            smartRefreshLayout.f21376o0O0O00 = z;
        }
        oooOO1.OooO00o(oooOO0O, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        if (oooOO1 != null) {
            oooOO1.OooO0OO(oooOOO0, refreshState, refreshState2);
            int i = OooO00o.f21480OooO00o[refreshState2.ordinal()];
            int i2 = this.f21475OooOOO;
            if (i != 1) {
                if (i == 3) {
                    if (oooOO1.getView() != this) {
                        oooOO1.getView().animate().alpha(1.0f).setDuration(i2 / 2);
                        return;
                    }
                    return;
                } else {
                    if (i == 4 && oooOO1.getView().getAlpha() == 0.0f && oooOO1.getView() != this) {
                        oooOO1.getView().setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
            if (oooOO1.getView() != this) {
                oooOO1.getView().animate().alpha(0.0f).setDuration(i2 / 2);
            }
            OooOO0O oooOO0O = this.f21479OooOOo0;
            if (oooOO0O != null) {
                SmartRefreshLayout.OooOOO oooOOO = (SmartRefreshLayout.OooOOO) oooOO0O;
                com.scwang.smartrefresh.layout.OooO00o oooO00o = new com.scwang.smartrefresh.layout.OooO00o(oooOOO);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                ValueAnimator valueAnimatorOooO00o = oooOOO.OooO00o(smartRefreshLayout.getMeasuredHeight());
                if (valueAnimatorOooO00o == null || valueAnimatorOooO00o != smartRefreshLayout.f21366o00000O0) {
                    oooO00o.onAnimationEnd(null);
                } else {
                    valueAnimatorOooO00o.setDuration(smartRefreshLayout.f21309OooO0oo);
                    valueAnimatorOooO00o.addListener(oooO00o);
                }
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0o0(float f, int i, int i2, int i3, boolean z) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        if (this.f21470OooO0oO != i && oooOO1 != null) {
            this.f21470OooO0oO = i;
            OooO0O0 spinnerStyle = oooOO1.getSpinnerStyle();
            if (spinnerStyle == OooO0O0.f43237OooO0Oo) {
                oooOO1.getView().setTranslationY(i);
            } else if (spinnerStyle.f43244OooO0OO) {
                View view = oooOO1.getView();
                view.layout(view.getLeft(), view.getTop(), view.getRight(), Math.max(0, i) + view.getTop());
            }
        }
        OooOO0 oooOO2 = this.f21478OooOOOo;
        OooOO0O oooOO0O = this.f21479OooOOo0;
        if (oooOO2 != null) {
            oooOO2.OooO0o0(f, i, i2, i3, z);
        }
        if (z) {
            float f2 = this.f21471OooO0oo;
            float f3 = this.f21472OooOO0;
            if (f2 < f3 && f >= f3 && this.f21474OooOO0o) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0Oo(RefreshState.ReleaseToTwoLevel);
            } else if (f2 >= f3 && f < this.f21473OooOO0O) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0Oo(RefreshState.PullDownToRefresh);
            } else if (f2 >= f3 && f < f3) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0Oo(RefreshState.ReleaseToRefresh);
            }
            this.f21471OooO0oo = f;
        }
    }

    public final void OooOO0(ClassicsHeader classicsHeader) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        if (oooOO1 != null) {
            removeView(oooOO1.getView());
        }
        if (classicsHeader.getSpinnerStyle() == OooO0O0.f43239OooO0o0) {
            addView(classicsHeader.getView(), 0, new RelativeLayout.LayoutParams(-1, -2));
        } else {
            addView(classicsHeader.getView(), getChildCount(), new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f21478OooOOOo = classicsHeader;
        this.f21482OooO0o = classicsHeader;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract
    public final boolean equals(Object obj) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        return (oooOO1 != null && oooOO1.equals(obj)) || super.equals(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21483OooO0o0 = OooO0O0.f43240OooO0oO;
        if (this.f21478OooOOOo == null) {
            OooOO0(new ClassicsHeader(getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21483OooO0o0 = OooO0O0.f43239OooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof OooO) {
                this.f21478OooOOOo = (OooO) childAt;
                this.f21482OooO0o = (OooOO0) childAt;
                bringChildToFront(childAt);
                break;
            }
        }
        if (this.f21478OooOOOo == null) {
            OooOO0(new ClassicsHeader(getContext()));
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooOO0 oooOO1 = this.f21478OooOOOo;
        if (oooOO1 == null) {
            super.onMeasure(i, i2);
        } else {
            if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
                super.onMeasure(i, i2);
                return;
            }
            oooOO1.getView().measure(i, i2);
            super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i), oooOO1.getView().getMeasuredHeight());
        }
    }

    public TwoLevelHeader(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21471OooO0oo = 0.0f;
        this.f21469OooO = 2.5f;
        this.f21472OooOO0 = 1.9f;
        this.f21473OooOO0O = 1.0f;
        this.f21474OooOO0o = true;
        this.f21476OooOOO0 = true;
        this.f21475OooOOO = 1000;
        this.f21483OooO0o0 = OooO0O0.f43239OooO0o0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOO.TwoLevelHeader);
        this.f21469OooO = typedArrayObtainStyledAttributes.getFloat(OooOOO.TwoLevelHeader_srlMaxRage, 2.5f);
        this.f21472OooOO0 = typedArrayObtainStyledAttributes.getFloat(OooOOO.TwoLevelHeader_srlFloorRage, 1.9f);
        this.f21473OooOO0O = typedArrayObtainStyledAttributes.getFloat(OooOOO.TwoLevelHeader_srlRefreshRage, 1.0f);
        this.f21475OooOOO = typedArrayObtainStyledAttributes.getInt(OooOOO.TwoLevelHeader_srlFloorDuration, 1000);
        this.f21474OooOO0o = typedArrayObtainStyledAttributes.getBoolean(OooOOO.TwoLevelHeader_srlEnableTwoLevel, true);
        this.f21476OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(OooOOO.TwoLevelHeader_srlEnablePullToCloseTwoLevel, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
