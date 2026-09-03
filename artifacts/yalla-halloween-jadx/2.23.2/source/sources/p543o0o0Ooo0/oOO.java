package p543o0o0Ooo0;

import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55480OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55481OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(EntranceEffectProfileCardVM entranceEffectProfileCardVM, int i) {
        super(0);
        this.f55480OooO0Oo = entranceEffectProfileCardVM;
        this.f55481OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EntranceEffectProfileCardVM entranceEffectProfileCardVM = this.f55480OooO0Oo;
        entranceEffectProfileCardVM.setCurrentPosition(this.f55481OooO0o0);
        entranceEffectProfileCardVM.getShowProfilePreViewDialog().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
