package o000O00O;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n+ 2 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,109:1\n36#2,4:110\n36#2,4:114\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n*L\n101#1:110,4\n104#1:114,4\n*E\n"})
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooOOO0 f34455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooOOO0 f34456OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooOOO0 f34457OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooOOO f34458OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final androidx.paging.OooOOO f34459OooO0o0;

    public OooOo(@NotNull androidx.paging.OooOOO0 refresh, @NotNull androidx.paging.OooOOO0 prepend, @NotNull androidx.paging.OooOOO0 append, @NotNull androidx.paging.OooOOO source, @Nullable androidx.paging.OooOOO oooOOO) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f34455OooO00o = refresh;
        this.f34456OooO0O0 = prepend;
        this.f34457OooO0OO = append;
        this.f34458OooO0Oo = source;
        this.f34459OooO0o0 = oooOOO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(OooOo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f34455OooO00o, oooOo.f34455OooO00o) && Intrinsics.areEqual(this.f34456OooO0O0, oooOo.f34456OooO0O0) && Intrinsics.areEqual(this.f34457OooO0OO, oooOo.f34457OooO0OO) && Intrinsics.areEqual(this.f34458OooO0Oo, oooOo.f34458OooO0Oo) && Intrinsics.areEqual(this.f34459OooO0o0, oooOo.f34459OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = (this.f34458OooO0Oo.hashCode() + ((this.f34457OooO0OO.hashCode() + ((this.f34456OooO0O0.hashCode() + (this.f34455OooO00o.hashCode() * 31)) * 31)) * 31)) * 31;
        androidx.paging.OooOOO oooOOO = this.f34459OooO0o0;
        return iHashCode + (oooOOO != null ? oooOOO.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f34455OooO00o + ", prepend=" + this.f34456OooO0O0 + ", append=" + this.f34457OooO0OO + ", source=" + this.f34458OooO0Oo + ", mediator=" + this.f34459OooO0o0 + ')';
    }
}
