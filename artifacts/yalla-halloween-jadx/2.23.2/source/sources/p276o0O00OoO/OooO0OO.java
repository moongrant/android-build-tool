package p276o0O00OoO;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {
    @Nullable
    public static TypedValue OooO00o(@AttrRes int i, @NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean OooO0O0(@NonNull Context context, @AttrRes int i, boolean z) {
        TypedValue typedValueOooO00o = OooO00o(i, context);
        if (typedValueOooO00o == null || typedValueOooO00o.type != 18) {
            return z;
        }
        return typedValueOooO00o.data != 0;
    }

    @NonNull
    public static TypedValue OooO0OO(@AttrRes int i, @NonNull Context context, @NonNull String str) {
        TypedValue typedValueOooO00o = OooO00o(i, context);
        if (typedValueOooO00o != null) {
            return typedValueOooO00o;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
