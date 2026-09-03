package p105o000oo0o;

import androidx.navigation.NavDestination;
import androidx.navigation.OooO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000 f35704OooO0Oo = new o000();

    public o000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination navDestination) {
        NavDestination destination = navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        OooO oooO = destination.f9912OooO0o0;
        if (oooO != null && oooO.f9929OooOOO == destination.f9915OooOO0) {
            return oooO;
        }
        return null;
    }
}
