package p089o000o000;

import androidx.paging.LoadType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o000000 f28750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o000000 f28751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o000000 f28752OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            iArr[LoadType.PREPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0000Ooo() {
        o000000.OooO0OO oooO0OO = o000000.OooO0OO.f28699OooO0OO;
        this.f28750OooO00o = oooO0OO;
        this.f28751OooO0O0 = oooO0OO;
        this.f28752OooO0OO = oooO0OO;
    }

    @NotNull
    public final o000000 OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO00o.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.f28750OooO00o;
        }
        if (i == 2) {
            return this.f28752OooO0OO;
        }
        if (i == 3) {
            return this.f28751OooO0O0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void OooO0O0(@NotNull LoadType type, @NotNull o000000 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.f28750OooO00o = state;
        } else if (i == 2) {
            this.f28752OooO0OO = state;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f28751OooO0O0 = state;
        }
    }

    public final void OooO0OO(@NotNull o000000O states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f28750OooO00o = states.f28702OooO00o;
        this.f28752OooO0OO = states.f28704OooO0OO;
        this.f28751OooO0O0 = states.f28703OooO0O0;
    }

    @NotNull
    public final o000000O OooO0Oo() {
        return new o000000O(this.f28750OooO00o, this.f28751OooO0O0, this.f28752OooO0OO);
    }
}
