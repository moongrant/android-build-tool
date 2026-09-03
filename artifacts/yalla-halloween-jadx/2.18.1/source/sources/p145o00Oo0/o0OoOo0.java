package p145o00Oo0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o00O0O.OooO00o;
import o00O0O.OooOO0O;
import o00O0O.OooOOO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Path f32146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RectF f32147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final float[] f32148OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Matrix f32149OooO0Oo;

    public o0OoOo0(@NotNull Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.f32146OooO00o = internalPath;
        this.f32147OooO0O0 = new RectF();
        this.f32148OooO0OO = new float[8];
        this.f32149OooO0Oo = new Matrix();
    }

    @Override // p145o00Oo0.o000O0o
    public final boolean OooO(@NotNull o000O0o path1, @NotNull o000O0o path2, int i) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        Path path = this.f32146OooO00o;
        if (!(path1 instanceof o0OoOo0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path3 = ((o0OoOo0) path1).f32146OooO00o;
        if (path2 instanceof o0OoOo0) {
            return path.op(path3, ((o0OoOo0) path2).f32146OooO00o, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO00o() {
        this.f32146OooO00o.reset();
    }

    @Override // p145o00Oo0.o000O0o
    public final boolean OooO0O0() {
        return this.f32146OooO00o.isConvex();
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0OO(@NotNull OooOO0O rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!(!Float.isNaN(rect.f30404OooO00o))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!Float.isNaN(rect.f30405OooO0O0))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!Float.isNaN(rect.f30406OooO0OO))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (!(!Float.isNaN(rect.f30407OooO0Oo))) {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
        RectF rectF = this.f32147OooO0O0;
        Intrinsics.checkNotNullParameter(rect, "<this>");
        rectF.set(new RectF(rect.f30404OooO00o, rect.f30405OooO0O0, rect.f30406OooO0OO, rect.f30407OooO0Oo));
        this.f32146OooO00o.addRect(this.f32147OooO0O0, Path.Direction.CCW);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0Oo(float f, float f2) {
        this.f32146OooO00o.rMoveTo(f, f2);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0o(float f, float f2, float f3, float f4) {
        this.f32146OooO00o.quadTo(f, f2, f3, f4);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0o0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f32146OooO00o.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0oO(@NotNull OooOOO roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        this.f32147OooO0O0.set(roundRect.f30408OooO00o, roundRect.f30409OooO0O0, roundRect.f30410OooO0OO, roundRect.f30411OooO0Oo);
        this.f32148OooO0OO[0] = OooO00o.OooO0O0(roundRect.f30413OooO0o0);
        this.f32148OooO0OO[1] = OooO00o.OooO0OO(roundRect.f30413OooO0o0);
        this.f32148OooO0OO[2] = OooO00o.OooO0O0(roundRect.f30412OooO0o);
        this.f32148OooO0OO[3] = OooO00o.OooO0OO(roundRect.f30412OooO0o);
        this.f32148OooO0OO[4] = OooO00o.OooO0O0(roundRect.f30414OooO0oO);
        this.f32148OooO0OO[5] = OooO00o.OooO0OO(roundRect.f30414OooO0oO);
        this.f32148OooO0OO[6] = OooO00o.OooO0O0(roundRect.f30415OooO0oo);
        this.f32148OooO0OO[7] = OooO00o.OooO0OO(roundRect.f30415OooO0oo);
        this.f32146OooO00o.addRoundRect(this.f32147OooO0O0, this.f32148OooO0OO, Path.Direction.CCW);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooO0oo(float f, float f2, float f3, float f4) {
        this.f32146OooO00o.rQuadTo(f, f2, f3, f4);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooOO0(float f, float f2) {
        this.f32146OooO00o.moveTo(f, f2);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooOO0O(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f32146OooO00o.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooOO0o(long j) {
        this.f32149OooO0Oo.reset();
        this.f32149OooO0Oo.setTranslate(OooO.OooO0OO(j), OooO.OooO0Oo(j));
        this.f32146OooO00o.transform(this.f32149OooO0Oo);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooOOO(float f, float f2) {
        this.f32146OooO00o.lineTo(f, f2);
    }

    @Override // p145o00Oo0.o000O0o
    public final void OooOOO0(float f, float f2) {
        this.f32146OooO00o.rLineTo(f, f2);
    }

    public final void OooOOOO(@NotNull o000O0o path, long j) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = this.f32146OooO00o;
        if (!(path instanceof o0OoOo0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((o0OoOo0) path).f32146OooO00o, OooO.OooO0OO(j), OooO.OooO0Oo(j));
    }

    @Override // p145o00Oo0.o000O0o
    public final void close() {
        this.f32146OooO00o.close();
    }

    @Override // p145o00Oo0.o000O0o
    @NotNull
    public final OooOO0O getBounds() {
        this.f32146OooO00o.computeBounds(this.f32147OooO0O0, true);
        RectF rectF = this.f32147OooO0O0;
        return new OooOO0O(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p145o00Oo0.o000O0o
    public final boolean isEmpty() {
        return this.f32146OooO00o.isEmpty();
    }

    public o0OoOo0() {
        this(new Path());
    }
}
