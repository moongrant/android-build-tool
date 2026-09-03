package p331o0OO0o0;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends o0OOO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(@NotNull o000000 permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO00o() {
        o000000 o000000Var = this.f43190OooO00o;
        if (!o000000Var.f43174OooO0o0.contains("android.permission.REQUEST_INSTALL_PACKAGES") || Build.VERSION.SDK_INT < 26 || o000000Var.OooO0Oo() < 26) {
            finish();
        } else if (o000000Var.OooO00o().getPackageManager().canRequestPackageInstalls()) {
            finish();
        } else {
            finish();
        }
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
        if (Build.VERSION.SDK_INT < 26) {
            o000oooOooO0OO.OooO0OO();
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", o000oooOooO0OO.requireActivity().getPackageName())));
        o000oooOooO0OO.f43187OooOO0O.OooO0O0(intent);
    }
}
