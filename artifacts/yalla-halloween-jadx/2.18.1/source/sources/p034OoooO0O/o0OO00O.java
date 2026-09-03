package p034OoooO0O;

import OooO00o.OooO00o;
import androidx.compose.foundation.text.Handle;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Handle f3558OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f3559OooO0O0;

    public o0OO00O(Handle handle, long j) {
        this.f3558OooO00o = handle;
        this.f3559OooO0O0 = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OO00O)) {
            return false;
        }
        o0OO00O o0oo00o2 = (o0OO00O) obj;
        return this.f3558OooO00o == o0oo00o2.f3558OooO00o && OooO.OooO00o(this.f3559OooO0O0, o0oo00o2.f3559OooO0O0);
    }

    public final int hashCode() {
        return OooO.OooO0o0(this.f3559OooO0O0) + (this.f3558OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SelectionHandleInfo(handle=");
        sbOooO0o0.append(this.f3558OooO00o);
        sbOooO0o0.append(", position=");
        sbOooO0o0.append((Object) OooO.OooO(this.f3559OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
