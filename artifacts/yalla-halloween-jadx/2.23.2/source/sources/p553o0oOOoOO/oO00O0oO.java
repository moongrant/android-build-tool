package p553o0oOOoOO;

import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f56109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipWelfareModel f56110OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(VipVm vipVm, VipWelfareModel vipWelfareModel) {
        super(0);
        this.f56109OooO0Oo = vipVm;
        this.f56110OooO0o0 = vipWelfareModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipVm vipVm = this.f56109OooO0Oo;
        vipVm.setCurrentUserWelfareModel(this.f56110OooO0o0);
        vipVm.getShowProfilePreViewDialog().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
