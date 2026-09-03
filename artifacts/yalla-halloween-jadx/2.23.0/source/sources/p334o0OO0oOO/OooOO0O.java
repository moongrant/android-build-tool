package p334o0OO0oOO;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43246OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43245OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Path f43247OooO0oO = new Path();

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int i = this.f43246OooO0o0;
        Path path = this.f43247OooO0oO;
        if (i != iWidth || this.f43245OooO0o != iHeight) {
            path.reset();
            float f = (iWidth * 30) / 225;
            float f2 = f * 0.70710677f;
            float f3 = f / 0.70710677f;
            float f4 = iWidth;
            float f5 = f4 / 2.0f;
            float f6 = iHeight;
            path.moveTo(f5, f6);
            float f7 = f6 / 2.0f;
            path.lineTo(0.0f, f7);
            float f8 = f7 - f2;
            path.lineTo(f2, f8);
            float f9 = f / 2.0f;
            float f10 = f5 - f9;
            float f11 = (f6 - f3) - f9;
            path.lineTo(f10, f11);
            path.lineTo(f10, 0.0f);
            float f12 = f5 + f9;
            path.lineTo(f12, 0.0f);
            path.lineTo(f12, f11);
            path.lineTo(f4 - f2, f8);
            path.lineTo(f4, f7);
            path.close();
            this.f43246OooO0o0 = iWidth;
            this.f43245OooO0o = iHeight;
        }
        canvas.drawPath(path, this.f43253OooO0Oo);
    }
}
