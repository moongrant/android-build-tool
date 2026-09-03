package p145o00Oo0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o00O0O.OooO;
import o00O0O.OooOO0O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@PublishedApi
public final class OooOOO implements o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Canvas f32046OooO00o = OooOOOO.f32049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Rect f32047OooO0O0 = new Rect();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Rect f32048OooO0OO = new Rect();

    @Override // p145o00Oo0.o0O0O00
    public final void OooO(long j, long j2, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawLine(OooO.OooO0OO(j), OooO.OooO0Oo(j), OooO.OooO0OO(j2), OooO.OooO0Oo(j2), paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO00o(float f, float f2, float f3, float f4, int i) {
        this.f32046OooO00o.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0O0(float f, float f2) {
        this.f32046OooO00o.translate(f, f2);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0OO(@NotNull o000O0o path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f32046OooO00o;
        if (!(path instanceof o0OoOo0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((o0OoOo0) path).f32146OooO00o, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0Oo(float f, float f2) {
        this.f32046OooO00o.scale(f, f2);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0o(float f, float f2, float f3, float f4, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawRect(f, f2, f3, f4, paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final /* synthetic */ void OooO0o0(OooOO0O oooOO0O, o000 o000Var) {
        oo0o0Oo.OooO00o(this, oooOO0O, o000Var);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0oO(OooOO0O rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        OooO00o(rect.f30404OooO00o, rect.f30405OooO0O0, rect.f30406OooO0OO, rect.f30407OooO0Oo, i);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooO0oo() {
        this.f32046OooO00o.save();
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOO0() {
        o000000O.OooO00o(this.f32046OooO00o, false);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOO0O(@NotNull o0000oo image, long j, long j2, long j3, long j4, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f32046OooO00o;
        Bitmap bitmapOooO00o = OooOo.OooO00o(image);
        Rect rect = this.f32047OooO0O0;
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        int i = (int) (j >> 32);
        rect.left = i;
        rect.top = OooOo.OooO0OO(j);
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = o000oOoO.OooO0O0(j2) + OooOo.OooO0OO(j);
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.f32048OooO0OO;
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        rect2.top = OooOo.OooO0OO(j3);
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = o000oOoO.OooO0O0(j4) + OooOo.OooO0OO(j3);
        canvas.drawBitmap(bitmapOooO00o, rect, rect2, paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOO0o(float f, float f2, float f3, float f4, float f5, float f6, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawRoundRect(f, f2, f3, f4, f5, f6, paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOO(long j, float f, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawCircle(OooO.OooO0OO(j), OooO.OooO0Oo(j), f, paint.OooO0o0());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    @Override // p145o00Oo0.o0O0O00
    public final void OooOOO0(@NotNull float[] matrix) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(matrix, "$this$isIdentity");
        int i = 0;
        loop0: while (true) {
            if (i >= 4) {
                z = true;
                break;
            }
            int i2 = 0;
            while (i2 < 4) {
                if (!(matrix[(i * 4) + i2] == (i == i2 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
                    z = false;
                    break loop0;
                }
                i2++;
            }
            i++;
        }
        if (z) {
            return;
        }
        Matrix setFrom = new Matrix();
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (matrix[2] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (matrix[6] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (matrix[10] == 1.0f) {
                    if (matrix[14] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (matrix[8] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            if (matrix[9] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                if (matrix[11] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
        }
        float f = matrix[0];
        float f2 = matrix[1];
        float f3 = matrix[2];
        float f4 = matrix[3];
        float f5 = matrix[4];
        float f6 = matrix[5];
        float f7 = matrix[6];
        float f8 = matrix[7];
        float f9 = matrix[8];
        float f10 = matrix[12];
        float f11 = matrix[13];
        float f12 = matrix[15];
        matrix[0] = f;
        matrix[1] = f5;
        matrix[2] = f10;
        matrix[3] = f2;
        matrix[4] = f6;
        matrix[5] = f11;
        matrix[6] = f4;
        matrix[7] = f8;
        matrix[8] = f12;
        setFrom.setValues(matrix);
        matrix[0] = f;
        matrix[1] = f2;
        matrix[2] = f3;
        matrix[3] = f4;
        matrix[4] = f5;
        matrix[5] = f6;
        matrix[6] = f7;
        matrix[7] = f8;
        matrix[8] = f9;
        this.f32046OooO00o.concat(setFrom);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOOO(@NotNull o000O0o path, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f32046OooO00o;
        if (!(path instanceof o0OoOo0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((o0OoOo0) path).f32146OooO00o, paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOOo() {
        this.f32046OooO00o.rotate(45.0f);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOo(@NotNull o0000oo image, long j, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawBitmap(OooOo.OooO00o(image), OooO.OooO0OO(j), OooO.OooO0Oo(j), paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOo0() {
        this.f32046OooO00o.restore();
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOOoo() {
        o000000O.OooO00o(this.f32046OooO00o, true);
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOo0(float f, float f2, float f3, float f4, float f5, float f6, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.drawArc(f, f2, f3, f4, f5, f6, false, paint.OooO0o0());
    }

    @Override // p145o00Oo0.o0O0O00
    public final void OooOo00(@NotNull OooOO0O bounds, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f32046OooO00o.saveLayer(bounds.f30404OooO00o, bounds.f30405OooO0O0, bounds.f30406OooO0OO, bounds.f30407OooO0Oo, paint.OooO0o0(), 31);
    }

    public final void OooOo0O(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.f32046OooO00o = canvas;
    }
}
