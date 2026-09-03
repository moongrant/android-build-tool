package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Deprecated
    public float f17176OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Deprecated
    public float f17177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Deprecated
    public float f17178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Deprecated
    public float f17179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Deprecated
    public float f17180OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Deprecated
    public float f17181OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f17182OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f17183OooO0oo = new ArrayList();

    public static abstract class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f17184OooO00o = new Matrix();

        public abstract void OooO00o(Matrix matrix, Path path);
    }

    public static class OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f17185OooO0OO;

        public OooO00o(OooO0OO oooO0OO) {
            this.f17185OooO0OO = oooO0OO;
        }

        @Override // com.google.android.material.shape.OooO0o.OooOO0
        public final void OooO00o(Matrix matrix, @NonNull o0O00o00.OooO00o oooO00o, int i, @NonNull Canvas canvas) {
            OooO0OO oooO0OO = this.f17185OooO0OO;
            float f = oooO0OO.f17193OooO0o;
            float f2 = oooO0OO.f17195OooO0oO;
            RectF rectF = new RectF(oooO0OO.f17190OooO0O0, oooO0OO.f17191OooO0OO, oooO0OO.f17192OooO0Oo, oooO0OO.f17194OooO0o0);
            oooO00o.getClass();
            boolean z = f2 < 0.0f;
            Path path = oooO00o.f41061OooO0oO;
            int[] iArr = o0O00o00.OooO00o.f41053OooOO0O;
            if (z) {
                iArr[0] = 0;
                iArr[1] = oooO00o.f41059OooO0o;
                iArr[2] = oooO00o.f41060OooO0o0;
                iArr[3] = oooO00o.f41058OooO0Oo;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = oooO00o.f41058OooO0Oo;
                iArr[2] = oooO00o.f41060OooO0o0;
                iArr[3] = oooO00o.f41059OooO0o;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = o0O00o00.OooO00o.f41054OooOO0o;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = oooO00o.f41056OooO0O0;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, oooO00o.f41062OooO0oo);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }

    public static class OooO0O0 extends OooOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C0221OooO0o f17186OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f17187OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f17188OooO0o0;

        public OooO0O0(C0221OooO0o c0221OooO0o, float f, float f2) {
            this.f17186OooO0OO = c0221OooO0o;
            this.f17187OooO0Oo = f;
            this.f17188OooO0o0 = f2;
        }

        @Override // com.google.android.material.shape.OooO0o.OooOO0
        public final void OooO00o(Matrix matrix, @NonNull o0O00o00.OooO00o oooO00o, int i, @NonNull Canvas canvas) {
            C0221OooO0o c0221OooO0o = this.f17186OooO0OO;
            float f = c0221OooO0o.f17197OooO0OO;
            float f2 = this.f17188OooO0o0;
            float f3 = c0221OooO0o.f17196OooO0O0;
            float f4 = this.f17187OooO0Oo;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = this.f17199OooO00o;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(OooO0O0());
            oooO00o.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = o0O00o00.OooO00o.f41051OooO;
            iArr[0] = oooO00o.f41059OooO0o;
            iArr[1] = oooO00o.f41060OooO0o0;
            iArr[2] = oooO00o.f41058OooO0Oo;
            Paint paint = oooO00o.f41057OooO0OO;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, o0O00o00.OooO00o.f41052OooOO0, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float OooO0O0() {
            C0221OooO0o c0221OooO0o = this.f17186OooO0OO;
            return (float) Math.toDegrees(Math.atan((c0221OooO0o.f17197OooO0OO - this.f17188OooO0o0) / (c0221OooO0o.f17196OooO0O0 - this.f17187OooO0Oo)));
        }
    }

    public static class OooO0OO extends OooO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final RectF f17189OooO0oo = new RectF();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Deprecated
        public float f17190OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Deprecated
        public float f17191OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Deprecated
        public float f17192OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Deprecated
        public float f17193OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Deprecated
        public float f17194OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Deprecated
        public float f17195OooO0oO;

        public OooO0OO(float f, float f2, float f3, float f4) {
            this.f17190OooO0O0 = f;
            this.f17191OooO0OO = f2;
            this.f17192OooO0Oo = f3;
            this.f17194OooO0o0 = f4;
        }

        @Override // com.google.android.material.shape.OooO0o.OooO
        public final void OooO00o(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f17184OooO00o;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f17189OooO0oo;
            rectF.set(this.f17190OooO0O0, this.f17191OooO0OO, this.f17192OooO0Oo, this.f17194OooO0o0);
            path.arcTo(rectF, this.f17193OooO0o, this.f17195OooO0oO, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class C0221OooO0o extends OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f17196OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f17197OooO0OO;

        @Override // com.google.android.material.shape.OooO0o.OooO
        public final void OooO00o(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f17184OooO00o;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f17196OooO0O0, this.f17197OooO0OO);
            path.transform(matrix);
        }
    }

    public static abstract class OooOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Matrix f17198OooO0O0 = new Matrix();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f17199OooO00o = new Matrix();

        public abstract void OooO00o(Matrix matrix, o0O00o00.OooO00o oooO00o, int i, Canvas canvas);
    }

    public OooO0o() {
        OooO0o0(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        OooO0OO oooO0OO = new OooO0OO(f, f2, f3, f4);
        oooO0OO.f17193OooO0o = f5;
        oooO0OO.f17195OooO0oO = f6;
        this.f17182OooO0oO.add(oooO0OO);
        OooO00o oooO00o = new OooO00o(oooO0OO);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        OooO0O0(f5);
        this.f17183OooO0oo.add(oooO00o);
        this.f17181OooO0o0 = f8;
        double d = f7;
        this.f17178OooO0OO = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f17179OooO0Oo = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void OooO0O0(float f) {
        float f2 = this.f17181OooO0o0;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f17178OooO0OO;
        float f5 = this.f17179OooO0Oo;
        OooO0OO oooO0OO = new OooO0OO(f4, f5, f4, f5);
        oooO0OO.f17193OooO0o = this.f17181OooO0o0;
        oooO0OO.f17195OooO0oO = f3;
        this.f17183OooO0oo.add(new OooO00o(oooO0OO));
        this.f17181OooO0o0 = f;
    }

    public final void OooO0OO(Matrix matrix, Path path) {
        ArrayList arrayList = this.f17182OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO) arrayList.get(i)).OooO00o(matrix, path);
        }
    }

    public final void OooO0Oo(float f, float f2) {
        C0221OooO0o c0221OooO0o = new C0221OooO0o();
        c0221OooO0o.f17196OooO0O0 = f;
        c0221OooO0o.f17197OooO0OO = f2;
        this.f17182OooO0oO.add(c0221OooO0o);
        OooO0O0 oooO0O0 = new OooO0O0(c0221OooO0o, this.f17178OooO0OO, this.f17179OooO0Oo);
        float fOooO0O0 = oooO0O0.OooO0O0() + 270.0f;
        float fOooO0O1 = oooO0O0.OooO0O0() + 270.0f;
        OooO0O0(fOooO0O0);
        this.f17183OooO0oo.add(oooO0O0);
        this.f17181OooO0o0 = fOooO0O1;
        this.f17178OooO0OO = f;
        this.f17179OooO0Oo = f2;
    }

    public final void OooO0o0(float f, float f2, float f3, float f4) {
        this.f17176OooO00o = f;
        this.f17177OooO0O0 = f2;
        this.f17178OooO0OO = f;
        this.f17179OooO0Oo = f2;
        this.f17181OooO0o0 = f3;
        this.f17180OooO0o = (f3 + f4) % 360.0f;
        this.f17182OooO0oO.clear();
        this.f17183OooO0oo.clear();
    }
}
