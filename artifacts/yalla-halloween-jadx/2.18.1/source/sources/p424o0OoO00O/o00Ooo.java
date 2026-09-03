package p424o0OoO00O;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f39842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f39843OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39844OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f39845OooO0Oo;

    public o00Ooo(@NotNull String xZeus, @NotNull String xHera, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(xZeus, "xZeus");
        Intrinsics.checkNotNullParameter(xHera, "xHera");
        this.f39842OooO00o = xZeus;
        this.f39843OooO0O0 = xHera;
        this.f39844OooO0OO = j;
        this.f39845OooO0Oo = str;
    }

    @NotNull
    public final Map<String, String> OooO00o() {
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("X-Zeus", this.f39842OooO00o), new Pair("X-Hera", this.f39843OooO0O0), new Pair("X-Time", String.valueOf(this.f39844OooO0OO)));
        String str = this.f39845OooO0Oo;
        if (str != null) {
            mapMutableMapOf.put("X-Shield", str);
        }
        return mapMutableMapOf;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return Intrinsics.areEqual(this.f39842OooO00o, o00ooo2.f39842OooO00o) && Intrinsics.areEqual(this.f39843OooO0O0, o00ooo2.f39843OooO0O0) && this.f39844OooO0OO == o00ooo2.f39844OooO0OO && Intrinsics.areEqual(this.f39845OooO0Oo, o00ooo2.f39845OooO0Oo);
    }

    public final int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.f39843OooO0O0, this.f39842OooO00o.hashCode() * 31, 31);
        long j = this.f39844OooO0OO;
        int i = (iOooO00o + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f39845OooO0Oo;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZeusEntity(xZeus=");
        sbOooO0o0.append(this.f39842OooO00o);
        sbOooO0o0.append(", xHera=");
        sbOooO0o0.append(this.f39843OooO0O0);
        sbOooO0o0.append(", xTime=");
        sbOooO0o0.append(this.f39844OooO0OO);
        sbOooO0o0.append(", xShield=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.f39845OooO0Oo, ')');
    }
}
