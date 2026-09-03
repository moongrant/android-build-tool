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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.oO0OOo0o;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;
import p586o0oOoo00.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class TwoLevelHeader extends InternalAbstract implements ooOOOOoo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f19654Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f19655OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f19656OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f19657OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f19658OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f19659OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f19660OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f19661OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public oO0OOo0o f19662OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public oO000Oo0 f19663OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f19664o000oOoO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19665OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19665OooO00o = iArr;
            try {
                iArr[RefreshState.TwoLevelReleased.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19665OooO00o[RefreshState.TwoLevel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19665OooO00o[RefreshState.TwoLevelFinish.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19665OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TwoLevelHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        if (oo0ooo0o == null) {
            return;
        }
        float f = ((i2 + i) * 1.0f) / i;
        float f2 = this.f19656OoooO0;
        if (f != f2 && this.f19661OoooOOo == 0) {
            this.f19661OoooOOo = i;
            this.f19662OoooOo0 = null;
            SmartRefreshLayout.this.OooOoo(f2);
            this.f19662OoooOo0 = oo0ooo0o;
        }
        if (this.f19663OoooOoO == null && oo0ooo0o.getSpinnerStyle() == o0OoOo0.f39152OooO0Oo && !isInEditMode()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oo0ooo0o.getView().getLayoutParams();
            marginLayoutParams.topMargin -= i;
            oo0ooo0o.getView().setLayoutParams(marginLayoutParams);
        }
        this.f19661OoooOOo = i;
        this.f19663OoooOoO = oo000oo0;
        int i3 = this.f19660OoooOOO;
        SmartRefreshLayout.OooOo00 oooOo00 = (SmartRefreshLayout.OooOo00) oo000oo0;
        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
        smartRefreshLayout.f19480OoooO00 = i3;
        boolean z = !this.f19664o000oOoO;
        if (equals(smartRefreshLayout.f19517o0000OOo)) {
            SmartRefreshLayout.this.f19531o0000oo0 = z;
        } else if (equals(SmartRefreshLayout.this.f19519o0000Oo0)) {
            SmartRefreshLayout.this.f19532o0000ooO = z;
        }
        oo0ooo0o.OooO0o(oo000oo0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        if (this.f19654Oooo != i && oo0ooo0o != null) {
            this.f19654Oooo = i;
            o0OoOo0 spinnerStyle = oo0ooo0o.getSpinnerStyle();
            if (spinnerStyle == o0OoOo0.f39152OooO0Oo) {
                oo0ooo0o.getView().setTranslationY(i);
            } else if (spinnerStyle.f39159OooO0OO) {
                View view = oo0ooo0o.getView();
                view.layout(view.getLeft(), view.getTop(), view.getRight(), Math.max(0, i) + view.getTop());
            }
        }
        oO0OOo0o oo0ooo0o2 = this.f19662OoooOo0;
        oO000Oo0 oo000oo0 = this.f19663OoooOoO;
        if (oo0ooo0o2 != null) {
            oo0ooo0o2.OooO0oO(z, f, i, i2, i3);
        }
        if (z) {
            float f2 = this.f19657OoooO00;
            float f3 = this.f19658OoooO0O;
            if (f2 < f3 && f >= f3 && this.f19659OoooOO0) {
                ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0Oo(RefreshState.ReleaseToTwoLevel);
            } else if (f2 >= f3 && f < this.f19655OoooO) {
                ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0Oo(RefreshState.PullDownToRefresh);
            } else if (f2 >= f3 && f < f3) {
                ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0Oo(RefreshState.ReleaseToRefresh);
            }
            this.f19657OoooO00 = f;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0oo(oo000oo, refreshState, refreshState2);
            int i = OooO00o.f19665OooO00o[refreshState2.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    if (oo0ooo0o.getView() != this) {
                        oo0ooo0o.getView().animate().alpha(1.0f).setDuration(this.f19660OoooOOO / 2);
                        return;
                    }
                    return;
                } else {
                    if (i == 4 && oo0ooo0o.getView().getAlpha() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && oo0ooo0o.getView() != this) {
                        oo0ooo0o.getView().setAlpha(1.0f);
                        return;
                    }
                    return;
                }
            }
            if (oo0ooo0o.getView() != this) {
                oo0ooo0o.getView().animate().alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(this.f19660OoooOOO / 2);
            }
            oO000Oo0 oo000oo0 = this.f19663OoooOoO;
            if (oo000oo0 != null) {
                SmartRefreshLayout.OooOo00 oooOo00 = (SmartRefreshLayout.OooOo00) oo000oo0;
                com.scwang.smartrefresh.layout.OooO00o oooO00o = new com.scwang.smartrefresh.layout.OooO00o(oooOo00);
                ValueAnimator valueAnimatorOooO00o = oooOo00.OooO00o(SmartRefreshLayout.this.getMeasuredHeight());
                if (valueAnimatorOooO00o != null) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    if (valueAnimatorOooO00o == smartRefreshLayout.f19534o000O0O) {
                        valueAnimatorOooO00o.setDuration(smartRefreshLayout.f19480OoooO00);
                        valueAnimatorOooO00o.addListener(oooO00o);
                        return;
                    }
                }
                oooO00o.onAnimationEnd(null);
            }
        }
    }

    public final TwoLevelHeader OooOO0(ooOOOOoo oooooooo) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        if (oo0ooo0o != null) {
            removeView(oo0ooo0o.getView());
        }
        if (oooooooo.getSpinnerStyle() == o0OoOo0.f39154OooO0o0) {
            addView(oooooooo.getView(), 0, new RelativeLayout.LayoutParams(-1, -2));
        } else {
            addView(oooooooo.getView(), getChildCount(), new RelativeLayout.LayoutParams(-1, -2));
        }
        this.f19662OoooOo0 = oooooooo;
        this.f19668Oooo0oo = oooooooo;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract
    public final boolean equals(Object obj) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        return (oo0ooo0o != null && oo0ooo0o.equals(obj)) || super.equals(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19667Oooo0oO = o0OoOo0.f39155OooO0oO;
        if (this.f19662OoooOo0 == null) {
            OooOO0(new ClassicsHeader(getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19667Oooo0oO = o0OoOo0.f39154OooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ooOOOOoo) {
                this.f19662OoooOo0 = (ooOOOOoo) childAt;
                this.f19668Oooo0oo = (oO0OOo0o) childAt;
                bringChildToFront(childAt);
                break;
            }
        }
        if (this.f19662OoooOo0 == null) {
            OooOO0(new ClassicsHeader(getContext()));
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        oO0OOo0o oo0ooo0o = this.f19662OoooOo0;
        if (oo0ooo0o == null) {
            super.onMeasure(i, i2);
        } else {
            if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
                super.onMeasure(i, i2);
                return;
            }
            oo0ooo0o.getView().measure(i, i2);
            super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i), oo0ooo0o.getView().getMeasuredHeight());
        }
    }

    public TwoLevelHeader(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19657OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f19656OoooO0 = 2.5f;
        this.f19658OoooO0O = 1.9f;
        this.f19655OoooO = 1.0f;
        this.f19659OoooOO0 = true;
        this.f19664o000oOoO = true;
        this.f19660OoooOOO = 1000;
        this.f19667Oooo0oO = o0OoOo0.f39154OooO0o0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.TwoLevelHeader);
        this.f19656OoooO0 = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.TwoLevelHeader_srlMaxRage, this.f19656OoooO0);
        this.f19658OoooO0O = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.TwoLevelHeader_srlFloorRage, this.f19658OoooO0O);
        this.f19655OoooO = typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.TwoLevelHeader_srlRefreshRage, this.f19655OoooO);
        this.f19660OoooOOO = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.TwoLevelHeader_srlFloorDuration, this.f19660OoooOOO);
        this.f19659OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.TwoLevelHeader_srlEnableTwoLevel, this.f19659OoooOO0);
        this.f19664o000oOoO = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.TwoLevelHeader_srlEnablePullToCloseTwoLevel, this.f19664o000oOoO);
        typedArrayObtainStyledAttributes.recycle();
    }
}
