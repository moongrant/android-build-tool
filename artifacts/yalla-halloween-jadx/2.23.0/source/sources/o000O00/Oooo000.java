package o000O00;

import androidx.navigation.NavDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<NavDestination, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ androidx.navigation.OooO0O0 f34363OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(androidx.navigation.OooO0O0 oooO0O0) {
        super(1);
        this.f34363OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NavDestination navDestination) {
        NavDestination destination = navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        return Boolean.valueOf(!this.f34363OooO0Oo.f6856OooOOO.containsKey(Integer.valueOf(destination.f6821OooOO0)));
    }
}
