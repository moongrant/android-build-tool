package com.scwang.smartrefresh.layout.internal;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import p334o0OO0oOO.OooOOO;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InternalClassics<T extends InternalClassics> extends InternalAbstract {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ImageView f21484OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f21485OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ImageView f21486OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0O f21487OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public p334o0OO0oOO.OooOO0O f21488OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOOO f21489OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f21490OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f21491OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f21492OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f21493OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f21494OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f21495OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f21496OooOOoo;

    public InternalClassics(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21493OooOOOo = 500;
        this.f21495OooOOo0 = 20;
        this.f21494OooOOo = 20;
        this.f21496OooOOoo = 0;
        this.f21483OooO0o0 = OooO0O0.f43237OooO0Oo;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO00o(@NonNull OooOO0O oooOO0O, int i, int i2) {
        this.f21487OooOO0 = oooOO0O;
        ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, this.f21492OooOOOO);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        ImageView imageView = this.f21484OooO;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f21493OooOOOo;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0o(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooO0oo(oooOOO0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public void OooO0oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        ImageView imageView = this.f21484OooO;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f21484OooO.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public void OooOO0(@ColorInt int i) {
        this.f21491OooOOO0 = true;
        this.f21485OooO0oO.setTextColor(i);
        p334o0OO0oOO.OooOO0O oooOO0O = this.f21488OooOO0O;
        if (oooOO0O != null) {
            oooOO0O.OooO00o(i);
            this.f21486OooO0oo.invalidateDrawable(this.f21488OooOO0O);
        }
        OooOOO oooOOO = this.f21489OooOO0o;
        if (oooOOO != null) {
            oooOOO.OooO00o(i);
            this.f21484OooO.invalidateDrawable(this.f21489OooOO0o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f21486OooO0oo;
        ImageView imageView2 = this.f21484OooO;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f21484OooO.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f21496OooOOoo == 0) {
            this.f21495OooOOo0 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f21494OooOOo = paddingBottom;
            if (this.f21495OooOOo0 == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iOooO0OO = this.f21495OooOOo0;
                if (iOooO0OO == 0) {
                    iOooO0OO = OooOo00.OooO0OO(20.0f);
                }
                this.f21495OooOOo0 = iOooO0OO;
                int iOooO0OO2 = this.f21494OooOOo;
                if (iOooO0OO2 == 0) {
                    iOooO0OO2 = OooOo00.OooO0OO(20.0f);
                }
                this.f21494OooOOo = iOooO0OO2;
                setPadding(paddingLeft, this.f21495OooOOo0, paddingRight, iOooO0OO2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f21496OooOOoo;
            if (size < i3) {
                int i4 = (size - i3) / 2;
                setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f21495OooOOo0, getPaddingRight(), this.f21494OooOOo);
        }
        super.onMeasure(i, i2);
        if (this.f21496OooOOoo == 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                if (this.f21496OooOOoo < measuredHeight) {
                    this.f21496OooOOoo = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f21490OooOOO) {
                int i = iArr[0];
                this.f21490OooOOO = true;
                this.f21492OooOOOO = i;
                OooOO0O oooOO0O = this.f21487OooOO0;
                if (oooOO0O != null) {
                    ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, i);
                }
                this.f21490OooOOO = false;
            }
            if (this.f21491OooOOO0) {
                return;
            }
            if (iArr.length > 1) {
                OooOO0(iArr[1]);
            } else {
                OooOO0(iArr[0] == -1 ? -10066330 : -1);
            }
            this.f21491OooOOO0 = false;
        }
    }
}
