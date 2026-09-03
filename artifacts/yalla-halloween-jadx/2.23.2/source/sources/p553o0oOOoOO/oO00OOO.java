package p553o0oOOoOO;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<VipWelfareModel> f56113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipVm f56114OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(OooOOOO<VipWelfareModel> oooOOOO, VipVm vipVm) {
        super(1);
        this.f56113OooO0Oo = oooOOOO;
        this.f56114OooO0o0 = vipVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        OooOOOO<VipWelfareModel> oooOOOO = this.f56113OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooOOOO.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(982386781, true, new oO00OO0O(oooOOOO, this.f56114OooO0o0)), 14, null);
        return Unit.INSTANCE;
    }
}
