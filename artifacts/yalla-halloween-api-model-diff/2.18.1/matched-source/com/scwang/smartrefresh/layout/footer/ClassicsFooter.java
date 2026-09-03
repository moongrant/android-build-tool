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
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p409o0Oo0Oo0.o0OoOo0;
import p410o0Oo0OoO.oO000o00;
import p410o0Oo0OoO.oO00O0o0;
import p411o0Oo0Ooo.oOo00OO0;
import p586o0oOoo00.o00oO0o;
import p586o0oOoo00.o0OOO0o;
import p586o0oOoo00.o0Oo0oo;
import p586o0oOoo00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements oO000OOo {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f19603Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f19604OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public String f19605OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public String f19606OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public String f19607Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public String f19608Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public String f19609OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f19610Ooooooo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19611OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19611OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19611OooO00o[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19611OooO00o[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19611OooO00o[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19611OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19611OooO00o[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO(@NonNull oO000Oo oo000oo, int i, int i2) {
        if (this.f19610Ooooooo) {
            return;
        }
        super.OooO(oo000oo, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        if (this.f19610Ooooooo) {
            return 0;
        }
        this.f19669Oooo.setText(z ? this.f19608Oooooo0 : this.f19607Oooooo);
        return super.OooO0O0(oo000oo, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO000OOo
    public final boolean OooO0OO(boolean z) {
        if (this.f19610Ooooooo == z) {
            return true;
        }
        this.f19610Ooooooo = z;
        ImageView imageView = this.f19672OoooO00;
        if (z) {
            this.f19669Oooo.setText(this.f19609OoooooO);
            imageView.setVisibility(8);
            return true;
        }
        this.f19669Oooo.setText(this.f19603Ooooo0o);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f19672OoooO00;
        if (this.f19610Ooooooo) {
            return;
        }
        switch (OooO00o.f19611OooO00o[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f19669Oooo.setText(this.f19605OooooOO);
                return;
            case 5:
                this.f19669Oooo.setText(this.f19604OooooO0);
                imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            case 6:
                this.f19669Oooo.setText(this.f19606OooooOo);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f19669Oooo.setText(this.f19603Ooooo0o);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f19667Oooo0oO == o0OoOo0.f39154OooO0o0) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19610Ooooooo = false;
        View.inflate(context, o0ooOOo.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(o00oO0o.srl_classics_arrow);
        this.f19672OoooO00 = imageView;
        ImageView imageView2 = (ImageView) findViewById(o00oO0o.srl_classics_progress);
        this.f19671OoooO0 = imageView2;
        this.f19669Oooo = (TextView) findViewById(o00oO0o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0Oo0oo.ClassicsFooter_srlDrawableMarginRight, oOo00OO0.OooO0OO(20.0f));
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
        this.f19677OoooOo0 = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsFooter_srlFinishDuration, this.f19677OoooOo0);
        this.f19667Oooo0oO = o0OoOo0.f39156OooO0oo[typedArrayObtainStyledAttributes.getInt(o0Oo0oo.ClassicsFooter_srlClassicsSpinnerStyle, this.f19667Oooo0oO.f39157OooO00o)];
        int i4 = o0Oo0oo.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f19672OoooO00.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f19672OoooO00.getDrawable() == null) {
            oO000o00 oo000o00 = new oO000o00();
            this.f19670OoooO = oo000o00;
            oo000o00.OooO00o(-10066330);
            this.f19672OoooO00.setImageDrawable(this.f19670OoooO);
        }
        int i5 = o0Oo0oo.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f19671OoooO0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f19671OoooO0.getDrawable() == null) {
            oO00O0o0 oo00o0o0 = new oO00O0o0();
            this.f19674OoooOO0 = oo00o0o0;
            oo00o0o0.OooO00o(-10066330);
            this.f19671OoooO0.setImageDrawable(this.f19674OoooOO0);
        }
        int i6 = o0Oo0oo.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f19669Oooo.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, oOo00OO0.OooO0OO(16.0f)));
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
            this.f19603Ooooo0o = typedArrayObtainStyledAttributes.getString(i9);
        } else {
            this.f19603Ooooo0o = context.getString(o0OOO0o.srl_footer_pulling);
        }
        int i10 = o0Oo0oo.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f19604OooooO0 = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f19604OooooO0 = context.getString(o0OOO0o.srl_footer_release);
        }
        int i11 = o0Oo0oo.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f19605OooooOO = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f19605OooooOO = context.getString(o0OOO0o.srl_footer_loading);
        }
        int i12 = o0Oo0oo.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f19606OooooOo = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f19606OooooOo = context.getString(o0OOO0o.srl_footer_refreshing);
        }
        int i13 = o0Oo0oo.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f19608Oooooo0 = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f19608Oooooo0 = context.getString(o0OOO0o.srl_footer_finish);
        }
        int i14 = o0Oo0oo.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f19607Oooooo = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f19607Oooooo = context.getString(o0OOO0o.srl_footer_failed);
        }
        int i15 = o0Oo0oo.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f19609OoooooO = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f19609OoooooO = context.getString(o0OOO0o.srl_footer_nothing);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f19669Oooo.setText(isInEditMode() ? this.f19605OooooOO : this.f19603Ooooo0o);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
