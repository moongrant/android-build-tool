package p100o000oOoO;

import androidx.compose.runtime.Composable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOOo<T> extends o0O0O0o0<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OO<T> f29509OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(@NotNull o0OO<T> policy, @NotNull Function0<? extends T> defaultFactory) {
        super(defaultFactory);
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        this.f29509OooO0O0 = policy;
    }

    @Override // p100o000oOoO.o00OO00O
    @Composable
    @NotNull
    public final oO0Oo OooO00o(Object obj, @Nullable oOO00O ooo00o) {
        Object objOooO0O0 = o000O00.OooO0O0(ooo00o, -84026900, -492369756);
        if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0O0 = o0OOO00.OooO0OO(obj, this.f29509OooO0O0);
            ooo00o.Oooo00o(objOooO0O0);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0O0;
        o0o00oo2.setValue(obj);
        ooo00o.Oooo0o0();
        return o0o00oo2;
    }
}
