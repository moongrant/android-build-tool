package p543o0o0Ooo0;

import androidx.compose.material.TabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p230o00oOo0o.o000000;
import p230o00oOo0o.o0000O00;
import p516o0o0O00o.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f55472OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o000000 o000000Var) {
        super(3);
        this.f55472OooO0Oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        List<? extends TabPosition> tabPositions = list;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-157785445, iIntValue, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:101)");
        }
        o0O00oO0.f51523OooO00o.OooO0O0(o0000O00.OooO00o(Modifier.INSTANCE, this.f55472OooO0Oo, tabPositions), 0.0f, 0.0f, null, 0L, false, null, composer2, 12582912, 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
