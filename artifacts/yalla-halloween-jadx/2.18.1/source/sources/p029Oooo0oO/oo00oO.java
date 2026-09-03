package p029Oooo0oO;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.OooOo;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO0O0;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00 f2476OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f2477OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2478OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f2479OooO0Oo;

    @ExperimentalFoundationApi
    public oo00oO(@NotNull o00O00 itemProvider, @NotNull OooOo measureScope, int i, @NotNull o0O00O0o measuredItemFactory) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measuredItemFactory, "measuredItemFactory");
        this.f2476OooO00o = itemProvider;
        this.f2477OooO0O0 = measureScope;
        this.f2478OooO0OO = i;
        this.f2479OooO0Oo = measuredItemFactory;
    }

    @NotNull
    public final o0O00o0 OooO00o(int i, int i2, long j) {
        int iOooO;
        Object objOooO00o = this.f2476OooO00o.OooO00o(i);
        o000O000[] o000o000ArrOoooO0O = this.f2477OooO0O0.OoooO0O(i, j);
        if (OooO0O0.OooO0o(j)) {
            iOooO = OooO0O0.OooOO0(j);
        } else {
            if (!OooO0O0.OooO0o0(j)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            iOooO = OooO0O0.OooO(j);
        }
        return this.f2479OooO0Oo.OooO00o(i, objOooO00o, iOooO, i2, o000o000ArrOoooO0O);
    }
}
