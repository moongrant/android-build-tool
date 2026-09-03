package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<UserMyOutFitModel> f55073OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55074OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55075OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55076OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(OooO0O0<UserMyOutFitModel> oooO0O0, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f55073OooO0Oo = oooO0O0;
        this.f55075OooO0o0 = entranceEffectProfileCardVM;
        this.f55074OooO0o = o0o0ooo0;
        this.f55076OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        OooO0O0<UserMyOutFitModel> oooO0O0 = this.f55073OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooO0O0.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(1860166548, true, new oO0Oo(oooO0O0, this.f55075OooO0o0, this.f55074OooO0o, this.f55076OooO0oO)), 14, null);
        return Unit.INSTANCE;
    }
}
