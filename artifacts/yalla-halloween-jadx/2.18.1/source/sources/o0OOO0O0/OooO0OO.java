package o0OOO0O0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OooOo00<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f38058OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f38059OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f38060OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f38061OooO0o0;

    public OooO0OO(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f38058OooO0OO = 1;
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO00o(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        S s = this.f38098OooO00o;
        float f2 = (((CircularProgressIndicatorSpec) s).f17497OooO0oO / 2.0f) + ((CircularProgressIndicatorSpec) s).f17498OooO0oo;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f38098OooO00o;
        this.f38058OooO0OO = ((CircularProgressIndicatorSpec) s2).f17496OooO == 0 ? 1 : -1;
        this.f38059OooO0Oo = ((CircularProgressIndicatorSpec) s2).f38052OooO00o * f;
        this.f38061OooO0o0 = ((CircularProgressIndicatorSpec) s2).f38053OooO0O0 * f;
        this.f38060OooO0o = (((CircularProgressIndicatorSpec) s2).f17497OooO0oO - ((CircularProgressIndicatorSpec) s2).f38052OooO00o) / 2.0f;
        if ((this.f38099OooO0O0.OooO0o0() && ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38057OooO0o0 == 2) || (this.f38099OooO0O0.OooO0Oo() && ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38056OooO0o == 1)) {
            this.f38060OooO0o = (((1.0f - f) * ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o) / 2.0f) + this.f38060OooO0o;
        } else if ((this.f38099OooO0O0.OooO0o0() && ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38057OooO0o0 == 1) || (this.f38099OooO0O0.OooO0Oo() && ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38056OooO0o == 2)) {
            this.f38060OooO0o -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o) / 2.0f;
        }
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f38059OooO0Oo);
        float f3 = this.f38058OooO0OO;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f38060OooO0o;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.f38061OooO0o0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        OooO0o(canvas, paint, this.f38059OooO0Oo, this.f38061OooO0o0, f4);
        OooO0o(canvas, paint, this.f38059OooO0Oo, this.f38061OooO0o0, f4 + f5);
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iOooO00o = o0O0000O.OooO00o(((CircularProgressIndicatorSpec) this.f38098OooO00o).f38055OooO0Oo, this.f38099OooO0O0.f38094o000oOoO);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iOooO00o);
        paint.setStrokeWidth(this.f38059OooO0Oo);
        float f = this.f38060OooO0o;
        canvas.drawArc(new RectF(-f, -f, f, f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 360.0f, false, paint);
    }

    @Override // o0OOO0O0.OooOo00
    public final int OooO0Oo() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f38098OooO00o;
        return (circularProgressIndicatorSpec.f17498OooO0oo * 2) + circularProgressIndicatorSpec.f17497OooO0oO;
    }

    public final void OooO0o(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f38060OooO0o;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // o0OOO0O0.OooOo00
    public final int OooO0o0() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f38098OooO00o;
        return (circularProgressIndicatorSpec.f17498OooO0oo * 2) + circularProgressIndicatorSpec.f17497OooO0oO;
    }
}
