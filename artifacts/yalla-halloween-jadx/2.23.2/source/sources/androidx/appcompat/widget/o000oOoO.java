package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f3326OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SeekBar f3327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ColorStateList f3328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f3329OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PorterDuff.Mode f3330OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f3331OooO0oo;

    public o000oOoO(SeekBar seekBar) {
        super(seekBar);
        this.f3328OooO0o = null;
        this.f3330OooO0oO = null;
        this.f3331OooO0oo = false;
        this.f3326OooO = false;
        this.f3327OooO0Oo = seekBar;
    }

    @Override // androidx.appcompat.widget.Oooo000
    public final void OooO00o(AttributeSet attributeSet, int i) {
        super.OooO00o(attributeSet, i);
        SeekBar seekBar = this.f3327OooO0Oo;
        Context context = seekBar.getContext();
        int[] iArr = p012OooOo0O.o00O0O.AppCompatSeekBar;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context, attributeSet, iArr, i);
        ViewCompat.OooOOO(seekBar, seekBar.getContext(), iArr, attributeSet, o000oo0OooOOO0.f3324OooO0O0, i, 0);
        Drawable drawableOooO0o = o000oo0OooOOO0.OooO0o(p012OooOo0O.o00O0O.AppCompatSeekBar_android_thumb);
        if (drawableOooO0o != null) {
            seekBar.setThumb(drawableOooO0o);
        }
        Drawable drawableOooO0o0 = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f3329OooO0o0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3329OooO0o0 = drawableOooO0o0;
        if (drawableOooO0o0 != null) {
            drawableOooO0o0.setCallback(seekBar);
            o00000oo.o00Ooo.OooO0OO.OooO0O0(drawableOooO0o0, ViewCompat.OooO.OooO0Oo(seekBar));
            if (drawableOooO0o0.isStateful()) {
                drawableOooO0o0.setState(seekBar.getDrawableState());
            }
            OooO0OO();
        }
        seekBar.invalidate();
        int i2 = p012OooOo0O.o00O0O.AppCompatSeekBar_tickMarkTintMode;
        if (o000oo0OooOOO0.OooOO0o(i2)) {
            this.f3330OooO0oO = o000000.OooO0OO(o000oo0OooOOO0.OooO0oo(i2, -1), this.f3330OooO0oO);
            this.f3326OooO = true;
        }
        int i3 = p012OooOo0O.o00O0O.AppCompatSeekBar_tickMarkTint;
        if (o000oo0OooOOO0.OooOO0o(i3)) {
            this.f3328OooO0o = o000oo0OooOOO0.OooO0O0(i3);
            this.f3331OooO0oo = true;
        }
        o000oo0OooOOO0.OooOOO();
        OooO0OO();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f3329OooO0o0;
        if (drawable != null) {
            if (this.f3331OooO0oo || this.f3326OooO) {
                Drawable drawableMutate = drawable.mutate();
                this.f3329OooO0o0 = drawableMutate;
                if (this.f3331OooO0oo) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f3328OooO0o);
                }
                if (this.f3326OooO) {
                    o00000oo.o00Ooo.OooO0O0.OooO(this.f3329OooO0o0, this.f3330OooO0oO);
                }
                if (this.f3329OooO0o0.isStateful()) {
                    this.f3329OooO0o0.setState(this.f3327OooO0Oo.getDrawableState());
                }
            }
        }
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.f3329OooO0o0 != null) {
            SeekBar seekBar = this.f3327OooO0Oo;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3329OooO0o0.getIntrinsicWidth();
                int intrinsicHeight = this.f3329OooO0o0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3329OooO0o0.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3329OooO0o0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
