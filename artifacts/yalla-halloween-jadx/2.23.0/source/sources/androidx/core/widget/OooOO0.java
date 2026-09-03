package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0 {
    @DoNotInline
    public static ColorStateList OooO00o(ImageView imageView) {
        return imageView.getImageTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode OooO0O0(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    @DoNotInline
    public static void OooO0OO(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    @DoNotInline
    public static void OooO0Oo(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
