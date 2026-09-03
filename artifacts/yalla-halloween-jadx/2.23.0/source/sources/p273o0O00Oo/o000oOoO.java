package p273o0O00Oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p272o0O000oo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends OooOo<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f41751OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f41752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Path f41753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f41754OooO0o0;

    public o000oOoO(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f41751OooO0OO = 300.0f;
    }

    @Override // p273o0O00Oo.OooOo
    public final void OooO00o(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f41751OooO0OO = rect.width();
        S s = this.f41733OooO00o;
        float f2 = ((LinearProgressIndicatorSpec) s).f41701OooO00o;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) s).f41701OooO00o) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) s).f17484OooO) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f41734OooO0O0.OooO0Oo() && ((LinearProgressIndicatorSpec) s).f41706OooO0o0 == 1) || (this.f41734OooO0O0.OooO0OO() && ((LinearProgressIndicatorSpec) s).f41705OooO0o == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f41734OooO0O0.OooO0Oo() || this.f41734OooO0O0.OooO0OO()) {
            canvas.translate(0.0f, ((f - 1.0f) * ((LinearProgressIndicatorSpec) s).f41701OooO00o) / 2.0f);
        }
        float f3 = this.f41751OooO0OO;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.f41752OooO0Oo = ((LinearProgressIndicatorSpec) s).f41701OooO00o * f;
        this.f41754OooO0o0 = ((LinearProgressIndicatorSpec) s).f41702OooO0O0 * f;
    }

    @Override // p273o0O00Oo.OooOo
    public final void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f41751OooO0OO;
        float f4 = (-f3) / 2.0f;
        float f5 = ((f * f3) + f4) - (this.f41754OooO0o0 * 2.0f);
        float f6 = (f2 * f3) + f4;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f41753OooO0o);
        float f7 = this.f41752OooO0Oo;
        RectF rectF = new RectF(f5, (-f7) / 2.0f, f6, f7 / 2.0f);
        float f8 = this.f41754OooO0o0;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        canvas.restore();
    }

    @Override // p273o0O00Oo.OooOo
    public final void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iOooO00o = OooOOO.OooO00o(((LinearProgressIndicatorSpec) this.f41733OooO00o).f41704OooO0Oo, this.f41734OooO0O0.f41745OooOOO0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iOooO00o);
        Path path = new Path();
        this.f41753OooO0o = path;
        float f = this.f41751OooO0OO;
        float f2 = this.f41752OooO0Oo;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f41754OooO0o0;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f41753OooO0o, paint);
    }

    @Override // p273o0O00Oo.OooOo
    public final int OooO0Oo() {
        return ((LinearProgressIndicatorSpec) this.f41733OooO00o).f41701OooO00o;
    }

    @Override // p273o0O00Oo.OooOo
    public final int OooO0o0() {
        return -1;
    }
}
