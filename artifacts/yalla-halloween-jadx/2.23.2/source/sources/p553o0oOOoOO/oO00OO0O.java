package p553o0oOOoOO;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<VipWelfareModel> f56111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipVm f56112OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(OooOOOO<VipWelfareModel> oooOOOO, VipVm vipVm) {
        super(4);
        this.f56111OooO0Oo = oooOOOO;
        this.f56112OooO0o0 = vipVm;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982386781, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.vip.WelFareRecordPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelfareMallPage.kt:85)");
            }
            VipWelfareModel vipWelfareModelOooO00o = this.f56111OooO0Oo.OooO00o(iIntValue);
            if (vipWelfareModelOooO00o != null) {
                VipVm vipVm = this.f56112OooO0o0;
                oO00000o.OooO0Oo(vipWelfareModelOooO00o, new oOo00OO0(vipVm, vipWelfareModelOooO00o), new oO00O0oO(vipVm, vipWelfareModelOooO00o), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
