package p115o00O00oO;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Scale;
import coil.size.Size;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p113o00O00Oo.OooO0O0;
import p119o00O0Oo0.Oooo000;
import p119o00O0Oo0.o00O0O;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f30353OooO00o;

    public o000oOoO(@NotNull OooO0O0 bitmapPool) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.f30353OooO00o = bitmapPool;
    }

    @WorkerThread
    @NotNull
    public final Bitmap OooO00o(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull Size size, @NotNull Scale scale, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap3, "bitmap");
            boolean z2 = true;
            if (bitmap3.getConfig() == Oooo000.OooO0o0(config)) {
                if (!z && !(size instanceof OriginalSize) && !Intrinsics.areEqual(size, Oooo000.OooO00o(bitmap3.getWidth(), bitmap3.getHeight(), size, scale))) {
                    z2 = false;
                }
                if (z2) {
                    return bitmap3;
                }
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "drawable.mutate()");
        o00O o00o2 = o00O0O.f30749OooO00o;
        Intrinsics.checkNotNullParameter(drawableMutate, "<this>");
        Integer numValueOf = null;
        BitmapDrawable bitmapDrawable = drawableMutate instanceof BitmapDrawable ? (BitmapDrawable) drawableMutate : null;
        Integer numValueOf2 = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? null : Integer.valueOf(bitmap2.getWidth());
        int intrinsicWidth = numValueOf2 == null ? drawableMutate.getIntrinsicWidth() : numValueOf2.intValue();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        Intrinsics.checkNotNullParameter(drawableMutate, "<this>");
        BitmapDrawable bitmapDrawable2 = drawableMutate instanceof BitmapDrawable ? (BitmapDrawable) drawableMutate : null;
        if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
            numValueOf = Integer.valueOf(bitmap.getHeight());
        }
        int intrinsicHeight = numValueOf == null ? drawableMutate.getIntrinsicHeight() : numValueOf.intValue();
        PixelSize pixelSizeOooO00o = Oooo000.OooO00o(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 512, size, scale);
        int i = pixelSizeOooO00o.f9946Oooo0o;
        int i2 = pixelSizeOooO00o.f9947Oooo0oO;
        Bitmap bitmapOooO0OO = this.f30353OooO00o.OooO0OO(i, i2, Oooo000.OooO0o0(config));
        Rect bounds = drawableMutate.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawableMutate.setBounds(0, 0, i, i2);
        drawableMutate.draw(new Canvas(bitmapOooO0OO));
        drawableMutate.setBounds(i3, i4, i5, i6);
        return bitmapOooO0OO;
    }
}
