package p406o0Oo0OOO;

import android.os.Build;
import android.provider.Settings;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0Ooooo extends oO0Oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(@NotNull oO00000o permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO00o() {
        if (!this.f39127OooO00o.f39119OooO0o0.contains("android.permission.WRITE_SETTINGS")) {
            OooO0O0();
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || this.f39127OooO00o.OooO0Oo() < 23) {
            this.f39127OooO00o.f39120OooO0oO.add("android.permission.WRITE_SETTINGS");
            this.f39127OooO00o.f39119OooO0o0.remove("android.permission.WRITE_SETTINGS");
            OooO0O0();
        } else {
            if (Settings.System.canWrite(this.f39127OooO00o.OooO00o())) {
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
        oO00000o oo00000o = this.f39127OooO00o;
        Objects.requireNonNull(oo00000o);
        Intrinsics.checkNotNullParameter(this, "chainTask");
        oo00000o.OooO0OO().OooO0oo(oo00000o, this);
    }
}
