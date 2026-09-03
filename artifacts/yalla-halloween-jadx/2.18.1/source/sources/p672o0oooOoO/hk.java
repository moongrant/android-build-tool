package p672o0oooOoO;

import OooO00o.OooO00o;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class hk {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final boolean f51996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Integer f51997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final boolean f51998OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Integer f51999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final boolean f52000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final boolean f52001OooO0o0;

    public hk() {
        this.f51996OooO00o = false;
        this.f51997OooO0O0 = null;
        this.f51998OooO0OO = false;
        this.f51999OooO0Oo = null;
        this.f52001OooO0o0 = false;
        this.f52000OooO0o = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        return this.f51996OooO00o == hkVar.f51996OooO00o && Intrinsics.areEqual(this.f51997OooO0O0, hkVar.f51997OooO0O0) && this.f51998OooO0OO == hkVar.f51998OooO0OO && Intrinsics.areEqual(this.f51999OooO0Oo, hkVar.f51999OooO0Oo) && this.f52001OooO0o0 == hkVar.f52001OooO0o0 && this.f52000OooO0o == hkVar.f52000OooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        boolean z = this.f51996OooO00o;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.f51997OooO0O0;
        int iHashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.f51998OooO0OO;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode + r2) * 31;
        Integer num2 = this.f51999OooO0Oo;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.f52001OooO0o0;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (iHashCode2 + r3) * 31;
        boolean z4 = this.f52000OooO0o;
        return i3 + (z4 ? 1 : z4);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("WebSocketExtensions(perMessageDeflate=");
        sbOooO0o0.append(this.f51996OooO00o);
        sbOooO0o0.append(", clientMaxWindowBits=");
        sbOooO0o0.append(this.f51997OooO0O0);
        sbOooO0o0.append(", clientNoContextTakeover=");
        sbOooO0o0.append(this.f51998OooO0OO);
        sbOooO0o0.append(", serverMaxWindowBits=");
        sbOooO0o0.append(this.f51999OooO0Oo);
        sbOooO0o0.append(", serverNoContextTakeover=");
        sbOooO0o0.append(this.f52001OooO0o0);
        sbOooO0o0.append(", unknownValues=");
        sbOooO0o0.append(this.f52000OooO0o);
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    public hk(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.f51996OooO00o = z;
        this.f51997OooO0O0 = num;
        this.f51998OooO0OO = z2;
        this.f51999OooO0Oo = num2;
        this.f52001OooO0o0 = z3;
        this.f52000OooO0o = z4;
    }
}
