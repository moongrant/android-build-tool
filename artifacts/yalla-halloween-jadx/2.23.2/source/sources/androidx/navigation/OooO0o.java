package androidx.navigation;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import p105o000oo0o.o0000Ooo;
import p105o000oo0o.o000O00;
import p105o000oo0o.o000O00O;
import p105o000oo0o.o00O00O;
import p105o000oo0o.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,2572:1\n2141#2,2:2573\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n*L\n1409#1:2573,2\n*E\n"})
public final class OooO0o extends Lambda implements Function1<OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NavDestination f9988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f9989OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(NavDestination navDestination, OooO0O0 oooO0O0) {
        super(1);
        this.f9988OooO0Oo = navDestination;
        this.f9989OooO0o0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOOO oooOOO) {
        boolean z;
        OooOOO navOptions = oooOOO;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.getClass();
        o000O00 animBuilder = o000O00.f35718OooO0Oo;
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        o0000Ooo o0000ooo = new o0000Ooo();
        animBuilder.invoke(o0000ooo);
        int i = o0000ooo.f35711OooO00o;
        OooOOO0.OooO00o oooO00o = navOptions.f9991OooO00o;
        oooO00o.f10005OooO00o = i;
        oooO00o.f10006OooO0O0 = o0000ooo.f35712OooO0O0;
        oooO00o.f10007OooO0OO = o0000ooo.f35713OooO0OO;
        oooO00o.f10008OooO0Oo = o0000ooo.f35714OooO0Oo;
        NavDestination navDestination = this.f9988OooO0Oo;
        boolean z2 = navDestination instanceof OooO;
        OooO0O0 oooO0O0 = this.f9989OooO0o0;
        boolean z3 = false;
        if (z2) {
            int i2 = NavDestination.f9908OooOO0o;
            Iterator it = NavDestination.OooO00o.OooO0OO(navDestination).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination navDestinationOooO0o = oooO0O0.OooO0o();
                if (Intrinsics.areEqual(navDestination2, navDestinationOooO0o != null ? navDestinationOooO0o.f9912OooO0o0 : null)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z3 = true;
            }
        }
        if (z3) {
            int i3 = OooO.f9928OooOOo0;
            OooO oooO = oooO0O0.f9941OooO0OO;
            if (oooO == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
            }
            Intrinsics.checkNotNull(oooO, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            int i4 = ((NavDestination) SequencesKt.last(SequencesKt.generateSequence(oooO.OooO0oo(oooO.f9929OooOOO, true), o00O00O.f35761OooO0Oo))).f9915OooOO0;
            o000O00O popUpToBuilder = o000O00O.f35720OooO0Oo;
            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
            navOptions.f9994OooO0Oo = i4;
            o00O0O0 o00o0o0 = new o00O0O0();
            popUpToBuilder.invoke(o00o0o0);
            navOptions.f9995OooO0o0 = o00o0o0.f35762OooO00o;
        }
        return Unit.INSTANCE;
    }
}
