package p100o000oOoO;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Object f29516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Object f29517OooO0O0;

    public o0O00000(@Nullable Object obj, @Nullable Object obj2) {
        this.f29516OooO00o = obj;
        this.f29517OooO0O0 = obj2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O00000)) {
            return false;
        }
        o0O00000 o0o00000 = (o0O00000) obj;
        return Intrinsics.areEqual(this.f29516OooO00o, o0o00000.f29516OooO00o) && Intrinsics.areEqual(this.f29517OooO0O0, o0o00000.f29517OooO0O0);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f29516OooO00o;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i = iHashCode * 31;
        Object obj2 = this.f29517OooO0O0;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return i + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("JoinedKey(left=");
        sbOooO0o0.append(this.f29516OooO00o);
        sbOooO0o0.append(", right=");
        return o0.OooO00o(sbOooO0o0, this.f29517OooO0O0, ')');
    }
}
