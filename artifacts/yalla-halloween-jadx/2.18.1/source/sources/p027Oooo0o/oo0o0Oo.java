package p027Oooo0o;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.OooO0O0;
import androidx.compose.foundation.lazy.layout.o00O0O;
import androidx.compose.runtime.Composable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class oo0o0Oo implements o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o000000O> f2014OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f2015OooO0O0;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2017Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f2018Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2) {
            super(2);
            this.f2017Oooo0oO = i;
            this.f2018Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oo0o0Oo.this.OooO0OO(this.f2017Oooo0oO, ooo00o, this.f2018Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public oo0o0Oo(@NotNull oO0Oo<o000000O> itemsSnapshot) {
        Intrinsics.checkNotNullParameter(itemsSnapshot, "itemsSnapshot");
        this.f2014OooO00o = itemsSnapshot;
        this.f2015OooO0O0 = new o0OoOo0();
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOOO
    @NotNull
    public final Object OooO00o(int i) {
        OooO0O0.OooO00o<o00Ooo> oooO00o = this.f2014OooO00o.getValue().f1793OooO00o.get(i);
        int i2 = i - oooO00o.f5793OooO00o;
        Function1<Integer, Object> function1 = oooO00o.f5795OooO0OO.f1983OooO00o;
        Object objInvoke = function1 != null ? function1.invoke(Integer.valueOf(i2)) : null;
        return objInvoke == null ? o00O0O.OooO00o(i) : objInvoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOOO
    @Nullable
    public final Object OooO0O0(int i) {
        OooO0O0.OooO00o<o00Ooo> oooO00o = this.f2014OooO00o.getValue().f1793OooO00o.get(i);
        return oooO00o.f5795OooO0OO.f1984OooO0O0.invoke(Integer.valueOf(i - oooO00o.f5793OooO00o));
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOOO
    @Composable
    public final void OooO0OO(int i, @Nullable oOO00O ooo00o, int i2) {
        int i3;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1704733014);
        if ((i2 & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            this.f2014OooO00o.getValue().OooO00o(this.f2015OooO0O0, i, ooo00oOooOOo, ((i3 << 3) & 112) | 512);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i, i2));
    }

    @Override // p027Oooo0o.o0OO00O
    @NotNull
    public final o0OoOo0 OooO0Oo() {
        return this.f2015OooO0O0;
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOOO
    @NotNull
    public final Map<Object, Integer> OooO0o() {
        return this.f2014OooO00o.getValue().f1795OooO0OO;
    }

    @Override // p027Oooo0o.o0OO00O
    @NotNull
    public final List<Integer> OooO0o0() {
        return this.f2014OooO00o.getValue().f1794OooO0O0;
    }

    @Override // androidx.compose.foundation.lazy.layout.OooOOO
    public final int OooO0oo() {
        return this.f2014OooO00o.getValue().f1793OooO00o.getSize();
    }
}
