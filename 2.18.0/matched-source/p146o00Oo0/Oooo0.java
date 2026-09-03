package p146o00Oo0;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Paint f32072OooO00o = new Paint(7);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f32073OooO0O0 = 3;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Shader f32074OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00000O f32075OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000Oo0 f32076OooO0o0;

    @Override // p146o00Oo0.o000
    public final int OooO() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    @Override // p146o00Oo0.o000
    public final long OooO00o() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return o00000OO.OooO0O0(paint.getColor());
    }

    @Override // p146o00Oo0.o000
    public final void OooO0O0(float f) {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // p146o00Oo0.o000
    public final void OooO0OO(int i) {
        this.f32073OooO0O0 = i;
        Paint setNativeBlendMode = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            o00O00O.f32156OooO00o.OooO00o(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(OooOOO0.OooO0O0(i)));
        }
    }

    @Override // p146o00Oo0.o000
    @Nullable
    public final o00000O OooO0Oo() {
        return this.f32075OooO0Oo;
    }

    @Override // p146o00Oo0.o000
    public final void OooO0o(@Nullable Shader shader) {
        this.f32074OooO0OO = shader;
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    @Override // p146o00Oo0.o000
    @NotNull
    public final Paint OooO0o0() {
        return this.f32072OooO00o;
    }

    @Override // p146o00Oo0.o000
    @Nullable
    public final Shader OooO0oO() {
        return this.f32074OooO0OO;
    }

    @Override // p146o00Oo0.o000
    public final void OooO0oo(int i) {
        Paint setNativeFilterQuality = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!(i == 0));
    }

    @Override // p146o00Oo0.o000
    public final void OooOO0(long j) {
        Paint setNativeColor = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(o00000OO.OooO0oO(j));
    }

    @Override // p146o00Oo0.o000
    public final int OooOO0O() {
        return this.f32073OooO0O0;
    }

    @Override // p146o00Oo0.o000
    public final void OooOO0o(@Nullable o00000O o00000o) {
        ColorFilter colorFilter;
        this.f32075OooO0Oo = o00000o;
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (o00000o != null) {
            Intrinsics.checkNotNullParameter(o00000o, "<this>");
            colorFilter = o00000o.f32082OooO00o;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public final int OooOOO() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : o000oOoO.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final int OooOOO0() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : o000oOoO.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // p146o00Oo0.o000
    public final float OooOOOO() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public final float OooOOOo() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public final void OooOOo(@Nullable o000Oo0 o000oo1) {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        o00O0O o00o0o2 = (o00O0O) o000oo1;
        paint.setPathEffect(o00o0o2 != null ? o00o0o2.f32157OooO0O0 : null);
        this.f32076OooO0o0 = o000oo1;
    }

    public final float OooOOo0() {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public final void OooOOoo(int i) {
        Paint.Cap cap;
        Paint setNativeStrokeCap = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public final void OooOo0(float f) {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public final void OooOo00(int i) {
        Paint.Join join;
        Paint setNativeStrokeJoin = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        if (i == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else {
                join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public final void OooOo0O(float f) {
        Paint paint = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public final void OooOo0o(int i) {
        Paint setNativeStyle = this.f32072OooO00o;
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
