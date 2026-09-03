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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p409o0Oo0Oo0.o0OoOo0;
import p410o0Oo0OoO.oO000o00;
import p410o0Oo0OoO.oO00O0o0;
import p411o0Oo0Ooo.oOo00OO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InternalClassics<T extends InternalClassics> extends InternalAbstract {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f19669Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public oO000o00 f19670OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView f19671OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView f19672OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public oO000Oo0 f19673OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public oO00O0o0 f19674OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f19675OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f19676OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f19677OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f19678OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f19679OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f19680Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f19681o000oOoO;

    public InternalClassics(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19677OoooOo0 = 500;
        this.f19678OoooOoO = 20;
        this.f19679OoooOoo = 20;
        this.f19680Ooooo00 = 0;
        this.f19667Oooo0oO = o0OoOo0.f39152OooO0Oo;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public void OooO(@NonNull oO000Oo oo000oo, int i, int i2) {
        ImageView imageView = this.f19671OoooO0;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f19671OoooO0.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NonNull oO000Oo oo000oo, int i, int i2) {
        OooO(oo000oo, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        ImageView imageView = this.f19671OoooO0;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f19677OoooOo0;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        this.f19673OoooO0O = oo000oo0;
        ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0OO(this, this.f19676OoooOOo);
    }

    public T OooOO0(@ColorInt int i) {
        this.f19681o000oOoO = true;
        this.f19669Oooo.setTextColor(i);
        oO000o00 oo000o00 = this.f19670OoooO;
        if (oo000o00 != null) {
            oo000o00.OooO00o(i);
            this.f19672OoooO00.invalidateDrawable(this.f19670OoooO);
        }
        oO00O0o0 oo00o0o0 = this.f19674OoooOO0;
        if (oo00o0o0 != null) {
            oo00o0o0.OooO00o(i);
            this.f19671OoooO0.invalidateDrawable(this.f19674OoooOO0);
        }
        return this;
    }

    public final T OooOO0O(@ColorInt int i) {
        this.f19675OoooOOO = true;
        this.f19676OoooOOo = i;
        oO000Oo0 oo000oo0 = this.f19673OoooO0O;
        if (oo000oo0 != null) {
            ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0OO(this, i);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f19672OoooO00;
        ImageView imageView2 = this.f19671OoooO0;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f19671OoooO0.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f19680Ooooo00 == 0) {
            this.f19678OoooOoO = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f19679OoooOoo = paddingBottom;
            if (this.f19678OoooOoO == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iOooO0OO = this.f19678OoooOoO;
                if (iOooO0OO == 0) {
                    iOooO0OO = oOo00OO0.OooO0OO(20.0f);
                }
                this.f19678OoooOoO = iOooO0OO;
                int iOooO0OO2 = this.f19679OoooOoo;
                if (iOooO0OO2 == 0) {
                    iOooO0OO2 = oOo00OO0.OooO0OO(20.0f);
                }
                this.f19679OoooOoo = iOooO0OO2;
                setPadding(paddingLeft, this.f19678OoooOoO, paddingRight, iOooO0OO2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f19680Ooooo00;
            if (size < i3) {
                int i4 = (size - i3) / 2;
                setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f19678OoooOoO, getPaddingRight(), this.f19679OoooOoo);
        }
        super.onMeasure(i, i2);
        if (this.f19680Ooooo00 == 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                if (this.f19680Ooooo00 < measuredHeight) {
                    this.f19680Ooooo00 = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f19675OoooOOO) {
                OooOO0O(iArr[0]);
                this.f19675OoooOOO = false;
            }
            if (this.f19681o000oOoO) {
                return;
            }
            if (iArr.length > 1) {
                OooOO0(iArr[1]);
            } else {
                OooOO0(iArr[0] == -1 ? -10066330 : -1);
            }
            this.f19681o000oOoO = false;
        }
    }
}
