package p105o000oo0o;

import androidx.navigation.NavDestination;
import androidx.navigation.OooO0O0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 extends Lambda implements Function1<NavDestination, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f35719OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(OooO0O0 oooO0O0) {
        super(1);
        this.f35719OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NavDestination navDestination) {
        NavDestination destination = navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        return Boolean.valueOf(!this.f35719OooO0Oo.f9950OooOOO.containsKey(Integer.valueOf(destination.f9915OooOO0)));
    }
}
