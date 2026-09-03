package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<ShopVehicleListModel> f55400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55401OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f55402OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55403OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(OooOOOO<ShopVehicleListModel> oooOOOO, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f55400OooO0Oo = oooOOOO;
        this.f55402OooO0o0 = userOutFitVM;
        this.f55401OooO0o = o0ooo0o1;
        this.f55403OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        OooOOOO<ShopVehicleListModel> oooOOOO = this.f55400OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooOOOO.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(1090486530, true, new d3(oooOOOO, this.f55402OooO0o0, this.f55401OooO0o, this.f55403OooO0oO)), 14, null);
        return Unit.INSTANCE;
    }
}
