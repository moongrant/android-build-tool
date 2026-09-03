package p406o0Oo0OOO;

import android.os.Build;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000O extends oO0Oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(@NotNull oO00000o permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO00o() {
        if (this.f39127OooO00o.f39119OooO0o0.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                this.f39127OooO00o.f39119OooO0o0.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f39127OooO00o.f39118OooO0o.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (OooO00o.OooO00o(this.f39127OooO00o.OooO00o(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                OooO0O0();
                return;
            }
            boolean z = OooO00o.OooO00o(this.f39127OooO00o.OooO00o(), "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean z2 = OooO00o.OooO00o(this.f39127OooO00o.OooO00o(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
            if (z || z2) {
                Objects.requireNonNull(this.f39127OooO00o);
                Objects.requireNonNull(this.f39127OooO00o);
                OooO0OO(CollectionsKt.emptyList());
                return;
            }
        }
        OooO0O0();
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
        oo00000OooO0OO.f39105Oooo.OooO0O0("android.permission.ACCESS_BACKGROUND_LOCATION");
    }
}
