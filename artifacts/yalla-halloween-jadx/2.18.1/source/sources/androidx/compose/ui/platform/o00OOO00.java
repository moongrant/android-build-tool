package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f6507OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Object f6508OooO0O0;

    public o00OOO00(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6507OooO00o = name;
        this.f6508OooO0O0 = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OOO00)) {
            return false;
        }
        o00OOO00 o00ooo01 = (o00OOO00) obj;
        return Intrinsics.areEqual(this.f6507OooO00o, o00ooo01.f6507OooO00o) && Intrinsics.areEqual(this.f6508OooO0O0, o00ooo01.f6508OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f6507OooO00o.hashCode() * 31;
        Object obj = this.f6508OooO0O0;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ValueElement(name=");
        sbOooO0o0.append(this.f6507OooO00o);
        sbOooO0o0.append(", value=");
        return p100o000oOoO.o0.OooO00o(sbOooO0o0, this.f6508OooO0O0, ')');
    }
}
