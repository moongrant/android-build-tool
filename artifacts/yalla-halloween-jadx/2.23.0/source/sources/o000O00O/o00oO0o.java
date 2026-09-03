package o000O00O;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00oO0o {
    public static final boolean OooO00o(@NotNull androidx.paging.o00000 o00000Var, @Nullable androidx.paging.o00000 o00000Var2, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(o00000Var, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (o00000Var2 == null) {
            return true;
        }
        if ((o00000Var2 instanceof androidx.paging.o00000.OooO0O0) && (o00000Var instanceof androidx.paging.o00000.OooO00o)) {
            return true;
        }
        return (((o00000Var instanceof androidx.paging.o00000.OooO0O0) && (o00000Var2 instanceof androidx.paging.o00000.OooO00o)) || (o00000Var.f7274OooO0OO == o00000Var2.f7274OooO0OO && o00000Var.f7275OooO0Oo == o00000Var2.f7275OooO0Oo && o00000Var2.OooO00o(loadType) <= o00000Var.OooO00o(loadType))) ? false : true;
    }
}
