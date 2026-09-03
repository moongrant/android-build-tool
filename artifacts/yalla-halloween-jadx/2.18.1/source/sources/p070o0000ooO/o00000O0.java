package p070o0000ooO;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o00000 f27981OooO00o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooO00o(@NonNull Bundle bundle) {
        String strOooO0OO = OooO0OO();
        if (strOooO0OO != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strOooO0OO);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public abstract void OooO0O0(o000OOo o000ooo2);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public abstract String OooO0OO();
}
