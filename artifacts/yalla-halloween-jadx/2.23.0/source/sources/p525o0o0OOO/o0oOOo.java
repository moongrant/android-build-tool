package p525o0o0OOO;

import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
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

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f53565OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(Oooo000 oooo000) {
        super(3);
        this.f53565OooO0Oo = oooo000;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        List<? extends TabPosition> it = list;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(973103665, iIntValue, -1, "com.yalla.yalla.ui.screen.main.MainSearchScreenContent.<anonymous>.<anonymous> (MainSearchScreen.kt:61)");
        }
        TabRowDefaults.INSTANCE.m1216Indicator9IZ8Weo(o00oO0o.OooO00o(Modifier.INSTANCE, this.f53565OooO0Oo, it), 0.0f, 0L, composer2, TabRowDefaults.$stable << 9, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
