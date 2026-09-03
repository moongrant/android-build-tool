package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o00000O;
import com.yalantis.ucrop.UCropActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p167o00Ooo.OooOO0;
import p168o00Ooo0.OooOo;
import p460o0Ooo0O0.o0000O0;
import p552o0oOO0Oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class CropImageView extends TransformImageView {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final RectF f20352OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f20353Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final Matrix f20354Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f20355OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o000Oo0 f20356Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f20357o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f20358o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f20359o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f20360o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public long f20361o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooO00o f20362o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public OooO0O0 f20363ooOO;

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final float f20364Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final WeakReference<CropImageView> f20365Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final long f20366Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final long f20367Oooo0oo = System.currentTimeMillis();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final float f20368OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final float f20369OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final float f20370OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final float f20371OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final float f20372OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final boolean f20373o000oOoO;

        public OooO00o(CropImageView cropImageView, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f20365Oooo0o = new WeakReference<>(cropImageView);
            this.f20366Oooo0oO = j;
            this.f20364Oooo = f;
            this.f20370OoooO00 = f2;
            this.f20369OoooO0 = f3;
            this.f20371OoooO0O = f4;
            this.f20368OoooO = f5;
            this.f20372OoooOO0 = f6;
            this.f20373o000oOoO = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CropImageView cropImageView = this.f20365Oooo0o.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f20366Oooo0oO, System.currentTimeMillis() - this.f20367Oooo0oo);
            float f = this.f20369OoooO0;
            float f2 = this.f20366Oooo0oO;
            float f3 = (fMin / f2) - 1.0f;
            float f4 = (f3 * f3 * f3) + 1.0f;
            float f5 = (f * f4) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f6 = (f4 * this.f20371OoooO0O) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float fOooO00o = o00000O.OooO00o(fMin, this.f20372OoooOO0, f2);
            if (fMin < this.f20366Oooo0oO) {
                float[] fArr = cropImageView.f20425OoooO00;
                cropImageView.OooO(f5 - (fArr[0] - this.f20364Oooo), f6 - (fArr[1] - this.f20370OoooO00));
                if (!this.f20373o000oOoO) {
                    cropImageView.OooOOO(this.f20368OoooO + fOooO00o, cropImageView.f20352OooooOo.centerX(), cropImageView.f20352OooooOo.centerY());
                }
                if (cropImageView.OooOO0o(cropImageView.f20422Oooo)) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final float f20374Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final WeakReference<CropImageView> f20375Oooo0o;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final float f20378OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final float f20379OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final float f20380OoooO0O;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final long f20377Oooo0oo = System.currentTimeMillis();

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final long f20376Oooo0oO = 200;

        public OooO0O0(CropImageView cropImageView, float f, float f2, float f3, float f4) {
            this.f20375Oooo0o = new WeakReference<>(cropImageView);
            this.f20374Oooo = f;
            this.f20379OoooO00 = f2;
            this.f20378OoooO0 = f3;
            this.f20380OoooO0O = f4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CropImageView cropImageView = this.f20375Oooo0o.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.f20376Oooo0oO, System.currentTimeMillis() - this.f20377Oooo0oo);
            float fOooO00o = o00000O.OooO00o(fMin, this.f20379OoooO00, this.f20376Oooo0oO);
            if (fMin >= this.f20376Oooo0oO) {
                cropImageView.setImageToWrapCropBounds(true);
            } else {
                cropImageView.OooOOO(this.f20374Oooo + fOooO00o, this.f20378OoooO0, this.f20380OoooO0O);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public final void OooO0o() {
        super.OooO0o();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f20353Oooooo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20353Oooooo = intrinsicWidth / intrinsicHeight;
        }
        int i = this.f20423OoooO;
        float f = this.f20353Oooooo;
        int i2 = (int) (i / f);
        int i3 = this.f20427OoooOO0;
        if (i2 > i3) {
            int i4 = (int) (i3 * f);
            int i5 = (i - i4) / 2;
            this.f20352OooooOo.set(i5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i4 + i5, i3);
        } else {
            int i6 = (i3 - i2) / 2;
            this.f20352OooooOo.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i6, i, i2 + i6);
        }
        OooOO0(intrinsicWidth, intrinsicHeight);
        float fWidth = this.f20352OooooOo.width();
        float fHeight = this.f20352OooooOo.height();
        float fMax = Math.max(this.f20352OooooOo.width() / intrinsicWidth, this.f20352OooooOo.height() / intrinsicHeight);
        float fOooO00o = OooOO0.OooO00o(intrinsicWidth, fMax, fWidth, 2.0f);
        RectF rectF = this.f20352OooooOo;
        float f2 = fOooO00o + rectF.left;
        float fOooO00o2 = OooOO0.OooO00o(intrinsicHeight, fMax, fHeight, 2.0f) + rectF.top;
        this.f20426OoooO0O.reset();
        this.f20426OoooO0O.postScale(fMax, fMax);
        this.f20426OoooO0O.postTranslate(f2, fOooO00o2);
        setImageMatrix(this.f20426OoooO0O);
        o000Oo0 o000oo1 = this.f20356Ooooooo;
        if (o000oo1 != null) {
            ((o0000O0) o000oo1).f40438OooO00o.f20439Oooo0oO.setTargetAspectRatio(this.f20353Oooooo);
        }
        TransformImageView.OooO00o oooO00o = this.f20437o000oOoO;
        if (oooO00o != null) {
            ((UCropActivity.OooO0O0) oooO00o).OooO0O0(getCurrentScale());
            ((UCropActivity.OooO0O0) this.f20437o000oOoO).OooO00o(getCurrentAngle());
        }
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public final void OooO0oo(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.OooO0oo(f, f2, f3);
        } else {
            if (f >= 1.0f || getCurrentScale() * f < getMinScale()) {
                return;
            }
            super.OooO0oo(f, f2, f3);
        }
    }

    public final void OooOO0(float f, float f2) {
        float fMin = Math.min(Math.min(this.f20352OooooOo.width() / f, this.f20352OooooOo.width() / f2), Math.min(this.f20352OooooOo.height() / f2, this.f20352OooooOo.height() / f));
        this.f20358o00Oo0 = fMin;
        this.f20357o00O0O = fMin * this.f20355OoooooO;
    }

    public final void OooOO0O() {
        removeCallbacks(this.f20362o0OoOo0);
        removeCallbacks(this.f20363ooOO);
    }

    public final boolean OooOO0o(float[] fArr) {
        this.f20354Oooooo0.reset();
        this.f20354Oooooo0.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.f20354Oooooo0.mapPoints(fArrCopyOf);
        float[] fArrOooO0OO = OooOo.OooO0OO(this.f20352OooooOo);
        this.f20354Oooooo0.mapPoints(fArrOooO0OO);
        return OooOo.OooO0oo(fArrCopyOf).contains(OooOo.OooO0oo(fArrOooO0OO));
    }

    public final void OooOOO(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            OooO0oo(f / getCurrentScale(), f2, f3);
        }
    }

    public final void OooOOO0(float f) {
        OooO0oO(f, this.f20352OooooOo.centerX(), this.f20352OooooOo.centerY());
    }

    @Nullable
    public o000Oo0 getCropBoundsChangeListener() {
        return this.f20356Ooooooo;
    }

    public float getMaxScale() {
        return this.f20357o00O0O;
    }

    public float getMinScale() {
        return this.f20358o00Oo0;
    }

    public float getTargetAspectRatio() {
        return this.f20353Oooooo;
    }

    public void setCropBoundsChangeListener(@Nullable o000Oo0 o000oo1) {
        this.f20356Ooooooo = o000oo1;
    }

    public void setCropRect(RectF rectF) {
        this.f20353Oooooo = rectF.width() / rectF.height();
        this.f20352OooooOo.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        Drawable drawable = getDrawable();
        if (drawable != null) {
            OooOO0(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float fMax;
        float f3;
        if (!this.f20431OoooOoO || OooOO0o(this.f20422Oooo)) {
            return;
        }
        float[] fArr = this.f20425OoooO00;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.f20352OooooOo.centerX() - f4;
        float fCenterY = this.f20352OooooOo.centerY() - f5;
        this.f20354Oooooo0.reset();
        this.f20354Oooooo0.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.f20422Oooo;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f20354Oooooo0.mapPoints(fArrCopyOf);
        boolean zOooOO0o = OooOO0o(fArrCopyOf);
        if (zOooOO0o) {
            this.f20354Oooooo0.reset();
            this.f20354Oooooo0.setRotate(-getCurrentAngle());
            float[] fArr3 = this.f20422Oooo;
            float[] fArrCopyOf2 = Arrays.copyOf(fArr3, fArr3.length);
            float[] fArrOooO0OO = OooOo.OooO0OO(this.f20352OooooOo);
            this.f20354Oooooo0.mapPoints(fArrCopyOf2);
            this.f20354Oooooo0.mapPoints(fArrOooO0OO);
            RectF rectFOooO0oo = OooOo.OooO0oo(fArrCopyOf2);
            RectF rectFOooO0oo2 = OooOo.OooO0oo(fArrOooO0OO);
            float f6 = rectFOooO0oo.left - rectFOooO0oo2.left;
            float f7 = rectFOooO0oo.top - rectFOooO0oo2.top;
            float f8 = rectFOooO0oo.right - rectFOooO0oo2.right;
            float f9 = rectFOooO0oo.bottom - rectFOooO0oo2.bottom;
            float[] fArr4 = new float[4];
            if (f6 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            fArr4[0] = f6;
            if (f7 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            fArr4[1] = f7;
            if (f8 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            fArr4[2] = f8;
            if (f9 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f9 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            fArr4[3] = f9;
            this.f20354Oooooo0.reset();
            this.f20354Oooooo0.setRotate(getCurrentAngle());
            this.f20354Oooooo0.mapPoints(fArr4);
            f2 = -(fArr4[0] + fArr4[2]);
            f3 = -(fArr4[1] + fArr4[3]);
            f = currentScale;
            fMax = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            RectF rectF = new RectF(this.f20352OooooOo);
            this.f20354Oooooo0.reset();
            this.f20354Oooooo0.setRotate(getCurrentAngle());
            this.f20354Oooooo0.mapRect(rectF);
            float[] fArr5 = this.f20422Oooo;
            f = currentScale;
            float[] fArr6 = {(float) Math.sqrt(Math.pow(fArr5[1] - fArr5[3], 2.0d) + Math.pow(fArr5[0] - fArr5[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr5[3] - fArr5[5], 2.0d) + Math.pow(fArr5[2] - fArr5[4], 2.0d))};
            f2 = fCenterX;
            fMax = (Math.max(rectF.width() / fArr6[0], rectF.height() / fArr6[1]) * f) - f;
            f3 = fCenterY;
        }
        if (z) {
            OooO00o oooO00o = new OooO00o(this, this.f20361o00ooo, f4, f5, f2, f3, f, fMax, zOooOO0o);
            this.f20362o0OoOo0 = oooO00o;
            post(oooO00o);
        } else {
            OooO(f2, f3);
            if (zOooOO0o) {
                return;
            }
            OooOOO(f + fMax, this.f20352OooooOo.centerX(), this.f20352OooooOo.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.f20361o00ooo = j;
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.f20359o00Ooo = i;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.f20360o00o0O = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f20355OoooooO = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f20353Oooooo = f;
            return;
        }
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20353Oooooo = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.f20353Oooooo = f;
        }
        o000Oo0 o000oo1 = this.f20356Ooooooo;
        if (o000oo1 != null) {
            ((o0000O0) o000oo1).f40438OooO00o.f20439Oooo0oO.setTargetAspectRatio(this.f20353Oooooo);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20352OooooOo = new RectF();
        this.f20354Oooooo0 = new Matrix();
        this.f20355OoooooO = 10.0f;
        this.f20363ooOO = null;
        this.f20359o00Ooo = 0;
        this.f20360o00o0O = 0;
        this.f20361o00ooo = 500L;
    }
}
