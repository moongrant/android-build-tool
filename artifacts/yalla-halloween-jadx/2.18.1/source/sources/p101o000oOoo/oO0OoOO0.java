package p101o000oOoo;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oO0OoOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f29761OooO00o = true;

    public static void OooO00o(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f29761OooO00o) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f29761OooO00o = false;
            }
        }
    }
}
