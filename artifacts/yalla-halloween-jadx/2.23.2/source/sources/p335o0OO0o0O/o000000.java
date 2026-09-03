package p335o0OO0o0O;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends o00oO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(@NotNull oo0o0Oo permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO00o() {
        oo0o0Oo oo0o0oo = this.f42472OooO00o;
        if (!oo0o0oo.f42491OooO0o0.contains("android.permission.REQUEST_INSTALL_PACKAGES") || Build.VERSION.SDK_INT < 26 || oo0o0oo.OooO0Oo() < 26) {
            finish();
        } else if (oo0o0oo.OooO00o().getPackageManager().canRequestPackageInstalls()) {
            finish();
        } else {
            finish();
        }
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
        if (Build.VERSION.SDK_INT < 26) {
            o0oo00oOooO0OO.OooO0OO();
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", o0oo00oOooO0OO.requireActivity().getPackageName())));
        o0oo00oOooO0OO.f42482OooOO0O.OooO0O0(intent);
    }
}
