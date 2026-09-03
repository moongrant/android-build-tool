package o000O00;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 extends Lambda implements Function1<androidx.navigation.OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000 f34364OooO0Oo = new o0000();

    public o0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(androidx.navigation.OooOOO oooOOO) {
        androidx.navigation.OooOOO navOptions = oooOOO;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.f6898OooO0O0 = true;
        return Unit.INSTANCE;
    }
}
