package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function1<NavDestination, NavDestination> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO0O0 f8651Oooo0o = new OooO0O0();

    public OooO0O0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination navDestination) {
        NavDestination it = navDestination;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof OooO0OO)) {
            return null;
        }
        OooO0OO oooO0OO = (OooO0OO) it;
        return oooO0OO.OooO0oo(oooO0OO.f8653OoooOOO, true);
    }
}
