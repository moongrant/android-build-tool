package p406o0Oo0OOO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p034OoooO0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000O0 extends oO0Oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(@NotNull oO00000o permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39127OooO00o.f39117OooO0Oo) {
            if (o0Oo0oo.OooO0OO(this.f39127OooO00o.OooO00o(), str)) {
                this.f39127OooO00o.f39120OooO0oO.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            OooO0O0();
            return;
        }
        Objects.requireNonNull(this.f39127OooO00o);
        oO00000o oo00000o = this.f39127OooO00o;
        oo00000o.OooO0o0(oo00000o.f39117OooO0Oo, this);
    }

    @Override // p406o0Oo0OOO.o0oo0000
    public final void OooO0OO(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        HashSet hashSet = new HashSet(this.f39127OooO00o.f39120OooO0oO);
        hashSet.addAll(permissions);
        if (!hashSet.isEmpty()) {
            this.f39127OooO00o.OooO0o0(hashSet, this);
        } else {
            OooO0O0();
        }
    }
}
