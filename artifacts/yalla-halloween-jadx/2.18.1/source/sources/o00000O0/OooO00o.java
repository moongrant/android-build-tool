package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
public final class OooO00o<T extends Function<? extends Boolean>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f26904OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f26905OooO0O0;

    public OooO00o(@Nullable String str, @Nullable T t) {
        this.f26904OooO00o = str;
        this.f26905OooO0O0 = t;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return Intrinsics.areEqual(this.f26904OooO00o, oooO00o.f26904OooO00o) && Intrinsics.areEqual(this.f26905OooO0O0, oooO00o.f26905OooO0O0);
    }

    public final int hashCode() {
        String str = this.f26904OooO00o;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f26905OooO0O0;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AccessibilityAction(label=");
        sbOooO0o0.append(this.f26904OooO00o);
        sbOooO0o0.append(", action=");
        sbOooO0o0.append(this.f26905OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
