package o0000O0;

import androidx.compose.runtime.Immutable;
import o0000O0O.o00O0O;
import o0000O0O.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27269OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f27270OooO0Oo = new OooOOOO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27271OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f27272OooO0O0;

    public static final class OooO00o {
    }

    public OooOOOO(long j, long j2) {
        this.f27271OooO00o = j;
        this.f27272OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return o00O0O.OooO00o(this.f27271OooO00o, oooOOOO.f27271OooO00o) && o00O0O.OooO00o(this.f27272OooO0O0, oooOOOO.f27272OooO0O0);
    }

    public final int hashCode() {
        return o00O0O.OooO0Oo(this.f27272OooO0O0) + (o00O0O.OooO0Oo(this.f27271OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextIndent(firstLine=");
        sbOooO0o0.append((Object) o00O0O.OooO0o0(this.f27271OooO00o));
        sbOooO0o0.append(", restLine=");
        sbOooO0o0.append((Object) o00O0O.OooO0o0(this.f27272OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public OooOOOO() {
        long jOooO0OO = o00Oo0.OooO0OO(0);
        long jOooO0OO2 = o00Oo0.OooO0OO(0);
        this.f27271OooO00o = jOooO0OO;
        this.f27272OooO0O0 = jOooO0OO2;
    }
}
