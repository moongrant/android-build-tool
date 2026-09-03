package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOOO f10253OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f10254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f10255OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f10256OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        OooOOO0.OooO0OO oooO0OO = OooOOO0.OooO0OO.f10261OooO0OO;
        f10253OooO0Oo = new OooOOO(oooO0OO, oooO0OO, oooO0OO);
    }

    public OooOOO(@NotNull OooOOO0 refresh, @NotNull OooOOO0 prepend, @NotNull OooOOO0 append) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        this.f10254OooO00o = refresh;
        this.f10255OooO0O0 = prepend;
        this.f10256OooO0OO = append;
    }

    public static OooOOO OooO00o(OooOOO oooOOO, OooOOO0 refresh, OooOOO0 prepend, OooOOO0 append, int i) {
        if ((i & 1) != 0) {
            refresh = oooOOO.f10254OooO00o;
        }
        if ((i & 2) != 0) {
            prepend = oooOOO.f10255OooO0O0;
        }
        if ((i & 4) != 0) {
            append = oooOOO.f10256OooO0OO;
        }
        oooOOO.getClass();
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        return new OooOOO(refresh, prepend, append);
    }

    @NotNull
    public final OooOOO OooO0O0(@NotNull LoadType loadType, @NotNull OooOOO0 newState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[loadType.ordinal()];
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
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Intrinsics.areEqual(this.f10254OooO00o, oooOOO.f10254OooO00o) && Intrinsics.areEqual(this.f10255OooO0O0, oooOOO.f10255OooO0O0) && Intrinsics.areEqual(this.f10256OooO0OO, oooOOO.f10256OooO0OO);
    }

    public final int hashCode() {
        return this.f10256OooO0OO.hashCode() + ((this.f10255OooO0O0.hashCode() + (this.f10254OooO00o.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "LoadStates(refresh=" + this.f10254OooO00o + ", prepend=" + this.f10255OooO0O0 + ", append=" + this.f10256OooO0OO + ')';
    }
}
