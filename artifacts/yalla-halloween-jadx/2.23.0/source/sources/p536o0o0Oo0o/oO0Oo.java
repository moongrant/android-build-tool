package p536o0o0Oo0o;

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
import o000O0.OooO0O0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<UserMyOutFitModel> f55162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55165OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(OooO0O0<UserMyOutFitModel> oooO0O0, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f55162OooO0Oo = oooO0O0;
        this.f55164OooO0o0 = entranceEffectProfileCardVM;
        this.f55163OooO0o = o0o0ooo0;
        this.f55165OooO0oO = lifecycleOwner;
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
                ComposerKt.traceEventStart(1860166548, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.MainContentList.<anonymous>.<anonymous>.<anonymous> (EntranceEffectProfileCardScreen.kt:124)");
            }
            UserMyOutFitModel userMyOutFitModelOooO00o = this.f55162OooO0Oo.OooO00o(iIntValue);
            if (userMyOutFitModelOooO00o != null) {
                o0OOOO00.OooOOO0(userMyOutFitModelOooO00o, this.f55164OooO0o0, this.f55163OooO0o, this.f55165OooO0oO, iIntValue, composer2, ((iIntValue2 << 9) & 57344) | 4680);
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
