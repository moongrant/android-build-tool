package o0O00o00;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0o[] f41807OooO00o = new com.google.android.material.shape.OooO0o[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix[] f41808OooO0O0 = new Matrix[4];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix[] f41809OooO0OO = new Matrix[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f41810OooO0Oo = new PointF();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Path f41812OooO0o0 = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f41811OooO0o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0o f41813OooO0oO = new com.google.android.material.shape.OooO0o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f41814OooO0oo = new float[2];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f41806OooO = new float[2];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f41815OooOO0 = new Path();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Path f41816OooOO0O = new Path();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f41817OooOO0o = true;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f41818OooO00o = new Oooo000();
    }

    public Oooo000() {
        for (int i = 0; i < 4; i++) {
            this.f41807OooO00o[i] = new com.google.android.material.shape.OooO0o();
            this.f41808OooO0O0[i] = new Matrix();
            this.f41809OooO0OO[i] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(com.google.android.material.shape.OooO0O0 oooO0O0, float f, RectF rectF, MaterialShapeDrawable.OooO00o oooO00o, @NonNull Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        com.google.android.material.shape.OooO0o[] oooO0oArr;
        OooOO0O oooOO0O;
        Path path2;
        char c;
        OooO0o oooO0o;
        OooO oooO;
        Oooo000 oooo000 = this;
        com.google.android.material.shape.OooO0O0 oooO0O1 = oooO0O0;
        Path path3 = path;
        path.rewind();
        Path path4 = oooo000.f41812OooO0o0;
        path4.rewind();
        Path path5 = oooo000.f41811OooO0o;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = oooo000.f41809OooO0OO;
            fArr = oooo000.f41814OooO0oo;
            matrixArr2 = oooo000.f41808OooO0O0;
            oooO0oArr = oooo000.f41807OooO00o;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                oooO0o = oooO0O1.f17634OooO0oO;
            } else if (i2 != 2) {
                oooO0o = i2 != 3 ? oooO0O1.f17632OooO0o : oooO0O1.f17633OooO0o0;
            } else {
                oooO0o = oooO0O1.f17635OooO0oo;
            }
            if (i2 == 1) {
                oooO = oooO0O1.f17630OooO0OO;
            } else if (i2 != 2) {
                oooO = i2 != 3 ? oooO0O1.f17629OooO0O0 : oooO0O1.f17628OooO00o;
            } else {
                oooO = oooO0O1.f17631OooO0Oo;
            }
            com.google.android.material.shape.OooO0o oooO0o2 = oooO0oArr[i2];
            oooO.getClass();
            oooO.OooO00o(f, oooO0o.OooO00o(rectF), oooO0o2);
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = oooo000.f41810OooO0Oo;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            com.google.android.material.shape.OooO0o oooO0o3 = oooO0oArr[i2];
            fArr[0] = oooO0o3.f17655OooO0OO;
            fArr[1] = oooO0o3.f17656OooO0Oo;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
            path4 = path4;
        }
        Path path6 = path4;
        char c2 = 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < i) {
            com.google.android.material.shape.OooO0o oooO0o4 = oooO0oArr[i4];
            fArr[c3] = oooO0o4.f17653OooO00o;
            fArr[c2] = oooO0o4.f17654OooO0O0;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c3], fArr[c2]);
            } else {
                path3.lineTo(fArr[c3], fArr[c2]);
            }
            oooO0oArr[i4].OooO0OO(matrixArr2[i4], path3);
            if (oooO00o != 0) {
                com.google.android.material.shape.OooO0o oooO0o5 = oooO0oArr[i4];
                Matrix matrix = matrixArr2[i4];
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.f17585OooO0oO;
                oooO0o5.getClass();
                bitSet.set(i4, false);
                oooO0o5.OooO0O0(oooO0o5.f17657OooO0o);
                materialShapeDrawable.f17584OooO0o0[i4] = new com.google.android.material.shape.OooO0OO(new ArrayList(oooO0o5.f17660OooO0oo), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            com.google.android.material.shape.OooO0o oooO0o6 = oooO0oArr[i4];
            fArr[0] = oooO0o6.f17655OooO0OO;
            fArr[1] = oooO0o6.f17656OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            com.google.android.material.shape.OooO0o oooO0o7 = oooO0oArr[i6];
            float f3 = oooO0o7.f17653OooO00o;
            float[] fArr2 = oooo000.f41806OooO;
            fArr2[0] = f3;
            fArr2[1] = oooO0o7.f17654OooO0O0;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            com.google.android.material.shape.OooO0o oooO0o8 = oooO0oArr[i4];
            fArr[0] = oooO0o8.f17655OooO0OO;
            fArr[1] = oooO0o8.f17656OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            com.google.android.material.shape.OooO0o oooO0o9 = oooo000.f41813OooO0oO;
            oooO0o9.OooO0o0(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                oooOO0O = oooO0O1.f17637OooOO0O;
            } else if (i4 != 2) {
                oooOO0O = i4 != 3 ? oooO0O1.f17636OooOO0 : oooO0O1.f17627OooO;
            } else {
                oooOO0O = oooO0O1.f17638OooOO0o;
            }
            oooOO0O.OooO0Oo(fMax, fAbs, f, oooO0o9);
            Path path7 = oooo000.f41815OooOO0;
            path7.reset();
            oooO0o9.OooO0OO(matrixArr[i4], path7);
            if (oooo000.f41817OooOO0o && (oooOO0O.OooO0O0() || oooo000.OooO0O0(path7, i4) || oooo000.OooO0O0(path7, i6))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = oooO0o9.f17653OooO00o;
                fArr[1] = oooO0o9.f17654OooO0O0;
                matrixArr[i4].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                oooO0o9.OooO0OO(matrixArr[i4], path2);
                path3 = path;
            } else {
                path2 = path6;
                path3 = path;
                oooO0o9.OooO0OO(matrixArr[i4], path3);
            }
            if (oooO00o != 0) {
                Matrix matrix2 = matrixArr[i4];
                MaterialShapeDrawable materialShapeDrawable2 = MaterialShapeDrawable.this;
                c = 0;
                materialShapeDrawable2.f17585OooO0oO.set(i4 + 4, false);
                oooO0o9.OooO0O0(oooO0o9.f17657OooO0o);
                materialShapeDrawable2.f17583OooO0o[i4] = new com.google.android.material.shape.OooO0OO(new ArrayList(oooO0o9.f17660OooO0oo), new Matrix(matrix2));
            } else {
                c = 0;
            }
            oooo000 = this;
            c3 = c;
            path6 = path2;
            i4 = i5;
            c2 = 1;
            i = 4;
            oooO0O1 = oooO0O0;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path3.op(path8, Path.Op.UNION);
    }

    @RequiresApi(19)
    public final boolean OooO0O0(Path path, int i) {
        Path path2 = this.f41816OooOO0O;
        path2.reset();
        this.f41807OooO00o[i].OooO0OO(this.f41808OooO0O0[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
