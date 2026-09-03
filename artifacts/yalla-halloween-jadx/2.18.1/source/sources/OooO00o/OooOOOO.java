package OooO00o;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f83OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f84OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Bundle f85OooO0OO;

    public OooOOOO(@NotNull String callId, int i, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.f83OooO00o = callId;
        this.f84OooO0O0 = i;
        this.f85OooO0OO = bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return Intrinsics.areEqual(this.f83OooO00o, oooOOOO.f83OooO00o) && this.f84OooO0O0 == oooOOOO.f84OooO0O0 && Intrinsics.areEqual(this.f85OooO0OO, oooOOOO.f85OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = ((this.f83OooO00o.hashCode() * 31) + this.f84OooO0O0) * 31;
        Bundle bundle = this.f85OooO0OO;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ProtocolRequestData(callId=");
        sbOooO0o0.append(this.f83OooO00o);
        sbOooO0o0.append(", operationCode=");
        sbOooO0o0.append(this.f84OooO0O0);
        sbOooO0o0.append(", data=");
        sbOooO0o0.append(this.f85OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
