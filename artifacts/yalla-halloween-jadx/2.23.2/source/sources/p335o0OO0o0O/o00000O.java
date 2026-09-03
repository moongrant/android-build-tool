package p335o0OO0o0O;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends o00oO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(@NotNull oo0o0Oo permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO00o() {
        oo0o0Oo oo0o0oo = this.f42472OooO00o;
        if (!oo0o0oo.f42491OooO0o0.contains("android.permission.WRITE_SETTINGS")) {
            finish();
            return;
        }
        if (oo0o0oo.OooO0Oo() < 23) {
            oo0o0oo.f42492OooO0oO.add("android.permission.WRITE_SETTINGS");
            oo0o0oo.f42491OooO0o0.remove("android.permission.WRITE_SETTINGS");
            finish();
        } else if (Settings.System.canWrite(oo0o0oo.OooO00o())) {
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
        if (Settings.System.canWrite(o0oo00oOooO0OO.getContext())) {
            o0oo00oOooO0OO.OooO0o();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", o0oo00oOooO0OO.requireActivity().getPackageName())));
        o0oo00oOooO0OO.f42475OooO.OooO0O0(intent);
    }
}
