package o000O00;

import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00000 f34365OooO0Oo = new o00000();

    public o00000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination navDestination) {
        NavDestination it = navDestination;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof androidx.navigation.OooO)) {
            return null;
        }
        androidx.navigation.OooO oooO = (androidx.navigation.OooO) it;
        return oooO.OooO0oo(oooO.f6835OooOOO, true);
    }
}
