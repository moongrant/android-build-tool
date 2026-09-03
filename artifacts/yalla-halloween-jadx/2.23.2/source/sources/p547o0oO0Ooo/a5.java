package p547o0oO0Ooo;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.annotation.NonNull;
import p547o0oO0Ooo.p4;

/* JADX INFO: loaded from: classes3.dex */
public final class a5<S extends p4> extends x4 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public y4<S> f55778OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public z4<ObjectAnimator> f55779OooOOOo;

    public a5(@NonNull Context context, @NonNull p4 p4Var, @NonNull y4<S> y4Var, @NonNull z4<ObjectAnimator> z4Var) {
        super(context, p4Var);
        this.f55778OooOOOO = y4Var;
        y4Var.f55850OooO0O0 = this;
        this.f55779OooOOOo = z4Var;
        z4Var.f55851OooO00o = this;
    }

    @Override // p547o0oO0Ooo.x4
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        if (!isRunning()) {
            this.f55779OooOOOo.OooO00o();
        }
        o4 o4Var = this.f55841OooO0o;
        ContentResolver contentResolver = this.f55840OooO0Oo.getContentResolver();
        o4Var.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.f55779OooOOOo.OooO0o0();
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
        y4<S> y4Var = this.f55778OooOOOO;
        Rect bounds = getBounds();
        float fOooO0O0 = OooO0O0();
        y4Var.f55849OooO00o.OooO00o();
        y4Var.OooO00o(canvas, bounds, fOooO0O0);
        y4<S> y4Var2 = this.f55778OooOOOO;
        Paint paint = this.f55847OooOO0o;
        y4Var2.OooO0OO(canvas, paint);
        int i = 0;
        while (true) {
            z4<ObjectAnimator> z4Var = this.f55779OooOOOo;
            int[] iArr = z4Var.f55853OooO0OO;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            y4<S> y4Var3 = this.f55778OooOOOO;
            int i2 = i * 2;
            float[] fArr = z4Var.f55852OooO0O0;
            y4Var3.OooO0O0(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f55778OooOOOO.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f55778OooOOOO.OooO0o0();
    }
}
