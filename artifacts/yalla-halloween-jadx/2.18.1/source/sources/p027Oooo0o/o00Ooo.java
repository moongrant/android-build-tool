package p027Oooo0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Function1<Integer, Object> f1983OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Object> f1984OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function4<o000oOoO, Integer, oOO00O, Integer, Unit> f1985OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull Function4<? super o000oOoO, ? super Integer, ? super oOO00O, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f1983OooO00o = function1;
        this.f1984OooO0O0 = type;
        this.f1985OooO0OO = item;
    }
}
