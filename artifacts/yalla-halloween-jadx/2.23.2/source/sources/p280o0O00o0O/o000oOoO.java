package p280o0O00o0O;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import com.google.android.material.shape.OooO0OO;
import com.google.android.material.shape.OooO0o;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o[] f41074OooO00o = new OooO0o[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix[] f41075OooO0O0 = new Matrix[4];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix[] f41076OooO0OO = new Matrix[4];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f41077OooO0Oo = new PointF();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Path f41079OooO0o0 = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f41078OooO0o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o f41080OooO0oO = new OooO0o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f41081OooO0oo = new float[2];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f41073OooO = new float[2];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f41082OooOO0 = new Path();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Path f41083OooOO0O = new Path();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f41084OooOO0o = true;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000oOoO f41085OooO00o = new o000oOoO();
    }

    public o000oOoO() {
        for (int i = 0; i < 4; i++) {
            this.f41074OooO00o[i] = new OooO0o();
            this.f41075OooO0O0[i] = new Matrix();
            this.f41076OooO0OO[i] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(OooO0O0 oooO0O0, float f, RectF rectF, MaterialShapeDrawable.OooO00o oooO00o, @NonNull Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        OooO0o[] oooO0oArr;
        OooOOO oooOOO;
        Path path2;
        char c;
        OooOO0 oooOO1;
        OooOO0O oooOO0O;
        o000oOoO o000oooo2 = this;
        OooO0O0 oooO0O1 = oooO0O0;
        Path path3 = path;
        path.rewind();
        Path path4 = o000oooo2.f41079OooO0o0;
        path4.rewind();
        Path path5 = o000oooo2.f41078OooO0o;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = o000oooo2.f41076OooO0OO;
            fArr = o000oooo2.f41081OooO0oo;
            matrixArr2 = o000oooo2.f41075OooO0O0;
            oooO0oArr = o000oooo2.f41074OooO00o;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                oooOO1 = oooO0O1.f17157OooO0oO;
            } else if (i2 != 2) {
                oooOO1 = i2 != 3 ? oooO0O1.f17155OooO0o : oooO0O1.f17156OooO0o0;
            } else {
                oooOO1 = oooO0O1.f17158OooO0oo;
            }
            if (i2 == 1) {
                oooOO0O = oooO0O1.f17153OooO0OO;
            } else if (i2 != 2) {
                oooOO0O = i2 != 3 ? oooO0O1.f17152OooO0O0 : oooO0O1.f17151OooO00o;
            } else {
                oooOO0O = oooO0O1.f17154OooO0Oo;
            }
            OooO0o oooO0o = oooO0oArr[i2];
            oooOO0O.getClass();
            oooOO0O.OooO00o(f, oooOO1.OooO00o(rectF), oooO0o);
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = o000oooo2.f41077OooO0Oo;
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
            OooO0o oooO0o2 = oooO0oArr[i2];
            fArr[0] = oooO0o2.f17178OooO0OO;
            fArr[1] = oooO0o2.f17179OooO0Oo;
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
            OooO0o oooO0o3 = oooO0oArr[i4];
            fArr[c3] = oooO0o3.f17176OooO00o;
            fArr[c2] = oooO0o3.f17177OooO0O0;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c3], fArr[c2]);
            } else {
                path3.lineTo(fArr[c3], fArr[c2]);
            }
            oooO0oArr[i4].OooO0OO(matrixArr2[i4], path3);
            if (oooO00o != 0) {
                OooO0o oooO0o4 = oooO0oArr[i4];
                Matrix matrix = matrixArr2[i4];
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.f17108OooO0oO;
                oooO0o4.getClass();
                bitSet.set(i4, false);
                oooO0o4.OooO0O0(oooO0o4.f17180OooO0o);
                materialShapeDrawable.f17107OooO0o0[i4] = new OooO0OO(new ArrayList(oooO0o4.f17183OooO0oo), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            OooO0o oooO0o5 = oooO0oArr[i4];
            fArr[0] = oooO0o5.f17178OooO0OO;
            fArr[1] = oooO0o5.f17179OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            OooO0o oooO0o6 = oooO0oArr[i6];
            float f3 = oooO0o6.f17176OooO00o;
            float[] fArr2 = o000oooo2.f41073OooO;
            fArr2[0] = f3;
            fArr2[1] = oooO0o6.f17177OooO0O0;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            OooO0o oooO0o7 = oooO0oArr[i4];
            fArr[0] = oooO0o7.f17178OooO0OO;
            fArr[1] = oooO0o7.f17179OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            OooO0o oooO0o8 = o000oooo2.f41080OooO0oO;
            oooO0o8.OooO0o0(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                oooOOO = oooO0O1.f17160OooOO0O;
            } else if (i4 != 2) {
                oooOOO = i4 != 3 ? oooO0O1.f17159OooOO0 : oooO0O1.f17150OooO;
            } else {
                oooOOO = oooO0O1.f17161OooOO0o;
            }
            oooOOO.OooO0Oo(fMax, fAbs, f, oooO0o8);
            Path path7 = o000oooo2.f41082OooOO0;
            path7.reset();
            oooO0o8.OooO0OO(matrixArr[i4], path7);
            if (o000oooo2.f41084OooOO0o && (oooOOO.OooO0O0() || o000oooo2.OooO0O0(path7, i4) || o000oooo2.OooO0O0(path7, i6))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = oooO0o8.f17176OooO00o;
                fArr[1] = oooO0o8.f17177OooO0O0;
                matrixArr[i4].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                oooO0o8.OooO0OO(matrixArr[i4], path2);
                path3 = path;
            } else {
                path2 = path6;
                path3 = path;
                oooO0o8.OooO0OO(matrixArr[i4], path3);
            }
            if (oooO00o != 0) {
                Matrix matrix2 = matrixArr[i4];
                MaterialShapeDrawable materialShapeDrawable2 = MaterialShapeDrawable.this;
                c = 0;
                materialShapeDrawable2.f17108OooO0oO.set(i4 + 4, false);
                oooO0o8.OooO0O0(oooO0o8.f17180OooO0o);
                materialShapeDrawable2.f17106OooO0o[i4] = new OooO0OO(new ArrayList(oooO0o8.f17183OooO0oo), new Matrix(matrix2));
            } else {
                c = 0;
            }
            o000oooo2 = this;
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
        Path path2 = this.f41083OooOO0O;
        path2.reset();
        this.f41074OooO00o[i].OooO0OO(this.f41075OooO0O0[i], path2);
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
