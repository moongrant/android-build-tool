package p536o0o0Oo0o;

import androidx.compose.material.TabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p184o00o00o.Oooo000;
import p184o00o00o.o00oO0o;
import p507o0o00ooo.q1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f55149OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(Oooo000 oooo000) {
        super(3);
        this.f55149OooO0Oo = oooo000;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        List<? extends TabPosition> tabPositions = list;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-157785445, iIntValue, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:100)");
        }
        q1.f50178OooO00o.OooO0O0(o00oO0o.OooO00o(Modifier.INSTANCE, this.f55149OooO0Oo, tabPositions), 0.0f, 0.0f, null, 0L, false, null, composer2, 12582912, 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
