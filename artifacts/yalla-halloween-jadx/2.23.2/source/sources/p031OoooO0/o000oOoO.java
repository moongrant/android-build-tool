package p031OoooO0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000oOoO {

    @RequiresApi(30)
    public static class OooO00o {
        @NonNull
        @DoNotInline
        public static Context OooO00o(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        public static String OooO0O0(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    @NonNull
    public static Context OooO00o(@NonNull Context context) {
        String strOooO0O0;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (strOooO0O0 = OooO00o.OooO0O0(context)) == null) ? applicationContext : OooO00o.OooO00o(applicationContext, strOooO0O0);
    }

    @Nullable
    public static Application OooO0O0(@NonNull Context context) {
        String strOooO0O0;
        Context contextOooO00o = OooO00o(context);
        while (contextOooO00o instanceof ContextWrapper) {
            if (contextOooO00o instanceof Application) {
                return (Application) contextOooO00o;
            }
            ContextWrapper contextWrapper = (ContextWrapper) contextOooO00o;
            Context baseContext = contextWrapper.getBaseContext();
            contextOooO00o = (Build.VERSION.SDK_INT < 30 || (strOooO0O0 = OooO00o.OooO0O0(contextWrapper)) == null) ? baseContext : OooO00o.OooO00o(baseContext, strOooO0O0);
        }
        return null;
    }
}
