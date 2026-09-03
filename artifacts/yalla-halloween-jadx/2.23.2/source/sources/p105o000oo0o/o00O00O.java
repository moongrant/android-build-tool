package p105o000oo0o;

import androidx.navigation.NavDestination;
import androidx.navigation.OooO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends Lambda implements Function1<NavDestination, NavDestination> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O00O f35761OooO0Oo = new o00O00O();

    public o00O00O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination navDestination) {
        NavDestination it = navDestination;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof OooO)) {
            return null;
        }
        OooO oooO = (OooO) it;
        return oooO.OooO0oo(oooO.f9929OooOOO, true);
    }
}
