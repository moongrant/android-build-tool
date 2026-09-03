package p406o0Oo0OOO;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000o0 extends oO0Oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(@NotNull oO00000o permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO00o() {
        if (!this.f39127OooO00o.f39119OooO0o0.contains("android.permission.REQUEST_INSTALL_PACKAGES") || Build.VERSION.SDK_INT < 26 || this.f39127OooO00o.OooO0Oo() < 26) {
            OooO0O0();
        } else {
            if (this.f39127OooO00o.OooO00o().getPackageManager().canRequestPackageInstalls()) {
                OooO0O0();
                return;
            }
            Objects.requireNonNull(this.f39127OooO00o);
            Objects.requireNonNull(this.f39127OooO00o);
            OooO0O0();
        }
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO0OO(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        oO00000o permissionBuilder = this.f39127OooO00o;
        Objects.requireNonNull(permissionBuilder);
        Intrinsics.checkNotNullParameter(this, "chainTask");
        oO00000 oo00000OooO0OO = permissionBuilder.OooO0OO();
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        oo00000OooO0OO.f39106Oooo0o = permissionBuilder;
        oo00000OooO0OO.f39107Oooo0oO = this;
        if (Build.VERSION.SDK_INT < 26) {
            oo00000OooO0OO.OooO0O0();
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse(Intrinsics.stringPlus("package:", oo00000OooO0OO.requireActivity().getPackageName())));
        oo00000OooO0OO.f39109OoooO.OooO0O0(intent);
    }
}
