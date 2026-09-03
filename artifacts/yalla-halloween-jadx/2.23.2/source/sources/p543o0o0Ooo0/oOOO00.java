package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f55514OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserMyOutFitModel f55515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55516OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55517OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55518OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f55519OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(UserMyOutFitModel userMyOutFitModel, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, int i, int i2) {
        super(2);
        this.f55515OooO0Oo = userMyOutFitModel;
        this.f55517OooO0o0 = entranceEffectProfileCardVM;
        this.f55516OooO0o = o0ooo0o1;
        this.f55518OooO0oO = lifecycleOwner;
        this.f55519OooO0oo = i;
        this.f55514OooO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ooooO0O0.OooOOO0(this.f55515OooO0Oo, this.f55517OooO0o0, this.f55516OooO0o, this.f55518OooO0oO, this.f55519OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55514OooO | 1));
        return Unit.INSTANCE;
    }
}
