package OooO0O0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f102OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Bundle f103OooO0OO;

    public OooOOO(@NotNull String callId, int i, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.f101OooO00o = callId;
        this.f102OooO0O0 = i;
        this.f103OooO0OO = bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Intrinsics.areEqual(this.f101OooO00o, oooOOO.f101OooO00o) && this.f102OooO0O0 == oooOOO.f102OooO0O0 && Intrinsics.areEqual(this.f103OooO0OO, oooOOO.f103OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = ((this.f101OooO00o.hashCode() * 31) + this.f102OooO0O0) * 31;
        Bundle bundle = this.f103OooO0OO;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ProtocolRequestData(callId=" + this.f101OooO00o + ", operationCode=" + this.f102OooO0O0 + ", data=" + this.f103OooO0OO + ')';
    }
}
