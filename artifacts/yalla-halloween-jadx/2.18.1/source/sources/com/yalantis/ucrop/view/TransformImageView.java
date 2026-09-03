package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.UCropActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p078o000Oo00.OooO;
import p168o00Ooo0.OooOo;
import p454o0Ooo0.OooOO0;
import p454o0Ooo0.OooOO0O;
import p552o0oOO0Oo.o000O0o;
import p583o0oOoOoo.m3;

/* JADX INFO: loaded from: classes2.dex */
public class TransformImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float[] f20422Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20423OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final float[] f20424OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float[] f20425OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Matrix f20426OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f20427OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float[] f20428OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float[] f20429OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f20430OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f20431OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20432OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Uri f20433Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Uri f20434Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public m3 f20435OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o000O0o f20436OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO00o f20437o000oOoO;

    public interface OooO00o {
    }

    public TransformImageView(Context context) {
        this(context, null);
    }

    public final void OooO(float f, float f2) {
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        this.f20426OoooO0O.postTranslate(f, f2);
        setImageMatrix(this.f20426OoooO0O);
    }

    public final float OooO0OO(@NonNull Matrix matrix) {
        matrix.getValues(this.f20424OoooO0);
        float[] fArr = this.f20424OoooO0;
        double d = fArr[1];
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(d, this.f20424OoooO0[0]) * 57.29577951308232d));
    }

    public final float OooO0Oo(@NonNull Matrix matrix) {
        matrix.getValues(this.f20424OoooO0);
        double dPow = Math.pow(this.f20424OoooO0[0], 2.0d);
        matrix.getValues(this.f20424OoooO0);
        return (float) Math.sqrt(Math.pow(this.f20424OoooO0[3], 2.0d) + dPow);
    }

    public void OooO0o() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, intrinsicWidth, intrinsicHeight);
        this.f20428OoooOOO = OooOo.OooO0OO(rectF);
        this.f20429OoooOOo = new float[]{rectF.centerX(), rectF.centerY()};
        this.f20431OoooOoO = true;
        OooO00o oooO00o = this.f20437o000oOoO;
        if (oooO00o != null) {
            UCropActivity.OooO0O0 oooO0O0 = (UCropActivity.OooO0O0) oooO00o;
            UCropActivity.this.f20306OoooOOO.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.f20319Ooooooo.setClickable(!uCropActivity.OooOOOo());
            UCropActivity.this.supportInvalidateOptionsMenu();
        }
    }

    public void OooO0o0() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void OooO0oO(float f, float f2, float f3) {
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20426OoooO0O.postRotate(f, f2, f3);
            setImageMatrix(this.f20426OoooO0O);
            OooO00o oooO00o = this.f20437o000oOoO;
            if (oooO00o != null) {
                ((UCropActivity.OooO0O0) oooO00o).OooO00o(OooO0OO(this.f20426OoooO0O));
            }
        }
    }

    public void OooO0oo(float f, float f2, float f3) {
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20426OoooO0O.postScale(f, f, f2, f3);
            setImageMatrix(this.f20426OoooO0O);
            OooO00o oooO00o = this.f20437o000oOoO;
            if (oooO00o != null) {
                ((UCropActivity.OooO0O0) oooO00o).OooO0O0(OooO0Oo(this.f20426OoooO0O));
            }
        }
    }

    public float getCurrentAngle() {
        return OooO0OO(this.f20426OoooO0O);
    }

    public float getCurrentScale() {
        return OooO0Oo(this.f20426OoooO0O);
    }

    public m3 getExifInfo() {
        return this.f20435OooooO0;
    }

    public Uri getImageInputPath() {
        return this.f20433Ooooo00;
    }

    public Uri getImageOutputPath() {
        return this.f20434Ooooo0o;
    }

    public int getMaxBitmapSize() {
        int iOooO00o;
        if (this.f20432OoooOoo <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i = point.x;
            int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i, 2.0d));
            Canvas canvas = new Canvas();
            int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (iMin > 0) {
                iSqrt = Math.min(iSqrt, iMin);
            }
            try {
                iOooO00o = OooOO0.OooO00o();
            } catch (Exception e) {
                Log.d("EglUtils", "getMaxTextureSize: ", e);
                iOooO00o = 0;
            }
            if (iOooO00o > 0) {
                iSqrt = Math.min(iSqrt, iOooO00o);
            }
            OooO.OooO00o("maxBitmapSize: ", iSqrt, "BitmapLoadUtils");
            this.f20432OoooOoo = iSqrt;
        }
        return this.f20432OoooOoo;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof OooOO0O)) {
            return null;
        }
        return ((OooOO0O) getDrawable()).f40358OooO0O0;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f20430OoooOo0 && !this.f20431OoooOoO)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f20423OoooO = width - paddingLeft;
            this.f20427OoooOO0 = height - paddingTop;
            OooO0o();
        }
    }

    public void setBitmapLoadCallback(o000O0o o000o0o2) {
        this.f20436OooooOO = o000o0o2;
    }

    public void setFailure(@NonNull Exception exc) {
        Log.e("TransformImageView", "onFailure: setImageUri", exc);
        OooO00o oooO00o = this.f20437o000oOoO;
        if (oooO00o != null) {
            UCropActivity.this.OooOo0(exc);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new OooOO0O(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f20426OoooO0O.set(matrix);
        this.f20426OoooO0O.mapPoints(this.f20422Oooo, this.f20428OoooOOO);
        this.f20426OoooO0O.mapPoints(this.f20425OoooO00, this.f20429OoooOOo);
    }

    public void setMaxBitmapSize(int i) {
        this.f20432OoooOoo = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(OooO00o oooO00o) {
        this.f20437o000oOoO = oooO00o;
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20422Oooo = new float[8];
        this.f20425OoooO00 = new float[2];
        this.f20424OoooO0 = new float[9];
        this.f20426OoooO0O = new Matrix();
        this.f20430OoooOo0 = false;
        this.f20431OoooOoO = false;
        this.f20432OoooOoo = 0;
        OooO0o0();
    }
}
