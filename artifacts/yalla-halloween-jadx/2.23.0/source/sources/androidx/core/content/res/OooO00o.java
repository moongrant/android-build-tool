package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p052o00000oO.OooOOOO;
import p188o00o0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f5288OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("sColorStateCacheLock")
    public static final WeakHashMap<OooO0o, SparseArray<OooO0OO>> f5289OooO0O0 = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f5290OooO0OO = new Object();

    public static abstract class OooO {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void OooO00o(final int i) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o0000Ooo.o00Ooo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34241OooO0Oo.OooO0OO(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void OooO0O0(@NonNull final Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o0000Ooo.o00Oo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34239OooO0Oo.OooO0Oo(typeface);
                }
            });
        }

        public abstract void OooO0OO(int i);

        public abstract void OooO0Oo(@NonNull Typeface typeface);
    }

    /* JADX INFO: renamed from: androidx.core.content.res.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(21)
    public static class C0119OooO00o {
        @DoNotInline
        public static Drawable OooO00o(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @DoNotInline
        public static Drawable OooO0O0(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 {
        @DoNotInline
        public static int OooO00o(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        @DoNotInline
        public static ColorStateList OooO0O0(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ColorStateList f5291OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Configuration f5292OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5293OooO0OO;

        public OooO0OO(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f5291OooO00o = colorStateList;
            this.f5292OooO0O0 = configuration;
            this.f5293OooO0OO = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f5294OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Resources.Theme f5295OooO0O0;

        public OooO0o(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f5294OooO00o = resources;
            this.f5295OooO0O0 = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f5294OooO00o.equals(oooO0o.f5294OooO00o) && o000OO.OooO0OO.OooO00o(this.f5295OooO0O0, oooO0o.f5295OooO0O0);
        }

        public final int hashCode() {
            return o000OO.OooO0OO.OooO0O0(this.f5294OooO00o, this.f5295OooO0O0);
        }
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: androidx.core.content.res.OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
        @RequiresApi(23)
        public static class C0120OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final Object f5296OooO00o = new Object();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static Method f5297OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static boolean f5298OooO0OO;
        }

        @RequiresApi(29)
        public static class OooO0O0 {
            @DoNotInline
            public static void OooO00o(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public static void OooO00o(@NonNull Resources.Theme theme) {
            Method method;
            if (Build.VERSION.SDK_INT >= 29) {
                OooO0O0.OooO00o(theme);
                return;
            }
            synchronized (C0120OooO00o.f5296OooO00o) {
                if (C0120OooO00o.f5298OooO0OO) {
                    method = C0120OooO00o.f5297OooO0O0;
                    if (method != null) {
                        method.invoke(theme, new Object[0]);
                    }
                } else {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        C0120OooO00o.f5297OooO0O0 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                    }
                    C0120OooO00o.f5298OooO0OO = true;
                    method = C0120OooO00o.f5297OooO0O0;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            C0120OooO00o.f5297OooO0O0 = null;
                        }
                    }
                }
                throw th;
            }
        }
    }

    public static void OooO00o(@NonNull OooO0o oooO0o, @ColorRes int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f5290OooO0OO) {
            WeakHashMap<OooO0o, SparseArray<OooO0OO>> weakHashMap = f5289OooO0O0;
            SparseArray<OooO0OO> sparseArray = weakHashMap.get(oooO0o);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(oooO0o, sparseArray);
            }
            sparseArray.append(i, new OooO0OO(colorStateList, oooO0o.f5294OooO00o.getConfiguration(), theme));
        }
    }

    @Nullable
    public static Typeface OooO0O0(@FontRes int i, @NonNull Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return OooO0OO(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    public static Typeface OooO0OO(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, @Nullable OooO oooO, boolean z, boolean z2) {
        Typeface typefaceOooO0Oo;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            OooOo<String, Typeface> oooOo = OooOOOO.f33997OooO0O0;
            typefaceOooO0Oo = oooOo.get(OooOOOO.OooO0O0(resources, i, string, i3, i2));
            if (typefaceOooO0Oo != null) {
                if (oooO != null) {
                    oooO.OooO0O0(typefaceOooO0Oo);
                }
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat.OooO0O0 oooO0O0OooO00o = FontResourcesParserCompat.OooO00o(resources.getXml(i), resources);
                        if (oooO0O0OooO00o == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (oooO != null) {
                                oooO.OooO00o(-3);
                            }
                        } else {
                            typefaceOooO0Oo = OooOOOO.OooO00o(context, oooO0O0OooO00o, resources, i, string, typedValue.assetCookie, i2, oooO, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typefaceOooO0Oo = OooOOOO.f33996OooO00o.OooO0Oo(context, resources, i, string, i2);
                        if (typefaceOooO0Oo != null) {
                            oooOo.put(OooOOOO.OooO0O0(resources, i, string, i4, i2), typefaceOooO0Oo);
                        }
                        if (oooO != null) {
                            if (typefaceOooO0Oo != null) {
                                oooO.OooO0O0(typefaceOooO0Oo);
                            } else {
                                oooO.OooO00o(-3);
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (oooO != null) {
                        oooO.OooO00o(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (oooO != null) {
                        oooO.OooO00o(-3);
                    }
                }
            }
            if (typefaceOooO0Oo == null || oooO != null || z2) {
                return typefaceOooO0Oo;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        if (oooO != null) {
            oooO.OooO00o(-3);
        }
        typefaceOooO0Oo = null;
        if (typefaceOooO0Oo == null) {
        }
        return typefaceOooO0Oo;
    }
}
