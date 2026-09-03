package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f5107OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SeekBar f5108OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ColorStateList f5109OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f5110OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PorterDuff.Mode f5111OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f5112OooO0oo;

    public Oooo0(SeekBar seekBar) {
        super(seekBar);
        this.f5109OooO0o = null;
        this.f5111OooO0oO = null;
        this.f5112OooO0oo = false;
        this.f5107OooO = false;
        this.f5108OooO0Oo = seekBar;
    }

    @Override // androidx.appcompat.widget.OooOo
    public final void OooO00o(AttributeSet attributeSet, int i) {
        super.OooO00o(attributeSet, i);
        Context context = this.f5108OooO0Oo.getContext();
        int[] iArr = OooOo00.OooOOOO.AppCompatSeekBar;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context, attributeSet, iArr, i);
        SeekBar seekBar = this.f5108OooO0Oo;
        ViewCompat.OooOo0O(seekBar, seekBar.getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        Drawable drawableOooO0oo = o0000o0OooOOo.OooO0oo(OooOo00.OooOOOO.AppCompatSeekBar_android_thumb);
        if (drawableOooO0oo != null) {
            this.f5108OooO0Oo.setThumb(drawableOooO0oo);
        }
        Drawable drawableOooO0oO = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f5110OooO0o0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f5110OooO0o0 = drawableOooO0oO;
        if (drawableOooO0oO != null) {
            drawableOooO0oO.setCallback(this.f5108OooO0Oo);
            SeekBar seekBar2 = this.f5108OooO0Oo;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            p084o000Ooo.o0OOO0o.OooO0OO(drawableOooO0oO, ViewCompat.OooO.OooO0Oo(seekBar2));
            if (drawableOooO0oO.isStateful()) {
                drawableOooO0oO.setState(this.f5108OooO0Oo.getDrawableState());
            }
            OooO0OO();
        }
        this.f5108OooO0Oo.invalidate();
        int i2 = OooOo00.OooOOOO.AppCompatSeekBar_tickMarkTintMode;
        if (o0000o0OooOOo.OooOOOo(i2)) {
            this.f5111OooO0oO = o0ooOOo.OooO0Oo(o0000o0OooOOo.OooOO0(i2, -1), this.f5111OooO0oO);
            this.f5107OooO = true;
        }
        int i3 = OooOo00.OooOOOO.AppCompatSeekBar_tickMarkTint;
        if (o0000o0OooOOo.OooOOOo(i3)) {
            this.f5109OooO0o = o0000o0OooOOo.OooO0OO(i3);
            this.f5112OooO0oo = true;
        }
        o0000o0OooOOo.OooOOoo();
        OooO0OO();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f5110OooO0o0;
        if (drawable != null) {
            if (this.f5112OooO0oo || this.f5107OooO) {
                Drawable drawableOooO0o0 = p084o000Ooo.o0OOO0o.OooO0o0(drawable.mutate());
                this.f5110OooO0o0 = drawableOooO0o0;
                if (this.f5112OooO0oo) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, this.f5109OooO0o);
                }
                if (this.f5107OooO) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO(this.f5110OooO0o0, this.f5111OooO0oO);
                }
                if (this.f5110OooO0o0.isStateful()) {
                    this.f5110OooO0o0.setState(this.f5108OooO0Oo.getDrawableState());
                }
            }
        }
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.f5110OooO0o0 != null) {
            int max = this.f5108OooO0Oo.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5110OooO0o0.getIntrinsicWidth();
                int intrinsicHeight = this.f5110OooO0o0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5110OooO0o0.setBounds(-i, -i2, i, i2);
                float width = ((this.f5108OooO0Oo.getWidth() - this.f5108OooO0Oo.getPaddingLeft()) - this.f5108OooO0Oo.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f5108OooO0Oo.getPaddingLeft(), this.f5108OooO0Oo.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5110OooO0o0.draw(canvas);
                    canvas.translate(width, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
