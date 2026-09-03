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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Deprecated
    public float f17592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Deprecated
    public float f17593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Deprecated
    public float f17594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Deprecated
    public float f17595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Deprecated
    public float f17596OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Deprecated
    public float f17597OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<OooOO0> f17598OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<OooOO0O> f17599OooO0oo = new ArrayList();

    public static class OooO extends OooOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f17600OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f17601OooO0OO;

        @Override // com.google.android.material.shape.OooO0OO.OooOO0
        public final void OooO00o(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f17615OooO00o;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f17600OooO0O0, this.f17601OooO0OO);
            path.transform(matrix);
        }
    }

    public class OooO00o extends OooOO0O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ List f17602OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Matrix f17603OooO0OO;

        public OooO00o(List list, Matrix matrix) {
            this.f17602OooO0O0 = list;
            this.f17603OooO0OO = matrix;
        }

        @Override // com.google.android.material.shape.OooO0OO.OooOO0O
        public final void OooO00o(Matrix matrix, p345o0OOO0Oo.OooO0OO oooO0OO, int i, Canvas canvas) {
            Iterator it = this.f17602OooO0O0.iterator();
            while (it.hasNext()) {
                ((OooOO0O) it.next()).OooO00o(this.f17603OooO0OO, oooO0OO, i, canvas);
            }
        }
    }

    public static class OooO0O0 extends OooOO0O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o f17604OooO0O0;

        public OooO0O0(OooO0o oooO0o) {
            this.f17604OooO0O0 = oooO0o;
        }

        @Override // com.google.android.material.shape.OooO0OO.OooOO0O
        public final void OooO00o(Matrix matrix, @NonNull p345o0OOO0Oo.OooO0OO oooO0OO, int i, @NonNull Canvas canvas) {
            OooO0o oooO0o = this.f17604OooO0O0;
            float f = oooO0o.f17612OooO0o;
            float f2 = oooO0o.f17614OooO0oO;
            OooO0o oooO0o2 = this.f17604OooO0O0;
            RectF rectF = new RectF(oooO0o2.f17609OooO0O0, oooO0o2.f17610OooO0OO, oooO0o2.f17611OooO0Oo, oooO0o2.f17613OooO0o0);
            boolean z = f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            Path path = oooO0OO.f38144OooO0oO;
            if (z) {
                int[] iArr = p345o0OOO0Oo.OooO0OO.f38136OooOO0O;
                iArr[0] = 0;
                iArr[1] = oooO0OO.f38142OooO0o;
                iArr[2] = oooO0OO.f38143OooO0o0;
                iArr[3] = oooO0OO.f38141OooO0Oo;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = p345o0OOO0Oo.OooO0OO.f38136OooOO0O;
                iArr2[0] = 0;
                iArr2[1] = oooO0OO.f38141OooO0Oo;
                iArr2[2] = oooO0OO.f38143OooO0o0;
                iArr2[3] = oooO0OO.f38142OooO0o;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = p345o0OOO0Oo.OooO0OO.f38137OooOO0o;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            oooO0OO.f38139OooO0O0.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, p345o0OOO0Oo.OooO0OO.f38136OooOO0O, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, oooO0OO.f38145OooO0oo);
            }
            canvas.drawArc(rectF, f, f2, true, oooO0OO.f38139OooO0O0);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C0112OooO0OO extends OooOO0O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO f17605OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f17606OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f17607OooO0Oo;

        public C0112OooO0OO(OooO oooO, float f, float f2) {
            this.f17605OooO0O0 = oooO;
            this.f17606OooO0OO = f;
            this.f17607OooO0Oo = f2;
        }

        @Override // com.google.android.material.shape.OooO0OO.OooOO0O
        public final void OooO00o(Matrix matrix, @NonNull p345o0OOO0Oo.OooO0OO oooO0OO, int i, @NonNull Canvas canvas) {
            OooO oooO = this.f17605OooO0O0;
            RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (float) Math.hypot(oooO.f17601OooO0OO - this.f17607OooO0Oo, oooO.f17600OooO0O0 - this.f17606OooO0OO), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f17606OooO0OO, this.f17607OooO0Oo);
            matrix2.preRotate(OooO0O0());
            Objects.requireNonNull(oooO0OO);
            rectF.bottom += i;
            rectF.offset(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -i);
            int[] iArr = p345o0OOO0Oo.OooO0OO.f38134OooO;
            iArr[0] = oooO0OO.f38142OooO0o;
            iArr[1] = oooO0OO.f38143OooO0o0;
            iArr[2] = oooO0OO.f38141OooO0Oo;
            Paint paint = oooO0OO.f38140OooO0OO;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, p345o0OOO0Oo.OooO0OO.f38135OooOO0, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, oooO0OO.f38140OooO0OO);
            canvas.restore();
        }

        public final float OooO0O0() {
            OooO oooO = this.f17605OooO0O0;
            return (float) Math.toDegrees(Math.atan((oooO.f17601OooO0OO - this.f17607OooO0Oo) / (oooO.f17600OooO0O0 - this.f17606OooO0OO)));
        }
    }

    public static class OooO0o extends OooOO0 {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final RectF f17608OooO0oo = new RectF();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Deprecated
        public float f17609OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Deprecated
        public float f17610OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Deprecated
        public float f17611OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Deprecated
        public float f17612OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Deprecated
        public float f17613OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Deprecated
        public float f17614OooO0oO;

        public OooO0o(float f, float f2, float f3, float f4) {
            this.f17609OooO0O0 = f;
            this.f17610OooO0OO = f2;
            this.f17611OooO0Oo = f3;
            this.f17613OooO0o0 = f4;
        }

        @Override // com.google.android.material.shape.OooO0OO.OooOO0
        public final void OooO00o(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f17615OooO00o;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f17608OooO0oo;
            rectF.set(this.f17609OooO0O0, this.f17610OooO0OO, this.f17611OooO0Oo, this.f17613OooO0o0);
            path.arcTo(rectF, this.f17612OooO0o, this.f17614OooO0oO, false);
            path.transform(matrix);
        }
    }

    public static abstract class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f17615OooO00o = new Matrix();

        public abstract void OooO00o(Matrix matrix, Path path);
    }

    public static abstract class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Matrix f17616OooO00o = new Matrix();

        public abstract void OooO00o(Matrix matrix, p345o0OOO0Oo.OooO0OO oooO0OO, int i, Canvas canvas);
    }

    public OooO0OO() {
        OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        OooO0o oooO0o = new OooO0o(f, f2, f3, f4);
        oooO0o.f17612OooO0o = f5;
        oooO0o.f17614OooO0oO = f6;
        this.f17598OooO0oO.add(oooO0o);
        OooO0O0 oooO0O0 = new OooO0O0(oooO0o);
        float f7 = f5 + f6;
        boolean z = f6 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        OooO0O0(f5);
        this.f17599OooO0oo.add(oooO0O0);
        this.f17597OooO0o0 = f8;
        double d = f7;
        this.f17594OooO0OO = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f17595OooO0Oo = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0O0(float f) {
        float f2 = this.f17597OooO0o0;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f17594OooO0OO;
        float f5 = this.f17595OooO0Oo;
        OooO0o oooO0o = new OooO0o(f4, f5, f4, f5);
        oooO0o.f17612OooO0o = this.f17597OooO0o0;
        oooO0o.f17614OooO0oO = f3;
        this.f17599OooO0oo.add(new OooO0O0(oooO0o));
        this.f17597OooO0o0 = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.material.shape.OooO0OO$OooOO0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.material.shape.OooO0OO$OooOO0>] */
    public final void OooO0OO(Matrix matrix, Path path) {
        int size = this.f17598OooO0oO.size();
        for (int i = 0; i < size; i++) {
            ((OooOO0) this.f17598OooO0oO.get(i)).OooO00o(matrix, path);
        }
    }

    @NonNull
    public final OooOO0O OooO0Oo(Matrix matrix) {
        OooO0O0(this.f17596OooO0o);
        return new OooO00o(new ArrayList(this.f17599OooO0oo), new Matrix(matrix));
    }

    public final void OooO0o(float f, float f2) {
        OooO0oO(f, f2, 270.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0o0(float f, float f2) {
        OooO oooO = new OooO();
        oooO.f17600OooO0O0 = f;
        oooO.f17601OooO0OO = f2;
        this.f17598OooO0oO.add(oooO);
        C0112OooO0OO c0112OooO0OO = new C0112OooO0OO(oooO, this.f17594OooO0OO, this.f17595OooO0Oo);
        float fOooO0O0 = c0112OooO0OO.OooO0O0() + 270.0f;
        float fOooO0O1 = c0112OooO0OO.OooO0O0() + 270.0f;
        OooO0O0(fOooO0O0);
        this.f17599OooO0oo.add(c0112OooO0OO);
        this.f17597OooO0o0 = fOooO0O1;
        this.f17594OooO0OO = f;
        this.f17595OooO0Oo = f2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.shape.OooO0OO$OooOO0>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.google.android.material.shape.OooO0OO$OooOO0O>] */
    public final void OooO0oO(float f, float f2, float f3, float f4) {
        this.f17592OooO00o = f;
        this.f17593OooO0O0 = f2;
        this.f17594OooO0OO = f;
        this.f17595OooO0Oo = f2;
        this.f17597OooO0o0 = f3;
        this.f17596OooO0o = (f3 + f4) % 360.0f;
        this.f17598OooO0oO.clear();
        this.f17599OooO0oo.clear();
    }
}
