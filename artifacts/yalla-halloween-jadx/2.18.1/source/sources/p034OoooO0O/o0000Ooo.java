package p034OoooO0O;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o0O000;
import p054o00000oo.o000O;
import p054o00000oo.o000O0Oo;
import p054o00000oo.o00O0O00;
import p054o00000oo.o00O0OOO;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo extends o0OoOo0<o0000Ooo> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o0O000 f3503OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f3504OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull oo0oOO0 currentValue, @NotNull o00O0O00 offsetMapping, @Nullable o0O000 o0o001, @NotNull o000O000 state) {
        super(currentValue.f27236OooO00o, currentValue.f27237OooO0O0, o0o001 != null ? o0o001.f3314OooO00o : null, offsetMapping, state);
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f3504OooO0oo = currentValue;
        this.f3503OooO = o0o001;
    }

    @Nullable
    public final List<o000O> OooOooO(@NotNull Function1<? super o0000Ooo, ? extends o000O> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        if (!o0OO00O.OooO0OO(this.f3564OooO0o)) {
            return CollectionsKt.listOf((Object[]) new o000O[]{new o000O0Oo("", 0), new o00O0OOO(o0OO00O.OooO0oO(this.f3564OooO0o), o0OO00O.OooO0oO(this.f3564OooO0o))});
        }
        o000O o000oInvoke = or.invoke(this);
        if (o000oInvoke != null) {
            return CollectionsKt.listOf(o000oInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final int OooOooo(o0O000 o0o001, int i) {
        OooOO0O oooOO0OOooo;
        Oooo000 oooo000 = o0o001.f3315OooO0O0;
        if (oooo000 != null) {
            Oooo000 oooo001 = o0o001.f3316OooO0OO;
            oooOO0OOooo = oooo001 != null ? oooo001.Oooo(oooo000, true) : null;
            if (oooOO0OOooo == null) {
                oooOO0OOooo = OooOO0O.f30402OooO0o;
            }
        } else {
            oooOO0OOooo = OooOO0O.f30402OooO0o;
        }
        OooOO0O oooOO0OOooO0OO = o0o001.f3314OooO00o.OooO0OO(this.f3563OooO0Oo.OooO0O0(o0OO00O.OooO0Oo(this.f3504OooO0oo.f27237OooO0O0)));
        return this.f3563OooO0Oo.OooO00o(o0o001.f3314OooO00o.OooOOO0(OooOO0.OooO00o(oooOO0OOooO0OO.f30404OooO00o, (OooOo00.OooO0O0(OooOo.OooO00o(oooOO0OOooo.f30406OooO0OO - oooOO0OOooo.f30404OooO00o, oooOO0OOooo.f30407OooO0Oo - oooOO0OOooo.f30405OooO0O0)) * i) + oooOO0OOooO0OO.f30405OooO0O0)));
    }

    @NotNull
    public final o0000Ooo Oooo000() {
        o0O000 o0o001;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (o0o001 = this.f3503OooO) != null) {
            OooOoo0(OooOooo(o0o001, 1));
        }
        return this;
    }

    @NotNull
    public final o0000Ooo Oooo00O() {
        o0O000 o0o001;
        if ((this.f3566OooO0oO.f26756Oooo0o.length() > 0) && (o0o001 = this.f3503OooO) != null) {
            OooOoo0(OooOooo(o0o001, -1));
        }
        return this;
    }
}
