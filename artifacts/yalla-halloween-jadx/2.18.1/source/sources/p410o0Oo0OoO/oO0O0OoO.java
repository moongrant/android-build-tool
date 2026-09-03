package p410o0Oo0OoO;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oO0O0OoO extends Drawable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Paint f39168Oooo0o;

    public oO0O0OoO() {
        Paint paint = new Paint();
        this.f39168Oooo0o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f39168Oooo0o.setAntiAlias(true);
        this.f39168Oooo0o.setColor(-5592406);
    }

    public final void OooO00o(int i) {
        this.f39168Oooo0o.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f39168Oooo0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39168Oooo0o.setColorFilter(colorFilter);
    }
}
