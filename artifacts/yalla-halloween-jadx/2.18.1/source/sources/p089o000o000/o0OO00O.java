package p089o000o000;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0OO00O {
    public static final boolean OooO00o(@NotNull o00OO0O0 o00oo0o1, @Nullable o00OO0O0 o00oo0o2, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(o00oo0o1, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (o00oo0o2 != null && (!(o00oo0o2 instanceof o00OO0O0.OooO0O0) || !(o00oo0o1 instanceof o00OO0O0.OooO00o))) {
            if ((o00oo0o1 instanceof o00OO0O0.OooO0O0) && (o00oo0o2 instanceof o00OO0O0.OooO00o)) {
                return false;
            }
            if (o00oo0o1.f29027OooO0OO == o00oo0o2.f29027OooO0OO && o00oo0o1.f29028OooO0Oo == o00oo0o2.f29028OooO0Oo && o00oo0o2.OooO00o(loadType) <= o00oo0o1.OooO00o(loadType)) {
                return false;
            }
        }
        return true;
    }
}
