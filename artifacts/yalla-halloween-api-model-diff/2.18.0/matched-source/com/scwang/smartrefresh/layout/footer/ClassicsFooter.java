package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p410o0Oo0OOo.oO000Oo0;
import p410o0Oo0OOo.oO0Oo0oo;
import p412o0Oo0Oo0.o0OoOo0;
import p413o0Oo0OoO.oO000Oo;
import p413o0Oo0OoO.oO0O0OoO;
import p414o0Oo0Ooo.oO00O0o;
import p588o0oOoo00.o00oO0o;
import p588o0oOoo00.o0OOO0o;
import p588o0oOoo00.o0Oo0oo;
import p588o0oOoo00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements oO0Oo0oo {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public String f19623OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public String f19624Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public String f19625Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public String f19626OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public String f19627Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f19628o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public String f19629o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public String f19630ooOO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19631OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19631OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19631OooO00o[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19631OooO00o[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19631OooO00o[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19631OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19631OooO00o[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p410o0Oo0OOo.ooOOOOoo
    public final void OooO(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        if (this.f19628o00O0O) {
            return;
        }
        super.OooO(oo000oo0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p410o0Oo0OOo.ooOOOOoo
    public final int OooO0O0(@NonNull oO000Oo0 oo000oo0, boolean z) {
        if (this.f19628o00O0O) {
            return 0;
        }
        this.f19690OoooO0O.setText(z ? this.f19627Ooooooo : this.f19629o0OoOo0);
        return super.OooO0O0(oo000oo0, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p410o0Oo0OOo.oO0Oo0oo
    public final boolean OooO0OO(boolean z) {
        if (this.f19628o00O0O == z) {
            return true;
        }
        this.f19628o00O0O = z;
        ImageView imageView = this.f19689OoooO;
        if (z) {
            this.f19690OoooO0O.setText(this.f19630ooOO);
            imageView.setVisibility(8);
            return true;
        }
        this.f19690OoooO0O.setText(this.f19623OooooOo);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p420o0Oo0oOo.oO00OOO
    public final void OooO0oo(@NonNull oO000Oo0 oo000oo0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f19689OoooO;
        if (this.f19628o00O0O) {
            return;
        }
        switch (OooO00o.f19631OooO00o[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f19690OoooO0O.setText(this.f19624Oooooo);
                return;
            case 5:
                this.f19690OoooO0O.setText(this.f19625Oooooo0);
                imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            case 6:
                this.f19690OoooO0O.setText(this.f19626OoooooO);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f19690OoooO0O.setText(this.f19623OooooOo);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p410o0Oo0OOo.ooOOOOoo
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f19688OoooO00 == o0OoOo0.f39174OooO0o0) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19628o00O0O = false;
        View.inflate(context, o0ooOOo.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(o00oO0o.srl_classics_arrow);
        this.f19689OoooO = imageView;
        ImageView imageView2 = (ImageView) findViewById(o00oO0o.srl_classics_progress);
        this.f19691OoooOO0 = imageView2;
        this.f19690OoooO0O = (TextView) findViewById(o00oO0o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsFooter_srlDrawableMarginRight, oO00O0o.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = o0Oo0oo.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = o0Oo0oo.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = o0Oo0oo.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f19697Ooooo00 = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsFooter_srlFinishDuration, this.f19697Ooooo00);
        this.f19688OoooO00 = o0OoOo0.f39176OooO0oo[typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsFooter_srlClassicsSpinnerStyle, this.f19688OoooO00.f39177OooO00o)];
        int i4 = o0Oo0oo.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f19689OoooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f19689OoooO.getDrawable() == null) {
            oO000Oo oo000oo = new oO000Oo();
            this.f19692OoooOOO = oo000oo;
            oo000oo.OooO00o(-10066330);
            this.f19689OoooO.setImageDrawable(this.f19692OoooOOO);
        }
        int i5 = o0Oo0oo.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f19691OoooOO0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f19691OoooOO0.getDrawable() == null) {
            oO0O0OoO oo0o0ooo = new oO0O0OoO();
            this.f19693OoooOOo = oo0o0ooo;
            oo0o0ooo.OooO00o(-10066330);
            this.f19691OoooOO0.setImageDrawable(this.f19693OoooOOo);
        }
        int i6 = o0Oo0oo.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f19690OoooO0O.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, oO00O0o.OooO0OO(16.0f)));
        }
        int i7 = o0Oo0oo.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            OooOO0O(typedArrayObtainStyledAttributes.getColor(i7, 0));
        }
        int i8 = o0Oo0oo.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            OooOO0(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = o0Oo0oo.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f19623OooooOo = typedArrayObtainStyledAttributes.getString(i9);
        } else {
            this.f19623OooooOo = context.getString(o0OOO0o.srl_footer_pulling);
        }
        int i10 = o0Oo0oo.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f19625Oooooo0 = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f19625Oooooo0 = context.getString(o0OOO0o.srl_footer_release);
        }
        int i11 = o0Oo0oo.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f19624Oooooo = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f19624Oooooo = context.getString(o0OOO0o.srl_footer_loading);
        }
        int i12 = o0Oo0oo.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f19626OoooooO = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f19626OoooooO = context.getString(o0OOO0o.srl_footer_refreshing);
        }
        int i13 = o0Oo0oo.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f19627Ooooooo = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f19627Ooooooo = context.getString(o0OOO0o.srl_footer_finish);
        }
        int i14 = o0Oo0oo.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f19629o0OoOo0 = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f19629o0OoOo0 = context.getString(o0OOO0o.srl_footer_failed);
        }
        int i15 = o0Oo0oo.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f19630ooOO = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f19630ooOO = context.getString(o0OOO0o.srl_footer_nothing);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f19690OoooO0O.setText(isInEditMode() ? this.f19624Oooooo : this.f19623OooooOo);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
