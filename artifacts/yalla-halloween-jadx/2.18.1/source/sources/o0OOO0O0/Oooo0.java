package o0OOO0O0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends OooOo00<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f38100OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f38101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f38102OooO0o0;

    public Oooo0(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f38100OooO0OO = 300.0f;
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO00o(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f38100OooO0OO = clipBounds.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (((LinearProgressIndicatorSpec) this.f38098OooO00o).f17500OooO) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f38099OooO0O0.OooO0o0() && ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38057OooO0o0 == 1) || (this.f38099OooO0O0.OooO0Oo() && ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38056OooO0o == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f38099OooO0O0.OooO0o0() || this.f38099OooO0O0.OooO0Oo()) {
            canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ((f - 1.0f) * ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o) / 2.0f);
        }
        float f3 = this.f38100OooO0OO;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f38098OooO00o;
        this.f38101OooO0Oo = ((LinearProgressIndicatorSpec) s).f38052OooO00o * f;
        this.f38102OooO0o0 = ((LinearProgressIndicatorSpec) s).f38053OooO0O0 * f;
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO0O0(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f38100OooO0OO;
        float f4 = this.f38102OooO0o0;
        float f5 = ((f3 - (f4 * 2.0f)) * f) + ((-f3) / 2.0f);
        float f6 = ((f3 - (f4 * 2.0f)) * f2) + ((-f3) / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f7 = this.f38101OooO0Oo;
        RectF rectF = new RectF(f5, (-f7) / 2.0f, (f4 * 2.0f) + f6, f7 / 2.0f);
        float f8 = this.f38102OooO0o0;
        canvas.drawRoundRect(rectF, f8, f8, paint);
    }

    @Override // o0OOO0O0.OooOo00
    public final void OooO0OO(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iOooO00o = o0O0000O.OooO00o(((LinearProgressIndicatorSpec) this.f38098OooO00o).f38055OooO0Oo, this.f38099OooO0O0.f38094o000oOoO);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iOooO00o);
        float f = this.f38100OooO0OO;
        float f2 = this.f38101OooO0Oo;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f38102OooO0o0;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // o0OOO0O0.OooOo00
    public final int OooO0Oo() {
        return ((LinearProgressIndicatorSpec) this.f38098OooO00o).f38052OooO00o;
    }

    @Override // o0OOO0O0.OooOo00
    public final int OooO0o0() {
        return -1;
    }
}
