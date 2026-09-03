package p454o0Ooo0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Drawable {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bitmap f40358OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40361OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f40357OooO00o = new Paint(2);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40359OooO0OO = KotlinVersion.MAX_COMPONENT_VALUE;

    public OooOO0O(Bitmap bitmap) {
        this.f40358OooO0O0 = bitmap;
        if (bitmap != null) {
            this.f40360OooO0Oo = bitmap.getWidth();
            this.f40361OooO0o0 = this.f40358OooO0O0.getHeight();
        } else {
            this.f40361OooO0o0 = 0;
            this.f40360OooO0Oo = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f40358OooO0O0;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f40358OooO0O0, (Rect) null, getBounds(), this.f40357OooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40359OooO0OO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f40361OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f40360OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f40361OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f40360OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40359OooO0OO = i;
        this.f40357OooO00o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40357OooO00o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f40357OooO00o.setFilterBitmap(z);
    }
}
