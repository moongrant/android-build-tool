package p331o0OO0o0;

import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends o0OOO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(@NotNull o000000 permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO00o() {
        ArrayList arrayList = new ArrayList();
        o000000 o000000Var = this.f43190OooO00o;
        for (String str : o000000Var.f43172OooO0Oo) {
            if (ContextCompat.OooO00o(o000000Var.OooO00o(), str) == 0) {
                o000000Var.f43175OooO0oO.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
        } else {
            o000000Var.OooO0o0(o000000Var.f43172OooO0Oo, this);
        }
    }

    @Override // p331o0OO0o0.o0Oo0oo
    public final void OooO0O0(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        o000000 o000000Var = this.f43190OooO00o;
        HashSet hashSet = new HashSet(o000000Var.f43175OooO0oO);
        hashSet.addAll(permissions);
        if (!hashSet.isEmpty()) {
            o000000Var.OooO0o0(hashSet, this);
        } else {
            finish();
        }
    }
}
