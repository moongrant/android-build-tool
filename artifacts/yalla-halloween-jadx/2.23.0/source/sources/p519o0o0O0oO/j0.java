package p519o0o0O0oO;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.RedemptionCodeAwards;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52373OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<RedemptionCodeAwards> f52374OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i, List<RedemptionCodeAwards> list) {
        super(4);
        this.f52373OooO0Oo = i;
        this.f52374OooO0o0 = list;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148830938, iIntValue2, -1, "com.yalla.yalla.ui.dialog.RedemptionCodeRewardDialog.Foreground.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RedemptionCodeDialog.kt:232)");
            }
            h0 h0Var = h0.f52296OooO00o;
            List<RedemptionCodeAwards> list = this.f52374OooO0o0;
            int i2 = this.f52373OooO0Oo;
            if (i2 == 1 || i2 == 2) {
                composer2.startReplaceableGroup(2054649110);
                h0Var.OooO0o(list.get(iIntValue), composer2, 56);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(2054649185);
                h0Var.OooO0oO(list.get(iIntValue), composer2, 56);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
