package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00.OooO00o f10120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f10121OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOo00.OooO00o oooO00o, NavBackStackEntry navBackStackEntry) {
        super(2);
        this.f10120OooO0Oo = oooO00o;
        this.f10121OooO0o0 = navBackStackEntry;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497631156, iIntValue, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:60)");
            }
            this.f10120OooO0Oo.f10133OooOOO.invoke(this.f10121OooO0o0, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
