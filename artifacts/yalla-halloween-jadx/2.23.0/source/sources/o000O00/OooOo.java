package o000O00;

import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function1<NavDestination, NavDestination> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo f34360OooO0Oo = new OooOo();

    public OooOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination navDestination) {
        NavDestination destination = navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        androidx.navigation.OooO oooO = destination.f6818OooO0o0;
        if (oooO != null && oooO.f6835OooOOO == destination.f6821OooOO0) {
            return oooO;
        }
        return null;
    }
}
