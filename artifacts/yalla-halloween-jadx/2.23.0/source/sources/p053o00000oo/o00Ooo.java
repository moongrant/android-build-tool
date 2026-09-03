package p053o00000oo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    @RequiresApi(19)
    public static class OooO00o {
        @DoNotInline
        public static int OooO00o(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        public static Drawable OooO0O0(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @DoNotInline
        public static Drawable OooO0OO(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        public static boolean OooO0Oo(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        public static void OooO0o0(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @DoNotInline
        public static void OooO00o(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        public static boolean OooO0O0(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        public static ColorFilter OooO0OO(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        public static void OooO0Oo(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static void OooO0o(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        public static void OooO0o0(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        public static void OooO0oO(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        public static void OooO0oo(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }
    }

    @RequiresApi(23)
    public static class OooO0OO {
        @DoNotInline
        public static int OooO00o(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        public static boolean OooO0O0(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void OooO00o(@NonNull Drawable drawable, @ColorInt int i) {
        OooO0O0.OooO0oO(drawable, i);
    }

    public static void OooO0O0(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        OooO0O0.OooO0oo(drawable, colorStateList);
    }

    public static void OooO0OO(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        OooO0O0.OooO(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T OooO0Oo(@NonNull Drawable drawable) {
        return drawable instanceof oo000o ? (T) ((oo000o) drawable).OooO00o() : drawable;
    }
}
