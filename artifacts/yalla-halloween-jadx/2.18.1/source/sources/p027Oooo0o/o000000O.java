package p027Oooo0o;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.OooO0O0;
import androidx.compose.foundation.lazy.layout.o00Oo0;
import androidx.compose.runtime.Composable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0<o00Ooo> f1793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer> f1794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<Object, Integer> f1795OooO0OO;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f1796Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f1798Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f1799Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000oOoO o000oooo2, int i, int i2) {
            super(2);
            this.f1798Oooo0oO = o000oooo2;
            this.f1799Oooo0oo = i;
            this.f1796Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000000O.this.OooO00o(this.f1798Oooo0oO, this.f1799Oooo0oo, ooo00o, this.f1796Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public o000000O(@NotNull OooO0O0<o00Ooo> list, @NotNull List<Integer> headerIndexes, @NotNull IntRange range) {
        Map<Object, Integer> mapEmptyMap;
        Intrinsics.checkNotNullParameter(list, "intervals");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(range, "nearestItemsRange");
        this.f1793OooO00o = list;
        this.f1794OooO0O0 = headerIndexes;
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(list, "list");
        int first = range.getFirst();
        if (!(first >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int iMin = Math.min(range.getLast(), ((o00Oo0) list).f5842OooO0O0 - 1);
        if (iMin < first) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            HashMap map = new HashMap();
            ((o00Oo0) list).OooO0OO(first, iMin, new o0O0O00(first, iMin, map));
            mapEmptyMap = map;
        }
        this.f1795OooO0OO = mapEmptyMap;
    }

    @Composable
    public final void OooO00o(@NotNull o000oOoO scope, int i, @Nullable oOO00O ooo00o, int i2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1922528915);
        OooO0O0.OooO00o<o00Ooo> oooO00o = this.f1793OooO00o.get(i);
        oooO00o.f5795OooO0OO.f1985OooO0OO.invoke(scope, Integer.valueOf(i - oooO00o.f5793OooO00o), ooo00oOooOOo, Integer.valueOf(i2 & 14));
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(scope, i, i2));
    }
}
