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
import o0OO0o.OooO0o;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p333o0OO0o0o.OooOO0;
import p333o0OO0o0o.OooOO0O;
import p333o0OO0o0o.OooOOO;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f21418OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final String f21419OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final String f21420OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final String f21421OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f21422OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f21423OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f21424OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f21425OooOoOO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21426OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f21426OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21426OooO00o[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21426OooO00o[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21426OooO00o[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21426OooO00o[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21426OooO00o[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooO0o
    public final boolean OooO0O0(boolean z) {
        if (this.f21425OooOoOO == z) {
            return true;
        }
        this.f21425OooOoOO = z;
        ImageView imageView = this.f21486OooO0oo;
        if (z) {
            this.f21485OooO0oO.setText(this.f21423OooOoO);
            imageView.setVisibility(8);
            return true;
        }
        this.f21485OooO0oO.setText(this.f21420OooOo00);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f21486OooO0oo;
        if (this.f21425OooOoOO) {
            return;
        }
        switch (OooO00o.f21426OooO00o[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f21485OooO0oO.setText(this.f21421OooOo0O);
                return;
            case 5:
                this.f21485OooO0oO.setText(this.f21419OooOo0);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f21485OooO0oO.setText(this.f21422OooOo0o);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f21485OooO0oO.setText(this.f21420OooOo00);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        if (this.f21425OooOoOO) {
            return 0;
        }
        this.f21485OooO0oO.setText(z ? this.f21418OooOo : this.f21424OooOoO0);
        return super.OooO0Oo(smartRefreshLayout, z);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        if (this.f21425OooOoOO) {
            return;
        }
        super.OooO0oo(oooOOO0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f21483OooO0o0 == OooO0O0.f43239OooO0o0) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21425OooOoOO = false;
        View.inflate(context, OooOO0O.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(OooOO0.srl_classics_arrow);
        this.f21486OooO0oo = imageView;
        ImageView imageView2 = (ImageView) findViewById(OooOO0.srl_classics_progress);
        this.f21484OooO = imageView2;
        this.f21485OooO0oO = (TextView) findViewById(OooOO0.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOO.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOOO.ClassicsFooter_srlDrawableMarginRight, OooOo00.OooO0OO(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i = OooOOO.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams.height);
        int i2 = OooOOO.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = OooOOO.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams2.height);
        this.f21493OooOOOo = typedArrayObtainStyledAttributes.getInt(OooOOO.ClassicsFooter_srlFinishDuration, this.f21493OooOOOo);
        this.f21483OooO0o0 = OooO0O0.f43241OooO0oo[typedArrayObtainStyledAttributes.getInt(OooOOO.ClassicsFooter_srlClassicsSpinnerStyle, this.f21483OooO0o0.f43242OooO00o)];
        int i4 = OooOOO.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f21486OooO0oo.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else if (this.f21486OooO0oo.getDrawable() == null) {
            p334o0OO0oOO.OooOO0O oooOO0O = new p334o0OO0oOO.OooOO0O();
            this.f21488OooOO0O = oooOO0O;
            oooOO0O.OooO00o(-10066330);
            this.f21486OooO0oo.setImageDrawable(this.f21488OooOO0O);
        }
        int i5 = OooOOO.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f21484OooO.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else if (this.f21484OooO.getDrawable() == null) {
            p334o0OO0oOO.OooOOO oooOOO = new p334o0OO0oOO.OooOOO();
            this.f21489OooOO0o = oooOOO;
            oooOOO.OooO00o(-10066330);
            this.f21484OooO.setImageDrawable(this.f21489OooOO0o);
        }
        int i6 = OooOOO.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.f21485OooO0oO.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, OooOo00.OooO0OO(16.0f)));
        }
        int i7 = OooOOO.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            int color = typedArrayObtainStyledAttributes.getColor(i7, 0);
            this.f21490OooOOO = true;
            this.f21492OooOOOO = color;
            o0OO0o.OooOO0O oooOO0O2 = this.f21487OooOO0;
            if (oooOO0O2 != null) {
                ((SmartRefreshLayout.OooOOO) oooOO0O2).OooO0OO(this, color);
            }
        }
        int i8 = OooOOO.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            OooOO0(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = OooOOO.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f21420OooOo00 = typedArrayObtainStyledAttributes.getString(i9);
        } else {
            this.f21420OooOo00 = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_pulling);
        }
        int i10 = OooOOO.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f21419OooOo0 = typedArrayObtainStyledAttributes.getString(i10);
        } else {
            this.f21419OooOo0 = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_release);
        }
        int i11 = OooOOO.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f21421OooOo0O = typedArrayObtainStyledAttributes.getString(i11);
        } else {
            this.f21421OooOo0O = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_loading);
        }
        int i12 = OooOOO.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f21422OooOo0o = typedArrayObtainStyledAttributes.getString(i12);
        } else {
            this.f21422OooOo0o = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_refreshing);
        }
        int i13 = OooOOO.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f21418OooOo = typedArrayObtainStyledAttributes.getString(i13);
        } else {
            this.f21418OooOo = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_finish);
        }
        int i14 = OooOOO.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f21424OooOoO0 = typedArrayObtainStyledAttributes.getString(i14);
        } else {
            this.f21424OooOoO0 = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_failed);
        }
        int i15 = OooOOO.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f21423OooOoO = typedArrayObtainStyledAttributes.getString(i15);
        } else {
            this.f21423OooOoO = context.getString(p333o0OO0o0o.OooOOO0.srl_footer_nothing);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f21485OooO0oO.setText(isInEditMode() ? this.f21421OooOo0O : this.f21420OooOo00);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
