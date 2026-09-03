package o00000O;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o00Oo0 f33447OooO00o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooO00o(@NonNull Bundle bundle) {
        String strOooO0OO = OooO0OO();
        if (strOooO0OO != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strOooO0OO);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public abstract void OooO0O0(oo000o oo000oVar);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public abstract String OooO0OO();

    public final void OooO0Oo(@Nullable o00Oo0 o00oo1) {
        if (this.f33447OooO00o != o00oo1) {
            this.f33447OooO00o = o00oo1;
            if (o00oo1 != null) {
                o00oo1.OooO0o0(this);
            }
        }
    }
}
