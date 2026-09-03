package p101o000oo;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadType;
import androidx.paging.o00000;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0000Ooo {
    public static final boolean OooO00o(@NotNull o00000 o00000Var, @Nullable o00000 o00000Var2, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(o00000Var, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (o00000Var2 == null) {
            return true;
        }
        if ((o00000Var2 instanceof o00000.OooO0O0) && (o00000Var instanceof o00000.OooO00o)) {
            return true;
        }
        return (((o00000Var instanceof o00000.OooO0O0) && (o00000Var2 instanceof o00000.OooO00o)) || (o00000Var.f10368OooO0OO == o00000Var2.f10368OooO0OO && o00000Var.f10369OooO0Oo == o00000Var2.f10369OooO0Oo && o00000Var2.OooO00o(loadType) <= o00000Var.OooO00o(loadType))) ? false : true;
    }
}
