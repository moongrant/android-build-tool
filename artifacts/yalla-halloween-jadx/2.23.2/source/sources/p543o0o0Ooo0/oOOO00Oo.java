package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<UserMyOutFitModel> f55524OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55525OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55526OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55527OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(OooOOOO<UserMyOutFitModel> oooOOOO, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f55524OooO0Oo = oooOOOO;
        this.f55526OooO0o0 = entranceEffectProfileCardVM;
        this.f55525OooO0o = o0ooo0o1;
        this.f55527OooO0oO = lifecycleOwner;
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
                ComposerKt.traceEventStart(1860166548, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.MainContentList.<anonymous>.<anonymous>.<anonymous> (EntranceEffectProfileCardScreen.kt:125)");
            }
            UserMyOutFitModel userMyOutFitModelOooO00o = this.f55524OooO0Oo.OooO00o(iIntValue);
            if (userMyOutFitModelOooO00o != null) {
                ooooO0O0.OooOOO0(userMyOutFitModelOooO00o, this.f55526OooO0o0, this.f55525OooO0o, this.f55527OooO0oO, iIntValue, composer2, ((iIntValue2 << 9) & 57344) | 4680);
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
