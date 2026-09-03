package p543o0o0Ooo0;

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
import p193o00o0O0O.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55667OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f55668OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i, boolean z) {
        super(3);
        this.f55667OooO0Oo = i;
        this.f55668OooO0o0 = z;
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
                ComposerKt.traceEventStart(-1299949832, iIntValue, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:113)");
            }
            String strStringResource = StringResources_androidKt.stringResource(this.f55667OooO0Oo == 0 ? o000000.Golds : o000000.crystal, composer2, 0);
            long sp = TextUnitKt.getSp(16);
            if (this.f55668OooO0o0) {
                composer2.startReplaceableGroup(954369750);
                j = o0000oo.OooO0OO(composer2).f38624OooO0oo;
            } else {
                composer2.startReplaceableGroup(954369769);
                j = o0000oo.OooO0OO(composer2).f38625OooOO0;
            }
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
