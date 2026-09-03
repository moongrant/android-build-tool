package p533o0o0OOoO;

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
import p230o00oOo0o.o000000;
import p230o00oOo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f53506OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o000000 o000000Var) {
        super(3);
        this.f53506OooO0Oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        List<? extends TabPosition> it = list;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(973103665, iIntValue, -1, "com.yalla.yalla.ui.screen.main.MainSearchScreenContent.<anonymous>.<anonymous> (MainSearchScreen.kt:62)");
        }
        TabRowDefaults.INSTANCE.m1226Indicator9IZ8Weo(o0000O00.OooO00o(Modifier.INSTANCE, this.f53506OooO0Oo, it), 0.0f, 0L, composer2, TabRowDefaults.$stable << 9, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
