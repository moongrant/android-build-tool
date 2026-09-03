package o00O0;

import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0oOOo f30083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f30084OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f30085OooO0OO;

    public Oooo0(@NotNull o0oOOo source, @Nullable String str, @NotNull DataSource dataSource) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f30083OooO00o = source;
        this.f30084OooO0O0 = str;
        this.f30085OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return Intrinsics.areEqual(this.f30083OooO00o, oooo0.f30083OooO00o) && Intrinsics.areEqual(this.f30084OooO0O0, oooo0.f30084OooO0O0) && this.f30085OooO0OO == oooo0.f30085OooO0OO;
    }

    public final int hashCode() {
        int iHashCode = this.f30083OooO00o.hashCode() * 31;
        String str = this.f30084OooO0O0;
        return this.f30085OooO0OO.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SourceResult(source=");
        sbOooO0o0.append(this.f30083OooO00o);
        sbOooO0o0.append(", mimeType=");
        sbOooO0o0.append((Object) this.f30084OooO0O0);
        sbOooO0o0.append(", dataSource=");
        sbOooO0o0.append(this.f30085OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
