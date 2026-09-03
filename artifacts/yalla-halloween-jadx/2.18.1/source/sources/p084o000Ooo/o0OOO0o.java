package p084o000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Method f28381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f28382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Method f28383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f28384OooO0Oo;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            OooO00o(OooO00o.OooO0OO((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof o0OO00O) {
            OooO00o(((o0OO00O) drawable).OooO0O0());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable drawableOooO0O0 = OooO00o.OooO0O0(drawableContainerState, i);
            if (drawableOooO0O0 != null) {
                OooO00o(drawableOooO0O0);
            }
        }
    }

    public static int OooO0O0(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return OooO0OO.OooO00o(drawable);
        }
        if (!f28384OooO0Oo) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f28383OooO0OO = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f28384OooO0Oo = true;
        }
        Method method = f28383OooO0OO;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f28383OooO0OO = null;
            }
        }
        return 0;
    }

    public static boolean OooO0OO(@NonNull Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return OooO0OO.OooO0O0(drawable, i);
        }
        if (!f28382OooO0O0) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f28381OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f28382OooO0O0 = true;
        }
        Method method = f28381OooO00o;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f28381OooO00o = null;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T OooO0Oo(@NonNull Drawable drawable) {
        return drawable instanceof o0OO00O ? (T) ((o0OO00O) drawable).OooO0O0() : drawable;
    }

    @NonNull
    public static Drawable OooO0o0(@NonNull Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof o0Oo0oo)) ? new o0O0O00(drawable) : drawable;
    }
}
