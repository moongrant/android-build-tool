package p536o0o0Oo0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f55067OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserMyOutFitModel f55068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55070OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55071OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f55072OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(UserMyOutFitModel userMyOutFitModel, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, int i, int i2) {
        super(2);
        this.f55068OooO0Oo = userMyOutFitModel;
        this.f55070OooO0o0 = entranceEffectProfileCardVM;
        this.f55069OooO0o = o0o0ooo0;
        this.f55071OooO0oO = lifecycleOwner;
        this.f55072OooO0oo = i;
        this.f55067OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0OOOO00.OooOOO0(this.f55068OooO0Oo, this.f55070OooO0o0, this.f55069OooO0o, this.f55071OooO0oO, this.f55072OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55067OooO | 1));
        return Unit.INSTANCE;
    }
}
