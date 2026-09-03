package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00o0 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<UserMyOutFitModel> f55528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55529OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55530OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55531OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(OooOOOO<UserMyOutFitModel> oooOOOO, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f55528OooO0Oo = oooOOOO;
        this.f55530OooO0o0 = entranceEffectProfileCardVM;
        this.f55529OooO0o = o0ooo0o1;
        this.f55531OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        OooOOOO<UserMyOutFitModel> oooOOOO = this.f55528OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooOOOO.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(1860166548, true, new oOOO00Oo(oooOOOO, this.f55530OooO0o0, this.f55529OooO0o, this.f55531OooO0oO)), 14, null);
        return Unit.INSTANCE;
    }
}
