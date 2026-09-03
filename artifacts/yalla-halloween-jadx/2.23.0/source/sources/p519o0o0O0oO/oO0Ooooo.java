package p519o0o0O0oO;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f52882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, oO000O0O, Unit> f52883OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0Ooooo(oO000O0O oo000o0o, Function2<? super String, ? super oO000O0O, Unit> function2) {
        super(3);
        this.f52882OooO0Oo = oo000o0o;
        this.f52883OooO0o0 = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        ColumnScope TextDialog = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468254063, iIntValue, -1, "com.yalla.yalla.ui.dialog.HorizontalEditDialogUtil.showHorizontalEditDialog.<anonymous>.<anonymous> (HorizontalEditDialogUtil.kt:44)");
            }
            oO0OOo0o.OooO00o(this.f52882OooO0Oo, this.f52883OooO0o0, composer2, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
