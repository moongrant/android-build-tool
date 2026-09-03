package com.google.accompanist.navigation.animation;

import Oooo000.o00Ooo;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f12965Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f12966Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(NavBackStackEntry navBackStackEntry, o00Ooo o00ooo2) {
        super(2);
        this.f12965Oooo0o = navBackStackEntry;
        this.f12966Oooo0oO = o00ooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            NavDestination destination = this.f12965Oooo0o.getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
            ((o0O00oO0.OooO00o.C0359OooO00o) destination).f35223o000oOoO.invoke(this.f12966Oooo0oO, this.f12965Oooo0o, ooo00o2, 72);
        }
        return Unit.INSTANCE;
    }
}
