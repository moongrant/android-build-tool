package p537o0o0OoO;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<VipWelfareModel> f55409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipVm f55410OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(OooO0O0<VipWelfareModel> oooO0O0, VipVm vipVm) {
        super(1);
        this.f55409OooO0Oo = oooO0O0;
        this.f55410OooO0o0 = vipVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        OooO0O0<VipWelfareModel> oooO0O0 = this.f55409OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooO0O0.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(982386781, true, new o0OO000o(oooO0O0, this.f55410OooO0o0)), 14, null);
        return Unit.INSTANCE;
    }
}
