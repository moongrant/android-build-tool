package p087o000Oooo;

import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O.OooO00o f28576Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28577Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o000O00O.OooO00o oooO00o, NavBackStackEntry navBackStackEntry) {
        super(2);
        this.f28576Oooo0o = oooO00o;
        this.f28577Oooo0oO = navBackStackEntry;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            this.f28576Oooo0o.f28570OoooOOO.invoke(this.f28577Oooo0oO, ooo00o2, 8);
        }
        return Unit.INSTANCE;
    }
}
