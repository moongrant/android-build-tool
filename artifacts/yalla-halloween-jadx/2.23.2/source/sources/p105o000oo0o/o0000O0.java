package p105o000oo0o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(o0000O0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        String str = o0000O0.class.getSimpleName() + " Type: null Nullable: false";
        Intrinsics.checkNotNullExpressionValue(str, "sb.toString()");
        return str;
    }
}
