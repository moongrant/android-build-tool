package o000O00;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function1<androidx.navigation.OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO0 f34358OooO0Oo = new OooOOO0();

    public OooOOO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(androidx.navigation.OooOOO oooOOO) {
        androidx.navigation.OooOOO navOptions = oooOOO;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.f6899OooO0OO = true;
        return Unit.INSTANCE;
    }
}
