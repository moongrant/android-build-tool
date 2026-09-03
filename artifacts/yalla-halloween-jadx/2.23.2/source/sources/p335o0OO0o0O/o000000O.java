package p335o0OO0o0O;

import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends o00oO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(@NotNull oo0o0Oo permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO00o() {
        if (!this.f42472OooO00o.f42491OooO0o0.contains("android.permission.MANAGE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT < 30) {
            finish();
        } else if (Environment.isExternalStorageManager()) {
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
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            o0oo00oOooO0OO.OooO0Oo();
        } else {
            o0oo00oOooO0OO.f42481OooOO0.OooO0O0(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
        }
    }
}
