package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p071o000O0o.OooOOO0;
import p081o000OoO.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f7829OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("sColorStateCacheLock")
    public static final WeakHashMap<OooO0o, SparseArray<OooO0OO>> f7830OooO0O0 = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f7831OooO0OO = new Object();

    public static abstract class OooO {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler OooO0OO() {
            return new Handler(Looper.getMainLooper());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void OooO00o(final int i) {
            OooO0OO().post(new Runnable() { // from class: o000OoO.o00Oo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28340Oooo0o.OooO0Oo(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void OooO0O0(@NonNull Typeface typeface) {
            OooO0OO().post(new o00O0O(this, typeface, 0));
        }

        public abstract void OooO0Oo(int i);

        public abstract void OooO0o0(@NonNull Typeface typeface);
    }

    /* JADX INFO: renamed from: androidx.core.content.res.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(21)
    public static class C0045OooO00o {
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
        public final ColorStateList f7832OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Configuration f7833OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7834OooO0OO;

        public OooO0OO(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f7832OooO00o = colorStateList;
            this.f7833OooO0O0 = configuration;
            this.f7834OooO0OO = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f7835OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Resources.Theme f7836OooO0O0;

        public OooO0o(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f7835OooO00o = resources;
            this.f7836OooO0O0 = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f7835OooO00o.equals(oooO0o.f7835OooO00o) && o000OO0O.OooO0OO.OooO00o(this.f7836OooO0O0, oooO0o.f7836OooO0O0);
        }

        public final int hashCode() {
            return o000OO0O.OooO0OO.OooO0O0(this.f7835OooO00o, this.f7836OooO0O0);
        }
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return OooO0O0(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    public static Typeface OooO0O0(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, @Nullable OooO oooO, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Resource \"");
            sbOooO0o0.append(resources.getResourceName(i));
            sbOooO0o0.append("\" (");
            sbOooO0o0.append(Integer.toHexString(i));
            sbOooO0o0.append(") is not a Font: ");
            sbOooO0o0.append(typedValue);
            throw new Resources.NotFoundException(sbOooO0o0.toString());
        }
        String string = charSequence.toString();
        Typeface typefaceOooO00o = null;
        if (string.startsWith("res/")) {
            Typeface typeface = OooOOO0.f28176OooO0O0.get(OooOOO0.OooO0OO(resources, i, string, typedValue.assetCookie, i2));
            if (typeface != null) {
                if (oooO != null) {
                    oooO.OooO0O0(typeface);
                }
                typefaceOooO00o = typeface;
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
                            typefaceOooO00o = OooOOO0.OooO00o(context, oooO0O0OooO00o, resources, i, string, typedValue.assetCookie, i2, oooO, z);
                        }
                    } else {
                        Typeface typefaceOooO0O0 = OooOOO0.OooO0O0(context, resources, i, string, typedValue.assetCookie, i2);
                        if (oooO != null) {
                            if (typefaceOooO0O0 != null) {
                                oooO.OooO0O0(typefaceOooO0O0);
                            } else {
                                oooO.OooO00o(-3);
                            }
                        }
                        typefaceOooO00o = typefaceOooO0O0;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                    if (oooO != null) {
                        oooO.OooO00o(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e2);
                    if (oooO != null) {
                        oooO.OooO00o(-3);
                    }
                }
            }
        } else if (oooO != null) {
            oooO.OooO00o(-3);
        }
        if (typefaceOooO00o != null || oooO != null || z2) {
            return typefaceOooO00o;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Font resource ID #0x");
        sbOooO0o1.append(Integer.toHexString(i));
        sbOooO0o1.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sbOooO0o1.toString());
    }
}
