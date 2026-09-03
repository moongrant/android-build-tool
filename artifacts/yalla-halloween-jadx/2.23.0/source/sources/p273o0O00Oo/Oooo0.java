package p273o0O00Oo;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.annotation.NonNull;
import p273o0O00Oo.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0<S extends OooO0OO> extends OooOo00 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo<S> f41746OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Oooo000<ObjectAnimator> f41747OooOOOo;

    public Oooo0(@NonNull Context context, @NonNull OooO0OO oooO0OO, @NonNull OooOo<S> oooOo, @NonNull Oooo000<ObjectAnimator> oooo000) {
        super(context, oooO0OO);
        this.f41746OooOOOO = oooOo;
        oooOo.f41734OooO0O0 = this;
        this.f41747OooOOOo = oooo000;
        oooo000.f41748OooO00o = this;
    }

    @Override // p273o0O00Oo.OooOo00
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        if (!isRunning()) {
            this.f41747OooOOOo.OooO00o();
        }
        OooO0O0 oooO0O0 = this.f41738OooO0o;
        ContentResolver contentResolver = this.f41737OooO0Oo.getContentResolver();
        oooO0O0.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.f41747OooOOOo.OooO0o0();
        }
        return zOooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        OooOo<S> oooOo = this.f41746OooOOOO;
        Rect bounds = getBounds();
        float fOooO0O0 = OooO0O0();
        oooOo.f41733OooO00o.OooO00o();
        oooOo.OooO00o(canvas, bounds, fOooO0O0);
        OooOo<S> oooOo2 = this.f41746OooOOOO;
        Paint paint = this.f41744OooOO0o;
        oooOo2.OooO0OO(canvas, paint);
        int i = 0;
        while (true) {
            Oooo000<ObjectAnimator> oooo000 = this.f41747OooOOOo;
            int[] iArr = oooo000.f41750OooO0OO;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            OooOo<S> oooOo3 = this.f41746OooOOOO;
            int i2 = i * 2;
            float[] fArr = oooo000.f41749OooO0O0;
            oooOo3.OooO0O0(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f41746OooOOOO.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f41746OooOOOO.OooO0o0();
    }
}
