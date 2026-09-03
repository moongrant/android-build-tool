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
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooOO0O;
import o0OO0oO0.OooOOO0;
import p339o0OO0oo0.OooOOOO;
import p392o0OOoooO.o00O0O0O;
import p392o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalClassics<T extends InternalClassics> extends InternalAbstract {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ImageView f21011OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f21012OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ImageView f21013OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0O f21014OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00O0O0O f21015OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public oo0o0O0 f21016OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f21017OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f21018OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f21019OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f21020OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f21021OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f21022OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f21023OooOOoo;

    public InternalClassics(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21020OooOOOo = 500;
        this.f21022OooOOo0 = 20;
        this.f21021OooOOo = 20;
        this.f21023OooOOoo = 0;
        this.f21010OooO0o0 = OooO0O0.f42504OooO0Oo;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        ImageView imageView = this.f21011OooO;
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
        return this.f21020OooOOOo;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO0Oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooO0o0(oooOOO0, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public void OooO0o0(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        ImageView imageView = this.f21011OooO;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f21011OooO.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO0oo(@NonNull SmartRefreshLayout.OooOOO oooOOO, int i, int i2) {
        this.f21014OooOO0 = oooOOO;
        oooOOO.OooO0OO(this, this.f21019OooOOOO);
    }

    public void OooOO0(@ColorInt int i) {
        this.f21018OooOOO0 = true;
        this.f21012OooO0oO.setTextColor(i);
        o00O0O0O o00o0o0o2 = this.f21015OooOO0O;
        if (o00o0o0o2 != null) {
            o00o0o0o2.OooO00o(i);
            this.f21013OooO0oo.invalidateDrawable(this.f21015OooOO0O);
        }
        oo0o0O0 oo0o0o0 = this.f21016OooOO0o;
        if (oo0o0o0 != null) {
            oo0o0o0.OooO00o(i);
            this.f21011OooO.invalidateDrawable(this.f21016OooOO0o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f21013OooO0oo;
        ImageView imageView2 = this.f21011OooO;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f21011OooO.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f21023OooOOoo == 0) {
            this.f21022OooOOo0 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f21021OooOOo = paddingBottom;
            if (this.f21022OooOOo0 == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iOooO0OO = this.f21022OooOOo0;
                if (iOooO0OO == 0) {
                    iOooO0OO = OooOOOO.OooO0OO(20.0f);
                }
                this.f21022OooOOo0 = iOooO0OO;
                int iOooO0OO2 = this.f21021OooOOo;
                if (iOooO0OO2 == 0) {
                    iOooO0OO2 = OooOOOO.OooO0OO(20.0f);
                }
                this.f21021OooOOo = iOooO0OO2;
                setPadding(paddingLeft, this.f21022OooOOo0, paddingRight, iOooO0OO2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f21023OooOOoo;
            if (size < i3) {
                int i4 = (size - i3) / 2;
                setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f21022OooOOo0, getPaddingRight(), this.f21021OooOOo);
        }
        super.onMeasure(i, i2);
        if (this.f21023OooOOoo == 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                if (this.f21023OooOOoo < measuredHeight) {
                    this.f21023OooOOoo = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f21017OooOOO) {
                int i = iArr[0];
                this.f21017OooOOO = true;
                this.f21019OooOOOO = i;
                OooOO0O oooOO0O = this.f21014OooOO0;
                if (oooOO0O != null) {
                    ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0OO(this, i);
                }
                this.f21017OooOOO = false;
            }
            if (this.f21018OooOOO0) {
                return;
            }
            if (iArr.length > 1) {
                OooOO0(iArr[1]);
            } else {
                OooOO0(iArr[0] == -1 ? -10066330 : -1);
            }
            this.f21018OooOOO0 = false;
        }
    }
}
