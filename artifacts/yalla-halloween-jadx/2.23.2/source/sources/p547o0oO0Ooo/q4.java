package p547o0oO0Ooo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import p274o0O000oo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 extends y4<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f55811OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f55812OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f55813OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f55814OooO0o0;

    public q4(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f55811OooO0OO = 1;
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO00o(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float fWidth = rect.width() / OooO0o();
        float fHeight = rect.height() / OooO0o();
        S s = this.f55849OooO00o;
        float f2 = (((CircularProgressIndicatorSpec) s).f17008OooO0oO / 2.0f) + ((CircularProgressIndicatorSpec) s).f17009OooO0oo;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f55811OooO0OO = ((CircularProgressIndicatorSpec) s).f17007OooO == 0 ? 1 : -1;
        this.f55812OooO0Oo = ((CircularProgressIndicatorSpec) s).f55805OooO00o * f;
        this.f55814OooO0o0 = ((CircularProgressIndicatorSpec) s).f55806OooO0O0 * f;
        this.f55813OooO0o = (((CircularProgressIndicatorSpec) s).f17008OooO0oO - ((CircularProgressIndicatorSpec) s).f55805OooO00o) / 2.0f;
        if ((this.f55850OooO0O0.OooO0Oo() && ((CircularProgressIndicatorSpec) s).f55810OooO0o0 == 2) || (this.f55850OooO0O0.OooO0OO() && ((CircularProgressIndicatorSpec) s).f55809OooO0o == 1)) {
            this.f55813OooO0o = (((1.0f - f) * ((CircularProgressIndicatorSpec) s).f55805OooO00o) / 2.0f) + this.f55813OooO0o;
        } else if ((this.f55850OooO0O0.OooO0Oo() && ((CircularProgressIndicatorSpec) s).f55810OooO0o0 == 1) || (this.f55850OooO0O0.OooO0OO() && ((CircularProgressIndicatorSpec) s).f55809OooO0o == 2)) {
            this.f55813OooO0o -= ((1.0f - f) * ((CircularProgressIndicatorSpec) s).f55805OooO00o) / 2.0f;
        }
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f55812OooO0Oo);
        float f3 = this.f55811OooO0OO;
        float f4 = f * 360.0f * f3;
        if (f2 < f) {
            f2 += 1.0f;
        }
        float f5 = (f2 - f) * 360.0f * f3;
        float f6 = this.f55813OooO0o;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.f55814OooO0o0 <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f8 = this.f55812OooO0Oo;
        float f9 = this.f55814OooO0o0;
        canvas.save();
        canvas.rotate(f4);
        float f10 = this.f55813OooO0o;
        float f11 = f8 / 2.0f;
        canvas.drawRoundRect(new RectF(f10 - f11, f9, f10 + f11, -f9), f9, f9, paint);
        canvas.restore();
        float f12 = this.f55812OooO0Oo;
        float f13 = this.f55814OooO0o0;
        canvas.save();
        canvas.rotate(f4 + f5);
        float f14 = this.f55813OooO0o;
        float f15 = f12 / 2.0f;
        canvas.drawRoundRect(new RectF(f14 - f15, f13, f14 + f15, -f13), f13, f13, paint);
        canvas.restore();
    }

    @Override // p547o0oO0Ooo.y4
    public final void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iOooO00o = OooOOO0.OooO00o(((CircularProgressIndicatorSpec) this.f55849OooO00o).f55808OooO0Oo, this.f55850OooO0O0.f55848OooOOO0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iOooO00o);
        paint.setStrokeWidth(this.f55812OooO0Oo);
        float f = this.f55813OooO0o;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // p547o0oO0Ooo.y4
    public final int OooO0Oo() {
        return OooO0o();
    }

    public final int OooO0o() {
        S s = this.f55849OooO00o;
        return (((CircularProgressIndicatorSpec) s).f17009OooO0oo * 2) + ((CircularProgressIndicatorSpec) s).f17008OooO0oO;
    }

    @Override // p547o0oO0Ooo.y4
    public final int OooO0o0() {
        return OooO0o();
    }
}
