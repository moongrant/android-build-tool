package p335o0OO0o0O;

import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 extends o00oO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(@NotNull oo0o0Oo permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO00o() {
        oo0o0Oo oo0o0oo = this.f42472OooO00o;
        if (oo0o0oo.f42491OooO0o0.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                oo0o0oo.f42491OooO0o0.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                oo0o0oo.f42490OooO0o.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (ContextCompat.OooO00o(oo0o0oo.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                finish();
                return;
            }
            boolean z = ContextCompat.OooO00o(oo0o0oo.OooO00o(), "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean z2 = ContextCompat.OooO00o(oo0o0oo.OooO00o(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
            if (z || z2) {
                OooO0O0(CollectionsKt.emptyList());
                return;
            }
        }
        finish();
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO0O0(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        oo0o0Oo permissionBuilder = this.f42472OooO00o;
        permissionBuilder.getClass();
        Intrinsics.checkNotNullParameter(this, "chainTask");
        o0OO00O o0oo00oOooO0OO = permissionBuilder.OooO0OO();
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        o0oo00oOooO0OO.f42476OooO0Oo = permissionBuilder;
        o0oo00oOooO0OO.f42478OooO0o0 = this;
        o0oo00oOooO0OO.f42479OooO0oO.OooO0O0("android.permission.ACCESS_BACKGROUND_LOCATION");
    }
}
