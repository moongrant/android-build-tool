package p101o000oo;

import androidx.paging.OooOOO;
import androidx.paging.OooOOO0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n+ 2 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,109:1\n36#2,4:110\n36#2,4:114\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n*L\n101#1:110,4\n104#1:114,4\n*E\n"})
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f35618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f35619OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f35620OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOOO f35621OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooOOO f35622OooO0o0;

    public oo0o0Oo(@NotNull OooOOO0 refresh, @NotNull OooOOO0 prepend, @NotNull OooOOO0 append, @NotNull OooOOO source, @Nullable OooOOO oooOOO) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f35618OooO00o = refresh;
        this.f35619OooO0O0 = prepend;
        this.f35620OooO0OO = append;
        this.f35621OooO0Oo = source;
        this.f35622OooO0o0 = oooOOO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(oo0o0Oo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return Intrinsics.areEqual(this.f35618OooO00o, oo0o0oo.f35618OooO00o) && Intrinsics.areEqual(this.f35619OooO0O0, oo0o0oo.f35619OooO0O0) && Intrinsics.areEqual(this.f35620OooO0OO, oo0o0oo.f35620OooO0OO) && Intrinsics.areEqual(this.f35621OooO0Oo, oo0o0oo.f35621OooO0Oo) && Intrinsics.areEqual(this.f35622OooO0o0, oo0o0oo.f35622OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = (this.f35621OooO0Oo.hashCode() + ((this.f35620OooO0OO.hashCode() + ((this.f35619OooO0O0.hashCode() + (this.f35618OooO00o.hashCode() * 31)) * 31)) * 31)) * 31;
        OooOOO oooOOO = this.f35622OooO0o0;
        return iHashCode + (oooOOO != null ? oooOOO.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f35618OooO00o + ", prepend=" + this.f35619OooO0O0 + ", append=" + this.f35620OooO0OO + ", source=" + this.f35621OooO0Oo + ", mediator=" + this.f35622OooO0o0 + ')';
    }
}
