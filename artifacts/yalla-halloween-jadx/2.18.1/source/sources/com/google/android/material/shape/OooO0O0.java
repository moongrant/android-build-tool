package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.BitSet;
import java.util.Objects;
import p347o0OOO0o0.o0OO00O;
import p347o0OOO0o0.o0OOO0o;
import p347o0OOO0o0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO[] f17580OooO00o = new OooO0OO[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix[] f17581OooO0O0 = new Matrix[4];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix[] f17582OooO0OO = new Matrix[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f17583OooO0Oo = new PointF();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Path f17585OooO0o0 = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f17584OooO0o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f17586OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f17587OooO0oo = new float[2];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f17579OooO = new float[2];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f17588OooOO0 = new Path();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Path f17589OooOO0O = new Path();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f17590OooOO0o = true;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f17591OooO00o = new OooO0O0();
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface InterfaceC0111OooO0O0 {
    }

    public OooO0O0() {
        for (int i = 0; i < 4; i++) {
            this.f17580OooO00o[i] = new OooO0OO();
            this.f17581OooO0O0[i] = new Matrix();
            this.f17582OooO0OO[i] = new Matrix();
        }
    }

    public final void OooO00o(com.google.android.material.shape.OooO00o oooO00o, float f, RectF rectF, @NonNull Path path) {
        OooO0O0(oooO00o, f, rectF, null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0O0(com.google.android.material.shape.OooO00o oooO00o, float f, RectF rectF, InterfaceC0111OooO0O0 interfaceC0111OooO0O0, @NonNull Path path) {
        int i;
        o0OO00O o0oo00o2;
        o0ooOOo o0ooooo2;
        o0OOO0o o0ooo0o2;
        path.rewind();
        this.f17585OooO0o0.rewind();
        this.f17584OooO0o.rewind();
        this.f17584OooO0o.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                o0ooooo2 = oooO00o.f17562OooO0oO;
            } else if (i2 != 2) {
                o0ooooo2 = i2 != 3 ? oooO00o.f17560OooO0o : oooO00o.f17561OooO0o0;
            } else {
                o0ooooo2 = oooO00o.f17563OooO0oo;
            }
            if (i2 == 1) {
                o0ooo0o2 = oooO00o.f17558OooO0OO;
            } else if (i2 != 2) {
                o0ooo0o2 = i2 != 3 ? oooO00o.f17557OooO0O0 : oooO00o.f17556OooO00o;
            } else {
                o0ooo0o2 = oooO00o.f17559OooO0Oo;
            }
            OooO0OO oooO0OO = this.f17580OooO00o[i2];
            Objects.requireNonNull(o0ooo0o2);
            o0ooo0o2.OooO00o(oooO0OO, f, o0ooooo2.OooO00o(rectF));
            int i3 = i2 + 1;
            float f2 = i3 * 90;
            this.f17581OooO0O0[i2].reset();
            PointF pointF = this.f17583OooO0Oo;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.f17581OooO0O0[i2];
            PointF pointF2 = this.f17583OooO0Oo;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f17581OooO0O0[i2].preRotate(f2);
            float[] fArr = this.f17587OooO0oo;
            OooO0OO[] oooO0OOArr = this.f17580OooO00o;
            fArr[0] = oooO0OOArr[i2].f17594OooO0OO;
            fArr[1] = oooO0OOArr[i2].f17595OooO0Oo;
            this.f17581OooO0O0[i2].mapPoints(fArr);
            this.f17582OooO0OO[i2].reset();
            Matrix matrix2 = this.f17582OooO0OO[i2];
            float[] fArr2 = this.f17587OooO0oo;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f17582OooO0OO[i2].preRotate(f2);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr3 = this.f17587OooO0oo;
            OooO0OO[] oooO0OOArr2 = this.f17580OooO00o;
            fArr3[0] = oooO0OOArr2[i4].f17592OooO00o;
            fArr3[1] = oooO0OOArr2[i4].f17593OooO0O0;
            this.f17581OooO0O0[i4].mapPoints(fArr3);
            if (i4 == 0) {
                float[] fArr4 = this.f17587OooO0oo;
                path.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f17587OooO0oo;
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f17580OooO00o[i4].OooO0OO(this.f17581OooO0O0[i4], path);
            if (interfaceC0111OooO0O0 != null) {
                OooO0OO oooO0OO2 = this.f17580OooO00o[i4];
                Matrix matrix3 = this.f17581OooO0O0[i4];
                MaterialShapeDrawable.OooO00o oooO00o2 = (MaterialShapeDrawable.OooO00o) interfaceC0111OooO0O0;
                BitSet bitSet = MaterialShapeDrawable.this.f17509Oooo;
                Objects.requireNonNull(oooO0OO2);
                bitSet.set(i4, false);
                MaterialShapeDrawable.this.f17511Oooo0oO[i4] = oooO0OO2.OooO0Oo(matrix3);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f17587OooO0oo;
            OooO0OO[] oooO0OOArr3 = this.f17580OooO00o;
            fArr6[0] = oooO0OOArr3[i4].f17594OooO0OO;
            fArr6[1] = oooO0OOArr3[i4].f17595OooO0Oo;
            this.f17581OooO0O0[i4].mapPoints(fArr6);
            float[] fArr7 = this.f17579OooO;
            OooO0OO[] oooO0OOArr4 = this.f17580OooO00o;
            fArr7[0] = oooO0OOArr4[i6].f17592OooO00o;
            fArr7[1] = oooO0OOArr4[i6].f17593OooO0O0;
            this.f17581OooO0O0[i6].mapPoints(fArr7);
            float[] fArr8 = this.f17587OooO0oo;
            float f3 = fArr8[0];
            float[] fArr9 = this.f17579OooO;
            float fMax = Math.max(((float) Math.hypot(f3 - fArr9[0], fArr8[1] - fArr9[1])) - 0.001f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float[] fArr10 = this.f17587OooO0oo;
            OooO0OO[] oooO0OOArr5 = this.f17580OooO00o;
            fArr10[0] = oooO0OOArr5[i4].f17594OooO0OO;
            fArr10[1] = oooO0OOArr5[i4].f17595OooO0Oo;
            this.f17581OooO0O0[i4].mapPoints(fArr10);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.f17587OooO0oo[0]) : Math.abs(rectF.centerY() - this.f17587OooO0oo[1]);
            this.f17586OooO0oO.OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            if (i4 == 1) {
                o0oo00o2 = oooO00o.f17565OooOO0O;
            } else if (i4 != 2) {
                o0oo00o2 = i4 != 3 ? oooO00o.f17564OooOO0 : oooO00o.f17555OooO;
            } else {
                o0oo00o2 = oooO00o.f17566OooOO0o;
            }
            o0oo00o2.OooO0Oo(fMax, fAbs, f, this.f17586OooO0oO);
            this.f17588OooOO0.reset();
            this.f17586OooO0oO.OooO0OO(this.f17582OooO0OO[i4], this.f17588OooOO0);
            if (this.f17590OooOO0o && (o0oo00o2.OooO0OO() || OooO0OO(this.f17588OooOO0, i4) || OooO0OO(this.f17588OooOO0, i6))) {
                Path path2 = this.f17588OooOO0;
                path2.op(path2, this.f17584OooO0o, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f17587OooO0oo;
                OooO0OO oooO0OO3 = this.f17586OooO0oO;
                fArr11[0] = oooO0OO3.f17592OooO00o;
                fArr11[1] = oooO0OO3.f17593OooO0O0;
                this.f17582OooO0OO[i4].mapPoints(fArr11);
                Path path3 = this.f17585OooO0o0;
                float[] fArr12 = this.f17587OooO0oo;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.f17586OooO0oO.OooO0OO(this.f17582OooO0OO[i4], this.f17585OooO0o0);
            } else {
                this.f17586OooO0oO.OooO0OO(this.f17582OooO0OO[i4], path);
            }
            if (interfaceC0111OooO0O0 != null) {
                OooO0OO oooO0OO4 = this.f17586OooO0oO;
                Matrix matrix4 = this.f17582OooO0OO[i4];
                MaterialShapeDrawable.OooO00o oooO00o3 = (MaterialShapeDrawable.OooO00o) interfaceC0111OooO0O0;
                Objects.requireNonNull(oooO0OO4);
                MaterialShapeDrawable.this.f17509Oooo.set(i4 + 4, false);
                MaterialShapeDrawable.this.f17512Oooo0oo[i4] = oooO0OO4.OooO0Oo(matrix4);
            }
            i4 = i5;
        }
        path.close();
        this.f17585OooO0o0.close();
        if (this.f17585OooO0o0.isEmpty()) {
            return;
        }
        path.op(this.f17585OooO0o0, Path.Op.UNION);
    }

    @RequiresApi(19)
    public final boolean OooO0OO(Path path, int i) {
        this.f17589OooOO0O.reset();
        this.f17580OooO00o[i].OooO0OO(this.f17581OooO0O0[i], this.f17589OooOO0O);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f17589OooOO0O.computeBounds(rectF, true);
        path.op(this.f17589OooOO0O, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
