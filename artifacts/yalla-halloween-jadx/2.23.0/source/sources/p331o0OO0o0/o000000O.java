package p331o0OO0o0;

import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o0OOO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(@NotNull o000000 permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO00o() {
        o000000 o000000Var = this.f43190OooO00o;
        if (o000000Var.f43174OooO0o0.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                o000000Var.f43174OooO0o0.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                o000000Var.f43173OooO0o.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (ContextCompat.OooO00o(o000000Var.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                finish();
                return;
            }
            boolean z = ContextCompat.OooO00o(o000000Var.OooO00o(), "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean z2 = ContextCompat.OooO00o(o000000Var.OooO00o(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
            if (z || z2) {
                OooO0O0(CollectionsKt.emptyList());
                return;
            }
        }
        finish();
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO0O0(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        o000000 permissionBuilder = this.f43190OooO00o;
        permissionBuilder.getClass();
        Intrinsics.checkNotNullParameter(this, "chainTask");
        o000OOo o000oooOooO0OO = permissionBuilder.OooO0OO();
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        o000oooOooO0OO.f43181OooO0Oo = permissionBuilder;
        o000oooOooO0OO.f43183OooO0o0 = this;
        o000oooOooO0OO.f43184OooO0oO.OooO0O0("android.permission.ACCESS_BACKGROUND_LOCATION");
    }
}
