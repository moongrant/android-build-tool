package o000O00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(OooO.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        String str = OooO.class.getSimpleName() + " Type: null Nullable: false";
        Intrinsics.checkNotNullExpressionValue(str, "sb.toString()");
        return str;
    }
}
