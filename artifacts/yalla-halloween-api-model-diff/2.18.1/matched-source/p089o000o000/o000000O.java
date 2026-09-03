package p089o000o000;

import androidx.paging.LoadType;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f28700OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o000000O f28701OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000000 f28702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000 f28703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000000 f28704OooO0OO;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.APPEND.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.REFRESH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        o000000.OooO0OO oooO0OO = o000000.OooO0OO.f28699OooO0OO;
        f28701OooO0o0 = new o000000O(oooO0OO, oooO0OO, oooO0OO);
    }

    public o000000O(@NotNull o000000 refresh, @NotNull o000000 prepend, @NotNull o000000 append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        this.f28702OooO00o = refresh;
        this.f28703OooO0O0 = prepend;
        this.f28704OooO0OO = append;
    }

    public static o000000O OooO00o(o000000O o000000o2, o000000 refresh, o000000 prepend, o000000 append, int i) {
        if ((i & 1) != 0) {
            refresh = o000000o2.f28702OooO00o;
        }
        if ((i & 2) != 0) {
            prepend = o000000o2.f28703OooO0O0;
        }
        if ((i & 4) != 0) {
            append = o000000o2.f28704OooO0OO;
        }
        Objects.requireNonNull(o000000o2);
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        return new o000000O(refresh, prepend, append);
    }

    @NotNull
    public final o000000O OooO0O0(@NotNull LoadType loadType) {
        o000000.OooO0OO newState = o000000.OooO0OO.f28699OooO0OO;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return OooO00o(this, null, null, newState, 3);
        }
        if (i == 2) {
            return OooO00o(this, null, newState, null, 5);
        }
        if (i == 3) {
            return OooO00o(this, newState, null, null, 6);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000000O)) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        return Intrinsics.areEqual(this.f28702OooO00o, o000000o2.f28702OooO00o) && Intrinsics.areEqual(this.f28703OooO0O0, o000000o2.f28703OooO0O0) && Intrinsics.areEqual(this.f28704OooO0OO, o000000o2.f28704OooO0OO);
    }

    public final int hashCode() {
        return this.f28704OooO0OO.hashCode() + ((this.f28703OooO0O0.hashCode() + (this.f28702OooO00o.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LoadStates(refresh=");
        sbOooO0o0.append(this.f28702OooO00o);
        sbOooO0o0.append(", prepend=");
        sbOooO0o0.append(this.f28703OooO0O0);
        sbOooO0o0.append(", append=");
        sbOooO0o0.append(this.f28704OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
