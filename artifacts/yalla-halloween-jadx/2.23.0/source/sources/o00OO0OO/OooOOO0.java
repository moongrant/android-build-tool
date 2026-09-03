package o00OO0OO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import p016OooOoOO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile boolean f37260OooO00o = true;

    public static Drawable OooO00o(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f37260OooO00o) {
                return OooO0O0(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            Object obj = ContextCompat.f5271OooO00o;
            return ContextCompat.OooO0OO.OooO0O0(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f37260OooO00o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        return androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i, theme);
    }

    public static Drawable OooO0O0(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            o00Oo0 o00oo1 = new o00Oo0(context, theme);
            o00oo1.OooO00o(theme.getResources().getConfiguration());
            context = o00oo1;
        }
        return p013OooOo0o.o00Oo0.OooO00o(context, i);
    }
}
