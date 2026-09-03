package p547o0oO0Ooo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p274o0O000oo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 extends y4<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f55780OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f55781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Path f55782OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f55783OooO0o0;

    public b5(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f55780OooO0OO = 300.0f;
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO00o(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f55780OooO0OO = rect.width();
        S s = this.f55849OooO00o;
        float f2 = ((LinearProgressIndicatorSpec) s).f55805OooO00o;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) s).f55805OooO00o) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) s).f17011OooO) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f55850OooO0O0.OooO0Oo() && ((LinearProgressIndicatorSpec) s).f55810OooO0o0 == 1) || (this.f55850OooO0O0.OooO0OO() && ((LinearProgressIndicatorSpec) s).f55809OooO0o == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f55850OooO0O0.OooO0Oo() || this.f55850OooO0O0.OooO0OO()) {
            canvas.translate(0.0f, ((f - 1.0f) * ((LinearProgressIndicatorSpec) s).f55805OooO00o) / 2.0f);
        }
        float f3 = this.f55780OooO0OO;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.f55781OooO0Oo = ((LinearProgressIndicatorSpec) s).f55805OooO00o * f;
        this.f55783OooO0o0 = ((LinearProgressIndicatorSpec) s).f55806OooO0O0 * f;
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f55780OooO0OO;
        float f4 = (-f3) / 2.0f;
        float f5 = ((f * f3) + f4) - (this.f55783OooO0o0 * 2.0f);
        float f6 = (f2 * f3) + f4;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f55782OooO0o);
        float f7 = this.f55781OooO0Oo;
        RectF rectF = new RectF(f5, (-f7) / 2.0f, f6, f7 / 2.0f);
        float f8 = this.f55783OooO0o0;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        canvas.restore();
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iOooO00o = OooOOO0.OooO00o(((LinearProgressIndicatorSpec) this.f55849OooO00o).f55808OooO0Oo, this.f55850OooO0O0.f55848OooOOO0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iOooO00o);
        Path path = new Path();
        this.f55782OooO0o = path;
        float f = this.f55780OooO0OO;
        float f2 = this.f55781OooO0Oo;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f55783OooO0o0;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f55782OooO0o, paint);
    }

    @Override // p547o0oO0Ooo.y4
    public final int OooO0Oo() {
        return ((LinearProgressIndicatorSpec) this.f55849OooO00o).f55805OooO00o;
    }

    @Override // p547o0oO0Ooo.y4
    public final int OooO0o0() {
        return -1;
    }
}
