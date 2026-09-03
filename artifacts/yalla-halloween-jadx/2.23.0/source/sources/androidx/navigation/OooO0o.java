package androidx.navigation;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import o000O00.Oooo0;
import o000O00.o00000;
import o000O00.o0000oo;
import o000O00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,2572:1\n2141#2,2:2573\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n*L\n1409#1:2573,2\n*E\n"})
public final class OooO0o extends Lambda implements Function1<OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NavDestination f6894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f6895OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(NavDestination navDestination, OooO0O0 oooO0O0) {
        super(1);
        this.f6894OooO0Oo = navDestination;
        this.f6895OooO0o0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOOO oooOOO) {
        boolean z;
        OooOOO navOptions = oooOOO;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.getClass();
        Oooo0 animBuilder = Oooo0.f34362OooO0Oo;
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        o000O00.OooO00o oooO00o = new o000O00.OooO00o();
        animBuilder.invoke(oooO00o);
        int i = oooO00o.f34348OooO00o;
        OooOOO0.OooO00o oooO00o2 = navOptions.f6897OooO00o;
        oooO00o2.f6911OooO00o = i;
        oooO00o2.f6912OooO0O0 = oooO00o.f34349OooO0O0;
        oooO00o2.f6913OooO0OO = oooO00o.f34350OooO0OO;
        oooO00o2.f6914OooO0Oo = oooO00o.f34351OooO0Oo;
        NavDestination navDestination = this.f6894OooO0Oo;
        boolean z2 = navDestination instanceof OooO;
        OooO0O0 oooO0O0 = this.f6895OooO0o0;
        boolean z3 = false;
        if (z2) {
            int i2 = NavDestination.f6814OooOO0o;
            Iterator it = NavDestination.OooO00o.OooO0OO(navDestination).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination navDestinationOooO0o = oooO0O0.OooO0o();
                if (Intrinsics.areEqual(navDestination2, navDestinationOooO0o != null ? navDestinationOooO0o.f6818OooO0o0 : null)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z3 = true;
            }
        }
        if (z3) {
            int i3 = OooO.f6834OooOOo0;
            OooO oooO = oooO0O0.f6847OooO0OO;
            if (oooO == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
            }
            Intrinsics.checkNotNull(oooO, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            int i4 = ((NavDestination) SequencesKt.last(SequencesKt.generateSequence(oooO.OooO0oo(oooO.f6835OooOOO, true), o00000.f34365OooO0Oo))).f6821OooOO0;
            o000oOoO popUpToBuilder = o000oOoO.f34383OooO0Oo;
            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
            navOptions.f6900OooO0Oo = i4;
            o0000oo o0000ooVar = new o0000oo();
            popUpToBuilder.invoke(o0000ooVar);
            navOptions.f6901OooO0o0 = o0000ooVar.f34381OooO00o;
        }
        return Unit.INSTANCE;
    }
}
