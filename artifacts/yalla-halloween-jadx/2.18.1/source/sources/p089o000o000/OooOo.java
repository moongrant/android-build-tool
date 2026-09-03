package p089o000o000;

import OooO00o.OooO00o;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000000 f28682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000 f28683OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000000 f28684OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000000O f28685OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o000000O f28686OooO0o0;

    public OooOo(@NotNull o000000 refresh, @NotNull o000000 prepend, @NotNull o000000 append, @NotNull o000000O source, @Nullable o000000O o000000o2) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f28682OooO00o = refresh;
        this.f28683OooO0O0 = prepend;
        this.f28684OooO0OO = append;
        this.f28685OooO0Oo = source;
        this.f28686OooO0o0 = o000000o2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(OooOo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f28682OooO00o, oooOo.f28682OooO00o) && Intrinsics.areEqual(this.f28683OooO0O0, oooOo.f28683OooO0O0) && Intrinsics.areEqual(this.f28684OooO0OO, oooOo.f28684OooO0OO) && Intrinsics.areEqual(this.f28685OooO0Oo, oooOo.f28685OooO0Oo) && Intrinsics.areEqual(this.f28686OooO0o0, oooOo.f28686OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = (this.f28685OooO0Oo.hashCode() + ((this.f28684OooO0OO.hashCode() + ((this.f28683OooO0O0.hashCode() + (this.f28682OooO00o.hashCode() * 31)) * 31)) * 31)) * 31;
        o000000O o000000o2 = this.f28686OooO0o0;
        return iHashCode + (o000000o2 != null ? o000000o2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CombinedLoadStates(refresh=");
        sbOooO0o0.append(this.f28682OooO00o);
        sbOooO0o0.append(", prepend=");
        sbOooO0o0.append(this.f28683OooO0O0);
        sbOooO0o0.append(", append=");
        sbOooO0o0.append(this.f28684OooO0OO);
        sbOooO0o0.append(", source=");
        sbOooO0o0.append(this.f28685OooO0Oo);
        sbOooO0o0.append(", mediator=");
        sbOooO0o0.append(this.f28686OooO0o0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
