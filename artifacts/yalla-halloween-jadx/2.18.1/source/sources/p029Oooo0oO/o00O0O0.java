package p029Oooo0oO;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.OooO0O0;
import androidx.compose.foundation.lazy.layout.o00Oo0;
import androidx.compose.runtime.Composable;
import java.util.HashMap;
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
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0<o00> f2301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f2302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f2303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<Object, Integer> f2304OooO0Oo;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2306Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f2307Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2) {
            super(2);
            this.f2306Oooo0oO = i;
            this.f2307Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O0O0.this.OooO00o(this.f2306Oooo0oO, ooo00o, this.f2307Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public o00O0O0(@NotNull OooO0O0<o00> list, boolean z, @NotNull IntRange range) {
        Map<Object, Integer> mapEmptyMap;
        Intrinsics.checkNotNullParameter(list, "intervals");
        Intrinsics.checkNotNullParameter(range, "nearestItemsRange");
        this.f2301OooO00o = list;
        this.f2302OooO0O0 = z;
        this.f2303OooO0OO = new o00OOOO0(this);
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
            ((o00Oo0) list).OooO0OO(first, iMin, new oOO00O(first, iMin, map));
            mapEmptyMap = map;
        }
        this.f2304OooO0Oo = mapEmptyMap;
    }

    @Composable
    public final void OooO00o(int i, @Nullable oOO00O ooo00o, int i2) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-405085610);
        OooO0O0.OooO00o<o00> oooO00o = this.f2301OooO00o.get(i);
        oooO00o.f5795OooO0OO.f2250OooO0Oo.invoke(o00O0.f2275OooO00o, Integer.valueOf(i - oooO00o.f5793OooO00o), ooo00oOooOOo, 6);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i, i2));
    }
}
