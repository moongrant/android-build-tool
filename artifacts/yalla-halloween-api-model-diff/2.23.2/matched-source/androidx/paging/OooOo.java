package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public OooOOO0 f10263OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOOO0 f10264OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public OooOOO0 f10265OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OooOo() {
        OooOOO0.OooO0OO oooO0OO = OooOOO0.OooO0OO.f10261OooO0OO;
        this.f10263OooO00o = oooO0OO;
        this.f10264OooO0O0 = oooO0OO;
        this.f10265OooO0OO = oooO0OO;
    }

    @NotNull
    public final OooOOO0 OooO00o(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = OooO00o.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.f10263OooO00o;
        }
        if (i == 2) {
            return this.f10265OooO0OO;
        }
        if (i == 3) {
            return this.f10264OooO0O0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void OooO0O0(@NotNull OooOOO states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f10263OooO00o = states.f10254OooO00o;
        this.f10265OooO0OO = states.f10256OooO0OO;
        this.f10264OooO0O0 = states.f10255OooO0O0;
    }

    public final void OooO0OO(@NotNull LoadType type, @NotNull OooOOO0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.f10263OooO00o = state;
        } else if (i == 2) {
            this.f10265OooO0OO = state;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f10264OooO0O0 = state;
        }
    }

    @NotNull
    public final OooOOO OooO0Oo() {
        return new OooOOO(this.f10263OooO00o, this.f10264OooO0O0, this.f10265OooO0OO);
    }
}
