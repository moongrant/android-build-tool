package p029Oooo0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Function1<Integer, Object> f2247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<o00O0O00, Integer, o000OO0O> f2248OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Object> f2249OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function4<oo00o, Integer, oOO00O, Integer, Unit> f2250OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o00(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function2<? super o00O0O00, ? super Integer, o000OO0O> span, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull Function4<? super oo00o, ? super Integer, ? super oOO00O, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f2247OooO00o = function1;
        this.f2248OooO0O0 = span;
        this.f2249OooO0OO = type;
        this.f2250OooO0Oo = item;
    }
}
