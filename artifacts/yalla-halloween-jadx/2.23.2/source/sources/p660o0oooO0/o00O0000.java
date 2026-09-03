package p660o0oooO0;

import androidx.compose.animation.OooO0o;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final boolean f59717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Integer f59718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final boolean f59719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Integer f59720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final boolean f59721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final boolean f59722OooO0o0;

    public o00O0000() {
        this(false, null, false, null, false, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0000)) {
            return false;
        }
        o00O0000 o00o0001 = (o00O0000) obj;
        return this.f59717OooO00o == o00o0001.f59717OooO00o && Intrinsics.areEqual(this.f59718OooO0O0, o00o0001.f59718OooO0O0) && this.f59719OooO0OO == o00o0001.f59719OooO0OO && Intrinsics.areEqual(this.f59720OooO0Oo, o00o0001.f59720OooO0Oo) && this.f59722OooO0o0 == o00o0001.f59722OooO0o0 && this.f59721OooO0o == o00o0001.f59721OooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z = this.f59717OooO00o;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        Integer num = this.f59718OooO0O0;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f59719OooO0OO;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (iHashCode + r3) * 31;
        Integer num2 = this.f59720OooO0Oo;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.f59722OooO0o0;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (iHashCode2 + r2) * 31;
        boolean z4 = this.f59721OooO0o;
        return i3 + (z4 ? 1 : z4);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f59717OooO00o);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f59718OooO0O0);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f59719OooO0OO);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f59720OooO0Oo);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f59722OooO0o0);
        sb.append(", unknownValues=");
        return OooO0o.OooO00o(sb, this.f59721OooO0o, ')');
    }

    public o00O0000(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.f59717OooO00o = z;
        this.f59718OooO0O0 = num;
        this.f59719OooO0OO = z2;
        this.f59720OooO0Oo = num2;
        this.f59722OooO0o0 = z3;
        this.f59721OooO0o = z4;
    }
}
