package p335o0OO0o0O;

import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends o00oO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(@NotNull oo0o0Oo permissionBuilder) {
        super(permissionBuilder);
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO00o() {
        ArrayList arrayList = new ArrayList();
        oo0o0Oo oo0o0oo = this.f42472OooO00o;
        for (String str : oo0o0oo.f42489OooO0Oo) {
            if (ContextCompat.OooO00o(oo0o0oo.OooO00o(), str) == 0) {
                oo0o0oo.f42492OooO0oO.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
        } else {
            oo0o0oo.OooO0o0(oo0o0oo.f42489OooO0Oo, this);
        }
    }

    @Override // p335o0OO0o0O.o0ooOOo
    public final void OooO0O0(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        oo0o0Oo oo0o0oo = this.f42472OooO00o;
        HashSet hashSet = new HashSet(oo0o0oo.f42492OooO0oO);
        hashSet.addAll(permissions);
        if (!hashSet.isEmpty()) {
            oo0o0oo.OooO0o0(hashSet, this);
        } else {
            finish();
        }
    }
}
