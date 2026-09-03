package p331o0OO0o0;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends o0OOO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull o000000 permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO00o() {
        o000000 o000000Var = this.f43190OooO00o;
        if (!o000000Var.f43174OooO0o0.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
            finish();
            return;
        }
        if (o000000Var.OooO0Oo() < 23) {
            o000000Var.f43175OooO0oO.add("android.permission.SYSTEM_ALERT_WINDOW");
            o000000Var.f43174OooO0o0.remove("android.permission.SYSTEM_ALERT_WINDOW");
            finish();
        } else if (Settings.canDrawOverlays(o000000Var.OooO00o())) {
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
        if (Settings.canDrawOverlays(o000oooOooO0OO.getContext())) {
            o000oooOooO0OO.OooO0o0();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", o000oooOooO0OO.requireActivity().getPackageName())));
        o000oooOooO0OO.f43185OooO0oo.OooO0O0(intent);
    }
}
