package p331o0OO0o0;

import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends o0OOO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(@NotNull o000000 permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO00o() {
        if (!this.f43190OooO00o.f43174OooO0o0.contains("android.permission.MANAGE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT < 30) {
            finish();
        } else if (Environment.isExternalStorageManager()) {
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
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            o000oooOooO0OO.OooO0Oo();
        } else {
            o000oooOooO0OO.f43186OooOO0.OooO0O0(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
        }
    }
}
