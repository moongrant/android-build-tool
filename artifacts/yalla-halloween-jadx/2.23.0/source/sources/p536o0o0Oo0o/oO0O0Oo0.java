package p536o0o0Oo0o;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p147o00Oo0Oo.o000OOo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0Oo0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f55154OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0Oo0(int i, boolean z) {
        super(3);
        this.f55153OooO0Oo = i;
        this.f55154OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        long j;
        ColumnScope Tab = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299949832, iIntValue, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:112)");
            }
            String strStringResource = StringResources_androidKt.stringResource(this.f55153OooO0Oo == 0 ? oO00OOo0.Golds : oO00OOo0.crystal, composer2, 0);
            long sp = TextUnitKt.getSp(16);
            if (this.f55154OooO0o0) {
                composer2.startReplaceableGroup(954369750);
                j = o000OOo.OooO0OO(composer2).f37709OooO0oo;
            } else {
                composer2.startReplaceableGroup(954369769);
                j = o000OOo.OooO0OO(composer2).f37710OooOO0;
            }
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
