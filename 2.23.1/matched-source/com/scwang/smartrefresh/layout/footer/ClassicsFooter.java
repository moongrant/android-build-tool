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
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import o0OO0o.OooO0OO;
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooO0o;
import o0OO0oO0.OooOO0O;
import o0OO0oO0.OooOOO0;
import p340o0OO0oo0.OooOOOO;
import p394o0OOoooO.o00O0OOO;
import p394o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f20950OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final String f20951OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final String f20952OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final String f20953OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f20954OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f20955OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f20956OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f20957OooOoOO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20958OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f20958OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20958OooO00o[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20958OooO00o[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20958OooO00o[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20958OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20958OooO00o[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p339o0OO0oOo.o000oOoO
    public final void OooO00o(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f21018OooO0oo;
        if (this.f20957OooOoOO) {
            return;
        }
        switch (OooO00o.f20958OooO00o[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f21017OooO0oO.setText(this.f20953OooOo0O);
                return;
            case 5:
                this.f21017OooO0oO.setText(this.f20951OooOo0);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f21017OooO0oO.setText(this.f20954OooOo0o);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f21017OooO0oO.setText(this.f20952OooOo00);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooO0o
    public final boolean OooO0O0(boolean z) {
        if (this.f20957OooOoOO == z) {
            return true;
        }
        this.f20957OooOoOO = z;
        ImageView imageView = this.f21018OooO0oo;
        if (z) {
            this.f21017OooO0oO.setText(this.f20955OooOoO);
            imageView.setVisibility(8);
            return true;
        }
        this.f21017OooO0oO.setText(this.f20952OooOo00);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        if (this.f20957OooOoOO) {
            return 0;
        }
        this.f21017OooO0oO.setText(z ? this.f20950OooOo : this.f20956OooOoO0);
        return super.OooO0OO(smartRefreshLayout, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO0o0(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        if (this.f20957OooOoOO) {
            return;
        }
        super.OooO0o0(oooOOO0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f21015OooO0o0 == OooO0O0.f42502OooO0o0) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20957OooOoOO = false;
        View.inflate(context, o0OO0o.OooO0O0.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(o0OO0o.OooO00o.srl_classics_arrow);
        this.f21018OooO0oo = imageView;
        ImageView imageView2 = (ImageView) findViewById(o0OO0o.OooO00o.srl_classics_progress);
        this.f21016OooO = imageView2;
        this.f21017OooO0oO = (TextView) findViewById(o0OO0o.OooO00o.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OO0o.OooO0o.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OO0o.OooO0o.ClassicsFooter_srlDrawableMarginRight, OooOOOO.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = o0OO0o.OooO0o.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = o0OO0o.OooO0o.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = o0OO0o.OooO0o.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f21025OooOOOo = typedArrayObtainStyledAttributes.getInt(o0OO0o.OooO0o.ClassicsFooter_srlFinishDuration, this.f21025OooOOOo);
        this.f21015OooO0o0 = OooO0O0.f42504OooO0oo[typedArrayObtainStyledAttributes.getInt(o0OO0o.OooO0o.ClassicsFooter_srlClassicsSpinnerStyle, this.f21015OooO0o0.f42505OooO00o)];
        int i4 = o0OO0o.OooO0o.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f21018OooO0oo.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f21018OooO0oo.getDrawable() == null) {
            oo0o0O0 oo0o0o0 = new oo0o0O0();
            this.f21020OooOO0O = oo0o0o0;
            oo0o0o0.OooO00o(-10066330);
            this.f21018OooO0oo.setImageDrawable(this.f21020OooOO0O);
        }
        int i5 = o0OO0o.OooO0o.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f21016OooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f21016OooO.getDrawable() == null) {
            o00O0OOO o00o0ooo2 = new o00O0OOO();
            this.f21021OooOO0o = o00o0ooo2;
            o00o0ooo2.OooO00o(-10066330);
            this.f21016OooO.setImageDrawable(this.f21021OooOO0o);
        }
        int i6 = o0OO0o.OooO0o.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f21017OooO0oO.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, OooOOOO.OooO0OO(16.0f)));
        }
        int i7 = o0OO0o.OooO0o.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            int color = typedArrayObtainStyledAttributes.getColor(i7, 0);
            this.f21022OooOOO = true;
            this.f21024OooOOOO = color;
            OooOO0O oooOO0O = this.f21019OooOO0;
            if (oooOO0O != null) {
                ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, color);
            }
        }
        int i8 = o0OO0o.OooO0o.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            OooOO0(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = o0OO0o.OooO0o.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f20952OooOo00 = typedArrayObtainStyledAttributes.getString(i9);
        } else {
            this.f20952OooOo00 = context.getString(OooO0OO.srl_footer_pulling);
        }
        int i10 = o0OO0o.OooO0o.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f20951OooOo0 = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f20951OooOo0 = context.getString(OooO0OO.srl_footer_release);
        }
        int i11 = o0OO0o.OooO0o.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f20953OooOo0O = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f20953OooOo0O = context.getString(OooO0OO.srl_footer_loading);
        }
        int i12 = o0OO0o.OooO0o.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f20954OooOo0o = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f20954OooOo0o = context.getString(OooO0OO.srl_footer_refreshing);
        }
        int i13 = o0OO0o.OooO0o.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f20950OooOo = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f20950OooOo = context.getString(OooO0OO.srl_footer_finish);
        }
        int i14 = o0OO0o.OooO0o.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f20956OooOoO0 = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f20956OooOoO0 = context.getString(OooO0OO.srl_footer_failed);
        }
        int i15 = o0OO0o.OooO0o.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f20955OooOoO = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f20955OooOoO = context.getString(OooO0OO.srl_footer_nothing);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f21017OooO0oO.setText(isInEditMode() ? this.f20953OooOo0O : this.f20952OooOo00);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
