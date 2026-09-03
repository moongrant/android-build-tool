package p227o00oOOoO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import o000O000.OooO00o;
import p012OooOo0.OooOO0O;
import p016OooOoO0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile boolean f33877OooO00o = true;

    public static Drawable OooO00o(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f33877OooO00o) {
                return OooOO0O.OooO0O0(theme != null ? new OooOOO0(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            Object obj = OooO00o.f28085OooO00o;
            return OooO00o.OooO0OO.OooO0O0(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f33877OooO00o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
        return androidx.core.content.res.OooO00o.C0045OooO00o.OooO00o(resources, i, theme);
    }
}
