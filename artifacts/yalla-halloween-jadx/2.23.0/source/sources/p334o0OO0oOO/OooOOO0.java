package p334o0OO0oOO;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOOO0 extends Drawable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Paint f43253OooO0Oo;

    public OooOOO0() {
        Paint paint = new Paint();
        this.f43253OooO0Oo = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-5592406);
    }

    public final void OooO00o(int i) {
        this.f43253OooO0Oo.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43253OooO0Oo.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f43253OooO0Oo.setColorFilter(colorFilter);
    }
}
