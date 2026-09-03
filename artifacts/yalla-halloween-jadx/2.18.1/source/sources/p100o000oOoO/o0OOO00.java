package p100o000oOoO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p037OoooOOo.o00000O0;
import p038OoooOo0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO00 {
    @Composable
    @NotNull
    public static final oO0Oo OooO00o(@NotNull Flow flow, Object obj, @Nullable CoroutineContext coroutineContext, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        ooo00o.OooO0o0(-606625098);
        if ((i & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        o0OOOO00 producer = new o0OOOO00(coroutineContext, flow, null);
        Intrinsics.checkNotNullParameter(producer, "producer");
        ooo00o.OooO0o0(-1703169085);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = OooO0Oo(obj);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        o00Oo00.OooO0Oo(flow, coroutineContext, new o0OOO0OO(producer, o0o00oo2, null), ooo00o);
        ooo00o.Oooo0o0();
        ooo00o.Oooo0o0();
        return o0o00oo2;
    }

    @NotNull
    public static final <T> oO0Oo<T> OooO0O0(@NotNull Function0<? extends T> calculation) {
        o0OOo000<o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>>> o0ooo001 = o0OOO0.f29636OooO00o;
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new o00OOO00(calculation);
    }

    @NotNull
    public static final <T> o0O00OO<T> OooO0OO(T t, @NotNull o0OO<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Lazy lazy = o00O0000.f29359OooO00o;
        Intrinsics.checkNotNullParameter(policy, "policy");
        return new ParcelableSnapshotMutableState(t, policy);
    }

    public static /* synthetic */ o0O00OO OooO0Oo(Object obj) {
        return OooO0OO(obj, o.f29323OooO00o);
    }

    @Composable
    @NotNull
    public static final oO0Oo OooO0o(Object obj, @Nullable oOO00O ooo00o) {
        Object objOooO0O0 = o000O00.OooO0O0(ooo00o, -1058319986, -492369756);
        if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0O0 = OooO0Oo(obj);
            ooo00o.Oooo00o(objOooO0O0);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0O0;
        o0o00oo2.setValue(obj);
        ooo00o.Oooo0o0();
        return o0o00oo2;
    }

    public static final <R> void OooO0o0(@NotNull Function1<? super oO0Oo<?>, Unit> start, @NotNull Function1<? super oO0Oo<?>, Unit> done, @NotNull Function0<? extends R> block) {
        o0OOo000<o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>>> o0ooo001 = o0OOO0.f29636OooO00o;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(block, "block");
        o0OOo000<o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>>> o0ooo002 = o0OOO0.f29636OooO00o;
        o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>> o00000o0OooO00o = o0ooo002.OooO00o();
        try {
            o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>> o00000o0OooO00o2 = o0ooo002.OooO00o();
            if (o00000o0OooO00o2 == null) {
                o000O0O0.OooO00o oooO00o = o000O0O0.f3709Oooo0oO;
                o00000o0OooO00o2 = o000O0O0.f3710Oooo0oo;
            }
            o0ooo002.OooO0O0(o00000o0OooO00o2.add(TuplesKt.to(start, done)));
            ((o00O00o0.OooOOO) block).invoke();
        } finally {
            o0OOO0.f29636OooO00o.OooO0O0(o00000o0OooO00o);
        }
    }

    @NotNull
    public static final <T> Flow<T> OooO0oO(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.flow(new o0OOOO0o(block, null));
    }
}
