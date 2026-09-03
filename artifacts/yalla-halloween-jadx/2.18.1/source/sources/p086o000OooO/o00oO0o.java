package p086o000OooO;

import androidx.navigation.NavDestination;
import androidx.navigation.OooO0O0;
import androidx.navigation.OooO0OO;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<o00000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ NavDestination f28510Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f28511Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(NavDestination navDestination, o00Oo0 o00oo1) {
        super(1);
        this.f28510Oooo0o = navDestination;
        this.f28511Oooo0oO = o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0 o00000o1) {
        boolean z;
        o00000O0 navOptions = o00000o1;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        o00Ooo animBuilder = o00Ooo.f28509Oooo0o;
        Objects.requireNonNull(navOptions);
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        OooOo oooOo = new OooOo();
        animBuilder.invoke(oooOo);
        o00000.OooO00o oooO00o = navOptions.f28428OooO00o;
        oooO00o.f28425OooO0oO = oooOo.f28403OooO00o;
        oooO00o.f28426OooO0oo = oooOo.f28404OooO0O0;
        oooO00o.f28418OooO = -1;
        oooO00o.f28427OooOO0 = -1;
        NavDestination navDestination = this.f28510Oooo0o;
        boolean z2 = false;
        if (navDestination instanceof OooO0OO) {
            Sequence<NavDestination> sequenceOooO0OO = NavDestination.f8629OoooOO0.OooO0OO(navDestination);
            o00Oo0 o00oo1 = this.f28511Oooo0oO;
            Iterator<NavDestination> it = sequenceOooO0OO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                NavDestination next = it.next();
                NavDestination navDestinationOooO0oO = o00oo1.OooO0oO();
                if (Intrinsics.areEqual(next, navDestinationOooO0oO != null ? navDestinationOooO0oO.f8632Oooo0oO : null)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            OooO0OO.OooO00o oooO00o2 = OooO0OO.f8652OoooOoO;
            OooO0OO OooO0oo2 = this.f28511Oooo0oO.OooO0oo();
            Intrinsics.checkNotNullParameter(OooO0oo2, "<this>");
            int i = ((NavDestination) SequencesKt.last(SequencesKt.generateSequence(OooO0oo2.OooO0oo(OooO0oo2.f8653OoooOOO, true), OooO0O0.f8651Oooo0o))).f8637OoooO0O;
            oo000o popUpToBuilder = oo000o.f28533Oooo0o;
            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
            navOptions.f28430OooO0OO = i;
            o0000oo o0000ooVar = new o0000oo();
            popUpToBuilder.invoke(o0000ooVar);
            navOptions.f28432OooO0o0 = o0000ooVar.f28440OooO00o;
        }
        return Unit.INSTANCE;
    }
}
